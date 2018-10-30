package org.eclipse.agail.protocol.dlink.webapi;

import net.servicestack.client.HttpHeaders;
import net.servicestack.client.JsonServiceClient;
import net.servicestack.client.MimeTypes;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonServiceClientExt extends JsonServiceClient {

	private static final String GW_API_HEADER = "enControl-Api-Key";
	private static final String GW_API_KEY = "[ENCONTROL API KEY HERE]";

	public JsonServiceClientExt(String baseUrl) {
		super(baseUrl);
	}

	@Override
	public HttpURLConnection createRequest(String requestUrl, String httpMethod, byte[] requestBody, String requestType) {
        try {
        	URL url = new URL(requestUrl);

            HttpURLConnection req = (HttpURLConnection) url.openConnection();

            req.setConnectTimeout(5000);
            req.setReadTimeout(5000);

            req.setRequestMethod(httpMethod);
            req.setRequestProperty(HttpHeaders.Accept, MimeTypes.Json);
            req.setRequestProperty(GW_API_HEADER, GW_API_KEY);
            
            if (requestType != null) {
                req.setRequestProperty(HttpHeaders.ContentType, requestType);
            }

            if (RequestFilter != null) {
                RequestFilter.exec(req);
            }

            if (GlobalRequestFilter != null) {
                GlobalRequestFilter.exec(req);
            }

            if (requestBody != null) {
                req.setDoOutput(true);
                req.setRequestProperty(HttpHeaders.ContentLength, Integer.toString(requestBody.length));
                DataOutputStream wr = new DataOutputStream(req.getOutputStream());
                wr.write(requestBody);
                wr.flush();
                wr.close();
            }

            return req;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
