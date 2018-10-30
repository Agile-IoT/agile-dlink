package org.eclipse.agail.protocol.dlink.webapi;

import com.google.gson.Gson;
import net.servicestack.client.HttpMethods;
import net.servicestack.client.IReturn;
import net.servicestack.client.Utils;
import net.servicestack.client.WebServiceException;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.eclipse.agail.protocol.dlink.webapi.dto.*;

public class SStackWebApiConsumer {

	private static final Logger log = LoggerFactory.getLogger(SStackWebApiConsumer.class);

	private static final String API_URL = "https://encontrol.io/api/";
	private static final String USERNAME = "[ENCONTROL USERNAME HERE]";
	private static final String PASSWORD = "[ENCONTROL PASSWORD HERE]";
	
	private static final String GW_API_HEADER = "enControl-Api-Key";
	private static final String GW_API_KEY = "[ENCONTROL API KEY HERE]";
	
	private JsonServiceClientExt client;

	private CloseableHttpClient patchClient;
	private BasicCookieStore cookieStore;
	private Gson gson = new Gson();

	private String replyUrl;

	private boolean needsAuthenticate = false;

	public SStackWebApiConsumer() {
		client = new JsonServiceClientExt(API_URL);
		replyUrl = API_URL + "json/reply/";
		client.setTimeout(5000);
		
		cookieStore = new BasicCookieStore();
		RequestConfig globalConfig = RequestConfig.custom().setCookieSpec(CookieSpecs.DEFAULT)
				.setConnectionRequestTimeout(5000).setConnectTimeout(5000).build();
		patchClient = HttpClients.custom().setDefaultRequestConfig(globalConfig)
				.setConnectionManager(new PoolingHttpClientConnectionManager()).setDefaultCookieStore(cookieStore)
				.build();
	}

	private void authenticate() {
		dto.Authenticate auth = new dto.Authenticate();
		auth.setUserName(USERNAME);
		auth.setPassword(PASSWORD);

		try {
			client.post(auth);
			log.debug("Authenticate OK");
		} catch (Exception e) {
			log.debug("Authenticate ERROR", e);
		}
	}

	private void authenticatePatch() {
		log.debug("Authenticating PATCH....");
		CloseableHttpResponse response = null;
		HttpPost request = null;

		try {
			request = new HttpPost(API_URL + "auth");
			Map<String, String> content = new HashMap<String, String>();

			content.put("username", USERNAME);
			content.put("password", PASSWORD);

			request.setEntity(new StringEntity(gson.toJson(content), ContentType.APPLICATION_JSON));
			request.setHeader(GW_API_HEADER, GW_API_KEY);
			
			response = patchClient.execute(request);

			if (response.getStatusLine().getStatusCode() == 200) {
				log.debug("Authenticate PATCH OK");
			} else {
				log.debug("Authentication PATCH KO");
			}

			response.close();
		} catch (Exception e) {
			log.error("ERROR authenticating PATCH web api consumer: {}", e.getMessage());
		} finally {
			request.releaseConnection();
		}
	}

	@SuppressWarnings({ "unchecked" })
	private <T> Optional<T> executeRequest(IReturn<T> request, String method, int retries) {
		if (retries < 0) {
			// Prevent some cases where authentication is not detected with 401 error
			needsAuthenticate = true;
			return Optional.empty();
		}

		if (needsAuthenticate) {
			if (method.equals(HttpMethods.Patch)) {
				authenticatePatch();
			} else {
				authenticate();
			}

			needsAuthenticate = false;
		}

		log.debug("Executing request {} on retry: {}", request.getClass().getSimpleName(), (retries - 1));

		try {
			if (HttpMethods.Get.equals(method)) {
				return Optional.of(client.get(request));
			} else if (HttpMethods.Post.equals(method)) {
				return Optional.of(client.post(request));
			} else if (HttpMethods.Put.equals(method)) {
				return Optional.of(client.put(request));
			} else if (HttpMethods.Delete.equals(method)) {
				return Optional.of(client.delete(request));
			} else if (HttpMethods.Patch.equals(method)) {
				HttpPatch patch = null;
				try {
					patch = new HttpPatch(new URI(Utils.combinePath(replyUrl, request.getClass().getSimpleName())));
					patch.setHeader(GW_API_HEADER, GW_API_KEY);
					patch.setEntity(new StringEntity(gson.toJson(request)));

					CloseableHttpResponse response = patchClient.execute(patch);

					if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
						response.close();
						return Optional.of((T) request.getResponseType());
					} else {
						if (response.getStatusLine().getStatusCode() == HttpStatus.SC_UNAUTHORIZED) {
							response.close();
							authenticatePatch();
							log.error("ERROR executing generic PATCH request, 401 unauthorized");
						} else {
							log.error("ERROR executing generic request, {}",
									response.getStatusLine().getStatusCode());
						}
					}
				} catch (Exception e) {
					log.error("ERROR executing generic PATCH request {}", e);
				} finally {
					if (patch != null) {
						patch.releaseConnection();
					}
				}
			} else {
				return Optional.empty();
			}
		} catch (WebServiceException e) {
			if (e.getStatusCode() == HttpStatus.SC_UNAUTHORIZED) {
				authenticate();
				log.error("ERROR executing generic request, 401 unauthorized");
			} else {
				log.error("ERROR executing generic request {} {}", e.getStatusCode(), e);
			}
		} catch (NullPointerException e1) {
			log.error("ERROR executing {} request, empty response from the server", request.getClass().getSimpleName());
		} catch (Exception e) {
			log.error("ERROR executing generic request {} exception", e.getClass().getName());
			log.error("ERROR executing generic request stack", e);
		}

		return executeRequest(request, method, retries - 1);
	}

	public boolean reportSensorStatus(String sensorId, String status) {
		SensorStatusPoint point = new SensorStatusPoint();
		point.setSensorId(sensorId);
		point.setStatusPoint(new StatusPoint(status, new Date(), "device"));

		List<SensorStatusPoint> points = new ArrayList<>();
		points.add(point);

		SensorStatusesBatch request = new SensorStatusesBatch();
		request.setSensorStatusPoints(points);

		return executeRequest(request, HttpMethods.Post, 3).isPresent();
	}
}
