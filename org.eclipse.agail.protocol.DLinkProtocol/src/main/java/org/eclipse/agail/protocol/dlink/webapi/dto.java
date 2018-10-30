/* Options:
Date: 2016-06-20 15:31:42
Version: 4.056
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: http://nassist.dev/api

Package: com.sensingcontrol.gateway.core.dto
GlobalNamespace: dto
//AddPropertyAccessors: True
//SettersReturnThis: True
//AddServiceStackTypes: True
//AddResponseStatus: False
//AddImplicitVersion: 
//IncludeTypes: 
//ExcludeTypes: 
//TreatTypesAsStrings: 
//DefaultImports: java.math.*,java.util.*,net.servicestack.client.*
*/

package org.eclipse.agail.protocol.dlink.webapi;

import com.google.gson.annotations.SerializedName;
import net.servicestack.client.*;

import java.util.*;

public class dto
{

    @Route(Path="/cameras", Verbs="PATCH")
    public static class CamerasPatch implements IReturn<Camera>
    {
        @ApiMember(Verb="PATCH", ParameterType="body", Name="Camera", Description="Camera object", DataType="Camera", IsRequired=true)
        public Camera Camera = null;

        @ApiMember(Name="fields", Description="Fields to update", ParameterType="query", DataType="string[]", IsRequired=true, Verb="PATCH")
        public ArrayList<String> Fields = null;

        public Camera getCamera() { return Camera; }
        public CamerasPatch setCamera(Camera value) { this.Camera = value; return this; }
        public ArrayList<String> getFields() { return Fields; }
        public CamerasPatch setFields(ArrayList<String> value) { this.Fields = value; return this; }
        private static Object responseType = Camera.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras", Verbs="GET")
    // @Route(Path="/cameras", Verbs="POST")
    // @Route(Path="/cameras", Verbs="PUT")
    public static class Cameras implements IReturn<CamerasResponse>
    {
        public Camera Camera = null;
        public Boolean UpdateOnGateway = null;
        public String InstallationId = null;

        public Camera getCamera() { return Camera; }
        public Cameras setCamera(Camera value) { this.Camera = value; return this; }
        public Boolean isUpdateOnGateway() { return UpdateOnGateway; }
        public Cameras setUpdateOnGateway(Boolean value) { this.UpdateOnGateway = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public Cameras setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = CamerasResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/details", Verbs="GET")
    // @Route(Path="/cameras/{Id}", Verbs="DELETE")
    public static class CameraDetails implements IReturn<CameraDetailsResponse>
    {
        @ApiMember(Name="Id", Description="Camera id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="InstallationId", Description="InstallationId", ParameterType="body", DataType="string", IsRequired=true, Verb="DELETE")
        public String InstallationId = null;

        public String getId() { return Id; }
        public CameraDetails setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public CameraDetails setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = CameraDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/statuses", Verbs="GET")
    // @Route(Path="/cameras/{Id}/statuses", Verbs="POST")
    public static class CameraStatuses implements IReturn<CameraStatusesResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="StatusPoints", Description="Collection of statuses to insert", ParameterType="body", DataType="List<StatusPoint>", IsRequired=true, Verb="POST")
        public ArrayList<StatusPoint> StatusPoints = null;

        public String getId() { return Id; }
        public CameraStatuses setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public CameraStatuses setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public CameraStatuses setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public CameraStatuses setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public CameraStatuses setPageSize(Integer value) { this.PageSize = value; return this; }
        public ArrayList<StatusPoint> getStatusPoints() { return StatusPoints; }
        public CameraStatuses setStatusPoints(ArrayList<StatusPoint> value) { this.StatusPoints = value; return this; }
        private static Object responseType = CameraStatusesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/statuses", Verbs="POST")
    public static class CameraStatusesBatch implements IReturn<CameraStatusesBatchResponse>
    {
        @ApiMember(Name="CameraStatusPoints", Description="Collection of statuspoints to insert", ParameterType="body", DataType="List<SensorStatusPoint>", IsRequired=true, Verb="POST")
        public List<SensorStatusPoint> CameraStatusPoints = null;

        public List<SensorStatusPoint> getCameraStatusPoints() { return CameraStatusPoints; }
        public CameraStatusesBatch setCameraStatusPoints(List<SensorStatusPoint> value) { this.CameraStatusPoints = value; return this; }
        private static Object responseType = CameraStatusesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/photos", Verbs="GET")
    // @Route(Path="/cameras/{Id}/photos", Verbs="POST")
    // @Route(Path="/cameras/{Id}/photos", Verbs="DELETE")
    public static class CameraPhoto implements IReturn<CameraPhotoResponse>
    {
        @ApiMember(Name="Id", Description="Camera Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public Date Date = null;
        public String Base64 = null;
        public String Trigger = null;
        public Date DeleteBeforeDate = null;
        public Date FromDate = null;
        public Date ToDate = null;

        public String getId() { return Id; }
        public CameraPhoto setId(String value) { this.Id = value; return this; }
        public Date getDate() { return Date; }
        public CameraPhoto setDate(Date value) { this.Date = value; return this; }
        public String getBase64() { return Base64; }
        public CameraPhoto setBase64(String value) { this.Base64 = value; return this; }
        public String getTrigger() { return Trigger; }
        public CameraPhoto setTrigger(String value) { this.Trigger = value; return this; }
        public Date getDeleteBeforeDate() { return DeleteBeforeDate; }
        public CameraPhoto setDeleteBeforeDate(Date value) { this.DeleteBeforeDate = value; return this; }
        public Date getFromDate() { return FromDate; }
        public CameraPhoto setFromDate(Date value) { this.FromDate = value; return this; }
        public Date getToDate() { return ToDate; }
        public CameraPhoto setToDate(Date value) { this.ToDate = value; return this; }
        private static Object responseType = CameraPhotoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/lastphoto", Verbs="GET")
    // @Route(Path="/cameras/{Id}/lastphoto", Verbs="POST")
    public static class CameraLastPhoto implements IReturn<CameraLastPhotoResponse>
    {
        @ApiMember(Name="Id", Description="Camera Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="InstallationId", Description="Installation Id", ParameterType="body", DataType="string", IsRequired=true, Verb="POST")
        public String InstallationId = null;

        public String getId() { return Id; }
        public CameraLastPhoto setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public CameraLastPhoto setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = CameraLastPhotoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/oldphotos", Verbs="DELETE")
    public static class CameraOldPhoto implements IReturn<CameraOldPhotoResponse>
    {

        private static Object responseType = CameraOldPhotoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/photo", Verbs="GET")
    // @Route(Path="/cameras/{Id}/photo", Verbs="DELETE")
    public static class CameraPhotoBlob implements IReturn<CameraPhotoBlobResponse>
    {
        @ApiMember(Name="Id", Description="Camera Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String TriggerId = null;
        public Date Date = null;

        public String getId() { return Id; }
        public CameraPhotoBlob setId(String value) { this.Id = value; return this; }
        public String getTriggerId() { return TriggerId; }
        public CameraPhotoBlob setTriggerId(String value) { this.TriggerId = value; return this; }
        public Date getDate() { return Date; }
        public CameraPhotoBlob setDate(Date value) { this.Date = value; return this; }
        private static Object responseType = CameraPhotoBlobResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/history", Verbs="GET")
    public static class CameraHistory implements IReturn<CameraPhotoResponse>
    {
        @ApiMember(Name="Id", Description="Camera Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromPhoto", Description="Initial Photo", ParameterType="query", DataType="int", IsRequired=true)
        public Integer FromPhoto = null;

        @ApiMember(Name="PageSize", Description="Page Size", ParameterType="query", DataType="int", IsRequired=true)
        public Integer PageSize = null;

        public String getId() { return Id; }
        public CameraHistory setId(String value) { this.Id = value; return this; }
        public Integer getFromPhoto() { return FromPhoto; }
        public CameraHistory setFromPhoto(Integer value) { this.FromPhoto = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public CameraHistory setPageSize(Integer value) { this.PageSize = value; return this; }
        private static Object responseType = CameraPhotoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/video/endpoint", Verbs="GET")
    public static class CameraVideoStreamingEndpoint implements IReturn<CameraVideoStreamingEndpointResponse>
    {
        @ApiMember(Name="Id", Description="Camera Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Installation Id", Description="Installation Id", ParameterType="body", DataType="string", IsRequired=true)
        public String InstallationId = null;

        public String getId() { return Id; }
        public CameraVideoStreamingEndpoint setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public CameraVideoStreamingEndpoint setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = CameraVideoStreamingEndpointResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/videoconsumption", Verbs="GET")
    public static class CameraVideoConsumption implements IReturn<CameraVideoConsumptionResponse>
    {
        @ApiMember(Name="Id", Description="Camera Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public CameraVideoConsumption setId(String value) { this.Id = value; return this; }
        private static Object responseType = CameraVideoConsumptionResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/consumption", Verbs="POST")
    public static class CameraConsumption implements IReturn<CameraConsumptionResponse>
    {
        @ApiMember(Name="Id", Description="CameraId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Bytes", Description="Bytes consumed", ParameterType="body", DataType="long", IsRequired=true, Verb="POST")
        public Long Bytes = null;

        public String getId() { return Id; }
        public CameraConsumption setId(String value) { this.Id = value; return this; }
        public Long getBytes() { return Bytes; }
        public CameraConsumption setBytes(Long value) { this.Bytes = value; return this; }
        private static Object responseType = CameraConsumptionResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameranodes/details", Verbs="GET")
    // @Route(Path="/cameranodes", Verbs="POST")
    // @Route(Path="/cameranodes", Verbs="DELETE")
    public static class CameraNodes implements IReturn<CameraNodesResponse>
    {
        @ApiMember(Name="CameraNode", Description="Camera Node", ParameterType="body", DataType="CameraNode", IsRequired=true, Verb="POST")
        // @ApiMember(Name="CameraNode", Description="Camera Node", ParameterType="body", DataType="CameraNode", IsRequired=true, Verb="DELETE")
        public CameraNode CameraNode = null;

        public CameraNode getCameraNode() { return CameraNode; }
        public CameraNodes setCameraNode(CameraNode value) { this.CameraNode = value; return this; }
        private static Object responseType = CameraNodesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/installations", Verbs="GET")
    public static class CameraInstallations implements IReturn<AssignableInstallationsResponse>
    {
        @ApiMember(Name="Id", Description="CameraId", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        public String getId() { return Id; }
        public CameraInstallations setId(String value) { this.Id = value; return this; }
        private static Object responseType = AssignableInstallationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/{Id}/users", Verbs="GET")
    public static class CameraUsers implements IReturn<CameraUsersResponse>
    {
        @ApiMember(Name="Id", Description="Camera Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public CameraUsers setId(String value) { this.Id = value; return this; }
        private static Object responseType = CameraUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/cameras/unassigned", Verbs="GET")
    public static class UnassignedCameras implements IReturn<UnassignedCamerasResponse>
    {

        private static Object responseType = UnassignedCamerasResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfigurations", Verbs="GET")
    public static class DefaultConfigurationsSensors implements IReturn<DefaultConfigurationSensorsResponse>
    {

        private static Object responseType = DefaultConfigurationSensorsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfigurations", Verbs="POST")
    // @Route(Path="/defaultconfigurations", Verbs="PUT")
    public static class DefaultConfigurationCreateOrUpdate implements IReturn<DefaultConfigurationCreateOrUpdateResponse>
    {
        public Integer Id = null;
        public String GatewayType = null;
        public String Type = null;
        public String Protocol = null;
        public String Manufacturer = null;
        public String ManufacturerType = null;
        public String ManufacturerTypeId = null;
        public String ManufacturerName = null;
        public String ManufacturerDeviceName = null;
        public String ManufacturerTypeName = null;
        public String FirmwareVersion = null;
        public String MinGWVersion = null;
        public String Configuration = null;

        public Integer getId() { return Id; }
        public DefaultConfigurationCreateOrUpdate setId(Integer value) { this.Id = value; return this; }
        public String getGatewayType() { return GatewayType; }
        public DefaultConfigurationCreateOrUpdate setGatewayType(String value) { this.GatewayType = value; return this; }
        public String getType() { return Type; }
        public DefaultConfigurationCreateOrUpdate setType(String value) { this.Type = value; return this; }
        public String getProtocol() { return Protocol; }
        public DefaultConfigurationCreateOrUpdate setProtocol(String value) { this.Protocol = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public DefaultConfigurationCreateOrUpdate setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getManufacturerType() { return ManufacturerType; }
        public DefaultConfigurationCreateOrUpdate setManufacturerType(String value) { this.ManufacturerType = value; return this; }
        public String getManufacturerTypeId() { return ManufacturerTypeId; }
        public DefaultConfigurationCreateOrUpdate setManufacturerTypeId(String value) { this.ManufacturerTypeId = value; return this; }
        public String getManufacturerName() { return ManufacturerName; }
        public DefaultConfigurationCreateOrUpdate setManufacturerName(String value) { this.ManufacturerName = value; return this; }
        public String getManufacturerDeviceName() { return ManufacturerDeviceName; }
        public DefaultConfigurationCreateOrUpdate setManufacturerDeviceName(String value) { this.ManufacturerDeviceName = value; return this; }
        public String getManufacturerTypeName() { return ManufacturerTypeName; }
        public DefaultConfigurationCreateOrUpdate setManufacturerTypeName(String value) { this.ManufacturerTypeName = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public DefaultConfigurationCreateOrUpdate setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getMinGWVersion() { return MinGWVersion; }
        public DefaultConfigurationCreateOrUpdate setMinGWVersion(String value) { this.MinGWVersion = value; return this; }
        public String getConfiguration() { return Configuration; }
        public DefaultConfigurationCreateOrUpdate setConfiguration(String value) { this.Configuration = value; return this; }
        private static Object responseType = DefaultConfigurationCreateOrUpdateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfigurations/{Id}/clone", Verbs="POST")
    public static class DefaultConfigurationClone implements IReturn<DefaultConfigurationCloneResponse>
    {
        @ApiMember(Name="Id", Description="Clone Id Source", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String GatewayVersion = null;
        public String FirmwareVersion = null;

        public String getId() { return Id; }
        public DefaultConfigurationClone setId(String value) { this.Id = value; return this; }
        public String getGatewayVersion() { return GatewayVersion; }
        public DefaultConfigurationClone setGatewayVersion(String value) { this.GatewayVersion = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public DefaultConfigurationClone setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        private static Object responseType = DefaultConfigurationCloneResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfigurations/{Id}", Verbs="GET")
    // @Route(Path="/defaultconfigurations/{Id}", Verbs="DELETE")
    public static class DefaultConfigurationSensorById implements IReturn<DefaultConfigurationSensorResponse>
    {
        @ApiMember(Name="GatewayType", Description="Gateway definition", ParameterType="path", DataType="int", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        public Integer Id = null;

        public Integer getId() { return Id; }
        public DefaultConfigurationSensorById setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = DefaultConfigurationSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfiguration", Verbs="GET")
    public static class DefaultConfigurationSensors implements IReturn<DefaultConfigurationSensorsResponse>
    {
        @ApiMember(Name="GatewayType", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String GatewayType = null;

        @ApiMember(Name="LastUpdate", Description="Last Update", ParameterType="query", DataType="DateTime", IsRequired=true, Verb="GET")
        public Date LastUpdate = null;

        @ApiMember(Name="GWVersion", Description="GW Version", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String GWVersion = null;

        public String getGatewayType() { return GatewayType; }
        public DefaultConfigurationSensors setGatewayType(String value) { this.GatewayType = value; return this; }
        public Date getLastUpdate() { return LastUpdate; }
        public DefaultConfigurationSensors setLastUpdate(Date value) { this.LastUpdate = value; return this; }
        public String getGwVersion() { return GWVersion; }
        public DefaultConfigurationSensors setGwVersion(String value) { this.GWVersion = value; return this; }
        private static Object responseType = DefaultConfigurationSensorsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfiguration/sensor", Verbs="GET")
    public static class DefaultConfigurationSensor implements IReturn<DefaultConfigurationSensorResponse>
    {
        @ApiMember(Name="GatewayType", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String GatewayType = null;

        @ApiMember(Name="Protocol", Description="Sensor Protocol", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String Protocol = null;

        @ApiMember(Name="Manufacturer", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String Manufacturer = null;

        @ApiMember(Name="ManufacturerType", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String ManufacturerType = null;

        @ApiMember(Name="ManufacturerTypeId", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String ManufacturerTypeId = null;

        @ApiMember(Name="ManufacturerTypeName", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String ManufacturerTypeName = null;

        @ApiMember(Name="FirmwareVersion", Description="Sensor Firmware Version", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String FirmwareVersion = null;

        @ApiMember(Name="GatewayVersion", Description="Gateway version", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String GatewayVersion = null;

        @ApiMember(Name="ConfigurationDate", Description="Configuration Date, used only when we need to check if an update exists from a specific date", ParameterType="query", DataType="DateTime?", Verb="GET")
        public Date ConfigurationDate = null;

        public String getGatewayType() { return GatewayType; }
        public DefaultConfigurationSensor setGatewayType(String value) { this.GatewayType = value; return this; }
        public String getProtocol() { return Protocol; }
        public DefaultConfigurationSensor setProtocol(String value) { this.Protocol = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public DefaultConfigurationSensor setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getManufacturerType() { return ManufacturerType; }
        public DefaultConfigurationSensor setManufacturerType(String value) { this.ManufacturerType = value; return this; }
        public String getManufacturerTypeId() { return ManufacturerTypeId; }
        public DefaultConfigurationSensor setManufacturerTypeId(String value) { this.ManufacturerTypeId = value; return this; }
        public String getManufacturerTypeName() { return ManufacturerTypeName; }
        public DefaultConfigurationSensor setManufacturerTypeName(String value) { this.ManufacturerTypeName = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public DefaultConfigurationSensor setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getGatewayVersion() { return GatewayVersion; }
        public DefaultConfigurationSensor setGatewayVersion(String value) { this.GatewayVersion = value; return this; }
        public Date getConfigurationDate() { return ConfigurationDate; }
        public DefaultConfigurationSensor setConfigurationDate(Date value) { this.ConfigurationDate = value; return this; }
        private static Object responseType = DefaultConfigurationSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfiguration/device", Verbs="GET")
    public static class DefaultConfigurationDevice implements IReturn<DefaultConfigurationSensorsResponse>
    {
        @ApiMember(Name="GatewayType", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String GatewayType = null;

        @ApiMember(Name="Protocol", Description="Sensor Protocol", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String Protocol = null;

        @ApiMember(Name="Manufacturer", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String Manufacturer = null;

        @ApiMember(Name="ManufacturerType", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String ManufacturerType = null;

        @ApiMember(Name="ManufacturerTypeId", Description="Gateway definition", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String ManufacturerTypeId = null;

        @ApiMember(Name="FirmwareVersion", Description="Sensor Firmware Version", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String FirmwareVersion = null;

        @ApiMember(Name="GatewayVersion", Description="Gateway version", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String GatewayVersion = null;

        @ApiMember(Name="ConfigurationDate", Description="Configuration Date, used only when we need to check if an update exists from a specific date", ParameterType="query", DataType="DateTime?", Verb="GET")
        public Date ConfigurationDate = null;

        public String getGatewayType() { return GatewayType; }
        public DefaultConfigurationDevice setGatewayType(String value) { this.GatewayType = value; return this; }
        public String getProtocol() { return Protocol; }
        public DefaultConfigurationDevice setProtocol(String value) { this.Protocol = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public DefaultConfigurationDevice setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getManufacturerType() { return ManufacturerType; }
        public DefaultConfigurationDevice setManufacturerType(String value) { this.ManufacturerType = value; return this; }
        public String getManufacturerTypeId() { return ManufacturerTypeId; }
        public DefaultConfigurationDevice setManufacturerTypeId(String value) { this.ManufacturerTypeId = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public DefaultConfigurationDevice setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getGatewayVersion() { return GatewayVersion; }
        public DefaultConfigurationDevice setGatewayVersion(String value) { this.GatewayVersion = value; return this; }
        public Date getConfigurationDate() { return ConfigurationDate; }
        public DefaultConfigurationDevice setConfigurationDate(Date value) { this.ConfigurationDate = value; return this; }
        private static Object responseType = DefaultConfigurationSensorsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfiguration/wmbussensor/list", Verbs="GET")
    public static class DefaultConfigurationWMBusByManufacturer implements IReturn<DefaultConfigurationWMBusByManufacturerResponse>
    {

        private static Object responseType = DefaultConfigurationWMBusByManufacturerResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfiguration/camera/details", Verbs="GET")
    public static class DefaultConfigurationCameraDetails implements IReturn<DefaultConfigurationCameraDetailsResponse>
    {
        @ApiMember(Name="Manufacturer", Description="Manufacturer name", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String Manufacturer = null;

        @ApiMember(Name="Model", Description="Model name", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String Model = null;

        public String getManufacturer() { return Manufacturer; }
        public DefaultConfigurationCameraDetails setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public DefaultConfigurationCameraDetails setModel(String value) { this.Model = value; return this; }
        private static Object responseType = DefaultConfigurationCameraDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfiguration/camera", Verbs="GET")
    public static class DefaultConfigurationCamera implements IReturn<DefaultConfigurationCameraResponse>
    {

        private static Object responseType = DefaultConfigurationCameraResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/defaultconfiguration/camerabymanufacturer", Verbs="GET")
    public static class DefaultConfigurationCameraByManufacturer implements IReturn<DefaultConfigurationCameraByManufacturerResponse>
    {

        private static Object responseType = DefaultConfigurationCameraByManufacturerResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UserId}/events/", Verbs="GET")
    // @Route(Path="/users/{UserId}/events/{Type}", Verbs="GET")
    public static class EventsBatch implements IReturn<EventsBatchResponse>
    {
        @ApiMember(Name="UserId", Description="Show events for specified user id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        public String UserId = null;

        @ApiMember(Name="Type", Description="Only return events of specified type", ParameterType="path", DataType="string", Verb="GET", ExcludeInSchema=true)
        public String Type = null;

        @ApiMember(Name="Pending", Description="Only return pending events", ParameterType="query", DataType="bool?", Verb="GET")
        public Boolean Pending = null;

        @ApiMember(Name="Page", Description="Page number", ParameterType="query", DataType="int?", Verb="GET")
        public Integer Page = null;

        @ApiMember(Name="PageSize", Description="Page size", ParameterType="query", DataType="int?", Verb="GET")
        public Integer PageSize = null;

        public Date DateFrom = null;
        public Date DateTo = null;
        @ApiMember(Name="InstallationId", Description="Show events for specified installation id", ParameterType="query", DataType="string", Verb="GET")
        public String InstallationId = null;

        public String getUserId() { return UserId; }
        public EventsBatch setUserId(String value) { this.UserId = value; return this; }
        public String getType() { return Type; }
        public EventsBatch setType(String value) { this.Type = value; return this; }
        public Boolean isPending() { return Pending; }
        public EventsBatch setPending(Boolean value) { this.Pending = value; return this; }
        public Integer getPage() { return Page; }
        public EventsBatch setPage(Integer value) { this.Page = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public EventsBatch setPageSize(Integer value) { this.PageSize = value; return this; }
        public Date getDateFrom() { return DateFrom; }
        public EventsBatch setDateFrom(Date value) { this.DateFrom = value; return this; }
        public Date getDateTo() { return DateTo; }
        public EventsBatch setDateTo(Date value) { this.DateTo = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public EventsBatch setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = EventsBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/events/{UserId}/all", Verbs="GET")
    public static class EventsGeneralBatch implements IReturn<EventsGeneralBatchResponse>
    {
        @ApiMember(Name="UserId", Description="Show events for specified user id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String UserId = null;

        @ApiMember(Name="Pending", Description="Only return pending events", ParameterType="query", DataType="bool?", Verb="GET")
        public Boolean Pending = null;

        @ApiMember(Name="Page", Description="Page number", ParameterType="query", DataType="int?", Verb="GET")
        public Integer Page = null;

        @ApiMember(Name="PageSize", Description="Page size", ParameterType="query", DataType="int?", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="DateFrom", Description="DateFrom", ParameterType="query", DataType="DateTime?", Verb="GET")
        public Date DateFrom = null;

        @ApiMember(Name="DateTo", Description="DateTo", ParameterType="query", DataType="DateTime?", Verb="GET")
        public Date DateTo = null;

        public String getUserId() { return UserId; }
        public EventsGeneralBatch setUserId(String value) { this.UserId = value; return this; }
        public Boolean isPending() { return Pending; }
        public EventsGeneralBatch setPending(Boolean value) { this.Pending = value; return this; }
        public Integer getPage() { return Page; }
        public EventsGeneralBatch setPage(Integer value) { this.Page = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public EventsGeneralBatch setPageSize(Integer value) { this.PageSize = value; return this; }
        public Date getDateFrom() { return DateFrom; }
        public EventsGeneralBatch setDateFrom(Date value) { this.DateFrom = value; return this; }
        public Date getDateTo() { return DateTo; }
        public EventsGeneralBatch setDateTo(Date value) { this.DateTo = value; return this; }
        private static Object responseType = EventsGeneralBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/events", Verbs="POST")
    public static class Events implements IReturn<EventsResponse>
    {
        public AzureEvent Event = null;
        public ArrayList<Integer> UserIds = null;
        public String Type = null;
        public Date DateFrom = null;
        public Date DateTo = null;

        public AzureEvent getEvent() { return Event; }
        public Events setEvent(AzureEvent value) { this.Event = value; return this; }
        public ArrayList<Integer> getUserIds() { return UserIds; }
        public Events setUserIds(ArrayList<Integer> value) { this.UserIds = value; return this; }
        public String getType() { return Type; }
        public Events setType(String value) { this.Type = value; return this; }
        public Date getDateFrom() { return DateFrom; }
        public Events setDateFrom(Date value) { this.DateFrom = value; return this; }
        public Date getDateTo() { return DateTo; }
        public Events setDateTo(Date value) { this.DateTo = value; return this; }
        private static Object responseType = EventsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UserId}/events/{EventType}/pending", Verbs="PUT")
    public static class EventsForTypePendingBatch implements IReturn<EventsPendingResponse>
    {
        @ApiMember(Name="UserId", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="PUT", ExcludeInSchema=true)
        public String UserId = null;

        @ApiMember(Name="Type", Description="Event type", ParameterType="path", DataType="string", IsRequired=true, Verb="PUT", ExcludeInSchema=true)
        public String EventType = null;

        @ApiMember(Name="InstallationId", Description="Installation id", ParameterType="query", DataType="string", Verb="PUT", ExcludeInSchema=true)
        public String InstallationId = null;

        public String getUserId() { return UserId; }
        public EventsForTypePendingBatch setUserId(String value) { this.UserId = value; return this; }
        public String getEventType() { return EventType; }
        public EventsForTypePendingBatch setEventType(String value) { this.EventType = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public EventsForTypePendingBatch setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = EventsPendingResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UserId}/events/{EventId}/togglePending", Verbs="PATCH")
    public static class EventsPending implements IReturn<EventsPendingResponse>
    {
        @ApiMember(Name="UserId", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String UserId = null;

        @ApiMember(Name="EventId", Description="Events to be updated", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String EventId = null;

        public String getUserId() { return UserId; }
        public EventsPending setUserId(String value) { this.UserId = value; return this; }
        public String getEventId() { return EventId; }
        public EventsPending setEventId(String value) { this.EventId = value; return this; }
        private static Object responseType = EventsPendingResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{UserId}/events/{EventId}/delete", Verbs="DELETE")
    public static class EventsDelete
    {
        @ApiMember(Name="UserId", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="DELETE", ExcludeInSchema=true)
        public String UserId = null;

        @ApiMember(Name="EventId", Description="Event id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="DELETE", ExcludeInSchema=true)
        public String EventId = null;

        public String getUserId() { return UserId; }
        public EventsDelete setUserId(String value) { this.UserId = value; return this; }
        public String getEventId() { return EventId; }
        public EventsDelete setEventId(String value) { this.EventId = value; return this; }
    }

    @Route(Path="/users/{Id}/events/admin", Verbs="POST")
    public static class EventsAdminSentNotification implements IReturn<EventsAdminSentNotificationResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="int", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public Integer Id = null;

        @ApiMember(Name="Event", Description="Event", ParameterType="body", DataType="AzureEvent", IsRequired=true, Verb="POST")
        public AzureEvent Event = null;

        public Integer getId() { return Id; }
        public EventsAdminSentNotification setId(Integer value) { this.Id = value; return this; }
        public AzureEvent getEvent() { return Event; }
        public EventsAdminSentNotification setEvent(AzureEvent value) { this.Event = value; return this; }
        private static Object responseType = EventsAdminSentNotificationResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/events/{UserId}/{EventId}/lastPhoto/", Verbs="GET")
    public static class EventPhoto
    {
        @ApiMember(Name="UserId", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String UserId = null;

        @ApiMember(Name="EventId", Description="Event id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String EventId = null;

        public String getUserId() { return UserId; }
        public EventPhoto setUserId(String value) { this.UserId = value; return this; }
        public String getEventId() { return EventId; }
        public EventPhoto setEventId(String value) { this.EventId = value; return this; }
    }

    @Route(Path="/users/{UserId}/events/count", Verbs="GET")
    // @Route(Path="/users/{UserId}/events/{Type}/count", Verbs="GET")
    public static class EventsCount implements IReturn<EventsCountResponse>
    {
        @ApiMember(Name="UserId", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String UserId = null;

        @ApiMember(Name="Type", Description="Events type filter", ParameterType="path", DataType="string", Verb="GET")
        public String Type = null;

        @ApiMember(Name="Pending", Description="Pending events filter", ParameterType="query", DataType="bool", Verb="GET")
        public Boolean Pending = null;

        @ApiMember(Name="DateFrom", Description="Date from filter", ParameterType="query", DataType="DateTime?", Verb="GET")
        public Date DateFrom = null;

        @ApiMember(Name="DateTo", Description="Date to filter", ParameterType="query", DataType="DateTime?", Verb="GET")
        public Date DateTo = null;

        public String getUserId() { return UserId; }
        public EventsCount setUserId(String value) { this.UserId = value; return this; }
        public String getType() { return Type; }
        public EventsCount setType(String value) { this.Type = value; return this; }
        public Boolean isPending() { return Pending; }
        public EventsCount setPending(Boolean value) { this.Pending = value; return this; }
        public Date getDateFrom() { return DateFrom; }
        public EventsCount setDateFrom(Date value) { this.DateFrom = value; return this; }
        public Date getDateTo() { return DateTo; }
        public EventsCount setDateTo(Date value) { this.DateTo = value; return this; }
        private static Object responseType = EventsCountResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/events/old", Verbs="PATCH")
    // @Route(Path="/events/old", Verbs="DELETE")
    public static class EventsOld implements IReturn<EventsOldResponse>
    {

        private static Object responseType = EventsOldResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/events/pending/notify", Verbs="POST")
    public static class EventsPendingCountNotify implements IReturn<EventsPendingCountNotifyResponse>
    {
        @ApiMember(Name="UserIds", Description="User ids", ParameterType="body", DataType="List<int>", IsRequired=true, Verb="POST")
        public ArrayList<Integer> UserIds = null;

        public ArrayList<Integer> getUserIds() { return UserIds; }
        public EventsPendingCountNotify setUserIds(ArrayList<Integer> value) { this.UserIds = value; return this; }
        private static Object responseType = EventsPendingCountNotifyResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/forgottenpassword", Verbs="POST")
    public static class UserForgottenPassword implements IReturn<UserForgottenPasswordResponse>
    {
        @ApiMember(Name="Email", Description="User's email", ParameterType="body", DataType="string", IsRequired=true, Verb="POST")
        public String Email = null;

        public String getEmail() { return Email; }
        public UserForgottenPassword setEmail(String value) { this.Email = value; return this; }
        private static Object responseType = UserForgottenPasswordResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/passwordreset", Verbs="PATCH")
    public static class UserPasswordReset implements IReturn<UserPasswordResetResponse>
    {
        public UUID Token = null;
        public String Password = null;
        public String PasswordValidation = null;

        public UUID getToken() { return Token; }
        public UserPasswordReset setToken(UUID value) { this.Token = value; return this; }
        public String getPassword() { return Password; }
        public UserPasswordReset setPassword(String value) { this.Password = value; return this; }
        public String getPasswordValidation() { return PasswordValidation; }
        public UserPasswordReset setPasswordValidation(String value) { this.PasswordValidation = value; return this; }
        private static Object responseType = UserPasswordResetResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/passwordresettoken/validate", Verbs="GET")
    public static class UserPasswordResetTokenValidation implements IReturn<UserPasswordResetTokenValidationResponse>
    {
        @ApiMember(Name="Token", Description="Password reset token", ParameterType="query", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Token = null;

        public UUID getToken() { return Token; }
        public UserPasswordResetTokenValidation setToken(UUID value) { this.Token = value; return this; }
        private static Object responseType = UserPasswordResetTokenValidationResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/activate", Verbs="GET")
    // @Route(Path="/gateways/{Id}/activate", Verbs="POST")
    public static class GatewayActivate implements IReturn<GatewayActivateResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayActivate setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayActivateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{GatewayId}/block", Verbs="GET")
    // @Route(Path="/gateways/{GatewayId}/block", Verbs="POST")
    public static class GatewayToggleBlockedStatus implements IReturn<GatewayToggleBlockedStatusResponse>
    {
        @ApiMember(Name="GatewayId", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID GatewayId = null;

        public UUID getGatewayId() { return GatewayId; }
        public GatewayToggleBlockedStatus setGatewayId(UUID value) { this.GatewayId = value; return this; }
        private static Object responseType = GatewayToggleBlockedStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{GatewayId}/unblock", Verbs="POST")
    public static class GatewayToggleUnblockedStatus implements IReturn<GatewayToggleUnblockedStatusResponse>
    {
        @ApiMember(Name="GatewayId", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public UUID GatewayId = null;

        public UUID getGatewayId() { return GatewayId; }
        public GatewayToggleUnblockedStatus setGatewayId(UUID value) { this.GatewayId = value; return this; }
        private static Object responseType = GatewayToggleUnblockedStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/livemode", Verbs="POST")
    public static class GatewayLiveMode implements IReturn<GatewayLiveModeResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayLiveMode setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayLiveModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/restart", Verbs="POST")
    public static class GatewayRestart implements IReturn<GatewayRestartResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayRestart setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayRestartResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/shutdown", Verbs="POST")
    public static class GatewayShutdown implements IReturn<GatewayShutdownResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayShutdown setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayShutdownResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/apiurl", Verbs="POST")
    public static class GatewayApiURL implements IReturn<GatewayApiURLResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ApiURL", Description="Api URL", ParameterType="body", DataType="string", IsRequired=true)
        public String ApiURL = null;

        public String getId() { return Id; }
        public GatewayApiURL setId(String value) { this.Id = value; return this; }
        public String getApiURL() { return ApiURL; }
        public GatewayApiURL setApiURL(String value) { this.ApiURL = value; return this; }
        private static Object responseType = GatewayApiURLResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/sbstring", Verbs="POST")
    public static class GatewayServiceBusString implements IReturn<GatewayServiceBusStringResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SBString", Description="SB Connection String", ParameterType="body", DataType="string", IsRequired=true)
        public String SBString = null;

        public String getId() { return Id; }
        public GatewayServiceBusString setId(String value) { this.Id = value; return this; }
        public String getSbString() { return SBString; }
        public GatewayServiceBusString setSbString(String value) { this.SBString = value; return this; }
        private static Object responseType = GatewayServiceBusStringResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/csstring", Verbs="POST")
    public static class GatewayCloudStorageString implements IReturn<GatewayCloudStorageStringResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="CSString", Description="CS Connection String", ParameterType="body", DataType="string", IsRequired=true)
        public String CSString = null;

        public String getId() { return Id; }
        public GatewayCloudStorageString setId(String value) { this.Id = value; return this; }
        public String getCsString() { return CSString; }
        public GatewayCloudStorageString setCsString(String value) { this.CSString = value; return this; }
        private static Object responseType = GatewayCloudStorageStringResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/iothubstring", Verbs="POST")
    public static class GatewayIoTHubString implements IReturn<GatewayIoTHubStringResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="IoTHubString", Description="IoT Hub Connection String", ParameterType="body", DataType="string", IsRequired=true)
        public String IoTHubString = null;

        public String getId() { return Id; }
        public GatewayIoTHubString setId(String value) { this.Id = value; return this; }
        public String getIoTHubString() { return IoTHubString; }
        public GatewayIoTHubString setIoTHubString(String value) { this.IoTHubString = value; return this; }
        private static Object responseType = GatewayIoTHubStringResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/logging/toggle", Verbs="POST")
    public static class GatewayLoggingToggle implements IReturn<GatewayLoggingToggleResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="LoggingState", Description="LoggingState", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean LoggingState = null;

        public String getId() { return Id; }
        public GatewayLoggingToggle setId(String value) { this.Id = value; return this; }
        public Boolean isLoggingState() { return LoggingState; }
        public GatewayLoggingToggle setLoggingState(Boolean value) { this.LoggingState = value; return this; }
        private static Object responseType = GatewayLoggingToggleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/update", Verbs="POST")
    public static class GatewayUpdate implements IReturn<GatewayUpdateResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayUpdate setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayUpdateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/unregister", Verbs="POST")
    public static class GatewayUnregister implements IReturn<GatewayUnregisterResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayUnregister setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayUnregisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/backup/create", Verbs="POST")
    public static class GatewayCreateBackup implements IReturn<GatewayCreateBackupResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayCreateBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayCreateBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/backup/restore", Verbs="POST")
    public static class GatewayRestoreBackup implements IReturn<GatewayRestoreBackupResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayRestoreBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayRestoreBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/backup/createsystem", Verbs="POST")
    public static class GatewayCreateSystemBackup implements IReturn<GatewayCreateSystemBackupResponse>
    {
        /**
         * Gateway Id
         */
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayCreateSystemBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayCreateSystemBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/backup/restoresystem", Verbs="POST")
    public static class GatewayRestoreSystemBackup implements IReturn<GatewayRestoreSystemBackupResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayRestoreSystemBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayRestoreSystemBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/backup/system/otherversions/{Version}", Verbs="DELETE")
    public static class GatewaySystemBackupOtherVersions implements IReturn<GatewaySystemBackupOtherVersionsResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="Version", Description="Version", ParameterType="path", DataType="string", IsRequired=true)
        public String Version = null;

        public String getId() { return Id; }
        public GatewaySystemBackupOtherVersions setId(String value) { this.Id = value; return this; }
        public String getVersion() { return Version; }
        public GatewaySystemBackupOtherVersions setVersion(String value) { this.Version = value; return this; }
        private static Object responseType = GatewaySystemBackupOtherVersionsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/securityStatus", Verbs="POST")
    public static class GatewaySetSecurityStatus implements IReturn<GatewaySetSecurityStatusResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String SecurityStatus = null;
        public String UserId = null;

        public String getId() { return Id; }
        public GatewaySetSecurityStatus setId(String value) { this.Id = value; return this; }
        public String getSecurityStatus() { return SecurityStatus; }
        public GatewaySetSecurityStatus setSecurityStatus(String value) { this.SecurityStatus = value; return this; }
        public String getUserId() { return UserId; }
        public GatewaySetSecurityStatus setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewaySetSecurityStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/addonesensormode", Verbs="POST")
    public static class GatewaySetAddOneSensorMode implements IReturn<GatewaySetAddOneSensorModeResponse>
    {
        @ApiMember(Name="Id", Description="Id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewaySetAddOneSensorMode setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewaySetAddOneSensorModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/removeonesensormode", Verbs="POST")
    public static class GatewaySetRemoveOneSensorMode implements IReturn<GatewaySetRemoveOneSensorModeResponse>
    {
        @ApiMember(Name="Id", Description="Id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewaySetRemoveOneSensorMode setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewaySetRemoveOneSensorModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/network/close", Verbs="POST")
    public static class GatewayNetworkClose implements IReturn<GatewayNetworkCloseResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayNetworkClose setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayNetworkCloseResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/networkmaintenance", Verbs="POST")
    public static class GatewayNetworkMaintenance implements IReturn<GatewayNetworkMaintenanceResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayNetworkMaintenance setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayNetworkMaintenanceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/Sensors/{SensorId}/writeregister", Verbs="POST")
    public static class GatewayWriteRegister implements IReturn<GatewayWriteRegisterResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String SensorId = null;

        @ApiMember(Name="RegConfig", Description="Register number to write", ParameterType="body", DataType="ZWaveConfiguration", IsRequired=true)
        public ZWaveRegister RegConfig = null;

        public String getId() { return Id; }
        public GatewayWriteRegister setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayWriteRegister setSensorId(String value) { this.SensorId = value; return this; }
        public ZWaveRegister getRegConfig() { return RegConfig; }
        public GatewayWriteRegister setRegConfig(ZWaveRegister value) { this.RegConfig = value; return this; }
        private static Object responseType = GatewayWriteRegisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/Sensors/{SensorId}/writeregisters", Verbs="POST")
    public static class GatewayWriteRegisters implements IReturn<GatewayWriteRegistersResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String SensorId = null;

        @ApiMember(Name="RegConfig", Description="Register numbers to write", ParameterType="body", DataType="List<ZWaveConfiguration>", IsRequired=true)
        public ArrayList<ZWaveRegister> RegConfig = null;

        public String getId() { return Id; }
        public GatewayWriteRegisters setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayWriteRegisters setSensorId(String value) { this.SensorId = value; return this; }
        public ArrayList<ZWaveRegister> getRegConfig() { return RegConfig; }
        public GatewayWriteRegisters setRegConfig(ArrayList<ZWaveRegister> value) { this.RegConfig = value; return this; }
        private static Object responseType = GatewayWriteRegistersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/addwmbussensor", Verbs="POST")
    public static class GatewayAddWMBusSensor implements IReturn<GatewayAddWMBusSensorResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String SerialId = null;
        public String Key = null;
        public String Manufacturer = null;
        public String Model = null;
        public String Version = null;
        public String SensorId = null;
        public Double AccumulatedScale = null;
        public Double InstantScale = null;

        public String getId() { return Id; }
        public GatewayAddWMBusSensor setId(String value) { this.Id = value; return this; }
        public String getSerialId() { return SerialId; }
        public GatewayAddWMBusSensor setSerialId(String value) { this.SerialId = value; return this; }
        public String getKey() { return Key; }
        public GatewayAddWMBusSensor setKey(String value) { this.Key = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public GatewayAddWMBusSensor setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public GatewayAddWMBusSensor setModel(String value) { this.Model = value; return this; }
        public String getVersion() { return Version; }
        public GatewayAddWMBusSensor setVersion(String value) { this.Version = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayAddWMBusSensor setSensorId(String value) { this.SensorId = value; return this; }
        public Double getAccumulatedScale() { return AccumulatedScale; }
        public GatewayAddWMBusSensor setAccumulatedScale(Double value) { this.AccumulatedScale = value; return this; }
        public Double getInstantScale() { return InstantScale; }
        public GatewayAddWMBusSensor setInstantScale(Double value) { this.InstantScale = value; return this; }
        private static Object responseType = GatewayAddWMBusSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/addwibeeesensor", Verbs="POST")
    public static class GatewayAddWibeeeSensor implements IReturn<GatewayAddWibeeeSensorResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String SensorId = null;
        public String MAC = null;

        public String getId() { return Id; }
        public GatewayAddWibeeeSensor setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayAddWibeeeSensor setSensorId(String value) { this.SensorId = value; return this; }
        public String getMac() { return MAC; }
        public GatewayAddWibeeeSensor setMac(String value) { this.MAC = value; return this; }
        private static Object responseType = GatewayAddWibeeeSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/logstreaming/devicesinfo", Verbs="GET")
    public static class GatewayLogStreamingDevicesInfo implements IReturn<GatewayLogStreamingDevicesInfoResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayLogStreamingDevicesInfo setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayLogStreamingDevicesInfoResponse.class;
        public Object getResponseType() { return responseType; }
    }


    @Route(Path="/installations/{Id}/adddevice", Verbs="POST")
    public static class InstallationAddDevice implements IReturn<InstallationAddDeviceResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Device", Description="Device", ParameterType="body", DataType="Device", IsRequired=true)
        public Device Device = null;

        public String getId() { return Id; }
        public InstallationAddDevice setId(String value) { this.Id = value; return this; }
        public Device getDevice() { return Device; }
        public InstallationAddDevice setDevice(Device value) { this.Device = value; return this; }
        private static Object responseType = InstallationAddDeviceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/thermostat/{ThermostatId}/setpoint", Verbs="POST")
    public static class GatewayThermostatSetPoint implements IReturn<GatewayThermostatSetPointResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ThermostatId", Description="ThermostatId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String ThermostatId = null;

        public Double Value = null;
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayThermostatSetPoint setId(String value) { this.Id = value; return this; }
        public String getThermostatId() { return ThermostatId; }
        public GatewayThermostatSetPoint setThermostatId(String value) { this.ThermostatId = value; return this; }
        public Double getValue() { return Value; }
        public GatewayThermostatSetPoint setValue(Double value) { this.Value = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayThermostatSetPoint setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayThermostatSetPointResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/thermostat/{ThermostatId}/main", Verbs="POST")
    public static class GatewayThermostatMain implements IReturn<GatewayThermostatMainResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ThermostatId", Description="ThermostatId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String ThermostatId = null;

        @ApiMember(Name="UserId", Description="UserId", ParameterType="body", DataType="string", IsRequired=true, Verb="POST")
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayThermostatMain setId(String value) { this.Id = value; return this; }
        public String getThermostatId() { return ThermostatId; }
        public GatewayThermostatMain setThermostatId(String value) { this.ThermostatId = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayThermostatMain setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayThermostatMainResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/thermostat/{SensorId}/toggle", Verbs="POST")
    public static class GatewayThermostatMode implements IReturn<GatewayThermostatModeResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ThermostatId", Description="ThermostatId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String ThermostatId = null;

        public SensorThermostatMode Mode = null;
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayThermostatMode setId(String value) { this.Id = value; return this; }
        public String getThermostatId() { return ThermostatId; }
        public GatewayThermostatMode setThermostatId(String value) { this.ThermostatId = value; return this; }
        public SensorThermostatMode getMode() { return Mode; }
        public GatewayThermostatMode setMode(SensorThermostatMode value) { this.Mode = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayThermostatMode setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayThermostatModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/thermostat/{ThermostatId}/link", Verbs="POST")
    public static class GatewayThermostatLink implements IReturn<GatewayThermostatLinkResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ThermostatId", Description="ThermostatId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String ThermostatId = null;

        public Boolean Link = null;
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayThermostatLink setId(String value) { this.Id = value; return this; }
        public String getThermostatId() { return ThermostatId; }
        public GatewayThermostatLink setThermostatId(String value) { this.ThermostatId = value; return this; }
        public Boolean isLink() { return Link; }
        public GatewayThermostatLink setLink(Boolean value) { this.Link = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayThermostatLink setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayThermostatLinkResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/addsupportedcamera", Verbs="POST")
    public static class GatewayAddCamera implements IReturn<GatewayAddCameraResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Camera", Description="Camera", ParameterType="body", DataType="Camera", IsRequired=true, Verb="POST")
        public Camera Camera = null;

        public String getId() { return Id; }
        public GatewayAddCamera setId(String value) { this.Id = value; return this; }
        public Camera getCamera() { return Camera; }
        public GatewayAddCamera setCamera(Camera value) { this.Camera = value; return this; }
        private static Object responseType = GatewayAddCameraResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/updatecamera", Verbs="POST")
    public static class GatewayUpdateCamera implements IReturn<GatewayUpdateCameraResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Camera", Description="Camera", ParameterType="body", DataType="Camera", IsRequired=true, Verb="POST")
        public Camera Camera = null;

        public String getId() { return Id; }
        public GatewayUpdateCamera setId(String value) { this.Id = value; return this; }
        public Camera getCamera() { return Camera; }
        public GatewayUpdateCamera setCamera(Camera value) { this.Camera = value; return this; }
        private static Object responseType = GatewayUpdateCameraResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/camera/{CameraId}/picture", Verbs="POST")
    public static class GatewayCameraPicture implements IReturn<GatewayCameraPictureResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="CameraId", Description="CameraId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String CameraId = null;

        @ApiMember(Name="UserId", Description="UserId", ParameterType="body", DataType="string", IsRequired=true, Verb="POST")
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayCameraPicture setId(String value) { this.Id = value; return this; }
        public String getCameraId() { return CameraId; }
        public GatewayCameraPicture setCameraId(String value) { this.CameraId = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayCameraPicture setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayCameraPictureResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/camera/{CameraId}/video", Verbs="POST")
    public static class GatewayCameraVideo implements IReturn<GatewayCameraVideoResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="CameraId", Description="CameraId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String CameraId = null;

        public String getId() { return Id; }
        public GatewayCameraVideo setId(String value) { this.Id = value; return this; }
        public String getCameraId() { return CameraId; }
        public GatewayCameraVideo setCameraId(String value) { this.CameraId = value; return this; }
        private static Object responseType = GatewayCameraVideoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/camera/{CameraId}", Verbs="DELETE")
    public static class GatewayCameraRemove implements IReturn<GatewayCameraRemoveResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="DELETE", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="CameraId", Description="CameraId", ParameterType="path", DataType="string", IsRequired=true, Verb="DELETE", ExcludeInSchema=true)
        public String CameraId = null;

        public String getId() { return Id; }
        public GatewayCameraRemove setId(String value) { this.Id = value; return this; }
        public String getCameraId() { return CameraId; }
        public GatewayCameraRemove setCameraId(String value) { this.CameraId = value; return this; }
        private static Object responseType = GatewayCameraRemoveResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/addschedule", Verbs="POST")
    public static class GatewayAddSchedule implements IReturn<GatewayAddScheduleResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String Type = null;
        public SchedulerPoint Point = null;

        public String getId() { return Id; }
        public GatewayAddSchedule setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public GatewayAddSchedule setType(String value) { this.Type = value; return this; }
        public SchedulerPoint getPoint() { return Point; }
        public GatewayAddSchedule setPoint(SchedulerPoint value) { this.Point = value; return this; }
        private static Object responseType = GatewayAddScheduleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/removeschedule", Verbs="POST")
    public static class GatewayRemoveSchedule implements IReturn<GatewayRemoveScheduleResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String Type = null;
        public SchedulerPoint Point = null;

        public String getId() { return Id; }
        public GatewayRemoveSchedule setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public GatewayRemoveSchedule setType(String value) { this.Type = value; return this; }
        public SchedulerPoint getPoint() { return Point; }
        public GatewayRemoveSchedule setPoint(SchedulerPoint value) { this.Point = value; return this; }
        private static Object responseType = GatewayRemoveScheduleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/pauseschedule", Verbs="POST")
    public static class GatewayPauseSchedule implements IReturn<GatewayPauseScheduleResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String Type = null;
        public Boolean Pause = null;

        public String getId() { return Id; }
        public GatewayPauseSchedule setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public GatewayPauseSchedule setType(String value) { this.Type = value; return this; }
        public Boolean isPause() { return Pause; }
        public GatewayPauseSchedule setPause(Boolean value) { this.Pause = value; return this; }
        private static Object responseType = GatewayPauseScheduleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/sensor/{sensorId}/configure", Verbs="GET")
    public static class GatewayConfigureSensor implements IReturn<GatewayConfigureSensorResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="SensorId", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String SensorId = null;

        @ApiMember(Name="SensorConfiguration", Description="Sensor Configuration", ParameterType="body", DataType="SensorConfiguration", IsRequired=true)
        public SensorConfiguration Configuration = null;

        public UUID getId() { return Id; }
        public GatewayConfigureSensor setId(UUID value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayConfigureSensor setSensorId(String value) { this.SensorId = value; return this; }
        public SensorConfiguration getConfiguration() { return Configuration; }
        public GatewayConfigureSensor setConfiguration(SensorConfiguration value) { this.Configuration = value; return this; }
        private static Object responseType = GatewayConfigureSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/sensor/{SensorId}/updateProperty", Verbs="POST")
    public static class GatewayUpdateProperties implements IReturn<GatewayUpdatePropertiesResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="SensorId", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String SensorId = null;

        public HashMap<String,Object> Properties = null;

        public UUID getId() { return Id; }
        public GatewayUpdateProperties setId(UUID value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayUpdateProperties setSensorId(String value) { this.SensorId = value; return this; }
        public HashMap<String,Object> getProperties() { return Properties; }
        public GatewayUpdateProperties setProperties(HashMap<String,Object> value) { this.Properties = value; return this; }
        private static Object responseType = GatewayUpdatePropertiesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/actuator/{ActuatorId}/toggle", Verbs="POST")
    public static class GatewayActuatorToggle implements IReturn<GatewayActuatorToggleResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ActuatorId", Description="ActuatorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String ActuatorId = null;

        public String Value = null;
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayActuatorToggle setId(String value) { this.Id = value; return this; }
        public String getActuatorId() { return ActuatorId; }
        public GatewayActuatorToggle setActuatorId(String value) { this.ActuatorId = value; return this; }
        public String getValue() { return Value; }
        public GatewayActuatorToggle setValue(String value) { this.Value = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayActuatorToggle setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayActuatorToggleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/dimmer/{DimmerId}/toggle", Verbs="POST")
    public static class GatewayDimmerToggle implements IReturn<GatewayDimmerToggleResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="DimmerId", Description="DimmerId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String DimmerId = null;

        public Integer Value = null;
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayDimmerToggle setId(String value) { this.Id = value; return this; }
        public String getDimmerId() { return DimmerId; }
        public GatewayDimmerToggle setDimmerId(String value) { this.DimmerId = value; return this; }
        public Integer getValue() { return Value; }
        public GatewayDimmerToggle setValue(Integer value) { this.Value = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayDimmerToggle setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayDimmerToggleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/bypass/{SensorId}", Verbs="POST")
    public static class GatewayBypassSensor implements IReturn<GatewayBypassSensorResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="Sensor Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String SensorId = null;

        @ApiMember(Name="BypassStatus", Description="Bypass Status (true or false)", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean BypassStatus = null;

        public String getId() { return Id; }
        public GatewayBypassSensor setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayBypassSensor setSensorId(String value) { this.SensorId = value; return this; }
        public Boolean isBypassStatus() { return BypassStatus; }
        public GatewayBypassSensor setBypassStatus(Boolean value) { this.BypassStatus = value; return this; }
        private static Object responseType = GatewayBypassSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/sensor/{SensorId}/removeforce", Verbs="POST")
    public static class GatewayRemoveSensorForce implements IReturn<GatewayRemoveSensorForceResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="SensorId", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String SensorId = null;

        public UUID getId() { return Id; }
        public GatewayRemoveSensorForce setId(UUID value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayRemoveSensorForce setSensorId(String value) { this.SensorId = value; return this; }
        private static Object responseType = GatewayRemoveSensorForceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/synchronize/sensordata", Verbs="POST")
    public static class GatewaySynchronizeSensorData implements IReturn<GatewaySynchronizeSensorDataResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewaySynchronizeSensorData setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewaySynchronizeSensorDataResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/doorLock/{SensorId}/toggle", Verbs="POST")
    public static class GatewayDoorLockToggle implements IReturn<GatewayDoorLockToggleResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String SensorId = null;

        public Boolean Lock = null;
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayDoorLockToggle setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayDoorLockToggle setSensorId(String value) { this.SensorId = value; return this; }
        public Boolean isLock() { return Lock; }
        public GatewayDoorLockToggle setLock(Boolean value) { this.Lock = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayDoorLockToggle setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayDoorLockToggleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/doorLock/{SensorId}/setpassword", Verbs="POST")
    public static class GatewayDoorLockSetPassword implements IReturn<GatewayDoorLockSetPasswordResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String SensorId = null;

        public String Password = null;

        public String getId() { return Id; }
        public GatewayDoorLockSetPassword setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayDoorLockSetPassword setSensorId(String value) { this.SensorId = value; return this; }
        public String getPassword() { return Password; }
        public GatewayDoorLockSetPassword setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = GatewayDoorLockSetPasswordResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/setsensorsmetadata", Verbs="POST")
    public static class GatewaySetSensorsMetadata implements IReturn<GatewaySetSensorsMetadataResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Metadata", Description="Metadata", ParameterType="body", DataType="Dictionary<sting, Dictionary<string, object>>", IsRequired=true, Verb="POST")
        public HashMap<String,HashMap<String,Object>> Metadata = null;

        public String getId() { return Id; }
        public GatewaySetSensorsMetadata setId(String value) { this.Id = value; return this; }
        public HashMap<String,HashMap<String,Object>> getMetadata() { return Metadata; }
        public GatewaySetSensorsMetadata setMetadata(HashMap<String,HashMap<String,Object>> value) { this.Metadata = value; return this; }
        private static Object responseType = GatewaySetSensorsMetadataResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/addorupdateusers", Verbs="POST")
    public static class GatewayAddOrUpdateUsers implements IReturn<GatewayAddOrUpdateUsersResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Users", Description="Users", ParameterType="body", DataType="List<UserAuth>", IsRequired=true, Verb="POST")
        public ArrayList<UserAuthWithCredentials> Users = null;

        public String getId() { return Id; }
        public GatewayAddOrUpdateUsers setId(String value) { this.Id = value; return this; }
        public ArrayList<UserAuthWithCredentials> getUsers() { return Users; }
        public GatewayAddOrUpdateUsers setUsers(ArrayList<UserAuthWithCredentials> value) { this.Users = value; return this; }
        private static Object responseType = GatewayAddOrUpdateUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/removeusers", Verbs="POST")
    public static class GatewayRemoveUsers implements IReturn<GatewayRemoveUsersResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="UserIds", Description="UserIds", ParameterType="body", DataType="List<int>", IsRequired=true, Verb="POST")
        public ArrayList<Integer> UserIds = null;

        public String getId() { return Id; }
        public GatewayRemoveUsers setId(String value) { this.Id = value; return this; }
        public ArrayList<Integer> getUserIds() { return UserIds; }
        public GatewayRemoveUsers setUserIds(ArrayList<Integer> value) { this.UserIds = value; return this; }
        private static Object responseType = GatewayRemoveUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/clearusers", Verbs="POST")
    public static class GatewayClearUsers implements IReturn<GatewayClearUsersResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayClearUsers setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayClearUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/syncusers", Verbs="POST")
    public static class GatewaySyncUsers implements IReturn<GatewaySyncUsersResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewaySyncUsers setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewaySyncUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/syncsensorsmetadata", Verbs="POST")
    public static class GatewaySyncSensorsMetadata implements IReturn<GatewaySyncSensorsMetadataResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewaySyncSensorsMetadata setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewaySyncSensorsMetadataResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/thermostat/{SensorId}/fanmode", Verbs="PATCH")
    public static class GatewayThermostatFanMode implements IReturn<GatewayThermostatFanModeResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ThermostatId", Description="Thermostat Id", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String ThermostatId = null;

        public SensorThermostatFanMode FanMode = null;
        public String UserId = null;

        public String getId() { return Id; }
        public GatewayThermostatFanMode setId(String value) { this.Id = value; return this; }
        public String getThermostatId() { return ThermostatId; }
        public GatewayThermostatFanMode setThermostatId(String value) { this.ThermostatId = value; return this; }
        public SensorThermostatFanMode getFanMode() { return FanMode; }
        public GatewayThermostatFanMode setFanMode(SensorThermostatFanMode value) { this.FanMode = value; return this; }
        public String getUserId() { return UserId; }
        public GatewayThermostatFanMode setUserId(String value) { this.UserId = value; return this; }
        private static Object responseType = GatewayThermostatFanModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/ping", Verbs="POST")
    public static class GatewayPing implements IReturn<GatewayPingResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayPing setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayPingResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/tunnel/open", Verbs="POST")
    public static class GatewayTunnelOpen implements IReturn<GatewayTunnelOpenResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayTunnelOpen setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayTunnelOpenResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/tunnel/close", Verbs="POST")
    public static class GatewayTunnelClose implements IReturn<GatewayTunnelCloseResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayTunnelClose setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayTunnelCloseResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/logs/update", Verbs="POST")
    // @Route(Path="/gateways/{Id}/logs", Verbs="PUT")
    // @Route(Path="/gateways/{Id}/logs", Verbs="GET")
    public static class GatewayLogs implements IReturn<GatewayLogsResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="LogName", Description="LogName", ParameterType="body", DataType="string", IsRequired=true, Verb="PUT")
        public String LogName = null;

        public String getId() { return Id; }
        public GatewayLogs setId(String value) { this.Id = value; return this; }
        public String getLogName() { return LogName; }
        public GatewayLogs setLogName(String value) { this.LogName = value; return this; }
        private static Object responseType = GatewayLogsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/routinginfo", Verbs="GET")
    public static class GatewayRoutingInfo implements IReturn<GatewayRoutingInfoResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayRoutingInfo setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayRoutingInfoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/checkupdate", Verbs="GET")
    public static class GatewayCheckUpdate implements IReturn<GatewayCheckUpdateResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayCheckUpdate setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayCheckUpdateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/network/status", Verbs="GET")
    public static class GatewayNetworkStatus implements IReturn<GatewayNetworkStatusResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayNetworkStatus setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayNetworkStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/devices", Verbs="GET")
    public static class GatewayDevices implements IReturn<GatewayDevicesResponse>
    {
        @ApiMember(Name="Id", Description="Id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayDevices setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayDevicesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/sensor/{sensorId}/poll", Verbs="GET")
    public static class GatewaySensorPoll implements IReturn<GatewaySensorPollResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String SensorId = null;

        public String getId() { return Id; }
        public GatewaySensorPoll setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewaySensorPoll setSensorId(String value) { this.SensorId = value; return this; }
        private static Object responseType = GatewaySensorPollResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/sensor/poll", Verbs="GET")
    public static class GatewaySensorPollAll implements IReturn<GatewaySensorPollAllResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewaySensorPollAll setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewaySensorPollAllResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/Sensors/{SensorId}/readregister", Verbs="GET")
    public static class GatewayReadRegister implements IReturn<GatewayReadRegisterResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String SensorId = null;

        @ApiMember(Name="RegNum", Description="Register number to read", ParameterType="query", DataType="int", IsRequired=true)
        public Integer RegNum = null;

        public String getId() { return Id; }
        public GatewayReadRegister setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayReadRegister setSensorId(String value) { this.SensorId = value; return this; }
        public Integer getRegNum() { return RegNum; }
        public GatewayReadRegister setRegNum(Integer value) { this.RegNum = value; return this; }
        private static Object responseType = GatewayReadRegisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/Sensors/{SensorId}/readregisters", Verbs="GET")
    public static class GatewayReadRegisters implements IReturn<GatewayReadRegistersResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String SensorId = null;

        @ApiMember(Name="RegNums", Description="Register numbers to read", ParameterType="query", DataType="List<int>", IsRequired=true)
        public ArrayList<Integer> RegNums = null;

        public String getId() { return Id; }
        public GatewayReadRegisters setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayReadRegisters setSensorId(String value) { this.SensorId = value; return this; }
        public ArrayList<Integer> getRegNums() { return RegNums; }
        public GatewayReadRegisters setRegNums(ArrayList<Integer> value) { this.RegNums = value; return this; }
        private static Object responseType = GatewayReadRegistersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/camera/poll", Verbs="GET")
    public static class GatewayCameraPollAll implements IReturn<GatewayCameraPollAllResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayCameraPollAll setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayCameraPollAllResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/upnpdevicesinfo", Verbs="GET")
    public static class GatewayUPnPDevicesInfo implements IReturn<GatewayUPnPDevicesInfoResponse>
    {
        @ApiMember(Name="Id", Description="Id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayUPnPDevicesInfo setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayUPnPDevicesInfoResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/ipscan", Verbs="GET")
    public static class GatewayIPScan implements IReturn<GatewayIPScanResponse>
    {
        @ApiMember(Name="Id", Description="Id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        public UUID getId() { return Id; }
        public GatewayIPScan setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = GatewayIPScanResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/scheduler/poll", Verbs="GET")
    public static class GatewaySchedulerPoll implements IReturn<GatewaySchedulerPollResponse>
    {
        @ApiMember(Name="Id", Description="GatewayId", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewaySchedulerPoll setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewaySchedulerPollResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/logging/state", Verbs="GET")
    public static class GatewayLoggingState implements IReturn<GatewayLoggingStateResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewayLoggingState setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewayLoggingStateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/notify/gatewaylifecyclestatus", Verbs="POST")
    public static class GatewayNotifyLifecycleStatus implements IReturn<GatewayNotifyLifecycleStatusResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="GatewayStatus", Description="Gateway Status", ParameterType="body", DataType="string", IsRequired=true)
        public String GatewayStatus = null;

        public String getId() { return Id; }
        public GatewayNotifyLifecycleStatus setId(String value) { this.Id = value; return this; }
        public String getGatewayStatus() { return GatewayStatus; }
        public GatewayNotifyLifecycleStatus setGatewayStatus(String value) { this.GatewayStatus = value; return this; }
        private static Object responseType = GatewayNotifyLifecycleStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/notify/addorremovesensor", Verbs="POST")
    public static class GatewayNotifyAddOrRemoveSensor implements IReturn<GatewayNotifyAddOrRemoveSensorResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="IsAdded", Description="Sensor Addition or Removal indicator", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean IsAdded = null;

        @ApiMember(Name="SensorId", Description="SensorId", ParameterType="body", DataType="String")
        public String SensorId = null;

        public String getId() { return Id; }
        public GatewayNotifyAddOrRemoveSensor setId(String value) { this.Id = value; return this; }
        public Boolean getIsAdded() { return IsAdded; }
        public GatewayNotifyAddOrRemoveSensor setIsAdded(Boolean value) { this.IsAdded = value; return this; }
        public String getSensorId() {return SensorId; }
        public GatewayNotifyAddOrRemoveSensor setSensorId(String sensorId) { this.SensorId = sensorId; return this; }
        private static Object responseType = GatewayNotifyAddOrRemoveSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/notify/sensorconfigured", Verbs="POST")
    public static class GatewayNotifySensorConfigured implements IReturn<GatewayNotifySensorConfiguredResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="Sensor Identifier", ParameterType="body", DataType="string", IsRequired=true)
        public String SensorId = null;

        public String getId() { return Id; }
        public GatewayNotifySensorConfigured setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayNotifySensorConfigured setSensorId(String value) { this.SensorId = value; return this; }
        private static Object responseType = GatewayNotifySensorConfiguredResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/notify/mainthermostatchanged", Verbs="POST")
    public static class GatewayNotifyMainThermostatChanged implements IReturn<GatewayNotifyMainThermostatChangedResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorId", Description="Sensor Identifier", ParameterType="body", DataType="string", IsRequired=true)
        public String SensorId = null;

        public String getId() { return Id; }
        public GatewayNotifyMainThermostatChanged setId(String value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public GatewayNotifyMainThermostatChanged setSensorId(String value) { this.SensorId = value; return this; }
        private static Object responseType = GatewayNotifyMainThermostatChangedResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/notify/networkstatus", Verbs="POST")
    public static class GatewayNotifyNetworkStatus implements IReturn<GatewayNotifyNetworkStatusResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Status", Description="Network Status", ParameterType="body", DataType="string", IsRequired=true)
        public String Status = null;

        public String getId() { return Id; }
        public GatewayNotifyNetworkStatus setId(String value) { this.Id = value; return this; }
        public String getStatus() { return Status; }
        public GatewayNotifyNetworkStatus setStatus(String value) { this.Status = value; return this; }
        private static Object responseType = GatewayNotifyNetworkStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/notify/videouploaded", Verbs="POST")
    public static class GatewayNotifyVideoUploaded implements IReturn<GatewayNotifyVideoUploadedResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="CameraId", Description="CameraId", ParameterType="body", DataType="string", IsRequired=true)
        public String CameraId = null;

        @ApiMember(Name="Date", Description="Date", ParameterType="body", DataType="string", IsRequired=true)
        public String Date = null;

        @ApiMember(Name="Url", Description="Url", ParameterType="body", DataType="string", IsRequired=true)
        public String Url = null;

        public String getId() { return Id; }
        public GatewayNotifyVideoUploaded setId(String value) { this.Id = value; return this; }
        public String getCameraId() { return CameraId; }
        public GatewayNotifyVideoUploaded setCameraId(String value) { this.CameraId = value; return this; }
        public String getDate() { return Date; }
        public GatewayNotifyVideoUploaded setDate(String value) { this.Date = value; return this; }
        public String getUrl() { return Url; }
        public GatewayNotifyVideoUploaded setUrl(String value) { this.Url = value; return this; }
        private static Object responseType = GatewayNotifyVideoUploadedResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/notify/backupcreated", Verbs="POST")
    public static class GatewayNotifyBackupCreated implements IReturn<GatewayNotifyBackupCreatedResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="IsCreated", Description="Backup creation indicator", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean IsCreated = null;

        public String getId() { return Id; }
        public GatewayNotifyBackupCreated setId(String value) { this.Id = value; return this; }
        public Boolean getIsCreated() { return IsCreated; }
        public GatewayNotifyBackupCreated setIsCreated(Boolean value) { this.IsCreated = value; return this; }
        private static Object responseType = GatewayNotifyBackupCreatedResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/notify/systembackupcreated", Verbs="POST")
    public static class GatewayNotifySystemBackupCreated implements IReturn<GatewayNotifySystemBackupCreatedResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="IsCreated", Description="Backup creation indicator", ParameterType="body", DataType="string", IsRequired=true)
        public Boolean IsCreated = null;

        public String getId() { return Id; }
        public GatewayNotifySystemBackupCreated setId(String value) { this.Id = value; return this; }
        public Boolean getIsCreated() { return IsCreated; }
        public GatewayNotifySystemBackupCreated setIsCreated(Boolean value) { this.IsCreated = value; return this; }
        private static Object responseType = GatewayNotifySystemBackupCreatedResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/update/status", Verbs="POST")
    public static class GatewayUpdateStatus implements IReturn<GatewayUpdateStatusResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="UpdateStatus", Description="Update Status", ParameterType="body", DataType="string", IsRequired=true)
        public String UpdateStatus = null;

        public String getId() { return Id; }
        public GatewayUpdateStatus setId(String value) { this.Id = value; return this; }
        public String getUpdateStatus() { return UpdateStatus; }
        public GatewayUpdateStatus setUpdateStatus(String value) { this.UpdateStatus = value; return this; }
        private static Object responseType = GatewayUpdateStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/alive", Verbs="GET")
    // @Route(Path="/gateways/{Id}/alive", Verbs="POST")
    public static class GatewayAlive implements IReturn<GatewayAliveResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="Alive", Description="Gateway Alive", ParameterType="body", DataType="string", IsRequired=true, Verb="POST")
        public String Alive = null;

        public String getId() { return Id; }
        public GatewayAlive setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public GatewayAlive setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public GatewayAlive setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public GatewayAlive setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public GatewayAlive setPageSize(Integer value) { this.PageSize = value; return this; }
        public String getAlive() { return Alive; }
        public GatewayAlive setAlive(String value) { this.Alive = value; return this; }
        private static Object responseType = GatewayAliveResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/statuses", Verbs="GET")
    // @Route(Path="/gateways/{Id}/statuses", Verbs="POST")
    public static class GatewayStatuses implements IReturn<GatewayStatusesResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="StatusPoints", Description="Collection of datapoints to insert", ParameterType="body", DataType="List<StatusPoint>", IsRequired=true, Verb="POST")
        public List<StatusPoint> StatusPoints = null;

        public String getId() { return Id; }
        public GatewayStatuses setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public GatewayStatuses setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public GatewayStatuses setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public GatewayStatuses setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public GatewayStatuses setPageSize(Integer value) { this.PageSize = value; return this; }
        public List<StatusPoint> getStatusPoints() { return StatusPoints; }
        public GatewayStatuses setStatusPoints(List<StatusPoint> value) { this.StatusPoints = value; return this; }
        private static Object responseType = GatewayStatusesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/date/sync", Verbs="GET")
    public static class GatewayDateSync implements IReturn<GatewayDateSyncResponse>
    {

        private static Object responseType = GatewayDateSyncResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/backup/system", Verbs="GET")
    public static class GatewaySystemBackup implements IReturn<GatewaySystemBackupResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewaySystemBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewaySystemBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/backup/systemdate", Verbs="GET")
    public static class GatewaySystemBackupDate implements IReturn<GatewaySystemBackupDateResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public GatewaySystemBackupDate setId(String value) { this.Id = value; return this; }
        private static Object responseType = GatewaySystemBackupDateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/register", Verbs="POST")
    public static class GatewayRegister implements IReturn<GatewayRegisterResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public String Type = null;
        public String Manufacturer = null;
        public String GWVersion = null;

        public UUID getId() { return Id; }
        public GatewayRegister setId(UUID value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public GatewayRegister setType(String value) { this.Type = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public GatewayRegister setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getGwVersion() { return GWVersion; }
        public GatewayRegister setGwVersion(String value) { this.GWVersion = value; return this; }
        private static Object responseType = GatewayRegisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/gateways/{Id}/gwversion", Verbs="POST")
    public static class GatewayGWVersion implements IReturn<GWVersionResponse>
    {
        @ApiMember(Name="Id", Description="Gateway Id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="GWVersion", Description="GW Version", ParameterType="body", DataType="string", IsRequired=true)
        public String GWVersion = null;

        public String getId() { return Id; }
        public GatewayGWVersion setId(String value) { this.Id = value; return this; }
        public String getGwVersion() { return GWVersion; }
        public GatewayGWVersion setGwVersion(String value) { this.GWVersion = value; return this; }
        private static Object responseType = GWVersionResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/register", Verbs="POST")
    public static class InstallationRegister implements IReturn<InstallationRegisterResponse>
    {
        @ApiMember(Name="Installation", Description="Installation details", ParameterType="body", DataType="Installation", IsRequired=true, Verb="POST")
        public Installation Installation = null;

        public Installation getInstallation() { return Installation; }
        public InstallationRegister setInstallation(Installation value) { this.Installation = value; return this; }
        private static Object responseType = InstallationRegisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/activate", Verbs="POST")
    public static class InstallationActivate implements IReturn<InstallationActivateResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="Name", Description="Installation Name", ParameterType="body", DataType="string", IsRequired=true, Verb="POST")
        public String Name = null;

        public UUID getId() { return Id; }
        public InstallationActivate setId(UUID value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public InstallationActivate setName(String value) { this.Name = value; return this; }
        private static Object responseType = InstallationActivateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/activateandassign", Verbs="POST")
    public static class InstallationActivateAndAssign implements IReturn<InstallationActivateAndAssignResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public UUID Id = null;

        public String Name = null;
        public Integer OwnerId = null;

        public UUID getId() { return Id; }
        public InstallationActivateAndAssign setId(UUID value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public InstallationActivateAndAssign setName(String value) { this.Name = value; return this; }
        public Integer getOwnerId() { return OwnerId; }
        public InstallationActivateAndAssign setOwnerId(Integer value) { this.OwnerId = value; return this; }
        private static Object responseType = InstallationActivateAndAssignResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/values/live/request", Verbs="POST")
    public static class InstallationRequestLiveSensorValues implements IReturn<InstallationRequestLiveSensorValuesResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationRequestLiveSensorValues setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationRequestLiveSensorValuesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/shutdown", Verbs="POST")
    public static class InstallationShutdown implements IReturn<InstallationShutdownResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationShutdown setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationShutdownResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/restart", Verbs="POST")
    public static class InstallationRestart implements IReturn<InstallationRestartResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationRestart setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationRestartResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/backup/create", Verbs="POST")
    public static class InstallationCreateBackup implements IReturn<InstallationCreateBackupResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationCreateBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationCreateBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/backup/createsystem", Verbs="POST")
    public static class InstallationCreateSystemBackup implements IReturn<InstallationCreateSystemBackupResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationCreateSystemBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationCreateSystemBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/backup/restore", Verbs="POST")
    public static class InstallationRestoreBackup implements IReturn<InstallationRestoreBackupResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationRestoreBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationRestoreBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/backup/restoresystem", Verbs="POST")
    public static class InstallationRestoreSystemBackup implements IReturn<InstallationRestoreSystemBackupResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationRestoreSystemBackup setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationRestoreSystemBackupResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/comfort", Verbs="GET")
    public static class InstallationComfort implements IReturn<InstallationComfortResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationComfort setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationComfortResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/comfortStatus", Verbs="GET")
    // @Route(Path="/installations/{Id}/comfortStatus", Verbs="PATCH")
    public static class InstallationComfortStatus implements IReturn<InstallationComfortStatusResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="ComfortStatus", Description="ComfortStatus", ParameterType="body", DataType="string", IsRequired=true, Verb="PATCH")
        public String ComfortStatus = null;

        public UUID getId() { return Id; }
        public InstallationComfortStatus setId(UUID value) { this.Id = value; return this; }
        public String getComfortStatus() { return ComfortStatus; }
        public InstallationComfortStatus setComfortStatus(String value) { this.ComfortStatus = value; return this; }
        private static Object responseType = InstallationComfortStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/comfortmonthvalues", Verbs="GET")
    public static class InstallationComfortMonthValues implements IReturn<InstallationComfortMonthValuesResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationComfortMonthValues setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationComfortMonthValuesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/securityStatus", Verbs="GET")
    // @Route(Path="/installations/{Id}/securityStatus", Verbs="PUT")
    public static class InstallationSecurityStatus implements IReturn<InstallationSecurityStatusResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public String SecurityStatus = null;
        public Date Date = null;
        public String Trigger = null;

        public UUID getId() { return Id; }
        public InstallationSecurityStatus setId(UUID value) { this.Id = value; return this; }
        public String getSecurityStatus() { return SecurityStatus; }
        public InstallationSecurityStatus setSecurityStatus(String value) { this.SecurityStatus = value; return this; }
        public Date getDate() { return Date; }
        public InstallationSecurityStatus setDate(Date value) { this.Date = value; return this; }
        public String getTrigger() { return Trigger; }
        public InstallationSecurityStatus setTrigger(String value) { this.Trigger = value; return this; }
        private static Object responseType = InstallationSecurityStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/predictions", Verbs="GET")
    public static class InstallationPredictions implements IReturn<InstallationPredictionsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        public UUID getId() { return Id; }
        public InstallationPredictions setId(UUID value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public InstallationPredictions setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public InstallationPredictions setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public InstallationPredictions setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public InstallationPredictions setPageSize(Integer value) { this.PageSize = value; return this; }
        private static Object responseType = InstallationPredictionsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energy/trend", Verbs="GET")
    // @Route(Path="/installations/{Id}/energy/trend", Verbs="PATCH")
    public static class InstallationEnergyTrends implements IReturn<InstallationEnergyTrendsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        public Double DayEnergyTrendValue = null;
        public Double WeekEnergyTrendValue = null;
        public Double MonthEnergyTrendValue = null;
        public String DayEnergyTrendCode = null;
        public String WeekEnergyTrendCode = null;
        public String MonthEnergyTrendCode = null;
        public Date EnergyTrendDate = null;

        public UUID getId() { return Id; }
        public InstallationEnergyTrends setId(UUID value) { this.Id = value; return this; }
        public Double getDayEnergyTrendValue() { return DayEnergyTrendValue; }
        public InstallationEnergyTrends setDayEnergyTrendValue(Double value) { this.DayEnergyTrendValue = value; return this; }
        public Double getWeekEnergyTrendValue() { return WeekEnergyTrendValue; }
        public InstallationEnergyTrends setWeekEnergyTrendValue(Double value) { this.WeekEnergyTrendValue = value; return this; }
        public Double getMonthEnergyTrendValue() { return MonthEnergyTrendValue; }
        public InstallationEnergyTrends setMonthEnergyTrendValue(Double value) { this.MonthEnergyTrendValue = value; return this; }
        public String getDayEnergyTrendCode() { return DayEnergyTrendCode; }
        public InstallationEnergyTrends setDayEnergyTrendCode(String value) { this.DayEnergyTrendCode = value; return this; }
        public String getWeekEnergyTrendCode() { return WeekEnergyTrendCode; }
        public InstallationEnergyTrends setWeekEnergyTrendCode(String value) { this.WeekEnergyTrendCode = value; return this; }
        public String getMonthEnergyTrendCode() { return MonthEnergyTrendCode; }
        public InstallationEnergyTrends setMonthEnergyTrendCode(String value) { this.MonthEnergyTrendCode = value; return this; }
        public Date getEnergyTrendDate() { return EnergyTrendDate; }
        public InstallationEnergyTrends setEnergyTrendDate(Date value) { this.EnergyTrendDate = value; return this; }
        private static Object responseType = InstallationEnergyTrendsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/gas/trend", Verbs="GET")
    // @Route(Path="/installations/{Id}/gas/trend", Verbs="PATCH")
    public static class InstallationGasTrends implements IReturn<InstallationGasTrendsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        public Double DayGasTrendValue = null;
        public Double WeekGasTrendValue = null;
        public Double MonthGasTrendValue = null;
        public String DayGasTrendCode = null;
        public String WeekGasTrendCode = null;
        public String MonthGasTrendCode = null;
        public Date GasTrendDate = null;

        public UUID getId() { return Id; }
        public InstallationGasTrends setId(UUID value) { this.Id = value; return this; }
        public Double getDayGasTrendValue() { return DayGasTrendValue; }
        public InstallationGasTrends setDayGasTrendValue(Double value) { this.DayGasTrendValue = value; return this; }
        public Double getWeekGasTrendValue() { return WeekGasTrendValue; }
        public InstallationGasTrends setWeekGasTrendValue(Double value) { this.WeekGasTrendValue = value; return this; }
        public Double getMonthGasTrendValue() { return MonthGasTrendValue; }
        public InstallationGasTrends setMonthGasTrendValue(Double value) { this.MonthGasTrendValue = value; return this; }
        public String getDayGasTrendCode() { return DayGasTrendCode; }
        public InstallationGasTrends setDayGasTrendCode(String value) { this.DayGasTrendCode = value; return this; }
        public String getWeekGasTrendCode() { return WeekGasTrendCode; }
        public InstallationGasTrends setWeekGasTrendCode(String value) { this.WeekGasTrendCode = value; return this; }
        public String getMonthGasTrendCode() { return MonthGasTrendCode; }
        public InstallationGasTrends setMonthGasTrendCode(String value) { this.MonthGasTrendCode = value; return this; }
        public Date getGasTrendDate() { return GasTrendDate; }
        public InstallationGasTrends setGasTrendDate(Date value) { this.GasTrendDate = value; return this; }
        private static Object responseType = InstallationGasTrendsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/heating/trend", Verbs="GET")
    // @Route(Path="/installations/{Id}/heating/trend", Verbs="PATCH")
    public static class InstallationHeatingTrends implements IReturn<InstallationHeatingTrendsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        public Double DayHeatingTrendValue = null;
        public Double WeekHeatingTrendValue = null;
        public Double MonthHeatingTrendValue = null;
        public String DayHeatingTrendCode = null;
        public String WeekHeatingTrendCode = null;
        public String MonthHeatingTrendCode = null;
        public Date HeatingTrendDate = null;

        public UUID getId() { return Id; }
        public InstallationHeatingTrends setId(UUID value) { this.Id = value; return this; }
        public Double getDayHeatingTrendValue() { return DayHeatingTrendValue; }
        public InstallationHeatingTrends setDayHeatingTrendValue(Double value) { this.DayHeatingTrendValue = value; return this; }
        public Double getWeekHeatingTrendValue() { return WeekHeatingTrendValue; }
        public InstallationHeatingTrends setWeekHeatingTrendValue(Double value) { this.WeekHeatingTrendValue = value; return this; }
        public Double getMonthHeatingTrendValue() { return MonthHeatingTrendValue; }
        public InstallationHeatingTrends setMonthHeatingTrendValue(Double value) { this.MonthHeatingTrendValue = value; return this; }
        public String getDayHeatingTrendCode() { return DayHeatingTrendCode; }
        public InstallationHeatingTrends setDayHeatingTrendCode(String value) { this.DayHeatingTrendCode = value; return this; }
        public String getWeekHeatingTrendCode() { return WeekHeatingTrendCode; }
        public InstallationHeatingTrends setWeekHeatingTrendCode(String value) { this.WeekHeatingTrendCode = value; return this; }
        public String getMonthHeatingTrendCode() { return MonthHeatingTrendCode; }
        public InstallationHeatingTrends setMonthHeatingTrendCode(String value) { this.MonthHeatingTrendCode = value; return this; }
        public Date getHeatingTrendDate() { return HeatingTrendDate; }
        public InstallationHeatingTrends setHeatingTrendDate(Date value) { this.HeatingTrendDate = value; return this; }
        private static Object responseType = InstallationHeatingTrendsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/water/trend", Verbs="GET")
    // @Route(Path="/installations/{Id}/water/trend", Verbs="PATCH")
    public static class InstallationWaterTrends implements IReturn<InstallationWaterTrendsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        public Double DayWaterTrendValue = null;
        public Double WeekWaterTrendValue = null;
        public Double MonthWaterTrendValue = null;
        public String DayWaterTrendCode = null;
        public String WeekWaterTrendCode = null;
        public String MonthWaterTrendCode = null;
        public Date WaterTrendDate = null;

        public UUID getId() { return Id; }
        public InstallationWaterTrends setId(UUID value) { this.Id = value; return this; }
        public Double getDayWaterTrendValue() { return DayWaterTrendValue; }
        public InstallationWaterTrends setDayWaterTrendValue(Double value) { this.DayWaterTrendValue = value; return this; }
        public Double getWeekWaterTrendValue() { return WeekWaterTrendValue; }
        public InstallationWaterTrends setWeekWaterTrendValue(Double value) { this.WeekWaterTrendValue = value; return this; }
        public Double getMonthWaterTrendValue() { return MonthWaterTrendValue; }
        public InstallationWaterTrends setMonthWaterTrendValue(Double value) { this.MonthWaterTrendValue = value; return this; }
        public String getDayWaterTrendCode() { return DayWaterTrendCode; }
        public InstallationWaterTrends setDayWaterTrendCode(String value) { this.DayWaterTrendCode = value; return this; }
        public String getWeekWaterTrendCode() { return WeekWaterTrendCode; }
        public InstallationWaterTrends setWeekWaterTrendCode(String value) { this.WeekWaterTrendCode = value; return this; }
        public String getMonthWaterTrendCode() { return MonthWaterTrendCode; }
        public InstallationWaterTrends setMonthWaterTrendCode(String value) { this.MonthWaterTrendCode = value; return this; }
        public Date getWaterTrendDate() { return WaterTrendDate; }
        public InstallationWaterTrends setWaterTrendDate(Date value) { this.WaterTrendDate = value; return this; }
        private static Object responseType = InstallationWaterTrendsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energy/trend/{period}", Verbs="GET")
    public static class InstallationEnergyTrend implements IReturn<InstallationEnergyTrendResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="Period", Description="Trend period", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Period = null;

        public UUID getId() { return Id; }
        public InstallationEnergyTrend setId(UUID value) { this.Id = value; return this; }
        public String getPeriod() { return Period; }
        public InstallationEnergyTrend setPeriod(String value) { this.Period = value; return this; }
        private static Object responseType = InstallationEnergyTrendResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energytrend/summary", Verbs="GET")
    public static class InstallationEnergyTrendSummary implements IReturn<InstallationEnergyTrendSummaryResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="ConsumptionPeriod", Description="ConsumptionPeriod", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String ConsumptionPeriod = null;

        public String getId() { return Id; }
        public InstallationEnergyTrendSummary setId(String value) { this.Id = value; return this; }
        public String getConsumptionPeriod() { return ConsumptionPeriod; }
        public InstallationEnergyTrendSummary setConsumptionPeriod(String value) { this.ConsumptionPeriod = value; return this; }
        private static Object responseType = InstallationEnergyTrendSummaryResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/trees", Verbs="GET")
    public static class InstallationTrees implements IReturn<InstallationTreesResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="Type", Description="Tree Type", ParameterType="query", DataType="int", IsRequired=true, Verb="GET")
        public String Type = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="DateTime", Verb="GET")
        public Date FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public Date ToDate = null;

        public UUID getId() { return Id; }
        public InstallationTrees setId(UUID value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public InstallationTrees setType(String value) { this.Type = value; return this; }
        public Date getFromDate() { return FromDate; }
        public InstallationTrees setFromDate(Date value) { this.FromDate = value; return this; }
        public Date getToDate() { return ToDate; }
        public InstallationTrees setToDate(Date value) { this.ToDate = value; return this; }
        private static Object responseType = InstallationTreesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/trees/lastmonths/{MonthNum}", Verbs="GET")
    public static class InstallationLastMonthsTrees implements IReturn<InstallationLastMonthsTreesResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="MonthNum", Description="Number of months", ParameterType="path", DataType="int", IsRequired=true, Verb="GET")
        public Integer MonthNum = null;

        @ApiMember(Name="Type", Description="Tree Type", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String Type = null;

        public UUID getId() { return Id; }
        public InstallationLastMonthsTrees setId(UUID value) { this.Id = value; return this; }
        public Integer getMonthNum() { return MonthNum; }
        public InstallationLastMonthsTrees setMonthNum(Integer value) { this.MonthNum = value; return this; }
        public String getType() { return Type; }
        public InstallationLastMonthsTrees setType(String value) { this.Type = value; return this; }
        private static Object responseType = InstallationLastMonthsTreesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energy/consumption/values", Verbs="GET")
    public static class InstallationConsumptionValues implements IReturn<InstallationConsumptionValuesResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="UserTimeZone", Description="UserTimeZone", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String UserTimeZone = null;

        @ApiMember(Name="ConsumptionPeriod", Description="ConsumptionPeriod", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String ConsumptionPeriod = null;

        public UUID getId() { return Id; }
        public InstallationConsumptionValues setId(UUID value) { this.Id = value; return this; }
        public String getUserTimeZone() { return UserTimeZone; }
        public InstallationConsumptionValues setUserTimeZone(String value) { this.UserTimeZone = value; return this; }
        public String getConsumptionPeriod() { return ConsumptionPeriod; }
        public InstallationConsumptionValues setConsumptionPeriod(String value) { this.ConsumptionPeriod = value; return this; }
        private static Object responseType = InstallationConsumptionValuesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energy/percentageconsumption/values", Verbs="GET")
    public static class InstallationPercentageConsumptionValues implements IReturn<InstallationPercentageConsumptionValuesResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="UserTimeZone", Description="UserTimeZone", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String UserTimeZone = null;

        @ApiMember(Name="ConsumptionPeriod", Description="ConsumptionPeriod", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String ConsumptionPeriod = null;

        public UUID getId() { return Id; }
        public InstallationPercentageConsumptionValues setId(UUID value) { this.Id = value; return this; }
        public String getUserTimeZone() { return UserTimeZone; }
        public InstallationPercentageConsumptionValues setUserTimeZone(String value) { this.UserTimeZone = value; return this; }
        public String getConsumptionPeriod() { return ConsumptionPeriod; }
        public InstallationPercentageConsumptionValues setConsumptionPeriod(String value) { this.ConsumptionPeriod = value; return this; }
        private static Object responseType = InstallationPercentageConsumptionValuesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/consumption/summary", Verbs="GET")
    public static class InstallationConsumptionSummary implements IReturn<InstallationConsumptionSummaryResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="Type", Description="Consumption type", ParameterType="query", DataType="string", IsRequired=true)
        public String Type = null;

        @ApiMember(Name="UserTimeZone", Description="User time zone", ParameterType="query", DataType="string", IsRequired=true)
        public String UserTimeZone = null;

        public String getId() { return Id; }
        public InstallationConsumptionSummary setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public InstallationConsumptionSummary setType(String value) { this.Type = value; return this; }
        public String getUserTimeZone() { return UserTimeZone; }
        public InstallationConsumptionSummary setUserTimeZone(String value) { this.UserTimeZone = value; return this; }
        private static Object responseType = InstallationConsumptionSummaryResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energy/consumption", Verbs="POST")
    // @Route(Path="/installations/{Id}/energy/consumption", Verbs="GET")
    public static class InstallationEnergyConsumption implements IReturn<InstallationEnergyConsumptionResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="InstallationCategoryConsumption", Description="InstallationCategoryConsumption", ParameterType="body", DataType="InstallationCategoryConsumption", IsRequired=true, Verb="POST")
        public InstallationCategoryConsumption InstallationCategoryConsumption = null;

        public UUID getId() { return Id; }
        public InstallationEnergyConsumption setId(UUID value) { this.Id = value; return this; }
        public InstallationCategoryConsumption getInstallationCategoryConsumption() { return InstallationCategoryConsumption; }
        public InstallationEnergyConsumption setInstallationCategoryConsumption(InstallationCategoryConsumption value) { this.InstallationCategoryConsumption = value; return this; }
        private static Object responseType = InstallationEnergyConsumptionResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energy/consumption/categorized/day", Verbs="GET")
    public static class InstallationEnergyConsumptionByCategoriesDay implements IReturn<InstallationEnergyConsumptionByCategoriesDayResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="TimeZone", Description="TimeZone standard name", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String TimeZone = null;

        public UUID getId() { return Id; }
        public InstallationEnergyConsumptionByCategoriesDay setId(UUID value) { this.Id = value; return this; }
        public String getTimeZone() { return TimeZone; }
        public InstallationEnergyConsumptionByCategoriesDay setTimeZone(String value) { this.TimeZone = value; return this; }
        private static Object responseType = InstallationEnergyConsumptionByCategoriesDayResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energy/consumption/categorized/week", Verbs="GET")
    public static class InstallationEnergyConsumptionByCategoriesWeek implements IReturn<InstallationEnergyConsumptionByCategoriesWeekResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="TimeZone", Description="TimeZone standard name", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String TimeZone = null;

        public UUID getId() { return Id; }
        public InstallationEnergyConsumptionByCategoriesWeek setId(UUID value) { this.Id = value; return this; }
        public String getTimeZone() { return TimeZone; }
        public InstallationEnergyConsumptionByCategoriesWeek setTimeZone(String value) { this.TimeZone = value; return this; }
        private static Object responseType = InstallationEnergyConsumptionByCategoriesWeekResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/energy/consumption/categorized/month", Verbs="GET")
    public static class InstallationEnergyConsumptionByCategoriesMonth implements IReturn<InstallationEnergyConsumptionByCategoriesMonthResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="TimeZone", Description="TimeZone standard name", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String TimeZone = null;

        public UUID getId() { return Id; }
        public InstallationEnergyConsumptionByCategoriesMonth setId(UUID value) { this.Id = value; return this; }
        public String getTimeZone() { return TimeZone; }
        public InstallationEnergyConsumptionByCategoriesMonth setTimeZone(String value) { this.TimeZone = value; return this; }
        private static Object responseType = InstallationEnergyConsumptionByCategoriesMonthResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/stats", Verbs="GET")
    // @Route(Path="/installations/{Id}/stats", Verbs="POST")
    public static class InstallationsStats implements IReturn<InstallationsStatsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET", ExcludeInSchema=true)
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET", ExcludeInSchema=true)
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET", ExcludeInSchema=true)
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET", ExcludeInSchema=true)
        public Integer PageSize = null;

        public Date Date = null;
        public Double Uptime = null;

        public String getId() { return Id; }
        public InstallationsStats setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public InstallationsStats setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public InstallationsStats setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public InstallationsStats setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public InstallationsStats setPageSize(Integer value) { this.PageSize = value; return this; }
        public Date getDate() { return Date; }
        public InstallationsStats setDate(Date value) { this.Date = value; return this; }
        public Double getUptime() { return Uptime; }
        public InstallationsStats setUptime(Double value) { this.Uptime = value; return this; }
        private static Object responseType = InstallationsStatsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/datacloudstorage", Verbs="GET")
    // @Route(Path="/installations/{Id}/datacloudstorage", Verbs="POST")
    public static class InstallationDataCloudStorage implements IReturn<InstallationDataCloudStorageResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="Interval", Description="Interval aggregation time in minutes (15 every 15 mins, 30 every half an hour, 60 every hour...)", ParameterType="query", DataType="int", Verb="GET")
        public Integer Interval = null;

        @ApiMember(Name="AggregationType", Description="Type of aggregation by interval ('avg' or 'sum')", ParameterType="query", DataType="string", Verb="GET")
        public String AggregationType = null;

        @ApiMember(Name="Installation", Description="Installation data", ParameterType="body", DataType="Installation", IsRequired=true, Verb="POST")
        public Installation Installation = null;

        public String getId() { return Id; }
        public InstallationDataCloudStorage setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public InstallationDataCloudStorage setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public InstallationDataCloudStorage setToDate(String value) { this.ToDate = value; return this; }
        public Integer getInterval() { return Interval; }
        public InstallationDataCloudStorage setInterval(Integer value) { this.Interval = value; return this; }
        public String getAggregationType() { return AggregationType; }
        public InstallationDataCloudStorage setAggregationType(String value) { this.AggregationType = value; return this; }
        public Installation getInstallation() { return Installation; }
        public InstallationDataCloudStorage setInstallation(Installation value) { this.Installation = value; return this; }
        private static Object responseType = InstallationDataCloudStorageResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/activeSchedules", Verbs="GET")
    // @Route(Path="/installations/{Id}/activeSchedules", Verbs="PATCH")
    public static class InstallationActiveSchedules implements IReturn<InstallationActiveSchedulesResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        public String Type = null;
        public Integer ActiveSchedules = null;

        public UUID getId() { return Id; }
        public InstallationActiveSchedules setId(UUID value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public InstallationActiveSchedules setType(String value) { this.Type = value; return this; }
        public Integer getActiveSchedules() { return ActiveSchedules; }
        public InstallationActiveSchedules setActiveSchedules(Integer value) { this.ActiveSchedules = value; return this; }
        private static Object responseType = InstallationActiveSchedulesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/backup/systemdate", Verbs="GET")
    public static class InstallationSystemBackupDate implements IReturn<InstallationSystemBackupDateResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationSystemBackupDate setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationSystemBackupDateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/status", Verbs="GET")
    public static class InstallationStatus implements IReturn<InstallationStatusResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationStatus setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/gatewaySecurityStatus", Verbs="PUT")
    public static class InstallationGatewaySecurityStatus implements IReturn<InstallationGatewaySecurityStatusResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SecurityStatus", Description="SecurityStatus", ParameterType="body", DataType="string", IsRequired=true)
        public String SecurityStatus = null;

        @ApiMember(Name="Trigger", Description="Trigger", ParameterType="body", DataType="string")
        public String Trigger = null;

        public String getId() { return Id; }
        public InstallationGatewaySecurityStatus setId(String value) { this.Id = value; return this; }
        public String getSecurityStatus() { return SecurityStatus; }
        public InstallationGatewaySecurityStatus setSecurityStatus(String value) { this.SecurityStatus = value; return this; }
        public String getTrigger() { return Trigger; }
        public InstallationGatewaySecurityStatus setTrigger(String value) { this.Trigger = value; return this; }
        private static Object responseType = InstallationGatewaySecurityStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/dataupdater", Verbs="PATCH")
    public static class InstallationDataUpdater implements IReturn<InstallationDataUpdaterResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        public Double AverageTemperature = null;
        public Double AverageHumidity = null;

        public UUID getId() { return Id; }
        public InstallationDataUpdater setId(UUID value) { this.Id = value; return this; }
        public Double getAverageTemperature() { return AverageTemperature; }
        public InstallationDataUpdater setAverageTemperature(Double value) { this.AverageTemperature = value; return this; }
        public Double getAverageHumidity() { return AverageHumidity; }
        public InstallationDataUpdater setAverageHumidity(Double value) { this.AverageHumidity = value; return this; }
        private static Object responseType = InstallationDataUpdaterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/overalltemp", Verbs="PATCH")
    public static class InstallationOverallTemp implements IReturn<InstallationOverallTempResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="OverallTemp", Description="New Average Temperature", ParameterType="body", DataType="double?", IsRequired=true)
        public Double OverallTemp = null;

        public UUID getId() { return Id; }
        public InstallationOverallTemp setId(UUID value) { this.Id = value; return this; }
        public Double getOverallTemp() { return OverallTemp; }
        public InstallationOverallTemp setOverallTemp(Double value) { this.OverallTemp = value; return this; }
        private static Object responseType = InstallationOverallTempResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/overallhumidity", Verbs="PATCH")
    public static class InstallationOverallHumidity implements IReturn<InstallationOverallHumidityResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="OverallHumidity", Description="New Average Humidity", ParameterType="body", DataType="double?", IsRequired=true)
        public Double OverallHumidity = null;

        public UUID getId() { return Id; }
        public InstallationOverallHumidity setId(UUID value) { this.Id = value; return this; }
        public Double getOverallHumidity() { return OverallHumidity; }
        public InstallationOverallHumidity setOverallHumidity(Double value) { this.OverallHumidity = value; return this; }
        private static Object responseType = InstallationOverallHumidityResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/values/live", Verbs="POST")
    public static class InstallationSensorValuesBatch implements IReturn<SensorValuesBatchResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorDataPoints", Description="Collection of datapoints to insert", ParameterType="body", DataType="List<SensorDataPoint>", IsRequired=true, Verb="POST")
        public ArrayList<SensorDataPoint> SensorDataPoints = null;

        public String getId() { return Id; }
        public InstallationSensorValuesBatch setId(String value) { this.Id = value; return this; }
        public ArrayList<SensorDataPoint> getSensorDataPoints() { return SensorDataPoints; }
        public InstallationSensorValuesBatch setSensorDataPoints(ArrayList<SensorDataPoint> value) { this.SensorDataPoints = value; return this; }
        private static Object responseType = SensorValuesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/city", Verbs="PATCH")
    public static class InstallationCity implements IReturn<InstallationCityResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Woeid", Description="City Woeid", ParameterType="body", DataType="int", IsRequired=true, Verb="PATCH")
        public Integer Woeid = null;

        public String getId() { return Id; }
        public InstallationCity setId(String value) { this.Id = value; return this; }
        public Integer getWoeid() { return Woeid; }
        public InstallationCity setWoeid(Integer value) { this.Woeid = value; return this; }
        private static Object responseType = InstallationCityResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/name", Verbs="PATCH")
    public static class InstallationName implements IReturn<InstallationNameResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public UUID Id = null;

        @ApiMember(Name="Name", Description="Installation Name", ParameterType="body", DataType="string", IsRequired=true, Verb="PATCH")
        public String Name = null;

        public UUID getId() { return Id; }
        public InstallationName setId(UUID value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public InstallationName setName(String value) { this.Name = value; return this; }
        private static Object responseType = InstallationNameResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/addorupdatesensors", Verbs="POST")
    public static class InstallationAddOrUpdateSensors implements IReturn<InstallationAddOrUpdateSensorsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SensorAreas", Description="Sensors + Area name", ParameterType="body", DataType="List<SensorArea>", IsRequired=true)
        public ArrayList<SensorArea> SensorAreas = null;

        public String getId() { return Id; }
        public InstallationAddOrUpdateSensors setId(String value) { this.Id = value; return this; }
        public ArrayList<SensorArea> getSensorAreas() { return SensorAreas; }
        public InstallationAddOrUpdateSensors setSensorAreas(ArrayList<SensorArea> value) { this.SensorAreas = value; return this; }
        private static Object responseType = InstallationAddOrUpdateSensorsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/addwmbussensor", Verbs="POST")
    public static class InstallationAddWMBusSensor implements IReturn<InstallationAddWMBusSensorResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String Name = null;
        public String Manufacturer = null;
        public String Model = null;
        public String Version = null;
        public String SerialId = null;
        public String Key = null;
        public Double AccumulatedScale = null;
        public Double InstantScale = null;

        public String getId() { return Id; }
        public InstallationAddWMBusSensor setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public InstallationAddWMBusSensor setName(String value) { this.Name = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public InstallationAddWMBusSensor setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public InstallationAddWMBusSensor setModel(String value) { this.Model = value; return this; }
        public String getVersion() { return Version; }
        public InstallationAddWMBusSensor setVersion(String value) { this.Version = value; return this; }
        public String getSerialId() { return SerialId; }
        public InstallationAddWMBusSensor setSerialId(String value) { this.SerialId = value; return this; }
        public String getKey() { return Key; }
        public InstallationAddWMBusSensor setKey(String value) { this.Key = value; return this; }
        public Double getAccumulatedScale() { return AccumulatedScale; }
        public InstallationAddWMBusSensor setAccumulatedScale(Double value) { this.AccumulatedScale = value; return this; }
        public Double getInstantScale() { return InstantScale; }
        public InstallationAddWMBusSensor setInstantScale(Double value) { this.InstantScale = value; return this; }
        private static Object responseType = InstallationAddWMBusSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/addwibeeesensor", Verbs="POST")
    public static class InstallationAddWibeeeSensor implements IReturn<InstallationAddWibeeeSensorResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String MAC = null;
        public String Name = null;

        public String getId() { return Id; }
        public InstallationAddWibeeeSensor setId(String value) { this.Id = value; return this; }
        public String getMac() { return MAC; }
        public InstallationAddWibeeeSensor setMac(String value) { this.MAC = value; return this; }
        public String getName() { return Name; }
        public InstallationAddWibeeeSensor setName(String value) { this.Name = value; return this; }
        private static Object responseType = InstallationAddWibeeeSensorResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/addcamera", Verbs="POST")
    public static class InstallationAddCamera implements IReturn<InstallationAddCameraResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public String IPAddress = null;
        public Integer Port = null;
        public String Model = null;
        public String Manufacturer = null;
        public String Name = null;
        public String Description = null;
        public String Type = null;
        public String VideoURL = null;
        public String VideoFormat = null;
        public String VideoProtocol = null;
        public String RtspPort = null;
        public String PictureURL = null;
        public String PictureProtocol = null;
        public String PictureFormat = null;
        public String ZoomInURL = null;
        public String ZoomOutURL = null;
        public String PanLeftURL = null;
        public String PanRightURL = null;
        public String TiltUpURL = null;
        public String TiltDownURL = null;
        public String PTZStopURL = null;
        public String Authentication = null;
        public String User = null;
        public String Password = null;

        public UUID getId() { return Id; }
        public InstallationAddCamera setId(UUID value) { this.Id = value; return this; }
        public String getIpAddress() { return IPAddress; }
        public InstallationAddCamera setIpAddress(String value) { this.IPAddress = value; return this; }
        public Integer getPort() { return Port; }
        public InstallationAddCamera setPort(Integer value) { this.Port = value; return this; }
        public String getModel() { return Model; }
        public InstallationAddCamera setModel(String value) { this.Model = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public InstallationAddCamera setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getName() { return Name; }
        public InstallationAddCamera setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public InstallationAddCamera setDescription(String value) { this.Description = value; return this; }
        public String getType() { return Type; }
        public InstallationAddCamera setType(String value) { this.Type = value; return this; }
        public String getVideoURL() { return VideoURL; }
        public InstallationAddCamera setVideoURL(String value) { this.VideoURL = value; return this; }
        public String getVideoFormat() { return VideoFormat; }
        public InstallationAddCamera setVideoFormat(String value) { this.VideoFormat = value; return this; }
        public String getVideoProtocol() { return VideoProtocol; }
        public InstallationAddCamera setVideoProtocol(String value) { this.VideoProtocol = value; return this; }
        public String getRtspPort() { return RtspPort; }
        public InstallationAddCamera setRtspPort(String value) { this.RtspPort = value; return this; }
        public String getPictureURL() { return PictureURL; }
        public InstallationAddCamera setPictureURL(String value) { this.PictureURL = value; return this; }
        public String getPictureProtocol() { return PictureProtocol; }
        public InstallationAddCamera setPictureProtocol(String value) { this.PictureProtocol = value; return this; }
        public String getPictureFormat() { return PictureFormat; }
        public InstallationAddCamera setPictureFormat(String value) { this.PictureFormat = value; return this; }
        public String getZoomInURL() { return ZoomInURL; }
        public InstallationAddCamera setZoomInURL(String value) { this.ZoomInURL = value; return this; }
        public String getZoomOutURL() { return ZoomOutURL; }
        public InstallationAddCamera setZoomOutURL(String value) { this.ZoomOutURL = value; return this; }
        public String getPanLeftURL() { return PanLeftURL; }
        public InstallationAddCamera setPanLeftURL(String value) { this.PanLeftURL = value; return this; }
        public String getPanRightURL() { return PanRightURL; }
        public InstallationAddCamera setPanRightURL(String value) { this.PanRightURL = value; return this; }
        public String getTiltUpURL() { return TiltUpURL; }
        public InstallationAddCamera setTiltUpURL(String value) { this.TiltUpURL = value; return this; }
        public String getTiltDownURL() { return TiltDownURL; }
        public InstallationAddCamera setTiltDownURL(String value) { this.TiltDownURL = value; return this; }
        public String getPtzStopURL() { return PTZStopURL; }
        public InstallationAddCamera setPtzStopURL(String value) { this.PTZStopURL = value; return this; }
        public String getAuthentication() { return Authentication; }
        public InstallationAddCamera setAuthentication(String value) { this.Authentication = value; return this; }
        public String getUser() { return User; }
        public InstallationAddCamera setUser(String value) { this.User = value; return this; }
        public String getPassword() { return Password; }
        public InstallationAddCamera setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = InstallationAddCameraResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/users", Verbs="PUT")
    public static class InstallationsUsersBatch implements IReturn<InstallationsUsersBatchResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="Users", Description="Users", ParameterType="body", DataType="List<AssignableUser>", IsRequired=true)
        public ArrayList<AssignableUser> Users = null;

        public UUID getId() { return Id; }
        public InstallationsUsersBatch setId(UUID value) { this.Id = value; return this; }
        public ArrayList<AssignableUser> getUsers() { return Users; }
        public InstallationsUsersBatch setUsers(ArrayList<AssignableUser> value) { this.Users = value; return this; }
        private static Object responseType = InstallationsUsersBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/gateway/credentials", Verbs="GET")
    public static class InstallationGatewayCredentials implements IReturn<InstallationGatewayCredentialsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="Token", Description="Security Token", ParameterType="query", DataType="string", IsRequired=true)
        public String Token = null;

        public String getId() { return Id; }
        public InstallationGatewayCredentials setId(String value) { this.Id = value; return this; }
        public String getToken() { return Token; }
        public InstallationGatewayCredentials setToken(String value) { this.Token = value; return this; }
        private static Object responseType = InstallationGatewayCredentialsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/demandresponse", Verbs="POST")
    public static class InstallationDemandResponse implements IReturn<InstallationDemandResponseResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public UUID Id = null;

        public String Type = null;
        public String EnergySource = null;
        public String FromDate = null;
        public String ToDate = null;
        public String Action = null;
        public Integer ActionValue = null;
        public String ActionOperation = null;
        public Integer Reward = null;
        public String Tips = null;
        public String DRId = null;

        public UUID getId() { return Id; }
        public InstallationDemandResponse setId(UUID value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public InstallationDemandResponse setType(String value) { this.Type = value; return this; }
        public String getEnergySource() { return EnergySource; }
        public InstallationDemandResponse setEnergySource(String value) { this.EnergySource = value; return this; }
        public String getFromDate() { return FromDate; }
        public InstallationDemandResponse setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public InstallationDemandResponse setToDate(String value) { this.ToDate = value; return this; }
        public String getAction() { return Action; }
        public InstallationDemandResponse setAction(String value) { this.Action = value; return this; }
        public Integer getActionValue() { return ActionValue; }
        public InstallationDemandResponse setActionValue(Integer value) { this.ActionValue = value; return this; }
        public String getActionOperation() { return ActionOperation; }
        public InstallationDemandResponse setActionOperation(String value) { this.ActionOperation = value; return this; }
        public Integer getReward() { return Reward; }
        public InstallationDemandResponse setReward(Integer value) { this.Reward = value; return this; }
        public String getTips() { return Tips; }
        public InstallationDemandResponse setTips(String value) { this.Tips = value; return this; }
        public String getDrId() { return DRId; }
        public InstallationDemandResponse setDrId(String value) { this.DRId = value; return this; }
        private static Object responseType = InstallationDemandResponseResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/users/", Verbs="GET")
    public static class InstallationUsers implements IReturn<InstallationUsersResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        @ApiMember(Name="Role", Description="Role", ParameterType="query", DataType="string")
        public String Role = null;

        public UUID getId() { return Id; }
        public InstallationUsers setId(UUID value) { this.Id = value; return this; }
        public String getRole() { return Role; }
        public InstallationUsers setRole(String value) { this.Role = value; return this; }
        private static Object responseType = InstallationUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{id}/users/assignable", Verbs="GET")
    public static class InstallationAssignableUsers implements IReturn<InstallationAssignableUsersResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationAssignableUsers setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationAssignableUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors", Verbs="GET")
    public static class InstallationSensors implements IReturn<InstallationSensorsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationSensors setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/summary", Verbs="GET")
    public static class InstallationSensorsSummary implements IReturn<InstallationSensorsSummaryResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationSensorsSummary setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsSummaryResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/area", Verbs="GET")
    public static class InstallationSensorsWithAreaIdAndName implements IReturn<InstallationSensorsWithAreaIdAndNameResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        @ApiMember(Name="Protocol", Description="Protocol name", ParameterType="query", DataType="SensorProtocolType?")
        public SensorProtocolType Protocol = null;

        public UUID getId() { return Id; }
        public InstallationSensorsWithAreaIdAndName setId(UUID value) { this.Id = value; return this; }
        public SensorProtocolType getProtocol() { return Protocol; }
        public InstallationSensorsWithAreaIdAndName setProtocol(SensorProtocolType value) { this.Protocol = value; return this; }
        private static Object responseType = InstallationSensorsWithAreaIdAndNameResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/andsensorandcategory", Verbs="GET")
    public static class InstallationsAndSensorAndCategory implements IReturn<InstallationsAndSensorAndCategoryResponse>
    {
        @ApiMember(Name="SensorId", Description="Sensor id", ParameterType="body", DataType="string", Verb="GET")
        public String SensorId = null;

        @ApiMember(Name="CategoryType", Description="CategoryType of the sensors to be retrieved", ParameterType="query", DataType="string", Verb="GET")
        public String CategoryType = null;

        public String getSensorId() { return SensorId; }
        public InstallationsAndSensorAndCategory setSensorId(String value) { this.SensorId = value; return this; }
        public String getCategoryType() { return CategoryType; }
        public InstallationsAndSensorAndCategory setCategoryType(String value) { this.CategoryType = value; return this; }
        private static Object responseType = InstallationsAndSensorAndCategoryResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/devices/area", Verbs="GET")
    public static class InstallationDeviceAndArea implements IReturn<InstallationDeviceAndAreaResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationDeviceAndArea setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationDeviceAndAreaResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/withmaster", Verbs="GET")
    public static class InstallationsWithMaster implements IReturn<InstallationsWithMasterResponse>
    {
        @ApiMember(Name="MasterType", Description="Master category type", ParameterType="query", DataType="MasterConsumptionCategoryType", IsRequired=true, Verb="GET")
        public MasterConsumptionCategoryType MasterType = null;

        public MasterConsumptionCategoryType getMasterType() { return MasterType; }
        public InstallationsWithMaster setMasterType(MasterConsumptionCategoryType value) { this.MasterType = value; return this; }
        private static Object responseType = InstallationsWithMasterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/actuable", Verbs="GET")
    public static class InstallationSensorsActuable implements IReturn<InstallationSensorsActuableResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationSensorsActuable setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsActuableResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/security", Verbs="GET")
    public static class InstallationSensorsSecurity implements IReturn<InstallationSensorsSecurityResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationSensorsSecurity setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsSecurityResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/comfort", Verbs="GET")
    public static class InstallationSensorsComfort implements IReturn<InstallationSensorsComfortResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationSensorsComfort setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsComfortResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/sensors/comfort/scheduler", Verbs="GET")
    public static class InstallationSensorsComfortScheduler implements IReturn<InstallationSensorsComfortResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationSensorsComfortScheduler setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationSensorsComfortResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/mainthermostat", Verbs="GET")
    public static class InstallationMainThermostat implements IReturn<InstallationMainThermostatResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationMainThermostat setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationMainThermostatResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/cameras", Verbs="GET")
    public static class InstallationCameras implements IReturn<InstallationCamerasResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationCameras setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationCamerasResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/photos", Verbs="GET")
    public static class InstallationPhotos implements IReturn<InstallationPhotosResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationPhotos setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationPhotosResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/floorplans", Verbs="GET")
    public static class InstallationFloorplans implements IReturn<InstallationFloorplansResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationFloorplans setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationFloorplansResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{id}/floorplans/batch", Verbs="GET")
    public static class InstallationFloorplansWithAreasBatch implements IReturn<InstallationFloorplansWithAreasBatchResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true, Verb="GET")
        public UUID Id = null;

        @ApiMember(Name="SensorId", Description="Sensor id", ParameterType="query", DataType="string", IsRequired=true, Verb="GET")
        public String SensorId = null;

        public UUID getId() { return Id; }
        public InstallationFloorplansWithAreasBatch setId(UUID value) { this.Id = value; return this; }
        public String getSensorId() { return SensorId; }
        public InstallationFloorplansWithAreasBatch setSensorId(String value) { this.SensorId = value; return this; }
        private static Object responseType = InstallationFloorplansWithAreasBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/areas", Verbs="GET")
    public static class InstallationAreas implements IReturn<InstallationAreasResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationAreas setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationAreasResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/areas/comfort", Verbs="GET")
    public static class InstallationComfortAreas implements IReturn<InstallationComfortAreasResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationComfortAreas setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationComfortAreasResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/nodes", Verbs="GET")
    public static class InstallationNodes implements IReturn<InstallationNodesResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID Id = null;

        public UUID getId() { return Id; }
        public InstallationNodes setId(UUID value) { this.Id = value; return this; }
        private static Object responseType = InstallationNodesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations", Verbs="PATCH")
    public static class InstallationsPatch implements IReturn<Installation>
    {
        @ApiMember(Name="installation", Description="Intallation object", ParameterType="body", DataType="Installation", IsRequired=true, Verb="PATCH")
        public Installation Installation = null;

        @ApiMember(Name="fields", Description="Fields to update", ParameterType="query", DataType="string[]", IsRequired=true, Verb="PATCH")
        public ArrayList<String> Fields = null;

        public Installation getInstallation() { return Installation; }
        public InstallationsPatch setInstallation(Installation value) { this.Installation = value; return this; }
        public ArrayList<String> getFields() { return Fields; }
        public InstallationsPatch setFields(ArrayList<String> value) { this.Fields = value; return this; }
        private static Object responseType = Installation.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations", Verbs="GET")
    public static class InstallationsBatch implements IReturn<InstallationsBatchResponse>
    {
        @ApiMember(Name="WithType", Description="Gets installaions that have this type of sensors", ParameterType="query", DataType="string", Verb="GET")
        public String WithType = null;

        public String getWithType() { return WithType; }
        public InstallationsBatch setWithType(String value) { this.WithType = value; return this; }
        private static Object responseType = InstallationsBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations", Verbs="POST")
    // @Route(Path="/installations", Verbs="PUT")
    public static class Installations implements IReturn<InstallationDetailsResponse>
    {
        @ApiMember(Name="details", Description="Installation details", ParameterType="body", DataType="Installation", IsRequired=true, Verb="POST")
        // @ApiMember(Name="details", Description="Installation details", ParameterType="body", DataType="Installation", IsRequired=true, Verb="PUT")
        public Installation Installation = null;

        public Installation getInstallation() { return Installation; }
        public Installations setInstallation(Installation value) { this.Installation = value; return this; }
        private static Object responseType = InstallationDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{Id}/details", Verbs="GET")
    // @Route(Path="/installations/{Id}", Verbs="DELETE")
    public static class InstallationDetails implements IReturn<InstallationDetailsResponse>
    {
        @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, Verb="DELETE", ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public InstallationDetails setId(String value) { this.Id = value; return this; }
        private static Object responseType = InstallationDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/unassigned", Verbs="GET")
    public static class UnassignedInstallations implements IReturn<UnassignedInstallationsResponse>
    {

        private static Object responseType = UnassignedInstallationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/reports", Verbs="GET")
    public static class ReportsList implements IReturn<ReportsListResponse>
    {

        private static Object responseType = ReportsListResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/reports", Verbs="GET")
    public static class UserReports implements IReturn<UserReportsResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public UserReports setId(String value) { this.Id = value; return this; }
        private static Object responseType = UserReportsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/reports", Verbs="POST")
    // @Route(Path="/reports", Verbs="PUT")
    // @Route(Path="/reports/{Id}", Verbs="GET")
    // @Route(Path="/reports/{Id}", Verbs="DELETE")
    public static class Reports implements IReturn<ReportDetailsResponse>
    {
        @ApiMember(Name="Id", Description="Report id", ParameterType="path", DataType="int", IsRequired=true, Verb="GET")
        // @ApiMember(Name="Id", Description="Report id", ParameterType="path", DataType="int", IsRequired=true, Verb="DELETE")
        public Integer Id = null;

        @ApiMember(Name="Report", Description="Report details", ParameterType="body", DataType="Report", IsRequired=true, Verb="POST")
        // @ApiMember(Name="Report", Description="Report details", ParameterType="body", DataType="Report", IsRequired=true, Verb="PUT")
        public Report Report = null;

        public Integer getId() { return Id; }
        public Reports setId(Integer value) { this.Id = value; return this; }
        public Report getReport() { return Report; }
        public Reports setReport(Report value) { this.Report = value; return this; }
        private static Object responseType = ReportDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/reportinstallations/{Id}", Verbs="POST")
    // @Route(Path="/reportinstallations/{Id}", Verbs="PUT")
    // @Route(Path="/reportinstallations/{Id}", Verbs="GET")
    // @Route(Path="/reportinstallations/{Id}", Verbs="DELETE")
    public static class ReportInstallations implements IReturn<ReportInstallationsResponse>
    {
        @ApiMember(Name="Id", Description="Report id", ParameterType="path", DataType="int", IsRequired=true, Verb="GET")
        public Integer Id = null;

        @ApiMember(Name="ReportInstallation", Description="Report Installation", ParameterType="body", DataType="ReportInstallation", IsRequired=true, Verb="POST")
        // @ApiMember(Name="ReportInstallation", Description="Report Installation", ParameterType="body", DataType="ReportInstallation", IsRequired=true, Verb="PUT")
        // @ApiMember(Name="ReportInstallation", Description="Report Installation", ParameterType="body", DataType="ReportInstallation", IsRequired=true, Verb="DELETE")
        public ArrayList<UUID> Installations = null;

        public Integer getId() { return Id; }
        public ReportInstallations setId(Integer value) { this.Id = value; return this; }
        public ArrayList<UUID> getInstallations() { return Installations; }
        public ReportInstallations setInstallations(ArrayList<UUID> value) { this.Installations = value; return this; }
        private static Object responseType = ReportInstallationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/reports", Verbs="POST")
    public static class UserReportAssign implements IReturn<UserReportAssignResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="UserReport", Description="User Report", ParameterType="body", DataType="UserReport", IsRequired=true)
        public UserReport UserReport = null;

        public String getId() { return Id; }
        public UserReportAssign setId(String value) { this.Id = value; return this; }
        public UserReport getUserReport() { return UserReport; }
        public UserReportAssign setUserReport(UserReport value) { this.UserReport = value; return this; }
        private static Object responseType = UserReportAssignResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/reports/{Id}/excel/{Name}", Verbs="GET")
    public static class ReportsExcel
    {
        @ApiMember(Name="Id", Description="Report id", ParameterType="path", DataType="int", IsRequired=true)
        public Integer Id = null;

        @ApiMember(Name="Name", Description="Report name", ParameterType="path", DataType="string", IsRequired=true)
        public String Name = null;

        @ApiMember(Name="FromDate", Description="From date", ParameterType="query", DataType="DateTime", IsRequired=true)
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="To date", ParameterType="query", DataType="DateTime", IsRequired=true)
        public String ToDate = null;

        @ApiMember(Name="MinutesOffset", Description="Time zone minutes offset", ParameterType="query", DataType="double", Verb="GET")
        public Double MinutesOffset = null;

        public Integer getId() { return Id; }
        public ReportsExcel setId(Integer value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public ReportsExcel setName(String value) { this.Name = value; return this; }
        public String getFromDate() { return FromDate; }
        public ReportsExcel setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public ReportsExcel setToDate(String value) { this.ToDate = value; return this; }
        public Double getMinutesOffset() { return MinutesOffset; }
        public ReportsExcel setMinutesOffset(Double value) { this.MinutesOffset = value; return this; }
    }

    @Route(Path="/sensors/{Id}/poll", Verbs="GET")
    public static class SensorPoll implements IReturn<SensorPollResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="Guid", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="InstallationId", Description="Installation Id", ParameterType="query", DataType="string", IsRequired=true)
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorPoll setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorPoll setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorPollResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/lock", Verbs="PATCH")
    public static class SensorLock implements IReturn<SensorLockResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public Boolean IsLocked = null;
        public UUID InstallationId = null;

        public String getId() { return Id; }
        public SensorLock setId(String value) { this.Id = value; return this; }
        public Boolean getIsLocked() { return IsLocked; }
        public SensorLock setIsLocked(Boolean value) { this.IsLocked = value; return this; }
        public UUID getInstallationId() { return InstallationId; }
        public SensorLock setInstallationId(UUID value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorLockResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{id}/areas", Verbs="PUT")
    public static class SensorAreas implements IReturn<SensorAreasResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public UUID InstallationId = null;
        public ArrayList<AssignableArea> Areas = null;

        public String getId() { return Id; }
        public SensorAreas setId(String value) { this.Id = value; return this; }
        public UUID getInstallationId() { return InstallationId; }
        public SensorAreas setInstallationId(UUID value) { this.InstallationId = value; return this; }
        public ArrayList<AssignableArea> getAreas() { return Areas; }
        public SensorAreas setAreas(ArrayList<AssignableArea> value) { this.Areas = value; return this; }
        private static Object responseType = SensorAreasResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/unassign/{InstallationId}", Verbs="DELETE")
    public static class SensorUnassign implements IReturn<SensorUnassignResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="InstallationId", Description="Installation id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorUnassign setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorUnassign setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorUnassignResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/configure", Verbs="POST")
    public static class SensorConfigure implements IReturn<SensorConfigureResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String InstallationId = null;
        public String Configuration = null;

        public String getId() { return Id; }
        public SensorConfigure setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorConfigure setInstallationId(String value) { this.InstallationId = value; return this; }
        public String getConfiguration() { return Configuration; }
        public SensorConfigure setConfiguration(String value) { this.Configuration = value; return this; }
        private static Object responseType = SensorConfigureResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/configurationupdate", Verbs="POST")
    public static class SensorConfigurationUpdate implements IReturn<SensorConfigurationUpdateResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="DefaultSensorConfiguration", Description="DefaultSensorConfiguration", ParameterType="body", DataType="DefaultSensorConfiguration", IsRequired=true)
        public DefaultSensorConfiguration DefaultSensorConfiguration = null;

        public String getId() { return Id; }
        public SensorConfigurationUpdate setId(String value) { this.Id = value; return this; }
        public DefaultSensorConfiguration getDefaultSensorConfiguration() { return DefaultSensorConfiguration; }
        public SensorConfigurationUpdate setDefaultSensorConfiguration(DefaultSensorConfiguration value) { this.DefaultSensorConfiguration = value; return this; }
        private static Object responseType = SensorConfigurationUpdateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/updateEditableProperties", Verbs="POST")
    public static class SensorUpdateEditableProperties implements IReturn<SensorUpdateEditablePropertiesResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public HashMap<String,Object> PropertiesToUpdate = null;
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorUpdateEditableProperties setId(String value) { this.Id = value; return this; }
        public HashMap<String,Object> getPropertiesToUpdate() { return PropertiesToUpdate; }
        public SensorUpdateEditableProperties setPropertiesToUpdate(HashMap<String,Object> value) { this.PropertiesToUpdate = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorUpdateEditableProperties setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorUpdateEditablePropertiesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/zwaveregistereditables", Verbs="PATCH")
    public static class SensorZWaveRegisterEditablesBatch implements IReturn<SensorZWaveRegisterEditablesBatchResponse>
    {
        @ApiMember(Name="SensorZWaveRegisterEditablesPoints", Description="Collection of SensorZWaveRegisterEditablesPoint to update", ParameterType="body", DataType="List<SensorZWaveRegisterEditablesPoint>", IsRequired=true, Verb="PATCH")
        public List<SensorZWaveRegisterEditablesPoint> SensorZWaveRegisterEditablesPoints = null;

        public List<SensorZWaveRegisterEditablesPoint> getSensorZWaveRegisterEditablesPoints() { return SensorZWaveRegisterEditablesPoints; }
        public SensorZWaveRegisterEditablesBatch setSensorZWaveRegisterEditablesPoints(List<SensorZWaveRegisterEditablesPoint> value) { this.SensorZWaveRegisterEditablesPoints = value; return this; }
        private static Object responseType = SensorZWaveRegisterEditablesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/bypass", Verbs="POST")
    public static class SensorBypass implements IReturn<SensorBypassResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String InstallationId = null;
        public Boolean BypassStatus = null;

        public String getId() { return Id; }
        public SensorBypass setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorBypass setInstallationId(String value) { this.InstallationId = value; return this; }
        public Boolean isBypassStatus() { return BypassStatus; }
        public SensorBypass setBypassStatus(Boolean value) { this.BypassStatus = value; return this; }
        private static Object responseType = SensorBypassResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/toggle", Verbs="POST")
    public static class SensorPowerToggle implements IReturn<SensorPowerToggleResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String Value = null;
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorPowerToggle setId(String value) { this.Id = value; return this; }
        public String getValue() { return Value; }
        public SensorPowerToggle setValue(String value) { this.Value = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorPowerToggle setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorPowerToggleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/dimmable", Verbs="POST")
    public static class SensorDimmable implements IReturn<SensorDimmableResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public Double Value = null;
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorDimmable setId(String value) { this.Id = value; return this; }
        public Double getValue() { return Value; }
        public SensorDimmable setValue(Double value) { this.Value = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorDimmable setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorDimmableResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/doorlocktoggle", Verbs="POST")
    public static class SensorDoorLockToggle implements IReturn<SensorDoorLockToggleResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public Boolean Lock = null;
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorDoorLockToggle setId(String value) { this.Id = value; return this; }
        public Boolean isLock() { return Lock; }
        public SensorDoorLockToggle setLock(Boolean value) { this.Lock = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorDoorLockToggle setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorDoorLockToggleResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/lastvalue", Verbs="GET")
    public static class SensorLastValue implements IReturn<SensorLastValueResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public SensorLastValue setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorLastValueResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/laststatus", Verbs="GET")
    public static class SensorLastStatus implements IReturn<SensorLastStatusResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public SensorLastStatus setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorLastStatusResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/lastdateprocessed", Verbs="GET")
    // @Route(Path="/sensors/{Id}/lastdateprocessed", Verbs="POST")
    public static class SensorLastDateProcessed implements IReturn<SensorLastDateProcessedResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String Type = null;
        public Date LastDateProcessed = null;
        public String ProcessedStatus = null;

        public String getId() { return Id; }
        public SensorLastDateProcessed setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public SensorLastDateProcessed setType(String value) { this.Type = value; return this; }
        public Date getLastDateProcessed() { return LastDateProcessed; }
        public SensorLastDateProcessed setLastDateProcessed(Date value) { this.LastDateProcessed = value; return this; }
        public String getProcessedStatus() { return ProcessedStatus; }
        public SensorLastDateProcessed setProcessedStatus(String value) { this.ProcessedStatus = value; return this; }
        private static Object responseType = SensorLastDateProcessedResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/values", Verbs="GET")
    // @Route(Path="/sensors/{Id}/values", Verbs="POST")
    // @Route(Path="/sensors/{Id}/values", Verbs="PUT")
    // @Route(Path="/sensors/{Id}/values/{TimeStamp}", Verbs="DELETE")
    public static class SensorValues implements IReturn<SensorValuesResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="Interval", Description="Interval aggregation time in minutes (15 every 15 mins, 30 every half an hour, 60 every hour...)", ParameterType="query", DataType="int", Verb="GET")
        public Integer Interval = null;

        @ApiMember(Name="AggregationType", Description="Type of aggregation by interval ('avg' or 'sum')", ParameterType="query", DataType="string", Verb="GET")
        public String AggregationType = null;

        @ApiMember(Name="DataPoints", Description="Collection of datapoints to insert", ParameterType="body", DataType="List<DataPoint>", IsRequired=true, Verb="POST")
        // @ApiMember(Name="DataPoints", Description="Collection of datapoints to insert", ParameterType="body", DataType="List<DataPoint>", IsRequired=true, Verb="PUT")
        public ArrayList<DataPoint> DataPoints = null;

        @ApiMember(Name="TimeStamp", Description="Sensor value timestamp", ParameterType="query", DataType="Date", IsRequired=true, Verb="DELETE")
        public Date TimeStamp = null;

        @ApiMember(Name="Value", Description="Sensor value", ParameterType="body", DataType="double", IsRequired=true, Verb="DELETE")
        public Double Value = null;

        @ApiMember(Name="MinutesOffset", Description="Time zone minutes offset", ParameterType="query", DataType="double", Verb="GET")
        public Double MinutesOffset = null;

        public String getId() { return Id; }
        public SensorValues setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorValues setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorValues setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorValues setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorValues setPageSize(Integer value) { this.PageSize = value; return this; }
        public Integer getInterval() { return Interval; }
        public SensorValues setInterval(Integer value) { this.Interval = value; return this; }
        public String getAggregationType() { return AggregationType; }
        public SensorValues setAggregationType(String value) { this.AggregationType = value; return this; }
        public ArrayList<DataPoint> getDataPoints() { return DataPoints; }
        public SensorValues setDataPoints(ArrayList<DataPoint> value) { this.DataPoints = value; return this; }
        public Date getTimeStamp() { return TimeStamp; }
        public SensorValues setTimeStamp(Date value) { this.TimeStamp = value; return this; }
        public Double getValue() { return Value; }
        public SensorValues setValue(Double value) { this.Value = value; return this; }
        public Double getMinutesOffset() { return MinutesOffset; }
        public SensorValues setMinutesOffset(Double value) { this.MinutesOffset = value; return this; }
        private static Object responseType = SensorValuesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{id}/values/excel/{name}", Verbs="GET")
    public static class SensorValuesExcel
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="Name", Description="Sensor name", ParameterType="path", DataType="string", IsRequired=true)
        public String Name = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="Interval", Description="Interval aggregation time in minutes (15 every 15 mins, 30 every half an hour, 60 every hour...)", ParameterType="query", DataType="int", Verb="GET")
        public Integer Interval = null;

        @ApiMember(Name="AggregationType", Description="Type of aggregation by interval ('avg' or 'sum')", ParameterType="query", DataType="string", Verb="GET")
        public String AggregationType = null;

        @ApiMember(Name="MinutesOffset", Description="Time zone minutes offset", ParameterType="query", DataType="double", Verb="GET")
        public Double MinutesOffset = null;

        public String getId() { return Id; }
        public SensorValuesExcel setId(String value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public SensorValuesExcel setName(String value) { this.Name = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorValuesExcel setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorValuesExcel setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorValuesExcel setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorValuesExcel setPageSize(Integer value) { this.PageSize = value; return this; }
        public Integer getInterval() { return Interval; }
        public SensorValuesExcel setInterval(Integer value) { this.Interval = value; return this; }
        public String getAggregationType() { return AggregationType; }
        public SensorValuesExcel setAggregationType(String value) { this.AggregationType = value; return this; }
        public Double getMinutesOffset() { return MinutesOffset; }
        public SensorValuesExcel setMinutesOffset(Double value) { this.MinutesOffset = value; return this; }
    }

    @Route(Path="/sensors/values/SensorsValues", Verbs="GET")
    public static class SensorsValuesExcel
    {
        @ApiMember(Name="Ids", Description="", ParameterType="query", DataType="string", IsRequired=true)
        public String Ids = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="Interval", Description="Interval aggregation time in minutes (15 every 15 mins, 30 every half an hour, 60 every hour...)", ParameterType="query", DataType="int", Verb="GET")
        public Integer Interval = null;

        @ApiMember(Name="AggregationType", Description="Type of aggregation by interval ('avg' or 'sum')", ParameterType="query", DataType="string", Verb="GET")
        public String AggregationType = null;

        @ApiMember(Name="MinutesOffset", Description="Time zone minutes offset", ParameterType="query", DataType="double", Verb="GET")
        public Double MinutesOffset = null;

        public String getIds() { return Ids; }
        public SensorsValuesExcel setIds(String value) { this.Ids = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorsValuesExcel setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorsValuesExcel setToDate(String value) { this.ToDate = value; return this; }
        public Integer getInterval() { return Interval; }
        public SensorsValuesExcel setInterval(Integer value) { this.Interval = value; return this; }
        public String getAggregationType() { return AggregationType; }
        public SensorsValuesExcel setAggregationType(String value) { this.AggregationType = value; return this; }
        public Double getMinutesOffset() { return MinutesOffset; }
        public SensorsValuesExcel setMinutesOffset(Double value) { this.MinutesOffset = value; return this; }
    }

    @Route(Path="/sensors/{Id}/statuses", Verbs="GET")
    // @Route(Path="/sensors/{Id}/statuses", Verbs="POST")
    // @Route(Path="/sensors/{Id}/statuses/{TimeStamp}", Verbs="PUT")
    // @Route(Path="/sensors/{Id}/statuses/{TimeStamp}", Verbs="DELETE")
    public static class SensorStatuses implements IReturn<SensorStatusesResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="StatusPoints", Description="Collection of statuses to insert", ParameterType="body", DataType="List<StatusPoint>", IsRequired=true, Verb="POST")
        public ArrayList<StatusPoint> StatusPoints = null;

        @ApiMember(Name="TimeStamp", Description="Sensor status timestamp", ParameterType="query", DataType="Date", IsRequired=true, Verb="PUT")
        // @ApiMember(Name="TimeStamp", Description="Sensor status timestamp", ParameterType="query", DataType="Date", IsRequired=true, Verb="DELETE")
        public Date TimeStamp = null;

        @ApiMember(Name="Status", Description="Sensor status", ParameterType="body", DataType="string", IsRequired=true, Verb="PUT")
        public String Status = null;

        public String getId() { return Id; }
        public SensorStatuses setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorStatuses setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorStatuses setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorStatuses setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorStatuses setPageSize(Integer value) { this.PageSize = value; return this; }
        public ArrayList<StatusPoint> getStatusPoints() { return StatusPoints; }
        public SensorStatuses setStatusPoints(ArrayList<StatusPoint> value) { this.StatusPoints = value; return this; }
        public Date getTimeStamp() { return TimeStamp; }
        public SensorStatuses setTimeStamp(Date value) { this.TimeStamp = value; return this; }
        public String getStatus() { return Status; }
        public SensorStatuses setStatus(String value) { this.Status = value; return this; }
        private static Object responseType = SensorStatusesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/statuses", Verbs="GET")
    public static class SensorStatusesHistory implements IReturn<SensorStatusesHistoryResponse>
    {
        @ApiMember(Name="Sensors", Description="Collection of sensor ids to get", ParameterType="body", DataType="List<string>", IsRequired=true, Verb="GET")
        public ArrayList<String> Sensors = null;

        public ArrayList<String> getSensors() { return Sensors; }
        public SensorStatusesHistory setSensors(ArrayList<String> value) { this.Sensors = value; return this; }
        private static Object responseType = SensorStatusesHistoryResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/stats", Verbs="GET")
    // @Route(Path="/sensors/{Id}/stats", Verbs="POST")
    public static class SensorsStats implements IReturn<SensorsStatsResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String FromDate = null;
        public String ToDate = null;
        public Integer PageNumber = null;
        public Integer PageSize = null;
        public Date Date = null;
        public Double Uptime = null;

        public String getId() { return Id; }
        public SensorsStats setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorsStats setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorsStats setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorsStats setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorsStats setPageSize(Integer value) { this.PageSize = value; return this; }
        public Date getDate() { return Date; }
        public SensorsStats setDate(Date value) { this.Date = value; return this; }
        public Double getUptime() { return Uptime; }
        public SensorsStats setUptime(Double value) { this.Uptime = value; return this; }
        private static Object responseType = SensorsStatsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/stats/month", Verbs="GET")
    public static class SensorsStatsMonth implements IReturn<SensorsStatsMonthResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public SensorsStatsMonth setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorsStatsMonthResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/predictions/values", Verbs="GET")
    // @Route(Path="/sensors/{Id}/predictions/values", Verbs="POST")
    public static class SensorValuesPredictions implements IReturn<SensorValuesPredictionsResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="Interval", Description="Interval aggregation time in minutes (15 every 15 mins, 30 every half an hour, 60 every hour...)", ParameterType="query", DataType="int", Verb="GET")
        public Integer Interval = null;

        @ApiMember(Name="AggregationType", Description="Type of aggregation by interval ('avg' or 'sum')", ParameterType="query", DataType="string", Verb="GET")
        public String AggregationType = null;

        @ApiMember(Name="PredictionPoints", Description="Collection of PredictionPoints to insert", ParameterType="body", DataType="List<PredictionPoint>", IsRequired=true, Verb="POST")
        public ArrayList<PredictionPoint> PredictionPoints = null;

        @ApiMember(Name="MinutesOffset", Description="Time zone minutes offset", ParameterType="query", DataType="double", Verb="GET")
        public Double MinutesOffset = null;

        public String getId() { return Id; }
        public SensorValuesPredictions setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorValuesPredictions setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorValuesPredictions setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorValuesPredictions setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorValuesPredictions setPageSize(Integer value) { this.PageSize = value; return this; }
        public Integer getInterval() { return Interval; }
        public SensorValuesPredictions setInterval(Integer value) { this.Interval = value; return this; }
        public String getAggregationType() { return AggregationType; }
        public SensorValuesPredictions setAggregationType(String value) { this.AggregationType = value; return this; }
        public ArrayList<PredictionPoint> getPredictionPoints() { return PredictionPoints; }
        public SensorValuesPredictions setPredictionPoints(ArrayList<PredictionPoint> value) { this.PredictionPoints = value; return this; }
        public Double getMinutesOffset() { return MinutesOffset; }
        public SensorValuesPredictions setMinutesOffset(Double value) { this.MinutesOffset = value; return this; }
        private static Object responseType = SensorValuesPredictionsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/predictions/valuesML", Verbs="GET")
    // @Route(Path="/sensors/{Id}/predictions/valuesML", Verbs="POST")
    public static class SensorValuesPredictionsML implements IReturn<SensorValuesPredictionsResponseML>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="Interval", Description="Interval aggregation time in minutes (15 every 15 mins, 30 every half an hour, 60 every hour...)", ParameterType="query", DataType="int", Verb="GET")
        public Integer Interval = null;

        @ApiMember(Name="AggregationType", Description="Type of aggregation by interval ('avg' or 'sum')", ParameterType="query", DataType="string", Verb="GET")
        public String AggregationType = null;

        @ApiMember(Name="PredictionPoints", Description="Collection of PredictionPoints to insert", ParameterType="body", DataType="List<PredictionPoint>", IsRequired=true, Verb="POST")
        public ArrayList<PredictionPoint> PredictionPoints = null;

        @ApiMember(Name="MinutesOffset", Description="Time zone minutes offset", ParameterType="query", DataType="double", Verb="GET")
        public Double MinutesOffset = null;

        public String getId() { return Id; }
        public SensorValuesPredictionsML setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorValuesPredictionsML setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorValuesPredictionsML setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorValuesPredictionsML setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorValuesPredictionsML setPageSize(Integer value) { this.PageSize = value; return this; }
        public Integer getInterval() { return Interval; }
        public SensorValuesPredictionsML setInterval(Integer value) { this.Interval = value; return this; }
        public String getAggregationType() { return AggregationType; }
        public SensorValuesPredictionsML setAggregationType(String value) { this.AggregationType = value; return this; }
        public ArrayList<PredictionPoint> getPredictionPoints() { return PredictionPoints; }
        public SensorValuesPredictionsML setPredictionPoints(ArrayList<PredictionPoint> value) { this.PredictionPoints = value; return this; }
        public Double getMinutesOffset() { return MinutesOffset; }
        public SensorValuesPredictionsML setMinutesOffset(Double value) { this.MinutesOffset = value; return this; }
        private static Object responseType = SensorValuesPredictionsResponseML.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/outliers", Verbs="GET")
    // @Route(Path="/sensors/{Id}/outliers", Verbs="POST")
    public static class SensorOutliers implements IReturn<SensorOutliersResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="OutlierPoints", Description="Collection of OutlierPoints to insert", ParameterType="body", DataType="List<OutlierPoint>", IsRequired=true, Verb="POST")
        public ArrayList<OutlierPoint> OutlierPoints = null;

        public String getId() { return Id; }
        public SensorOutliers setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorOutliers setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorOutliers setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorOutliers setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorOutliers setPageSize(Integer value) { this.PageSize = value; return this; }
        public ArrayList<OutlierPoint> getOutlierPoints() { return OutlierPoints; }
        public SensorOutliers setOutlierPoints(ArrayList<OutlierPoint> value) { this.OutlierPoints = value; return this; }
        private static Object responseType = SensorOutliersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/gaps", Verbs="GET")
    // @Route(Path="/sensors/{Id}/gaps", Verbs="POST")
    public static class SensorGaps implements IReturn<SensorGapsResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="GET")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="GET")
        public String ToDate = null;

        @ApiMember(Name="PageNumber", Description="Pagination parameter page number", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageNumber = null;

        @ApiMember(Name="PageSize", Description="Pagination parameter page size", ParameterType="query", DataType="int", Verb="GET")
        public Integer PageSize = null;

        @ApiMember(Name="GapPoints", Description="Collection of GapPoints to insert", ParameterType="body", DataType="List<GapPoint>", IsRequired=true, Verb="POST")
        public ArrayList<GapPoint> GapPoints = null;

        public String getId() { return Id; }
        public SensorGaps setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorGaps setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorGaps setToDate(String value) { this.ToDate = value; return this; }
        public Integer getPageNumber() { return PageNumber; }
        public SensorGaps setPageNumber(Integer value) { this.PageNumber = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public SensorGaps setPageSize(Integer value) { this.PageSize = value; return this; }
        public ArrayList<GapPoint> getGapPoints() { return GapPoints; }
        public SensorGaps setGapPoints(ArrayList<GapPoint> value) { this.GapPoints = value; return this; }
        private static Object responseType = SensorGapsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/batterylevel", Verbs="PATCH")
    public static class SensorBatteryLevel implements IReturn<SensorBatteryLevelResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="BatteryLevelReport", Description="Battery Level Report", ParameterType="body", DataType="BatteryLevelReport", IsRequired=true)
        public BatteryLevelReport Report = null;

        public String getId() { return Id; }
        public SensorBatteryLevel setId(String value) { this.Id = value; return this; }
        public BatteryLevelReport getReport() { return Report; }
        public SensorBatteryLevel setReport(BatteryLevelReport value) { this.Report = value; return this; }
        private static Object responseType = SensorBatteryLevelResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/valuesML", Verbs="POST")
    public static class SensorValuesMLBatch implements IReturn<SensorValuesMLBatchResponse>
    {
        @ApiMember(Name="SensorDataPoints", Description="Collection of datapoints to insert", ParameterType="body", DataType="List<SensorDataPoint>", IsRequired=true, Verb="POST")
        public ArrayList<SensorDataPointML> SensorDataPointsML = null;

        public ArrayList<SensorDataPointML> getSensorDataPointsML() { return SensorDataPointsML; }
        public SensorValuesMLBatch setSensorDataPointsML(ArrayList<SensorDataPointML> value) { this.SensorDataPointsML = value; return this; }
        private static Object responseType = SensorValuesMLBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/values", Verbs="POST")
    public static class SensorValuesBatch implements IReturn<SensorValuesBatchResponse>
    {
        @ApiMember(Name="SensorDataPoints", Description="Collection of datapoints to insert", ParameterType="body", DataType="List<SensorDataPoint>", IsRequired=true, Verb="POST")
        public List<SensorDataPoint> SensorDataPoints = null;

        public List<SensorDataPoint> getSensorDataPoints() { return SensorDataPoints; }
        public SensorValuesBatch setSensorDataPoints(List<SensorDataPoint> value) { this.SensorDataPoints = value; return this; }
        private static Object responseType = SensorValuesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/statuses", Verbs="POST")
    public static class SensorStatusesBatch implements IReturn<SensorStatusesBatchResponse>
    {
        @ApiMember(Name="SensorStatusPoints", Description="Collection of statuspoints to insert", ParameterType="body", DataType="List<SensorStatusPoint>", IsRequired=true, Verb="POST")
        public List<SensorStatusPoint> SensorStatusPoints = null;

        public List<SensorStatusPoint> getSensorStatusPoints() { return SensorStatusPoints; }
        public SensorStatusesBatch setSensorStatusPoints(List<SensorStatusPoint> value) { this.SensorStatusPoints = value; return this; }
        private static Object responseType = SensorStatusesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/batterylevel", Verbs="PATCH")
    public static class SensorBatteryLevelBatch implements IReturn<SensorBatteryLevelBatchResponse>
    {
        @ApiMember(Name="BatteryLevelReport", Description="Battery Level Reports", ParameterType="body", DataType="List<BatteryLevelReport>", IsRequired=true)
        public List<BatteryLevelReport> Reports = null;

        public List<BatteryLevelReport> getReports() { return Reports; }
        public SensorBatteryLevelBatch setReports(List<BatteryLevelReport> value) { this.Reports = value; return this; }
        private static Object responseType = SensorBatteryLevelBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/values/energylive", Verbs="POST")
    public static class SensorValuesEnergyLiveBatch implements IReturn<SensorValuesBatchResponse>
    {
        @ApiMember(Name="SensorDataPoints", Description="Collection of datapoints to reflect in live consumption", ParameterType="body", DataType="List<SensorDataPoint>", IsRequired=true, Verb="POST")
        public List<SensorDataPoint> SensorDataPoints = null;

        public List<SensorDataPoint> getSensorDataPoints() { return SensorDataPoints; }
        public SensorValuesEnergyLiveBatch setSensorDataPoints(List<SensorDataPoint> value) { this.SensorDataPoints = value; return this; }
        private static Object responseType = SensorValuesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/predictions/values", Verbs="POST")
    public static class SensorValuesPredictionsBatch implements IReturn<SensorValuesPredictionsBatchResponse>
    {
        @ApiMember(Name="PredictionPoint", Description="Collection of predictionpoints to insert", ParameterType="body", DataType="List<PredictionPoint>", IsRequired=true, Verb="POST")
        public ArrayList<PredictionPoint> PredictionPoints = null;

        public ArrayList<PredictionPoint> getPredictionPoints() { return PredictionPoints; }
        public SensorValuesPredictionsBatch setPredictionPoints(ArrayList<PredictionPoint> value) { this.PredictionPoints = value; return this; }
        private static Object responseType = SensorValuesPredictionsBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/children", Verbs="GET")
    public static class SensorChildren implements IReturn<SensorChildrenResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public SensorChildren setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorChildrenResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/installations/", Verbs="GET")
    public static class SensorInstallations implements IReturn<SensorInstallationsResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        public String getId() { return Id; }
        public SensorInstallations setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorInstallationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/installations/assignable", Verbs="GET")
    public static class SensorAssignableInstallations implements IReturn<AssignableInstallationsResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        public String getId() { return Id; }
        public SensorAssignableInstallations setId(String value) { this.Id = value; return this; }
        private static Object responseType = AssignableInstallationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/area", Verbs="GET")
    public static class SensorAreaRequest implements IReturn<SensorAreaResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public SensorAreaRequest setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorAreaResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/node", Verbs="GET")
    public static class SensorNodeRequest implements IReturn<SensorNodeResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public SensorNodeRequest setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorNodeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/unassigned", Verbs="GET")
    public static class UnassignedSensors implements IReturn<UnassignedSensorsResponse>
    {

        private static Object responseType = UnassignedSensorsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/areaName", Verbs="GET")
    public static class SensorAreaName implements IReturn<SensorAreaNameResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true)
        public String Id = null;

        public String getId() { return Id; }
        public SensorAreaName setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorAreaNameResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/{Id}/mode", Verbs="PATCH")
    public static class SensorMode implements IReturn<SensorModeResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ModePoint", Description="Sensor mode", ParameterType="body", DataType="ModePoint", IsRequired=true, Verb="PATCH")
        public ModePoint ModePoint = null;

        public String getId() { return Id; }
        public SensorMode setId(String value) { this.Id = value; return this; }
        public ModePoint getModePoint() { return ModePoint; }
        public SensorMode setModePoint(ModePoint value) { this.ModePoint = value; return this; }
        private static Object responseType = SensorModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/{Id}/setpoint", Verbs="PATCH")
    public static class SensorSetPoint implements IReturn<SensorSetPointResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="SetPointPoint", Description="Sensor setpoint", ParameterType="body", DataType="SetPointPoint", IsRequired=true, Verb="PATCH")
        public SetPointPoint SetPointPoint = null;

        public String getId() { return Id; }
        public SensorSetPoint setId(String value) { this.Id = value; return this; }
        public SetPointPoint getSetPointPoint() { return SetPointPoint; }
        public SensorSetPoint setSetPointPoint(SetPointPoint value) { this.SetPointPoint = value; return this; }
        private static Object responseType = SensorSetPointResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/modes", Verbs="PATCH")
    public static class SensorModesBatch implements IReturn<SensorModesBatchResponse>
    {
        @ApiMember(Name="SensorModePoints", Description="Collection of ModePoint to insert", ParameterType="body", DataType="List<SensorModePoint>", IsRequired=true, Verb="PATCH")
        public List<SensorModePoint> SensorModePoints = null;

        public List<SensorModePoint> getSensorModePoints() { return SensorModePoints; }
        public SensorModesBatch setSensorModePoints(List<SensorModePoint> value) { this.SensorModePoints = value; return this; }
        private static Object responseType = SensorModesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/supportedmodes", Verbs="PATCH")
    public static class SensorSupportedModesBatch implements IReturn<SensorSupportedModesBatchResponse>
    {
        @ApiMember(Name="SensorSupportedModesPoints", Description="Collection of SupportedModesPoint to insert", ParameterType="body", DataType="List<SensorSupportedModesPoint>", IsRequired=true, Verb="PATCH")
        public List<SensorSupportedModesPoint> SensorSupportedModesPoints = null;

        public List<SensorSupportedModesPoint> getSensorSupportedModesPoints() { return SensorSupportedModesPoints; }
        public SensorSupportedModesBatch setSensorSupportedModesPoints(List<SensorSupportedModesPoint> value) { this.SensorSupportedModesPoints = value; return this; }
        private static Object responseType = SensorSupportedModesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/setpoints", Verbs="PATCH")
    public static class SensorSetPointsBatch implements IReturn<SensorSetPointsBatchResponse>
    {
        @ApiMember(Name="SensorSetPointPoints", Description="Collection of SetPointsPoint to insert", ParameterType="body", DataType="List<SensorSetPointPoint>", IsRequired=true, Verb="PATCH")
        public List<SensorSetPointPoint> SensorSetPointPoints = null;

        public List<SensorSetPointPoint> getSensorSetPointPoints() { return SensorSetPointPoints; }
        public SensorSetPointsBatch setSensorSetPointPoints(List<SensorSetPointPoint> value) { this.SensorSetPointPoints = value; return this; }
        private static Object responseType = SensorSetPointsBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/{Id}/fanmode", Verbs="PATCH")
    public static class SensorFanMode implements IReturn<SensorFanModeResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="ModePoint", Description="Sensor mode", ParameterType="body", DataType="ModePoint", IsRequired=true, Verb="PATCH")
        public FanModePoint FanModePoint = null;

        public String getId() { return Id; }
        public SensorFanMode setId(String value) { this.Id = value; return this; }
        public FanModePoint getFanModePoint() { return FanModePoint; }
        public SensorFanMode setFanModePoint(FanModePoint value) { this.FanModePoint = value; return this; }
        private static Object responseType = SensorFanModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/fanmodes", Verbs="PATCH")
    public static class SensorFanModesBatch implements IReturn<SensorFanModesBatchResponse>
    {
        @ApiMember(Name="SensorFanModePoints", Description="Collection of FanModePoint to insert", ParameterType="body", DataType="List<SensorFanModePoint>", IsRequired=true, Verb="PATCH")
        public List<SensorFanModePoint> SensorFanModePoints = null;

        public List<SensorFanModePoint> getSensorFanModePoints() { return SensorFanModePoints; }
        public SensorFanModesBatch setSensorFanModePoints(List<SensorFanModePoint> value) { this.SensorFanModePoints = value; return this; }
        private static Object responseType = SensorFanModesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/supportedfanmodes", Verbs="PATCH")
    public static class SensorSupportedFanModesBatch implements IReturn<SensorSupportedFanModesBatchResponse>
    {
        @ApiMember(Name="SensorSupportedFanModesPoints", Description="Collection of SupportedFanModesPoint to insert", ParameterType="body", DataType="List<SensorSupportedFanModesPoint>", IsRequired=true, Verb="PATCH")
        public List<SensorSupportedFanModesPoint> SensorSupportedFanModesPoints = null;

        public List<SensorSupportedFanModesPoint> getSensorSupportedFanModesPoints() { return SensorSupportedFanModesPoints; }
        public SensorSupportedFanModesBatch setSensorSupportedFanModesPoints(List<SensorSupportedFanModesPoint> value) { this.SensorSupportedFanModesPoints = value; return this; }
        private static Object responseType = SensorSupportedFanModesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }


    @Route(Path="/sensors/{Id}/thermostat/setpoint/previous", Verbs="POST")
    public static class SensorThermostatSetPreviousTemperature implements IReturn<SensorThermostatSetPointResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="InstallationId", Description="Installation Id", ParameterType="body", DataType="string", IsRequired=true, Verb="POST")
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorThermostatSetPreviousTemperature setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatSetPreviousTemperature setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorThermostatSetPointResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/{Id}/update/setpoint", Verbs="PATCH")
    public static class SensorThermostatSetPoint implements IReturn<SensorThermostatSetPointResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String Id = null;

        public Double SetPoint = null;
        public Boolean IsCelsius = null;
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorThermostatSetPoint setId(String value) { this.Id = value; return this; }
        public Double getSetPoint() { return SetPoint; }
        public SensorThermostatSetPoint setSetPoint(Double value) { this.SetPoint = value; return this; }
        public Boolean getIsCelsius() { return IsCelsius; }
        public SensorThermostatSetPoint setIsCelsius(Boolean value) { this.IsCelsius = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatSetPoint setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorThermostatSetPointResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/{Id}/update/mode", Verbs="PATCH")
    public static class SensorThermostatUpdateMode implements IReturn<SensorThermostatUpdateModeResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String Id = null;

        public String InstallationId = null;
        public SensorThermostatMode Mode = null;

        public String getId() { return Id; }
        public SensorThermostatUpdateMode setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatUpdateMode setInstallationId(String value) { this.InstallationId = value; return this; }
        public SensorThermostatMode getMode() { return Mode; }
        public SensorThermostatUpdateMode setMode(SensorThermostatMode value) { this.Mode = value; return this; }
        private static Object responseType = SensorThermostatUpdateModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/{Id}/update/mode/previous", Verbs="POST")
    public static class SensorThermostatSetPreviousMode implements IReturn<SensorThermostatUpdateModeResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public String Id = null;

        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorThermostatSetPreviousMode setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatSetPreviousMode setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorThermostatUpdateModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/thermostat/main", Verbs="POST")
    public static class SensorThermostatMain implements IReturn<SensorThermostatMainResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="InstallationId", Description="Installation Id", ParameterType="body", DataType="string", IsRequired=true)
        public String InstallationId = null;

        public String getId() { return Id; }
        public SensorThermostatMain setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatMain setInstallationId(String value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorThermostatMainResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{SensorId}/thermostat/link", Verbs="POST")
    public static class SensorThermostatLink implements IReturn<SensorThermostatLinkResponse>
    {
        @ApiMember(Name="SensorId", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String SensorId = null;

        public String InstallationId = null;
        public Boolean Link = null;

        public String getSensorId() { return SensorId; }
        public SensorThermostatLink setSensorId(String value) { this.SensorId = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatLink setInstallationId(String value) { this.InstallationId = value; return this; }
        public Boolean isLink() { return Link; }
        public SensorThermostatLink setLink(Boolean value) { this.Link = value; return this; }
        private static Object responseType = SensorThermostatLinkResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/thermostats/{Id}/update/fanmode", Verbs="PATCH")
    public static class SensorThermostatUpdateFanMode implements IReturn<SensorThermostatUpdateFanModeResponse>
    {
        @ApiMember(Name="Id", Description="SensorId", ParameterType="path", DataType="string", IsRequired=true, Verb="PATCH", ExcludeInSchema=true)
        public String Id = null;

        public String InstallationId = null;
        public SensorThermostatFanMode FanMode = null;

        public String getId() { return Id; }
        public SensorThermostatUpdateFanMode setId(String value) { this.Id = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public SensorThermostatUpdateFanMode setInstallationId(String value) { this.InstallationId = value; return this; }
        public SensorThermostatFanMode getFanMode() { return FanMode; }
        public SensorThermostatUpdateFanMode setFanMode(SensorThermostatFanMode value) { this.FanMode = value; return this; }
        private static Object responseType = SensorThermostatUpdateFanModeResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors", Verbs="GET")
    // @Route(Path="/sensors", Verbs="POST")
    // @Route(Path="/sensors", Verbs="PUT")
    public static class Sensors implements IReturn<SensorsResponse>
    {
        @ApiMember(Name="Sensor", Description="Sensor", ParameterType="body", DataType="Sensor", IsRequired=true, Verb="POST")
        // @ApiMember(Name="Sensor", Description="Sensor", ParameterType="body", DataType="Sensor", IsRequired=true, Verb="PUT")
        public Sensor Sensor = null;

        @ApiMember(Name="OnlyWithoutGateways", Description="Only return sensors with no gateways associated", ParameterType="query", DataType="bool", Verb="GET", ExcludeInSchema=true)
        public Boolean OnlyWithoutGateways = null;

        public Sensor getSensor() { return Sensor; }
        public Sensors setSensor(Sensor value) { this.Sensor = value; return this; }
        public Boolean isOnlyWithoutGateways() { return OnlyWithoutGateways; }
        public Sensors setOnlyWithoutGateways(Boolean value) { this.OnlyWithoutGateways = value; return this; }
        private static Object responseType = SensorsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/details", Verbs="GET")
    // @Route(Path="/sensors/{Id}", Verbs="DELETE")
    public static class SensorDetails implements IReturn<SensorDetailsResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        public String getId() { return Id; }
        public SensorDetails setId(String value) { this.Id = value; return this; }
        private static Object responseType = SensorDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/force", Verbs="DELETE")
    public static class SensorRemoveForce implements IReturn<SensorRemoveForceResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="GatewayId", Description="Gateway id", ParameterType="body", DataType="Guid", IsRequired=true)
        public UUID GatewayId = null;

        public String getId() { return Id; }
        public SensorRemoveForce setId(String value) { this.Id = value; return this; }
        public UUID getGatewayId() { return GatewayId; }
        public SensorRemoveForce setGatewayId(UUID value) { this.GatewayId = value; return this; }
        private static Object responseType = SensorRemoveForceResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors", Verbs="PATCH")
    public static class SensorsPatch implements IReturn<Sensor>
    {
        @ApiMember(Name="Sensor", Description="Sensor object", ParameterType="body", DataType="Sensor", IsRequired=true, Verb="PATCH")
        public Sensor Sensor = null;

        @ApiMember(Name="fields", Description="Fields to update", ParameterType="query", DataType="string[]", IsRequired=true, Verb="PATCH")
        public ArrayList<String> Fields = null;

        public Sensor getSensor() { return Sensor; }
        public SensorsPatch setSensor(Sensor value) { this.Sensor = value; return this; }
        public ArrayList<String> getFields() { return Fields; }
        public SensorsPatch setFields(ArrayList<String> value) { this.Fields = value; return this; }
        private static Object responseType = Sensor.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/copyvalues/active", Verbs="GET")
    public static class SensorCopyValuesActive implements IReturn<SensorCopyValuesBatchResponse>
    {
        @ApiMember(Name="InstallationId", Description="Installation id", ParameterType="query", DataType="Guid", IsRequired=true)
        public UUID InstallationId = null;

        public UUID getInstallationId() { return InstallationId; }
        public SensorCopyValuesActive setInstallationId(UUID value) { this.InstallationId = value; return this; }
        private static Object responseType = SensorCopyValuesBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/copyvalues", Verbs="POST")
    public static class SensorCopyValues implements IReturn<SensorCopyValuesResponse>
    {
        public String SourceSensorId = null;
        public String TargetSensorId = null;
        public String Key = null;
        public Date From = null;
        public Date To = null;

        public String getSourceSensorId() { return SourceSensorId; }
        public SensorCopyValues setSourceSensorId(String value) { this.SourceSensorId = value; return this; }
        public String getTargetSensorId() { return TargetSensorId; }
        public SensorCopyValues setTargetSensorId(String value) { this.TargetSensorId = value; return this; }
        public String getKey() { return Key; }
        public SensorCopyValues setKey(String value) { this.Key = value; return this; }
        public Date getFrom() { return From; }
        public SensorCopyValues setFrom(Date value) { this.From = value; return this; }
        public Date getTo() { return To; }
        public SensorCopyValues setTo(Date value) { this.To = value; return this; }
        private static Object responseType = SensorCopyValuesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/copyvalues/start", Verbs="POST")
    public static class SensorCopyValuesStart implements IReturn<SensorCopyValuesStartResponse>
    {
        public String SourceSensorId = null;
        public String TargetSensorId = null;
        public String FromTicks = null;
        public String ToTicks = null;

        public String getSourceSensorId() { return SourceSensorId; }
        public SensorCopyValuesStart setSourceSensorId(String value) { this.SourceSensorId = value; return this; }
        public String getTargetSensorId() { return TargetSensorId; }
        public SensorCopyValuesStart setTargetSensorId(String value) { this.TargetSensorId = value; return this; }
        public String getFromTicks() { return FromTicks; }
        public SensorCopyValuesStart setFromTicks(String value) { this.FromTicks = value; return this; }
        public String getToTicks() { return ToTicks; }
        public SensorCopyValuesStart setToTicks(String value) { this.ToTicks = value; return this; }
        private static Object responseType = SensorCopyValuesStartResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/copyvalues/complete", Verbs="POST")
    public static class SensorCopyValuesComplete implements IReturn<SensorCopyValuesCompleteResponse>
    {
        public String SourceSensorId = null;
        public String TargetSensorId = null;
        public String FromTicks = null;
        public String ToTicks = null;

        public String getSourceSensorId() { return SourceSensorId; }
        public SensorCopyValuesComplete setSourceSensorId(String value) { this.SourceSensorId = value; return this; }
        public String getTargetSensorId() { return TargetSensorId; }
        public SensorCopyValuesComplete setTargetSensorId(String value) { this.TargetSensorId = value; return this; }
        public String getFromTicks() { return FromTicks; }
        public SensorCopyValuesComplete setFromTicks(String value) { this.FromTicks = value; return this; }
        public String getToTicks() { return ToTicks; }
        public SensorCopyValuesComplete setToTicks(String value) { this.ToTicks = value; return this; }
        private static Object responseType = SensorCopyValuesCompleteResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/sensors/{Id}/valuesrange", Verbs="DELETE")
    public static class SensorValueRange
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="DELETE")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="DELETE")
        public String ToDate = null;

        public String getId() { return Id; }
        public SensorValueRange setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorValueRange setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorValueRange setToDate(String value) { this.ToDate = value; return this; }
    }

    @Route(Path="/sensors/{Id}/deletevalues", Verbs="DELETE")
    public static class SensorDeleteValues implements IReturn<SensorDeleteValuesResponse>
    {
        @ApiMember(Name="Id", Description="Sensor id", ParameterType="path", DataType="Guid", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="FromDate", Description="FromDate", ParameterType="query", DataType="string", Verb="DELETE")
        public String FromDate = null;

        @ApiMember(Name="ToDate", Description="ToDate", ParameterType="query", DataType="string", Verb="DELETE")
        public String ToDate = null;

        public String getId() { return Id; }
        public SensorDeleteValues setId(String value) { this.Id = value; return this; }
        public String getFromDate() { return FromDate; }
        public SensorDeleteValues setFromDate(String value) { this.FromDate = value; return this; }
        public String getToDate() { return ToDate; }
        public SensorDeleteValues setToDate(String value) { this.ToDate = value; return this; }
        private static Object responseType = SensorDeleteValuesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/installations/{InstallationId}/scheduler/all", Verbs="GET")
    public static class SchedulerBatch implements IReturn<SchedulerBatchResponse>
    {
        @ApiMember(Name="InstallationId", Description="Installation id", ParameterType="path", DataType="Guid", IsRequired=true)
        public UUID InstallationId = null;

        @ApiMember(Name="IsCelsius", Description="IsCelsius", ParameterType="query", DataType="bool?", Verb="GET")
        public Boolean IsCelsius = null;

        public UUID getInstallationId() { return InstallationId; }
        public SchedulerBatch setInstallationId(UUID value) { this.InstallationId = value; return this; }
        public Boolean getIsCelsius() { return IsCelsius; }
        public SchedulerBatch setIsCelsius(Boolean value) { this.IsCelsius = value; return this; }
        private static Object responseType = SchedulerBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tips", Verbs="GET")
    public static class Tips implements IReturn<TipsResponse>
    {

        private static Object responseType = TipsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/tips/{Section}", Verbs="GET")
    public static class TipsBySection implements IReturn<TipsBySectionResponse>
    {
        @ApiMember(Name="Section", Description="Tips section type", ParameterType="path", DataType="TipSection", IsRequired=true, Verb="GET")
        public TipSection Section = null;

        public TipSection getSection() { return Section; }
        public TipsBySection setSection(TipSection value) { this.Section = value; return this; }
        private static Object responseType = TipsBySectionResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/users", Verbs="GET")
    public static class UserSubusers implements IReturn<UserUsersResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        public String getId() { return Id; }
        public UserSubusers setId(String value) { this.Id = value; return this; }
        private static Object responseType = UserUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/users", Verbs="GET")
    // @Route(Path="/users/{Id}/users", Verbs="POST")
    public static class UserUsers implements IReturn<UserUsersResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Id", Description="User id", ParameterType="body", DataType="List<int>", IsRequired=true, Verb="POST")
        public ArrayList<Integer> ListUsersID = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserUsers setId(String value) { this.Id = value; return this; }
        public ArrayList<Integer> getListUsersID() { return ListUsersID; }
        public UserUsers setListUsersID(ArrayList<Integer> value) { this.ListUsersID = value; return this; }
        public String getType() { return Type; }
        public UserUsers setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/users/count", Verbs="GET")
    public static class UserUsersCount implements IReturn<UserUsersCountResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserUsersCount setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserUsersCount setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserUsersCountResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/parentusers", Verbs="GET")
    public static class UserParentUsers implements IReturn<UserParentUsersResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true)
        public Integer Id = null;

        public Integer getId() { return Id; }
        public UserParentUsers setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = UserParentUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/unassigned", Verbs="GET")
    public static class UnassignedUsers implements IReturn<UnassignedUsersResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        public String getId() { return Id; }
        public UnassignedUsers setId(String value) { this.Id = value; return this; }
        private static Object responseType = UnassignedUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/sensors", Verbs="GET")
    public static class UserSensors implements IReturn<UserSensorsResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserSensors setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserSensors setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserSensorsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/sensors/count", Verbs="GET")
    public static class UserSensorsCount implements IReturn<UserSensorsCountResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserSensorsCount setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserSensorsCount setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserSensorsCountResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/sensors/ids", Verbs="GET")
    public static class UserSensorsIds implements IReturn<UserSensorsIdsResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserSensorsIds setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserSensorsIds setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserSensorsIdsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/cameras", Verbs="GET")
    public static class UserCameras implements IReturn<UserCamerasResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserCameras setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserCameras setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserCamerasResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/cameras/count", Verbs="GET")
    public static class UserCamerasCount implements IReturn<UserCamerasCountResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserCamerasCount setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserCamerasCount setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserCamerasCountResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/numnotifications", Verbs="GET")
    // @Route(Path="/users/{Id}/numnotifications", Verbs="POST")
    public static class UserNumNotifications implements IReturn<UserNumNotificationsResponse>
    {
        @ApiMember(Name="Id", Description="User Id", ParameterType="path", DataType="int", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="User Id", ParameterType="path", DataType="int", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public Integer Id = null;

        public String NotificationType = null;
        public Date NotificationDate = null;

        public Integer getId() { return Id; }
        public UserNumNotifications setId(Integer value) { this.Id = value; return this; }
        public String getNotificationType() { return NotificationType; }
        public UserNumNotifications setNotificationType(String value) { this.NotificationType = value; return this; }
        public Date getNotificationDate() { return NotificationDate; }
        public UserNumNotifications setNotificationDate(Date value) { this.NotificationDate = value; return this; }
        private static Object responseType = UserNumNotificationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/events/admin", Verbs="GET")
    public static class UserAdminSentNotifications implements IReturn<UserAdminSentNotificationsResponse>
    {
        @ApiMember(Name="Id", Description="User Id", ParameterType="path", DataType="int", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        public Integer Id = null;

        public Integer getId() { return Id; }
        public UserAdminSentNotifications setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = UserAdminSentNotificationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/installations", Verbs="GET")
    public static class UserInstallations implements IReturn<UserInstallationsResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserInstallations setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserInstallations setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserInstallationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/installations/count", Verbs="GET")
    public static class UserInstallationsCount implements IReturn<UserInstallationsCountResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserInstallationsCount setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserInstallationsCount setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserInstallationsCountResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/installations/assignable", Verbs="GET")
    public static class AssignableUserInstallations implements IReturn<AssignableInstallationsResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        public String getId() { return Id; }
        public AssignableUserInstallations setId(String value) { this.Id = value; return this; }
        private static Object responseType = AssignableInstallationsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/installations/summary", Verbs="GET")
    public static class UserInstallationsSummary implements IReturn<UserInstallationsSummaryResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        public String getId() { return Id; }
        public UserInstallationsSummary setId(String value) { this.Id = value; return this; }
        private static Object responseType = UserInstallationsSummaryResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/installations", Verbs="PUT")
    public static class UsersInstallationsBatch implements IReturn<UsersInstallationsBatchResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Installations", Description="Installations", ParameterType="body", DataType="List<AssignableInstallation>", IsRequired=true)
        public ArrayList<AssignableInstallation> Installations = null;

        public String getId() { return Id; }
        public UsersInstallationsBatch setId(String value) { this.Id = value; return this; }
        public ArrayList<AssignableInstallation> getInstallations() { return Installations; }
        public UsersInstallationsBatch setInstallations(ArrayList<AssignableInstallation> value) { this.Installations = value; return this; }
        private static Object responseType = UsersInstallationsBatchResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/customers", Verbs="GET")
    public static class UserCustomers implements IReturn<UserCustomersResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserCustomers setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserCustomers setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserCustomersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/customers/count", Verbs="GET")
    public static class UserCustomersCount implements IReturn<UserCustomersCountResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="Type", Description="Type (empty or 'Error')", ParameterType="query", DataType="string", Verb="GET")
        public String Type = null;

        public String getId() { return Id; }
        public UserCustomersCount setId(String value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public UserCustomersCount setType(String value) { this.Type = value; return this; }
        private static Object responseType = UserCustomersCountResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users", Verbs="PATCH")
    public static class UsersSettingsPatch implements IReturn<UserDetailsResponse>
    {
        public String Id = null;
        public String OldPassword = null;
        public String NewPassword = null;
        public String Email = null;
        public String Culture = null;
        public String TimeZone = null;

        public String getId() { return Id; }
        public UsersSettingsPatch setId(String value) { this.Id = value; return this; }
        public String getOldPassword() { return OldPassword; }
        public UsersSettingsPatch setOldPassword(String value) { this.OldPassword = value; return this; }
        public String getNewPassword() { return NewPassword; }
        public UsersSettingsPatch setNewPassword(String value) { this.NewPassword = value; return this; }
        public String getEmail() { return Email; }
        public UsersSettingsPatch setEmail(String value) { this.Email = value; return this; }
        public String getCulture() { return Culture; }
        public UsersSettingsPatch setCulture(String value) { this.Culture = value; return this; }
        public String getTimeZone() { return TimeZone; }
        public UsersSettingsPatch setTimeZone(String value) { this.TimeZone = value; return this; }
        private static Object responseType = UserDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/settings", Verbs="GET")
    // @Route(Path="/users/{Id}/settings", Verbs="POST")
    // @Route(Path="/users/{Id}/settings", Verbs="PUT")
    public static class UserSettingsDetails implements IReturn<UserSettingsResponse>
    {
        @ApiMember(Name="Id", Description="User Id", ParameterType="path", DataType="int", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="User Id", ParameterType="path", DataType="int", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="User Id", ParameterType="path", DataType="int", IsRequired=true, Verb="PUT", ExcludeInSchema=true)
        public Integer Id = null;

        @ApiMember(Name="Settings", Description="User Settings", ParameterType="body", DataType="UserSettings", IsRequired=true, Verb="POST")
        // @ApiMember(Name="Settings", Description="User Settings", ParameterType="body", DataType="UserSettings", IsRequired=true, Verb="PUT")
        public UserSettings Settings = null;

        public Integer getId() { return Id; }
        public UserSettingsDetails setId(Integer value) { this.Id = value; return this; }
        public UserSettings getSettings() { return Settings; }
        public UserSettingsDetails setSettings(UserSettings value) { this.Settings = value; return this; }
        private static Object responseType = UserSettingsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/settings/notifications", Verbs="GET")
    // @Route(Path="/users/{Id}/settings/notifications", Verbs="PUT")
    public static class UserNotificationSettingsDetails implements IReturn<UserNotificationSettingsResponse>
    {
        @ApiMember(Name="Id", Description="User Id", ParameterType="path", DataType="int", IsRequired=true, Verb="GET", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="User Id", ParameterType="path", DataType="int", IsRequired=true, Verb="PUT", ExcludeInSchema=true)
        public Integer Id = null;

        @ApiMember(Name="NotificationSettings", Description="User Settings", ParameterType="body", DataType="List<UserNotificationSettings>", IsRequired=true, Verb="PUT")
        public ArrayList<UserNotificationSettings> NotificationSettings = null;

        public Integer getId() { return Id; }
        public UserNotificationSettingsDetails setId(Integer value) { this.Id = value; return this; }
        public ArrayList<UserNotificationSettings> getNotificationSettings() { return NotificationSettings; }
        public UserNotificationSettingsDetails setNotificationSettings(ArrayList<UserNotificationSettings> value) { this.NotificationSettings = value; return this; }
        private static Object responseType = UserNotificationSettingsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users", Verbs="PATCH")
    public static class UsersPatchGeneric implements IReturn<UserAuth>
    {
        @ApiMember(Name="User", Description="User object", ParameterType="body", DataType="UserAuth", IsRequired=true, Verb="PATCH")
        public UserAuth User = null;

        @ApiMember(Name="fields", Description="Fields to update", ParameterType="query", DataType="string", IsRequired=true, Verb="PATCH")
        public ArrayList<String> Fields = null;

        public UserAuth getUser() { return User; }
        public UsersPatchGeneric setUser(UserAuth value) { this.User = value; return this; }
        public ArrayList<String> getFields() { return Fields; }
        public UsersPatchGeneric setFields(ArrayList<String> value) { this.Fields = value; return this; }
        private static Object responseType = UserAuth.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users", Verbs="GET")
    public static class UsersList implements IReturn<UsersResponse>
    {

        private static Object responseType = UsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}", Verbs="GET")
    public static class UserDetails implements IReturn<UserDetailsResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        public String getId() { return Id; }
        public UserDetails setId(String value) { this.Id = value; return this; }
        private static Object responseType = UserDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users", Verbs="PUT")
    // @Route(Path="/users", Verbs="POST")
    public static class Users implements IReturn<UserDetailsResponse>
    {
        public UserAuth User = null;
        public String Password = null;

        public UserAuth getUser() { return User; }
        public Users setUser(UserAuth value) { this.User = value; return this; }
        public String getPassword() { return Password; }
        public Users setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = UserDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}", Verbs="DELETE")
    public static class UsersDelete implements IReturn<UsersDeleteResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="int", IsRequired=true, Verb="DELETE", ExcludeInSchema=true)
        public Integer Id = null;

        @ApiMember(Name="NewChildrenRefId", Description="RefId to assign to children of deleted user", ParameterType="body", DataType="int?", Verb="DELETE")
        public Integer NewChildrenRefId = null;

        public Integer getId() { return Id; }
        public UsersDelete setId(Integer value) { this.Id = value; return this; }
        public Integer getNewChildrenRefId() { return NewChildrenRefId; }
        public UsersDelete setNewChildrenRefId(Integer value) { this.NewChildrenRefId = value; return this; }
        private static Object responseType = UsersDeleteResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users", Verbs="PATCH")
    public static class UsersPatch implements IReturn<UserDetailsResponse>
    {
        public Integer Id = null;
        public String Password = null;
        public String FirstName = null;
        public String LastName = null;
        public String Email = null;
        public String Culture = null;
        public String TimeZone = null;
        public Integer RefId = null;
        public Integer NewChildrenParentRefId = null;
        public ArrayList<String> Roles = null;

        public Integer getId() { return Id; }
        public UsersPatch setId(Integer value) { this.Id = value; return this; }
        public String getPassword() { return Password; }
        public UsersPatch setPassword(String value) { this.Password = value; return this; }
        public String getFirstName() { return FirstName; }
        public UsersPatch setFirstName(String value) { this.FirstName = value; return this; }
        public String getLastName() { return LastName; }
        public UsersPatch setLastName(String value) { this.LastName = value; return this; }
        public String getEmail() { return Email; }
        public UsersPatch setEmail(String value) { this.Email = value; return this; }
        public String getCulture() { return Culture; }
        public UsersPatch setCulture(String value) { this.Culture = value; return this; }
        public String getTimeZone() { return TimeZone; }
        public UsersPatch setTimeZone(String value) { this.TimeZone = value; return this; }
        public Integer getRefId() { return RefId; }
        public UsersPatch setRefId(Integer value) { this.RefId = value; return this; }
        public Integer getNewChildrenParentRefId() { return NewChildrenParentRefId; }
        public UsersPatch setNewChildrenParentRefId(Integer value) { this.NewChildrenParentRefId = value; return this; }
        public ArrayList<String> getRoles() { return Roles; }
        public UsersPatch setRoles(ArrayList<String> value) { this.Roles = value; return this; }
        private static Object responseType = UserDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/roles/{role}", Verbs="GET")
    // @Route(Path="/users/{Id}/roles", Verbs="POST")
    // @Route(Path="/users/{Id}/roles", Verbs="DELETE")
    public static class UserRoles implements IReturn<UserRolesResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        // @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="DELETE", ExcludeInSchema=true)
        public String Id = null;

        @ApiMember(Name="Role", Description="User rol", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        // @ApiMember(Name="Role", Description="User rol", ParameterType="body", DataType="string", IsRequired=true, Verb="POST")
        // @ApiMember(Name="Role", Description="User rol", ParameterType="body", DataType="string", IsRequired=true, Verb="DELETE")
        public String Role = null;

        public String getId() { return Id; }
        public UserRoles setId(String value) { this.Id = value; return this; }
        public String getRole() { return Role; }
        public UserRoles setRole(String value) { this.Role = value; return this; }
        private static Object responseType = UserRolesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/block", Verbs="POST")
    public static class UserBlock implements IReturn<UserBlockResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="POST")
        public String Id = null;

        @ApiMember(Name="Block", Description="Block", ParameterType="body", DataType="bool", IsRequired=true, Verb="POST")
        public Boolean Block = null;

        public String getId() { return Id; }
        public UserBlock setId(String value) { this.Id = value; return this; }
        public Boolean isBlock() { return Block; }
        public UserBlock setBlock(Boolean value) { this.Block = value; return this; }
        private static Object responseType = UserBlockResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/gatewayaccess/{GwId}", Verbs="GET")
    public static class UserGatewayAccess implements IReturn<UserGatewayAccessResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="GwId", Description="Gateway id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String GwId = null;

        public String getId() { return Id; }
        public UserGatewayAccess setId(String value) { this.Id = value; return this; }
        public String getGwId() { return GwId; }
        public UserGatewayAccess setGwId(String value) { this.GwId = value; return this; }
        private static Object responseType = UserGatewayAccessResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/gatewayprivilegedaccess/{GwId}", Verbs="GET")
    public static class UserGatewayPrivilegedAccess implements IReturn<UserGatewayAccessResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String Id = null;

        @ApiMember(Name="GwId", Description="Gateway id", ParameterType="path", DataType="string", IsRequired=true, Verb="GET")
        public String GwId = null;

        public String getId() { return Id; }
        public UserGatewayPrivilegedAccess setId(String value) { this.Id = value; return this; }
        public String getGwId() { return GwId; }
        public UserGatewayPrivilegedAccess setGwId(String value) { this.GwId = value; return this; }
        private static Object responseType = UserGatewayAccessResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/warnings", Verbs="PATCH")
    public static class WarningsPatch implements IReturn<Warning>
    {
        @ApiMember(Name="warning", Description="Warning definition", ParameterType="body", DataType="Warning", IsRequired=true, Verb="PATCH")
        public Warning Warning = null;

        @ApiMember(Name="fields", Description="Fields to update", ParameterType="query", DataType="string", IsRequired=true, Verb="PATCH")
        public ArrayList<String> Fields = null;

        public Warning getWarning() { return Warning; }
        public WarningsPatch setWarning(Warning value) { this.Warning = value; return this; }
        public ArrayList<String> getFields() { return Fields; }
        public WarningsPatch setFields(ArrayList<String> value) { this.Fields = value; return this; }
        private static Object responseType = Warning.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/warnings", Verbs="GET")
    // @Route(Path="/warnings", Verbs="POST")
    // @Route(Path="/warnings", Verbs="PUT")
    public static class Warnings implements IReturn<WarningsResponse>
    {
        @ApiMember(Name="warning", Description="Warning definition", ParameterType="body", DataType="Warning", IsRequired=true, Verb="POST")
        // @ApiMember(Name="warning", Description="Warning definition", ParameterType="body", DataType="Warning", IsRequired=true, Verb="PUT")
        public Warning Warning = null;

        public Warning getWarning() { return Warning; }
        public Warnings setWarning(Warning value) { this.Warning = value; return this; }
        private static Object responseType = WarningsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/warnings/{Id}/details", Verbs="GET")
    // @Route(Path="/warnings/{Id}", Verbs="DELETE")
    public static class WarningDetails implements IReturn<WarningDetailsResponse>
    {
        @ApiMember(Name="Id", Description="Warning id", ParameterType="path", DataType="int", IsRequired=true, ExcludeInSchema=true)
        public Integer Id = null;

        public Integer getId() { return Id; }
        public WarningDetails setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = WarningDetailsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/userwarnings/details", Verbs="GET")
    // @Route(Path="/userwarnings", Verbs="POST")
    // @Route(Path="/userwarnings/{Id}", Verbs="DELETE")
    public static class UserWarnings implements IReturn<UserWarningsResponse>
    {
        @ApiMember(Name="UserWarning", Description="Sensor Warning", ParameterType="body", DataType="UserWarning", IsRequired=true, Verb="POST")
        public UserWarning UserWarning = null;

        @ApiMember(Name="Id", Description="Warning id", ParameterType="path", DataType="string", IsRequired=true, Verb="DELETE", ExcludeInSchema=true)
        public Integer Id = null;

        public UserWarning getUserWarning() { return UserWarning; }
        public UserWarnings setUserWarning(UserWarning value) { this.UserWarning = value; return this; }
        public Integer getId() { return Id; }
        public UserWarnings setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = UserWarningsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/warnings/created", Verbs="GET")
    public static class UserWarningsCreated implements IReturn<WarningsResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="int", IsRequired=true)
        public Integer Id = null;

        public Integer getId() { return Id; }
        public UserWarningsCreated setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = WarningsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/users/{Id}/warnings/active", Verbs="GET")
    public static class UserWarningsActive implements IReturn<WarningsResponse>
    {
        @ApiMember(Name="Id", Description="User id", ParameterType="path", DataType="int", IsRequired=true)
        public Integer Id = null;

        public Integer getId() { return Id; }
        public UserWarningsActive setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = WarningsResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/warnings/{Id}/users", Verbs="GET")
    // @Route(Path="/warnings/{Id}/users", Verbs="PUT")
    public static class WarningUsers implements IReturn<WarningUsersResponse>
    {
        @ApiMember(Name="Id", Description="Warning id", ParameterType="path", DataType="int", IsRequired=true, ExcludeInSchema=true)
        public Integer Id = null;

        @ApiMember(Name="Users", Description="List of assignable users", ParameterType="body", DataType="List<AssignableUser>", IsRequired=true, Verb="PUT")
        public ArrayList<AssignableUser> Users = null;

        public Integer getId() { return Id; }
        public WarningUsers setId(Integer value) { this.Id = value; return this; }
        public ArrayList<AssignableUser> getUsers() { return Users; }
        public WarningUsers setUsers(ArrayList<AssignableUser> value) { this.Users = value; return this; }
        private static Object responseType = WarningUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/warnings/{id}/users/assignable", Verbs="GET")
    public static class WarningAssignableUsers implements IReturn<WarningAssignableUsersResponse>
    {
        @ApiMember(Name="Id", Description="Warning id", ParameterType="path", DataType="int", IsRequired=true)
        public Integer Id = null;

        public Integer getId() { return Id; }
        public WarningAssignableUsers setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = WarningAssignableUsersResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/warnings/{Id}/activate", Verbs="POST")
    public static class WarningActivate implements IReturn<WarningActivateResponse>
    {
        @ApiMember(Name="Id", Description="Warning id", ParameterType="path", DataType="int", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public Integer Id = null;

        @ApiMember(Name="Activate", Description="Activate indicator", ParameterType="body", DataType="bool", IsRequired=true, Verb="POST")
        public Boolean Activate = null;

        public Integer getId() { return Id; }
        public WarningActivate setId(Integer value) { this.Id = value; return this; }
        public Boolean isActivate() { return Activate; }
        public WarningActivate setActivate(Boolean value) { this.Activate = value; return this; }
        private static Object responseType = WarningActivateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/warnings/{Id}/immediate", Verbs="POST")
    public static class WarningImmediate implements IReturn<WarningActivateResponse>
    {
        @ApiMember(Name="Id", Description="Warning id", ParameterType="path", DataType="int", IsRequired=true, Verb="POST", ExcludeInSchema=true)
        public Integer Id = null;

        public Integer getId() { return Id; }
        public WarningImmediate setId(Integer value) { this.Id = value; return this; }
        private static Object responseType = WarningActivateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/auth")
    // @Route("/auth/{provider}")
    // @Route("/authenticate")
    // @Route("/authenticate/{provider}")
    @DataContract
    public static class Authenticate implements IReturn<AuthenticateResponse>
    {
        @DataMember(Order=1)
        public String provider = null;

        @DataMember(Order=2)
        public String State = null;

        @DataMember(Order=3)
        public String oauth_token = null;

        @DataMember(Order=4)
        public String oauth_verifier = null;

        @DataMember(Order=5)
        public String UserName = null;

        @DataMember(Order=6)
        public String Password = null;

        @DataMember(Order=7)
        public Boolean RememberMe = null;

        @DataMember(Order=8)
        public String Continue = null;

        @DataMember(Order=9)
        public String nonce = null;

        @DataMember(Order=10)
        public String uri = null;

        @DataMember(Order=11)
        public String response = null;

        @DataMember(Order=12)
        public String qop = null;

        @DataMember(Order=13)
        public String nc = null;

        @DataMember(Order=14)
        public String cnonce = null;

        @DataMember(Order=15)
        public HashMap<String,String> Meta = null;

        public String getProvider() { return provider; }
        public Authenticate setProvider(String value) { this.provider = value; return this; }
        public String getState() { return State; }
        public Authenticate setState(String value) { this.State = value; return this; }
        public String getOauthToken() { return oauth_token; }
        public Authenticate setOauthToken(String value) { this.oauth_token = value; return this; }
        public String getOauthVerifier() { return oauth_verifier; }
        public Authenticate setOauthVerifier(String value) { this.oauth_verifier = value; return this; }
        public String getUserName() { return UserName; }
        public Authenticate setUserName(String value) { this.UserName = value; return this; }
        public String getPassword() { return Password; }
        public Authenticate setPassword(String value) { this.Password = value; return this; }
        public Boolean isRememberMe() { return RememberMe; }
        public Authenticate setRememberMe(Boolean value) { this.RememberMe = value; return this; }
        public String getContinue() { return Continue; }
        public Authenticate setContinue(String value) { this.Continue = value; return this; }
        public String getNonce() { return nonce; }
        public Authenticate setNonce(String value) { this.nonce = value; return this; }
        public String getUri() { return uri; }
        public Authenticate setUri(String value) { this.uri = value; return this; }
        public String getResponse() { return response; }
        public Authenticate setResponse(String value) { this.response = value; return this; }
        public String getQop() { return qop; }
        public Authenticate setQop(String value) { this.qop = value; return this; }
        public String getNc() { return nc; }
        public Authenticate setNc(String value) { this.nc = value; return this; }
        public String getCnonce() { return cnonce; }
        public Authenticate setCnonce(String value) { this.cnonce = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public Authenticate setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
        private static Object responseType = AuthenticateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/register")
    @DataContract
    public static class Register implements IReturn<RegisterResponse>
    {
        @DataMember(Order=1)
        public String UserName = null;

        @DataMember(Order=2)
        public String FirstName = null;

        @DataMember(Order=3)
        public String LastName = null;

        @DataMember(Order=4)
        public String DisplayName = null;

        @DataMember(Order=5)
        public String Email = null;

        @DataMember(Order=6)
        public String Password = null;

        @DataMember(Order=7)
        public Boolean AutoLogin = null;

        @DataMember(Order=8)
        public String Continue = null;

        public String getUserName() { return UserName; }
        public Register setUserName(String value) { this.UserName = value; return this; }
        public String getFirstName() { return FirstName; }
        public Register setFirstName(String value) { this.FirstName = value; return this; }
        public String getLastName() { return LastName; }
        public Register setLastName(String value) { this.LastName = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public Register setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getEmail() { return Email; }
        public Register setEmail(String value) { this.Email = value; return this; }
        public String getPassword() { return Password; }
        public Register setPassword(String value) { this.Password = value; return this; }
        public Boolean isAutoLogin() { return AutoLogin; }
        public Register setAutoLogin(Boolean value) { this.AutoLogin = value; return this; }
        public String getContinue() { return Continue; }
        public Register setContinue(String value) { this.Continue = value; return this; }
        private static Object responseType = RegisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    public static class Camera
    {
        public String Id = null;
        public String IpAddress = null;
        public Integer Port = null;
        public String Name = null;
        public String Description = null;
        public String Type = null;
        public String Manufacturer = null;
        public String Model = null;
        public Date LastDateImage = null;
        public String LastImageName = null;
        public Date CreationDate = null;
        public String LastSensorId = null;
        public String Configuration = null;

        public String getId() { return Id; }
        public Camera setId(String value) { this.Id = value; return this; }
        public String getIpAddress() { return IpAddress; }
        public Camera setIpAddress(String value) { this.IpAddress = value; return this; }
        public Integer getPort() { return Port; }
        public Camera setPort(Integer value) { this.Port = value; return this; }
        public String getName() { return Name; }
        public Camera setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public Camera setDescription(String value) { this.Description = value; return this; }
        public String getType() { return Type; }
        public Camera setType(String value) { this.Type = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public Camera setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public Camera setModel(String value) { this.Model = value; return this; }
        public Date getLastDateImage() { return LastDateImage; }
        public Camera setLastDateImage(Date value) { this.LastDateImage = value; return this; }
        public String getLastImageName() { return LastImageName; }
        public Camera setLastImageName(String value) { this.LastImageName = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public Camera setCreationDate(Date value) { this.CreationDate = value; return this; }
        public String getLastSensorId() { return LastSensorId; }
        public Camera setLastSensorId(String value) { this.LastSensorId = value; return this; }
        public String getConfiguration() { return Configuration; }
        public Camera setConfiguration(String value) { this.Configuration = value; return this; }
    }

    public static class CamerasResponse extends ResponseBase
    {
        public ArrayList<Camera> Cameras = null;
        public Camera NewCamera = null;

        public ArrayList<Camera> getCameras() { return Cameras; }
        public CamerasResponse setCameras(ArrayList<Camera> value) { this.Cameras = value; return this; }
        public Camera getNewCamera() { return NewCamera; }
        public CamerasResponse setNewCamera(Camera value) { this.NewCamera = value; return this; }
    }

    public static class CameraDetailsResponse extends ResponseBase
    {
        public Camera Camera = null;

        public Camera getCamera() { return Camera; }
        public CameraDetailsResponse setCamera(Camera value) { this.Camera = value; return this; }
    }

    public static class CameraStatusesResponse extends ResponseBase
    {
        public ArrayList<StatusPoint> Statuses = null;

        public ArrayList<StatusPoint> getStatuses() { return Statuses; }
        public CameraStatusesResponse setStatuses(ArrayList<StatusPoint> value) { this.Statuses = value; return this; }
    }

    public static class CameraStatusesBatchResponse extends ResponseBase
    {
        public ArrayList<SensorStatusPoint> SensorsStatuses = null;

        public ArrayList<SensorStatusPoint> getSensorsStatuses() { return SensorsStatuses; }
        public CameraStatusesBatchResponse setSensorsStatuses(ArrayList<SensorStatusPoint> value) { this.SensorsStatuses = value; return this; }
    }

    public static class CameraPhotoResponse extends ResponseBase
    {
        public ArrayList<Photo> Photos = null;
        public String CameraId = null;
        public String CameraName = null;
        public Integer NumPages = null;

        public ArrayList<Photo> getPhotos() { return Photos; }
        public CameraPhotoResponse setPhotos(ArrayList<Photo> value) { this.Photos = value; return this; }
        public String getCameraId() { return CameraId; }
        public CameraPhotoResponse setCameraId(String value) { this.CameraId = value; return this; }
        public String getCameraName() { return CameraName; }
        public CameraPhotoResponse setCameraName(String value) { this.CameraName = value; return this; }
        public Integer getNumPages() { return NumPages; }
        public CameraPhotoResponse setNumPages(Integer value) { this.NumPages = value; return this; }
    }

    public static class CameraLastPhotoResponse extends ResponseBase
    {
        public String ResponseString = null;
        public String LastPhotoName = null;
        public Date LastPhotoDate = null;

        public String getResponseString() { return ResponseString; }
        public CameraLastPhotoResponse setResponseString(String value) { this.ResponseString = value; return this; }
        public String getLastPhotoName() { return LastPhotoName; }
        public CameraLastPhotoResponse setLastPhotoName(String value) { this.LastPhotoName = value; return this; }
        public Date getLastPhotoDate() { return LastPhotoDate; }
        public CameraLastPhotoResponse setLastPhotoDate(Date value) { this.LastPhotoDate = value; return this; }
    }

    public static class CameraOldPhotoResponse extends ResponseBase
    {

    }

    public static class CameraPhotoBlobResponse extends ResponseBase
    {
        public String PhotoNameWithSAS = null;

        public String getPhotoNameWithSAS() { return PhotoNameWithSAS; }
        public CameraPhotoBlobResponse setPhotoNameWithSAS(String value) { this.PhotoNameWithSAS = value; return this; }
    }

    public static class CameraVideoStreamingEndpointResponse extends ResponseBase
    {
        public String Endpoint = null;

        public String getEndpoint() { return Endpoint; }
        public CameraVideoStreamingEndpointResponse setEndpoint(String value) { this.Endpoint = value; return this; }
    }

    public static class CameraVideoConsumptionResponse extends ResponseBase
    {
        public ArrayList<AzureCameraConsumption> VideoConsumption = null;

        public ArrayList<AzureCameraConsumption> getVideoConsumption() { return VideoConsumption; }
        public CameraVideoConsumptionResponse setVideoConsumption(ArrayList<AzureCameraConsumption> value) { this.VideoConsumption = value; return this; }
    }

    public static class CameraConsumptionResponse extends ResponseBase
    {

    }

    public static class CameraNodesResponse extends ResponseBase
    {
        public ArrayList<CameraNode> CameraNodes = null;

        public ArrayList<CameraNode> getCameraNodes() { return CameraNodes; }
        public CameraNodesResponse setCameraNodes(ArrayList<CameraNode> value) { this.CameraNodes = value; return this; }
    }

    public static class AssignableInstallationsResponse extends ResponseBase
    {
        public String Id = null;
        public ArrayList<AssignableInstallation> Installations = null;

        public String getId() { return Id; }
        public AssignableInstallationsResponse setId(String value) { this.Id = value; return this; }
        public ArrayList<AssignableInstallation> getInstallations() { return Installations; }
        public AssignableInstallationsResponse setInstallations(ArrayList<AssignableInstallation> value) { this.Installations = value; return this; }
    }

    public static class CameraUsersResponse extends ResponseBase
    {
        public ArrayList<UserAuth> CameraUsers = null;

        public ArrayList<UserAuth> getCameraUsers() { return CameraUsers; }
        public CameraUsersResponse setCameraUsers(ArrayList<UserAuth> value) { this.CameraUsers = value; return this; }
    }

    public static class UnassignedCamerasResponse extends ResponseBase
    {
        public ArrayList<Camera> UnassignedCameras = null;

        public ArrayList<Camera> getUnassignedCameras() { return UnassignedCameras; }
        public UnassignedCamerasResponse setUnassignedCameras(ArrayList<Camera> value) { this.UnassignedCameras = value; return this; }
    }

    public static class DefaultConfigurationSensorsResponse extends ResponseBase
    {
        public ArrayList<DefaultSensorConfiguration> Configurations = null;

        public ArrayList<DefaultSensorConfiguration> getConfigurations() { return Configurations; }
        public DefaultConfigurationSensorsResponse setConfigurations(ArrayList<DefaultSensorConfiguration> value) { this.Configurations = value; return this; }
    }

    public static class DefaultConfigurationCreateOrUpdateResponse extends ResponseBase
    {

    }

    public static class DefaultConfigurationCloneResponse extends ResponseBase
    {
        public DefaultSensorConfiguration Configuration = null;

        public DefaultSensorConfiguration getConfiguration() { return Configuration; }
        public DefaultConfigurationCloneResponse setConfiguration(DefaultSensorConfiguration value) { this.Configuration = value; return this; }
    }

    public static class DefaultConfigurationSensorResponse extends ResponseBase
    {
        public DefaultSensorConfiguration Configuration = null;

        public DefaultSensorConfiguration getConfiguration() { return Configuration; }
        public DefaultConfigurationSensorResponse setConfiguration(DefaultSensorConfiguration value) { this.Configuration = value; return this; }
    }

    public static class DefaultConfigurationWMBusByManufacturerResponse extends ResponseBase
    {
        public HashMap<String,HashMap<String,ArrayList<String>>> WMBusConfiguration = null;

        public HashMap<String,HashMap<String,ArrayList<String>>> getWmBusConfiguration() { return WMBusConfiguration; }
        public DefaultConfigurationWMBusByManufacturerResponse setWmBusConfiguration(HashMap<String,HashMap<String,ArrayList<String>>> value) { this.WMBusConfiguration = value; return this; }
    }

    public static class DefaultConfigurationCameraDetailsResponse extends ResponseBase
    {
        public DefaultCameraConfiguration Configuration = null;

        public DefaultCameraConfiguration getConfiguration() { return Configuration; }
        public DefaultConfigurationCameraDetailsResponse setConfiguration(DefaultCameraConfiguration value) { this.Configuration = value; return this; }
    }

    public static class DefaultConfigurationCameraResponse extends ResponseBase
    {
        public ArrayList<DefaultCameraConfiguration> ConfigurationList = null;

        public ArrayList<DefaultCameraConfiguration> getConfigurationList() { return ConfigurationList; }
        public DefaultConfigurationCameraResponse setConfigurationList(ArrayList<DefaultCameraConfiguration> value) { this.ConfigurationList = value; return this; }
    }

    public static class DefaultConfigurationCameraByManufacturerResponse extends ResponseBase
    {
        public HashMap<String,ArrayList<String>> ConfigurationDict = null;

        public HashMap<String,ArrayList<String>> getConfigurationDict() { return ConfigurationDict; }
        public DefaultConfigurationCameraByManufacturerResponse setConfigurationDict(HashMap<String,ArrayList<String>> value) { this.ConfigurationDict = value; return this; }
    }

    public static class EventsBatchResponse extends ResponseBase
    {
        public ArrayList<AzureEvent> Events = null;

        public ArrayList<AzureEvent> getEvents() { return Events; }
        public EventsBatchResponse setEvents(ArrayList<AzureEvent> value) { this.Events = value; return this; }
    }

    public static class EventsGeneralBatchResponse extends ResponseBase
    {
        public HashMap<String,ArrayList<AzureEvent>> EventGroups = null;
        public HashMap<String,Integer> EventGroupsCount = null;
        public Integer TotalCount = null;

        public HashMap<String,ArrayList<AzureEvent>> getEventGroups() { return EventGroups; }
        public EventsGeneralBatchResponse setEventGroups(HashMap<String,ArrayList<AzureEvent>> value) { this.EventGroups = value; return this; }
        public HashMap<String,Integer> getEventGroupsCount() { return EventGroupsCount; }
        public EventsGeneralBatchResponse setEventGroupsCount(HashMap<String,Integer> value) { this.EventGroupsCount = value; return this; }
        public Integer getTotalCount() { return TotalCount; }
        public EventsGeneralBatchResponse setTotalCount(Integer value) { this.TotalCount = value; return this; }
    }

    public static class EventsResponse extends ResponseBase
    {

    }

    public static class EventsPendingResponse extends ResponseBase
    {

    }

    public static class EventsAdminSentNotificationResponse extends ResponseBase
    {

    }

    public static class EventsCountResponse extends ResponseBase
    {
        public HashMap<String,Integer> EventGroupsCount = null;
        public Integer TotalCount = null;

        public HashMap<String,Integer> getEventGroupsCount() { return EventGroupsCount; }
        public EventsCountResponse setEventGroupsCount(HashMap<String,Integer> value) { this.EventGroupsCount = value; return this; }
        public Integer getTotalCount() { return TotalCount; }
        public EventsCountResponse setTotalCount(Integer value) { this.TotalCount = value; return this; }
    }

    public static class EventsOldResponse extends ResponseBase
    {

    }

    public static class EventsPendingCountNotifyResponse extends ResponseBase
    {

    }

    public static class UserForgottenPasswordResponse extends ResponseBase
    {

    }

    public static class UserPasswordResetResponse extends ResponseBase
    {

    }

    public static class UserPasswordResetTokenValidationResponse extends ResponseBase
    {
        public Boolean IsValid = null;

        public Boolean getIsValid() { return IsValid; }
        public UserPasswordResetTokenValidationResponse setIsValid(Boolean value) { this.IsValid = value; return this; }
    }

    public static class GatewayActivateResponse extends ResponseBase
    {
        public Boolean Activated = null;

        public Boolean isActivated() { return Activated; }
        public GatewayActivateResponse setActivated(Boolean value) { this.Activated = value; return this; }
    }

    public static class GatewayToggleBlockedStatusResponse extends ResponseBase
    {
        public Boolean Blocked = null;

        public Boolean isBlocked() { return Blocked; }
        public GatewayToggleBlockedStatusResponse setBlocked(Boolean value) { this.Blocked = value; return this; }
    }

    public static class GatewayToggleUnblockedStatusResponse extends ResponseBase
    {
        public Boolean Blocked = null;

        public Boolean isBlocked() { return Blocked; }
        public GatewayToggleUnblockedStatusResponse setBlocked(Boolean value) { this.Blocked = value; return this; }
    }

    public static class GatewayLiveModeResponse extends ResponseBase
    {
        public Boolean LiveModeSuccess = null;

        public Boolean isLiveModeSuccess() { return LiveModeSuccess; }
        public GatewayLiveModeResponse setLiveModeSuccess(Boolean value) { this.LiveModeSuccess = value; return this; }
    }

    public static class GatewayRestartResponse extends ResponseBase
    {
        public Boolean RestartSuccess = null;

        public Boolean isRestartSuccess() { return RestartSuccess; }
        public GatewayRestartResponse setRestartSuccess(Boolean value) { this.RestartSuccess = value; return this; }
    }

    public static class GatewayShutdownResponse extends ResponseBase
    {
        public Boolean ShutdownSuccess = null;

        public Boolean isShutdownSuccess() { return ShutdownSuccess; }
        public GatewayShutdownResponse setShutdownSuccess(Boolean value) { this.ShutdownSuccess = value; return this; }
    }

    public static class GatewayApiURLResponse extends ResponseBase
    {
        public Boolean SetApiURLSuccess = null;

        public Boolean isSetApiURLSuccess() { return SetApiURLSuccess; }
        public GatewayApiURLResponse setSetApiURLSuccess(Boolean value) { this.SetApiURLSuccess = value; return this; }
    }

    public static class GatewayServiceBusStringResponse extends ResponseBase
    {
        public Boolean SetServiceBusStringSuccess = null;

        public Boolean isSetServiceBusStringSuccess() { return SetServiceBusStringSuccess; }
        public GatewayServiceBusStringResponse setSetServiceBusStringSuccess(Boolean value) { this.SetServiceBusStringSuccess = value; return this; }
    }

    public static class GatewayCloudStorageStringResponse extends ResponseBase
    {
        public Boolean SetCloudStorageStringSuccess = null;

        public Boolean isSetCloudStorageStringSuccess() { return SetCloudStorageStringSuccess; }
        public GatewayCloudStorageStringResponse setSetCloudStorageStringSuccess(Boolean value) { this.SetCloudStorageStringSuccess = value; return this; }
    }

    public static class GatewayIoTHubStringResponse extends ResponseBase
    {
        public Boolean SetIoTHubStringSuccess = null;

        public Boolean isSetIoTHubStringSuccess() { return SetIoTHubStringSuccess; }
        public GatewayIoTHubStringResponse setSetIoTHubStringSuccess(Boolean value) { this.SetIoTHubStringSuccess = value; return this; }
    }

    public static class GatewayLoggingToggleResponse extends ResponseBase
    {
        public Boolean LoggingToggleSuccess = null;

        public Boolean isLoggingToggleSuccess() { return LoggingToggleSuccess; }
        public GatewayLoggingToggleResponse setLoggingToggleSuccess(Boolean value) { this.LoggingToggleSuccess = value; return this; }
    }

    public static class GatewayUpdateResponse extends ResponseBase
    {

    }

    public static class GatewayUnregisterResponse extends ResponseBase
    {
        public Boolean UnregisterSuccess = null;

        public Boolean isUnregisterSuccess() { return UnregisterSuccess; }
        public GatewayUnregisterResponse setUnregisterSuccess(Boolean value) { this.UnregisterSuccess = value; return this; }
    }

    public static class GatewayCreateBackupResponse extends ResponseBase
    {
        public Boolean CreateSuccess = null;

        public Boolean isCreateSuccess() { return CreateSuccess; }
        public GatewayCreateBackupResponse setCreateSuccess(Boolean value) { this.CreateSuccess = value; return this; }
    }

    public static class GatewayRestoreBackupResponse extends ResponseBase
    {
        public Boolean RestoreSuccess = null;

        public Boolean isRestoreSuccess() { return RestoreSuccess; }
        public GatewayRestoreBackupResponse setRestoreSuccess(Boolean value) { this.RestoreSuccess = value; return this; }
    }

    public static class GatewayCreateSystemBackupResponse extends ResponseBase
    {
        public Boolean CreateSuccess = null;

        public Boolean isCreateSuccess() { return CreateSuccess; }
        public GatewayCreateSystemBackupResponse setCreateSuccess(Boolean value) { this.CreateSuccess = value; return this; }
    }

    public static class GatewayRestoreSystemBackupResponse extends ResponseBase
    {
        public Boolean RestoreSuccess = null;

        public Boolean isRestoreSuccess() { return RestoreSuccess; }
        public GatewayRestoreSystemBackupResponse setRestoreSuccess(Boolean value) { this.RestoreSuccess = value; return this; }
    }

    public static class GatewaySystemBackupOtherVersionsResponse extends ResponseBase
    {

    }

    public static class GatewaySetSecurityStatusResponse extends ResponseBase
    {
        public Boolean SetSecurityStatusSuccess = null;

        public Boolean isSetSecurityStatusSuccess() { return SetSecurityStatusSuccess; }
        public GatewaySetSecurityStatusResponse setSetSecurityStatusSuccess(Boolean value) { this.SetSecurityStatusSuccess = value; return this; }
    }

    public static class GatewaySetAddOneSensorModeResponse extends ResponseBase
    {

    }

    public static class GatewaySetRemoveOneSensorModeResponse extends ResponseBase
    {

    }

    public static class GatewayNetworkCloseResponse extends ResponseBase
    {
        public Boolean CloseSuccess = null;

        public Boolean isCloseSuccess() { return CloseSuccess; }
        public GatewayNetworkCloseResponse setCloseSuccess(Boolean value) { this.CloseSuccess = value; return this; }
    }

    public static class GatewayNetworkMaintenanceResponse extends ResponseBase
    {
        public Boolean NetworkMaintenanceSuccess = null;

        public Boolean isNetworkMaintenanceSuccess() { return NetworkMaintenanceSuccess; }
        public GatewayNetworkMaintenanceResponse setNetworkMaintenanceSuccess(Boolean value) { this.NetworkMaintenanceSuccess = value; return this; }
    }

    public static class GatewayWriteRegisterResponse extends ResponseBase
    {
        public Boolean WriteRegisterSuccess = null;

        public Boolean isWriteRegisterSuccess() { return WriteRegisterSuccess; }
        public GatewayWriteRegisterResponse setWriteRegisterSuccess(Boolean value) { this.WriteRegisterSuccess = value; return this; }
    }

    public static class GatewayWriteRegistersResponse extends ResponseBase
    {
        public Boolean WriteRegistersSuccess = null;

        public Boolean isWriteRegistersSuccess() { return WriteRegistersSuccess; }
        public GatewayWriteRegistersResponse setWriteRegistersSuccess(Boolean value) { this.WriteRegistersSuccess = value; return this; }
    }

    public static class GatewayAddWMBusSensorResponse extends ResponseBase
    {
        public Boolean AddWMBusSensorSuccess = null;

        public Boolean isAddWMBusSensorSuccess() { return AddWMBusSensorSuccess; }
        public GatewayAddWMBusSensorResponse setAddWMBusSensorSuccess(Boolean value) { this.AddWMBusSensorSuccess = value; return this; }
    }

    public static class GatewayAddWibeeeSensorResponse extends ResponseBase
    {
        public CommandResponseWrapper<AddWibeeeSensorResult> AddWibeeeResult = null;

        public CommandResponseWrapper<AddWibeeeSensorResult> getAddWibeeeResult() { return AddWibeeeResult; }
        public GatewayAddWibeeeSensorResponse setAddWibeeeResult(CommandResponseWrapper<AddWibeeeSensorResult> value) { this.AddWibeeeResult = value; return this; }
    }

    public static class InstallationAddDeviceResponse extends ResponseBase
    {

    }

    public static class GatewayThermostatSetPointResponse extends ResponseBase
    {
        public Boolean SetPointSuccess = null;

        public Boolean isSetPointSuccess() { return SetPointSuccess; }
        public GatewayThermostatSetPointResponse setSetPointSuccess(Boolean value) { this.SetPointSuccess = value; return this; }
    }

    public static class GatewayThermostatMainResponse extends ResponseBase
    {
        public Boolean MainSuccess = null;

        public Boolean isMainSuccess() { return MainSuccess; }
        public GatewayThermostatMainResponse setMainSuccess(Boolean value) { this.MainSuccess = value; return this; }
    }

    public static class GatewayThermostatModeResponse extends ResponseBase
    {
        public Boolean ModeSuccess = null;

        public Boolean isModeSuccess() { return ModeSuccess; }
        public GatewayThermostatModeResponse setModeSuccess(Boolean value) { this.ModeSuccess = value; return this; }
    }

    public static class GatewayThermostatLinkResponse extends ResponseBase
    {
        public Boolean LinkSuccess = null;

        public Boolean isLinkSuccess() { return LinkSuccess; }
        public GatewayThermostatLinkResponse setLinkSuccess(Boolean value) { this.LinkSuccess = value; return this; }
    }

    public static class GatewayAddCameraResponse extends ResponseBase
    {
        public Boolean AddSuccess = null;

        public Boolean isAddSuccess() { return AddSuccess; }
        public GatewayAddCameraResponse setAddSuccess(Boolean value) { this.AddSuccess = value; return this; }
    }

    public static class GatewayUpdateCameraResponse extends ResponseBase
    {
        public Boolean UpdateSuccess = null;

        public Boolean isUpdateSuccess() { return UpdateSuccess; }
        public GatewayUpdateCameraResponse setUpdateSuccess(Boolean value) { this.UpdateSuccess = value; return this; }
    }

    public static class GatewayCameraPictureResponse extends ResponseBase
    {
        public Boolean PictureSuccess = null;

        public Boolean isPictureSuccess() { return PictureSuccess; }
        public GatewayCameraPictureResponse setPictureSuccess(Boolean value) { this.PictureSuccess = value; return this; }
    }

    public static class GatewayCameraVideoResponse extends ResponseBase
    {
        public String Endpoint = null;

        public String getEndpoint() { return Endpoint; }
        public GatewayCameraVideoResponse setEndpoint(String value) { this.Endpoint = value; return this; }
    }

    public static class GatewayCameraRemoveResponse extends ResponseBase
    {
        public Boolean RemoveSuccess = null;

        public Boolean isRemoveSuccess() { return RemoveSuccess; }
        public GatewayCameraRemoveResponse setRemoveSuccess(Boolean value) { this.RemoveSuccess = value; return this; }
    }

    public static class GatewayAddScheduleResponse extends ResponseBase
    {
        public Boolean AddSuccess = null;
        public Boolean CommunicationSuccess = null;

        public Boolean isAddSuccess() { return AddSuccess; }
        public GatewayAddScheduleResponse setAddSuccess(Boolean value) { this.AddSuccess = value; return this; }
        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public GatewayAddScheduleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
    }

    public static class GatewayRemoveScheduleResponse extends ResponseBase
    {
        public Boolean RemoveSuccess = null;
        public Boolean CommunicationSuccess = null;

        public Boolean isRemoveSuccess() { return RemoveSuccess; }
        public GatewayRemoveScheduleResponse setRemoveSuccess(Boolean value) { this.RemoveSuccess = value; return this; }
        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public GatewayRemoveScheduleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
    }

    public static class GatewayPauseScheduleResponse extends ResponseBase
    {
        public Boolean PauseSuccess = null;

        public Boolean isPauseSuccess() { return PauseSuccess; }
        public GatewayPauseScheduleResponse setPauseSuccess(Boolean value) { this.PauseSuccess = value; return this; }
    }

    public static class GatewayConfigureSensorResponse extends ResponseBase
    {
        public Boolean ConfigurationSuccess = null;

        public Boolean isConfigurationSuccess() { return ConfigurationSuccess; }
        public GatewayConfigureSensorResponse setConfigurationSuccess(Boolean value) { this.ConfigurationSuccess = value; return this; }
    }

    public static class GatewayUpdatePropertiesResponse extends ResponseBase
    {
        public Boolean UpdateSuccess = null;

        public Boolean isUpdateSuccess() { return UpdateSuccess; }
        public GatewayUpdatePropertiesResponse setUpdateSuccess(Boolean value) { this.UpdateSuccess = value; return this; }
    }

    public static class GatewayActuatorToggleResponse extends ResponseBase
    {
        public Boolean ToggleSuccess = null;
        public Boolean CommunicationSuccess = null;

        public Boolean isToggleSuccess() { return ToggleSuccess; }
        public GatewayActuatorToggleResponse setToggleSuccess(Boolean value) { this.ToggleSuccess = value; return this; }
        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public GatewayActuatorToggleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
    }

    public static class GatewayDimmerToggleResponse extends ResponseBase
    {
        public Boolean DimmerSuccess = null;
        public Boolean CommunicationSuccess = null;

        public Boolean isDimmerSuccess() { return DimmerSuccess; }
        public GatewayDimmerToggleResponse setDimmerSuccess(Boolean value) { this.DimmerSuccess = value; return this; }
        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public GatewayDimmerToggleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
    }

    public static class GatewayBypassSensorResponse extends ResponseBase
    {
        public CommandResponseWrapper<Boolean> SensorBypassSuccess = null;

        public CommandResponseWrapper<Boolean> getSensorBypassSuccess() { return SensorBypassSuccess; }
        public GatewayBypassSensorResponse setSensorBypassSuccess(CommandResponseWrapper<Boolean> value) { this.SensorBypassSuccess = value; return this; }
    }

    public static class GatewayRemoveSensorForceResponse extends ResponseBase
    {
        public Boolean RemoveSuccess = null;

        public Boolean isRemoveSuccess() { return RemoveSuccess; }
        public GatewayRemoveSensorForceResponse setRemoveSuccess(Boolean value) { this.RemoveSuccess = value; return this; }
    }

    public static class GatewaySynchronizeSensorDataResponse extends ResponseBase
    {
        public Boolean SynchronizeSuccess = null;

        public Boolean isSynchronizeSuccess() { return SynchronizeSuccess; }
        public GatewaySynchronizeSensorDataResponse setSynchronizeSuccess(Boolean value) { this.SynchronizeSuccess = value; return this; }
    }

    public static class GatewayDoorLockToggleResponse extends ResponseBase
    {
        public Boolean ToggleSuccess = null;
        public Boolean CommunicationSuccess = null;

        public Boolean isToggleSuccess() { return ToggleSuccess; }
        public GatewayDoorLockToggleResponse setToggleSuccess(Boolean value) { this.ToggleSuccess = value; return this; }
        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public GatewayDoorLockToggleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
    }

    public static class GatewayDoorLockSetPasswordResponse extends ResponseBase
    {
        public Boolean SetPasswordSuccess = null;

        public Boolean isSetPasswordSuccess() { return SetPasswordSuccess; }
        public GatewayDoorLockSetPasswordResponse setSetPasswordSuccess(Boolean value) { this.SetPasswordSuccess = value; return this; }
    }

    public static class GatewaySetSensorsMetadataResponse extends ResponseBase
    {

    }

    public static class GatewayAddOrUpdateUsersResponse extends ResponseBase
    {

    }

    public static class GatewayRemoveUsersResponse extends ResponseBase
    {

    }

    public static class GatewayClearUsersResponse extends ResponseBase
    {

    }

    public static class GatewaySyncUsersResponse extends ResponseBase
    {
        public Boolean SyncSuccess = null;

        public Boolean isSyncSuccess() { return SyncSuccess; }
        public GatewaySyncUsersResponse setSyncSuccess(Boolean value) { this.SyncSuccess = value; return this; }
    }

    public static class GatewaySyncSensorsMetadataResponse extends ResponseBase
    {

    }

    public static class GatewayThermostatFanModeResponse extends ResponseBase
    {
        public Boolean FanModeSuccess = null;

        public Boolean isFanModeSuccess() { return FanModeSuccess; }
        public GatewayThermostatFanModeResponse setFanModeSuccess(Boolean value) { this.FanModeSuccess = value; return this; }
    }

    public static class GatewayPingResponse extends ResponseBase
    {
        public Boolean Connection = null;

        public Boolean isConnection() { return Connection; }
        public GatewayPingResponse setConnection(Boolean value) { this.Connection = value; return this; }
    }

    public static class GatewayTunnelOpenResponse extends ResponseBase
    {
        public Boolean OpenSuccess = null;

        public Boolean isOpenSuccess() { return OpenSuccess; }
        public GatewayTunnelOpenResponse setOpenSuccess(Boolean value) { this.OpenSuccess = value; return this; }
    }

    public static class GatewayTunnelCloseResponse extends ResponseBase
    {
        public Boolean CloseSuccess = null;

        public Boolean isCloseSuccess() { return CloseSuccess; }
        public GatewayTunnelCloseResponse setCloseSuccess(Boolean value) { this.CloseSuccess = value; return this; }
    }

    public static class GatewayLogsResponse extends ResponseBase
    {
        public Boolean LogsRequestSuccess = null;
        public String LogDownloadLink = null;

        public Boolean isLogsRequestSuccess() { return LogsRequestSuccess; }
        public GatewayLogsResponse setLogsRequestSuccess(Boolean value) { this.LogsRequestSuccess = value; return this; }
        public String getLogDownloadLink() { return LogDownloadLink; }
        public GatewayLogsResponse setLogDownloadLink(String value) { this.LogDownloadLink = value; return this; }
    }

    public static class GatewayRoutingInfoResponse extends ResponseBase
    {
        public List<SensorRoutingInfo> GatewayRoutingInfo = null;

        public List<SensorRoutingInfo> getGatewayRoutingInfo() { return GatewayRoutingInfo; }
        public GatewayRoutingInfoResponse setGatewayRoutingInfo(List<SensorRoutingInfo> value) { this.GatewayRoutingInfo = value; return this; }
    }


    public static class GatewayCheckUpdateResponse extends ResponseBase
    {
        public Boolean newUpdate = null;

        public Boolean isNewUpdate() { return newUpdate; }
        public GatewayCheckUpdateResponse setNewUpdate(Boolean value) { this.newUpdate = value; return this; }
    }

    public static class GatewayNetworkStatusResponse extends ResponseBase
    {
        public String NetworkStatus = null;

        public String getNetworkStatus() { return NetworkStatus; }
        public GatewayNetworkStatusResponse setNetworkStatus(String value) { this.NetworkStatus = value; return this; }
    }

    public static class GatewayDevicesResponse extends ResponseBase
    {
        public ArrayList<Device> Devices = null;

        public ArrayList<Device> getDevices() { return Devices; }
        public GatewayDevicesResponse setDevices(ArrayList<Device> value) { this.Devices = value; return this; }
    }

    public static class GatewaySensorPollResponse extends ResponseBase
    {
        public SensorPollStatus SensorPollStatus = null;

        public SensorPollStatus getSensorPollStatus() { return SensorPollStatus; }
        public GatewaySensorPollResponse setSensorPollStatus(SensorPollStatus value) { this.SensorPollStatus = value; return this; }
    }

    public static class GatewaySensorPollAllResponse extends ResponseBase
    {
        public HashMap<String,SensorPollStatus> SensorPollAllStatus = null;

        public HashMap<String,SensorPollStatus> getSensorPollAllStatus() { return SensorPollAllStatus; }
        public GatewaySensorPollAllResponse setSensorPollAllStatus(HashMap<String,SensorPollStatus> value) { this.SensorPollAllStatus = value; return this; }
    }

    public static class GatewayReadRegisterResponse extends ResponseBase
    {
        public Integer RegisterValue = null;

        public Integer getRegisterValue() { return RegisterValue; }
        public GatewayReadRegisterResponse setRegisterValue(Integer value) { this.RegisterValue = value; return this; }
    }

    public static class GatewayReadRegistersResponse extends ResponseBase
    {
        public HashMap<String,Integer> RegisterValues = null;

        public HashMap<String,Integer> getRegisterValues() { return RegisterValues; }
        public GatewayReadRegistersResponse setRegisterValues(HashMap<String,Integer> value) { this.RegisterValues = value; return this; }
    }

    public static class GatewayCameraPollAllResponse extends ResponseBase
    {
        public HashMap<String,Boolean> CameraPollAllStatus = null;

        public HashMap<String,Boolean> getCameraPollAllStatus() { return CameraPollAllStatus; }
        public GatewayCameraPollAllResponse setCameraPollAllStatus(HashMap<String,Boolean> value) { this.CameraPollAllStatus = value; return this; }
    }

    public static class GatewayUPnPDevicesInfoResponse extends ResponseBase
    {
        public ArrayList<UPnPDeviceInfo> DevicesInfo = null;

        public ArrayList<UPnPDeviceInfo> getDevicesInfo() { return DevicesInfo; }
        public GatewayUPnPDevicesInfoResponse setDevicesInfo(ArrayList<UPnPDeviceInfo> value) { this.DevicesInfo = value; return this; }
    }

    public static class GatewayIPScanResponse extends ResponseBase
    {
        public ArrayList<IPScanInfo> ScanInfo = null;

        public ArrayList<IPScanInfo> getScanInfo() { return ScanInfo; }
        public GatewayIPScanResponse setScanInfo(ArrayList<IPScanInfo> value) { this.ScanInfo = value; return this; }
    }

    public static class GatewaySchedulerPollResponse extends ResponseBase
    {
        public ArrayList<SchedulerInstance> SchedulerInstances = null;
        public Boolean CommunicationSuccess = null;

        public ArrayList<SchedulerInstance> getSchedulerInstances() { return SchedulerInstances; }
        public GatewaySchedulerPollResponse setSchedulerInstances(ArrayList<SchedulerInstance> value) { this.SchedulerInstances = value; return this; }
        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public GatewaySchedulerPollResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
    }

    public static class GatewayLoggingStateResponse extends ResponseBase
    {
        public Boolean IsLoggingActive = null;

        public Boolean getIsLoggingActive() { return IsLoggingActive; }
        public GatewayLoggingStateResponse setIsLoggingActive(Boolean value) { this.IsLoggingActive = value; return this; }
    }

    public static class GatewayNotifyLifecycleStatusResponse extends ResponseBase
    {

    }

    public static class GatewayNotifyAddOrRemoveSensorResponse extends ResponseBase
    {

    }

    public static class GatewayNotifySensorConfiguredResponse extends ResponseBase
    {

    }

    public static class GatewayNotifyMainThermostatChangedResponse extends ResponseBase
    {

    }

    public static class GatewayNotifyNetworkStatusResponse extends ResponseBase
    {

    }

    public static class GatewayNotifyVideoUploadedResponse extends ResponseBase
    {

    }

    public static class GatewayNotifyBackupCreatedResponse extends ResponseBase
    {

    }

    public static class GatewayNotifySystemBackupCreatedResponse extends ResponseBase
    {

    }

    public static class GatewayUpdateStatusResponse extends ResponseBase
    {

    }

    public static class GatewayAliveResponse extends ResponseBase
    {
        public ArrayList<Date> AliveTimes = null;

        public ArrayList<Date> getAliveTimes() { return AliveTimes; }
        public GatewayAliveResponse setAliveTimes(ArrayList<Date> value) { this.AliveTimes = value; return this; }
    }

    public static class GatewayStatusesResponse extends ResponseBase
    {
        public ArrayList<StatusPoint> Statuses = null;

        public ArrayList<StatusPoint> getStatuses() { return Statuses; }
        public GatewayStatusesResponse setStatuses(ArrayList<StatusPoint> value) { this.Statuses = value; return this; }
    }

    public static class GatewayDateSyncResponse extends ResponseBase
    {
        public Long DateUTCEpoch = null;

        public Long getDateUTCEpoch() { return DateUTCEpoch; }
        public GatewayDateSyncResponse setDateUTCEpoch(Long value) { this.DateUTCEpoch = value; return this; }
    }

    public static class GatewaySystemBackupResponse extends ResponseBase
    {
        public String BackupName = null;
        public String BackupDownloadURL = null;
        public String BackupMD5 = null;
        public String UpdateName = null;
        public String UpdateDownloadURL = null;
        public String UpdateMD5 = null;

        public String getBackupName() { return BackupName; }
        public GatewaySystemBackupResponse setBackupName(String value) { this.BackupName = value; return this; }
        public String getBackupDownloadURL() { return BackupDownloadURL; }
        public GatewaySystemBackupResponse setBackupDownloadURL(String value) { this.BackupDownloadURL = value; return this; }
        public String getBackupMD5() { return BackupMD5; }
        public GatewaySystemBackupResponse setBackupMD5(String value) { this.BackupMD5 = value; return this; }
        public String getUpdateName() { return UpdateName; }
        public GatewaySystemBackupResponse setUpdateName(String value) { this.UpdateName = value; return this; }
        public String getUpdateDownloadURL() { return UpdateDownloadURL; }
        public GatewaySystemBackupResponse setUpdateDownloadURL(String value) { this.UpdateDownloadURL = value; return this; }
        public String getUpdateMD5() { return UpdateMD5; }
        public GatewaySystemBackupResponse setUpdateMD5(String value) { this.UpdateMD5 = value; return this; }
    }

    public static class GatewaySystemBackupDateResponse extends ResponseBase
    {
        public Date LastDate = null;

        public Date getLastDate() { return LastDate; }
        public GatewaySystemBackupDateResponse setLastDate(Date value) { this.LastDate = value; return this; }
    }

    public static class InstallationStatusResponse extends ResponseBase
    {
        public InstallationGatewayStatus Status = null;

        public InstallationGatewayStatus getStatus() { return Status; }
        public InstallationStatusResponse setStatus(InstallationGatewayStatus value) { this.Status = value; return this; }
    }

    public static class GatewayRegisterResponse extends ResponseBase
    {

    }

    public static class GWVersionResponse extends ResponseBase
    {
        public Boolean VersionSuccess = null;

        public Boolean isVersionSuccess() { return VersionSuccess; }
        public GWVersionResponse setVersionSuccess(Boolean value) { this.VersionSuccess = value; return this; }
    }

    public static class InstallationRegisterResponse extends ResponseBase
    {

    }

    public static class InstallationActivateResponse extends ResponseBase
    {
        public Boolean Activated = null;

        public Boolean isActivated() { return Activated; }
        public InstallationActivateResponse setActivated(Boolean value) { this.Activated = value; return this; }
    }

    public static class InstallationActivateAndAssignResponse extends ResponseBase
    {
        public Boolean ActivatedAndAssigned = null;

        public Boolean isActivatedAndAssigned() { return ActivatedAndAssigned; }
        public InstallationActivateAndAssignResponse setActivatedAndAssigned(Boolean value) { this.ActivatedAndAssigned = value; return this; }
    }

    public static class InstallationRequestLiveSensorValuesResponse extends ResponseBase
    {

    }

    public static class InstallationShutdownResponse extends ResponseBase
    {
        public Boolean ShutdownSuccess = null;

        public Boolean isShutdownSuccess() { return ShutdownSuccess; }
        public InstallationShutdownResponse setShutdownSuccess(Boolean value) { this.ShutdownSuccess = value; return this; }
    }

    public static class InstallationRestartResponse extends ResponseBase
    {
        public Boolean RestartSuccess = null;

        public Boolean isRestartSuccess() { return RestartSuccess; }
        public InstallationRestartResponse setRestartSuccess(Boolean value) { this.RestartSuccess = value; return this; }
    }

    public static class InstallationCreateBackupResponse extends ResponseBase
    {
        public Boolean CreateBackupSuccess = null;

        public Boolean isCreateBackupSuccess() { return CreateBackupSuccess; }
        public InstallationCreateBackupResponse setCreateBackupSuccess(Boolean value) { this.CreateBackupSuccess = value; return this; }
    }

    public static class InstallationCreateSystemBackupResponse extends ResponseBase
    {
        public Boolean CreateSystemBackupSuccess = null;

        public Boolean isCreateSystemBackupSuccess() { return CreateSystemBackupSuccess; }
        public InstallationCreateSystemBackupResponse setCreateSystemBackupSuccess(Boolean value) { this.CreateSystemBackupSuccess = value; return this; }
    }

    public static class InstallationRestoreBackupResponse extends ResponseBase
    {
        public Boolean RestoreBackupSuccess = null;

        public Boolean isRestoreBackupSuccess() { return RestoreBackupSuccess; }
        public InstallationRestoreBackupResponse setRestoreBackupSuccess(Boolean value) { this.RestoreBackupSuccess = value; return this; }
    }

    public static class InstallationRestoreSystemBackupResponse extends ResponseBase
    {
        public Boolean RestoreSystemBackupSuccess = null;

        public Boolean isRestoreSystemBackupSuccess() { return RestoreSystemBackupSuccess; }
        public InstallationRestoreSystemBackupResponse setRestoreSystemBackupSuccess(Boolean value) { this.RestoreSystemBackupSuccess = value; return this; }
    }

    public static class InstallationComfortResponse extends ResponseBase
    {
        public ComfortValues ComfortValues = null;

        public ComfortValues getComfortValues() { return ComfortValues; }
        public InstallationComfortResponse setComfortValues(ComfortValues value) { this.ComfortValues = value; return this; }
    }

    public static class InstallationComfortStatusResponse extends ResponseBase
    {
        public String ComfortStatus = null;

        public String getComfortStatus() { return ComfortStatus; }
        public InstallationComfortStatusResponse setComfortStatus(String value) { this.ComfortStatus = value; return this; }
    }

    public static class InstallationComfortMonthValuesResponse extends ResponseBase
    {
        public ArrayList<ComfortMonthValues> ComfortMonthValues = null;

        public ArrayList<ComfortMonthValues> getComfortMonthValues() { return ComfortMonthValues; }
        public InstallationComfortMonthValuesResponse setComfortMonthValues(ArrayList<ComfortMonthValues> value) { this.ComfortMonthValues = value; return this; }
    }

    public static class InstallationSecurityStatusResponse extends ResponseBase
    {
        public String SecurityStatus = null;

        public String getSecurityStatus() { return SecurityStatus; }
        public InstallationSecurityStatusResponse setSecurityStatus(String value) { this.SecurityStatus = value; return this; }
    }

    public static class InstallationPredictionsResponse extends ResponseBase
    {
        public ArrayList<PredictionPoint> InstallationValuePredictions = null;
        public ArrayList<ArrayList<PredictionPoint>> SensorValuesPredictions = null;
        public ArrayList<DataPoint> InstallationValues = null;
        public ArrayList<ArrayList<DataPoint>> SensorValues = null;
        public Integer NumSensors = null;

        public ArrayList<PredictionPoint> getInstallationValuePredictions() { return InstallationValuePredictions; }
        public InstallationPredictionsResponse setInstallationValuePredictions(ArrayList<PredictionPoint> value) { this.InstallationValuePredictions = value; return this; }
        public ArrayList<ArrayList<PredictionPoint>> getSensorValuesPredictions() { return SensorValuesPredictions; }
        public InstallationPredictionsResponse setSensorValuesPredictions(ArrayList<ArrayList<PredictionPoint>> value) { this.SensorValuesPredictions = value; return this; }
        public ArrayList<DataPoint> getInstallationValues() { return InstallationValues; }
        public InstallationPredictionsResponse setInstallationValues(ArrayList<DataPoint> value) { this.InstallationValues = value; return this; }
        public ArrayList<ArrayList<DataPoint>> getSensorValues() { return SensorValues; }
        public InstallationPredictionsResponse setSensorValues(ArrayList<ArrayList<DataPoint>> value) { this.SensorValues = value; return this; }
        public Integer getNumSensors() { return NumSensors; }
        public InstallationPredictionsResponse setNumSensors(Integer value) { this.NumSensors = value; return this; }
    }

    public static class InstallationEnergyTrendsResponse extends ResponseBase
    {
        public Double DayEnergyTrendValue = null;
        public String DayEnergyTrendCode = null;
        public Double WeekEnergyTrendValue = null;
        public String WeekEnergyTrendCode = null;
        public Double MonthEnergyTrendValue = null;
        public String MonthEnergyTrendCode = null;

        public Double getDayEnergyTrendValue() { return DayEnergyTrendValue; }
        public InstallationEnergyTrendsResponse setDayEnergyTrendValue(Double value) { this.DayEnergyTrendValue = value; return this; }
        public String getDayEnergyTrendCode() { return DayEnergyTrendCode; }
        public InstallationEnergyTrendsResponse setDayEnergyTrendCode(String value) { this.DayEnergyTrendCode = value; return this; }
        public Double getWeekEnergyTrendValue() { return WeekEnergyTrendValue; }
        public InstallationEnergyTrendsResponse setWeekEnergyTrendValue(Double value) { this.WeekEnergyTrendValue = value; return this; }
        public String getWeekEnergyTrendCode() { return WeekEnergyTrendCode; }
        public InstallationEnergyTrendsResponse setWeekEnergyTrendCode(String value) { this.WeekEnergyTrendCode = value; return this; }
        public Double getMonthEnergyTrendValue() { return MonthEnergyTrendValue; }
        public InstallationEnergyTrendsResponse setMonthEnergyTrendValue(Double value) { this.MonthEnergyTrendValue = value; return this; }
        public String getMonthEnergyTrendCode() { return MonthEnergyTrendCode; }
        public InstallationEnergyTrendsResponse setMonthEnergyTrendCode(String value) { this.MonthEnergyTrendCode = value; return this; }
    }

    public static class InstallationGasTrendsResponse extends ResponseBase
    {
        public Double DayGasTrendValue = null;
        public String DayGasTrendCode = null;
        public Double WeekGasTrendValue = null;
        public String WeekGasTrendCode = null;
        public Double MonthGasTrendValue = null;
        public String MonthGasTrendCode = null;

        public Double getDayGasTrendValue() { return DayGasTrendValue; }
        public InstallationGasTrendsResponse setDayGasTrendValue(Double value) { this.DayGasTrendValue = value; return this; }
        public String getDayGasTrendCode() { return DayGasTrendCode; }
        public InstallationGasTrendsResponse setDayGasTrendCode(String value) { this.DayGasTrendCode = value; return this; }
        public Double getWeekGasTrendValue() { return WeekGasTrendValue; }
        public InstallationGasTrendsResponse setWeekGasTrendValue(Double value) { this.WeekGasTrendValue = value; return this; }
        public String getWeekGasTrendCode() { return WeekGasTrendCode; }
        public InstallationGasTrendsResponse setWeekGasTrendCode(String value) { this.WeekGasTrendCode = value; return this; }
        public Double getMonthGasTrendValue() { return MonthGasTrendValue; }
        public InstallationGasTrendsResponse setMonthGasTrendValue(Double value) { this.MonthGasTrendValue = value; return this; }
        public String getMonthGasTrendCode() { return MonthGasTrendCode; }
        public InstallationGasTrendsResponse setMonthGasTrendCode(String value) { this.MonthGasTrendCode = value; return this; }
    }

    public static class InstallationHeatingTrendsResponse extends ResponseBase
    {
        public Double DayHeatingTrendValue = null;
        public String DayHeatingTrendCode = null;
        public Double WeekHeatingTrendValue = null;
        public String WeekHeatingTrendCode = null;
        public Double MonthHeatingTrendValue = null;
        public String MonthHeatingTrendCode = null;

        public Double getDayHeatingTrendValue() { return DayHeatingTrendValue; }
        public InstallationHeatingTrendsResponse setDayHeatingTrendValue(Double value) { this.DayHeatingTrendValue = value; return this; }
        public String getDayHeatingTrendCode() { return DayHeatingTrendCode; }
        public InstallationHeatingTrendsResponse setDayHeatingTrendCode(String value) { this.DayHeatingTrendCode = value; return this; }
        public Double getWeekHeatingTrendValue() { return WeekHeatingTrendValue; }
        public InstallationHeatingTrendsResponse setWeekHeatingTrendValue(Double value) { this.WeekHeatingTrendValue = value; return this; }
        public String getWeekHeatingTrendCode() { return WeekHeatingTrendCode; }
        public InstallationHeatingTrendsResponse setWeekHeatingTrendCode(String value) { this.WeekHeatingTrendCode = value; return this; }
        public Double getMonthHeatingTrendValue() { return MonthHeatingTrendValue; }
        public InstallationHeatingTrendsResponse setMonthHeatingTrendValue(Double value) { this.MonthHeatingTrendValue = value; return this; }
        public String getMonthHeatingTrendCode() { return MonthHeatingTrendCode; }
        public InstallationHeatingTrendsResponse setMonthHeatingTrendCode(String value) { this.MonthHeatingTrendCode = value; return this; }
    }

    public static class InstallationWaterTrendsResponse extends ResponseBase
    {
        public Double DayWaterTrendValue = null;
        public String DayWaterTrendCode = null;
        public Double WeekWaterTrendValue = null;
        public String WeekWaterTrendCode = null;
        public Double MonthWaterTrendValue = null;
        public String MonthWaterTrendCode = null;

        public Double getDayWaterTrendValue() { return DayWaterTrendValue; }
        public InstallationWaterTrendsResponse setDayWaterTrendValue(Double value) { this.DayWaterTrendValue = value; return this; }
        public String getDayWaterTrendCode() { return DayWaterTrendCode; }
        public InstallationWaterTrendsResponse setDayWaterTrendCode(String value) { this.DayWaterTrendCode = value; return this; }
        public Double getWeekWaterTrendValue() { return WeekWaterTrendValue; }
        public InstallationWaterTrendsResponse setWeekWaterTrendValue(Double value) { this.WeekWaterTrendValue = value; return this; }
        public String getWeekWaterTrendCode() { return WeekWaterTrendCode; }
        public InstallationWaterTrendsResponse setWeekWaterTrendCode(String value) { this.WeekWaterTrendCode = value; return this; }
        public Double getMonthWaterTrendValue() { return MonthWaterTrendValue; }
        public InstallationWaterTrendsResponse setMonthWaterTrendValue(Double value) { this.MonthWaterTrendValue = value; return this; }
        public String getMonthWaterTrendCode() { return MonthWaterTrendCode; }
        public InstallationWaterTrendsResponse setMonthWaterTrendCode(String value) { this.MonthWaterTrendCode = value; return this; }
    }

    public static class InstallationEnergyTrendResponse extends ResponseBase
    {
        public Double EnergyTrend = null;

        public Double getEnergyTrend() { return EnergyTrend; }
        public InstallationEnergyTrendResponse setEnergyTrend(Double value) { this.EnergyTrend = value; return this; }
    }

    public static class InstallationEnergyTrendSummaryResponse extends ResponseBase
    {
        public String EnergyTrend = null;
        public Double EnergyValue = null;

        public String getEnergyTrend() { return EnergyTrend; }
        public InstallationEnergyTrendSummaryResponse setEnergyTrend(String value) { this.EnergyTrend = value; return this; }
        public Double getEnergyValue() { return EnergyValue; }
        public InstallationEnergyTrendSummaryResponse setEnergyValue(Double value) { this.EnergyValue = value; return this; }
    }

    public static class InstallationTreesResponse extends ResponseBase
    {
        public ArrayList<Date> Trees = null;

        public ArrayList<Date> getTrees() { return Trees; }
        public InstallationTreesResponse setTrees(ArrayList<Date> value) { this.Trees = value; return this; }
    }

    public static class InstallationLastMonthsTreesResponse extends ResponseBase
    {
        public HashMap<String,Integer> Trees = null;

        public HashMap<String,Integer> getTrees() { return Trees; }
        public InstallationLastMonthsTreesResponse setTrees(HashMap<String,Integer> value) { this.Trees = value; return this; }
    }

    public static class InstallationConsumptionValuesResponse extends ResponseBase
    {
        public ArrayList<InstallationCategoryPeriodConsumption> Consumptions = null;

        public ArrayList<InstallationCategoryPeriodConsumption> getConsumptions() { return Consumptions; }
        public InstallationConsumptionValuesResponse setConsumptions(ArrayList<InstallationCategoryPeriodConsumption> value) { this.Consumptions = value; return this; }
    }

    public static class InstallationPercentageConsumptionValuesResponse extends ResponseBase
    {
        public HashMap<String,Double> ConsumptionPercentagesForPeriod = null;

        public HashMap<String,Double> getConsumptionPercentagesForPeriod() { return ConsumptionPercentagesForPeriod; }
        public InstallationPercentageConsumptionValuesResponse setConsumptionPercentagesForPeriod(HashMap<String,Double> value) { this.ConsumptionPercentagesForPeriod = value; return this; }
    }

    public static class InstallationConsumptionSummaryResponse extends ResponseBase
    {
        public Double DayProduction = null;
        public Double DayConsumption = null;
        public Double DayProductionPrediction = null;
        public Double DayConsumptionPrediction = null;
        public Double WeekProduction = null;
        public Double WeekConsumption = null;
        public Double WeekProductionPrediction = null;
        public Double WeekConsumptionPrediction = null;
        public Double MonthProduction = null;
        public Double MonthConsumption = null;
        public Double MonthProductionPrediction = null;
        public Double MonthConsumptionPrediction = null;
        public Double PricekWh = null;
        public Double PricekWhProduction = null;
        public Double PriceGaskWh = null;
        public Double PriceHeatingkWh = null;
        public Double PriceWaterM3 = null;
        public Double GasMeterTokWh = null;
        public String MasterSensorId = null;
        public String ProductionSensorId = null;

        public Double getDayProduction() { return DayProduction; }
        public InstallationConsumptionSummaryResponse setDayProduction(Double value) { this.DayProduction = value; return this; }
        public Double getDayConsumption() { return DayConsumption; }
        public InstallationConsumptionSummaryResponse setDayConsumption(Double value) { this.DayConsumption = value; return this; }
        public Double getDayProductionPrediction() { return DayProductionPrediction; }
        public InstallationConsumptionSummaryResponse setDayProductionPrediction(Double value) { this.DayProductionPrediction = value; return this; }
        public Double getDayConsumptionPrediction() { return DayConsumptionPrediction; }
        public InstallationConsumptionSummaryResponse setDayConsumptionPrediction(Double value) { this.DayConsumptionPrediction = value; return this; }
        public Double getWeekProduction() { return WeekProduction; }
        public InstallationConsumptionSummaryResponse setWeekProduction(Double value) { this.WeekProduction = value; return this; }
        public Double getWeekConsumption() { return WeekConsumption; }
        public InstallationConsumptionSummaryResponse setWeekConsumption(Double value) { this.WeekConsumption = value; return this; }
        public Double getWeekProductionPrediction() { return WeekProductionPrediction; }
        public InstallationConsumptionSummaryResponse setWeekProductionPrediction(Double value) { this.WeekProductionPrediction = value; return this; }
        public Double getWeekConsumptionPrediction() { return WeekConsumptionPrediction; }
        public InstallationConsumptionSummaryResponse setWeekConsumptionPrediction(Double value) { this.WeekConsumptionPrediction = value; return this; }
        public Double getMonthProduction() { return MonthProduction; }
        public InstallationConsumptionSummaryResponse setMonthProduction(Double value) { this.MonthProduction = value; return this; }
        public Double getMonthConsumption() { return MonthConsumption; }
        public InstallationConsumptionSummaryResponse setMonthConsumption(Double value) { this.MonthConsumption = value; return this; }
        public Double getMonthProductionPrediction() { return MonthProductionPrediction; }
        public InstallationConsumptionSummaryResponse setMonthProductionPrediction(Double value) { this.MonthProductionPrediction = value; return this; }
        public Double getMonthConsumptionPrediction() { return MonthConsumptionPrediction; }
        public InstallationConsumptionSummaryResponse setMonthConsumptionPrediction(Double value) { this.MonthConsumptionPrediction = value; return this; }
        public Double getPricekWh() { return PricekWh; }
        public InstallationConsumptionSummaryResponse setPricekWh(Double value) { this.PricekWh = value; return this; }
        public Double getPricekWhProduction() { return PricekWhProduction; }
        public InstallationConsumptionSummaryResponse setPricekWhProduction(Double value) { this.PricekWhProduction = value; return this; }
        public Double getPriceGaskWh() { return PriceGaskWh; }
        public InstallationConsumptionSummaryResponse setPriceGaskWh(Double value) { this.PriceGaskWh = value; return this; }
        public Double getPriceHeatingkWh() { return PriceHeatingkWh; }
        public InstallationConsumptionSummaryResponse setPriceHeatingkWh(Double value) { this.PriceHeatingkWh = value; return this; }
        public Double getPriceWaterM3() { return PriceWaterM3; }
        public InstallationConsumptionSummaryResponse setPriceWaterM3(Double value) { this.PriceWaterM3 = value; return this; }
        public Double getGasMeterTokWh() { return GasMeterTokWh; }
        public InstallationConsumptionSummaryResponse setGasMeterTokWh(Double value) { this.GasMeterTokWh = value; return this; }
        public String getMasterSensorId() { return MasterSensorId; }
        public InstallationConsumptionSummaryResponse setMasterSensorId(String value) { this.MasterSensorId = value; return this; }
        public String getProductionSensorId() { return ProductionSensorId; }
        public InstallationConsumptionSummaryResponse setProductionSensorId(String value) { this.ProductionSensorId = value; return this; }
    }

    public static class InstallationEnergyConsumptionResponse extends ResponseBase
    {
        public ArrayList<InstallationCategoryConsumption> CategoryConsumptions = null;

        public ArrayList<InstallationCategoryConsumption> getCategoryConsumptions() { return CategoryConsumptions; }
        public InstallationEnergyConsumptionResponse setCategoryConsumptions(ArrayList<InstallationCategoryConsumption> value) { this.CategoryConsumptions = value; return this; }
    }

    public static class InstallationEnergyConsumptionByCategoriesDayResponse extends ResponseBase
    {
        public HashMap<String,Double> TotalConsumption = null;
        public ArrayList<BarChartCategorizedItem> DistributedConsumption = null;

        public HashMap<String,Double> getTotalConsumption() { return TotalConsumption; }
        public InstallationEnergyConsumptionByCategoriesDayResponse setTotalConsumption(HashMap<String,Double> value) { this.TotalConsumption = value; return this; }
        public ArrayList<BarChartCategorizedItem> getDistributedConsumption() { return DistributedConsumption; }
        public InstallationEnergyConsumptionByCategoriesDayResponse setDistributedConsumption(ArrayList<BarChartCategorizedItem> value) { this.DistributedConsumption = value; return this; }
    }

    public static class InstallationEnergyConsumptionByCategoriesWeekResponse extends ResponseBase
    {
        public HashMap<String,Double> TotalConsumption = null;
        public ArrayList<BarChartCategorizedItem> DistributedConsumption = null;

        public HashMap<String,Double> getTotalConsumption() { return TotalConsumption; }
        public InstallationEnergyConsumptionByCategoriesWeekResponse setTotalConsumption(HashMap<String,Double> value) { this.TotalConsumption = value; return this; }
        public ArrayList<BarChartCategorizedItem> getDistributedConsumption() { return DistributedConsumption; }
        public InstallationEnergyConsumptionByCategoriesWeekResponse setDistributedConsumption(ArrayList<BarChartCategorizedItem> value) { this.DistributedConsumption = value; return this; }
    }

    public static class InstallationEnergyConsumptionByCategoriesMonthResponse extends ResponseBase
    {
        public HashMap<String,Double> TotalConsumption = null;
        public ArrayList<BarChartCategorizedItem> DistributedConsumption = null;

        public HashMap<String,Double> getTotalConsumption() { return TotalConsumption; }
        public InstallationEnergyConsumptionByCategoriesMonthResponse setTotalConsumption(HashMap<String,Double> value) { this.TotalConsumption = value; return this; }
        public ArrayList<BarChartCategorizedItem> getDistributedConsumption() { return DistributedConsumption; }
        public InstallationEnergyConsumptionByCategoriesMonthResponse setDistributedConsumption(ArrayList<BarChartCategorizedItem> value) { this.DistributedConsumption = value; return this; }
    }

    public static class InstallationsStatsResponse extends ResponseBase
    {
        public ArrayList<InstallationStats> InstallationStats = null;

        public ArrayList<InstallationStats> getInstallationStats() { return InstallationStats; }
        public InstallationsStatsResponse setInstallationStats(ArrayList<InstallationStats> value) { this.InstallationStats = value; return this; }
    }

    public static class InstallationDataCloudStorageResponse extends ResponseBase
    {
        public ArrayList<InstallationDataPoint> Values = null;

        public ArrayList<InstallationDataPoint> getValues() { return Values; }
        public InstallationDataCloudStorageResponse setValues(ArrayList<InstallationDataPoint> value) { this.Values = value; return this; }
    }

    public static class InstallationActiveSchedulesResponse extends ResponseBase
    {
        public Integer ActiveSchedules = null;

        public Integer getActiveSchedules() { return ActiveSchedules; }
        public InstallationActiveSchedulesResponse setActiveSchedules(Integer value) { this.ActiveSchedules = value; return this; }
    }

    public static class InstallationSystemBackupDateResponse extends ResponseBase
    {
        public Date LastDate = null;

        public Date getLastDate() { return LastDate; }
        public InstallationSystemBackupDateResponse setLastDate(Date value) { this.LastDate = value; return this; }
    }

    public static class InstallationGatewaySecurityStatusResponse extends ResponseBase
    {

    }

    public static class InstallationDataUpdaterResponse extends ResponseBase
    {

    }

    public static class InstallationOverallTempResponse extends ResponseBase
    {

    }

    public static class InstallationOverallHumidityResponse extends ResponseBase
    {

    }

    public static class SensorValuesBatchResponse extends ResponseBase
    {

    }

    public static class InstallationCityResponse extends ResponseBase
    {

    }

    public static class InstallationNameResponse extends ResponseBase
    {

    }

    public static class InstallationAddOrUpdateSensorsResponse extends ResponseBase
    {

    }

    public static class InstallationAddWMBusSensorResponse extends ResponseBase
    {

    }

    public static class InstallationAddWibeeeSensorResponse extends ResponseBase
    {
        public Boolean CommunicationSuccess = null;
        public AddWibeeeSensorResult AddResult = null;
        public SensorWithAreaIdAndName Sensor = null;

        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public InstallationAddWibeeeSensorResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
        public AddWibeeeSensorResult getAddResult() { return AddResult; }
        public InstallationAddWibeeeSensorResponse setAddResult(AddWibeeeSensorResult value) { this.AddResult = value; return this; }
        public SensorWithAreaIdAndName getSensor() { return Sensor; }
        public InstallationAddWibeeeSensorResponse setSensor(SensorWithAreaIdAndName value) { this.Sensor = value; return this; }
    }

    public static class GatewayLogStreamingDevicesInfoResponse extends ResponseBase
    {
        public List<LogStreamingDeviceInfo> LogStreamingDevicesInfo = null;
        public Boolean CommunicationSuccess = null;

        public List<LogStreamingDeviceInfo> getLogStreamingDevicesInfo() { return LogStreamingDevicesInfo; }
        public GatewayLogStreamingDevicesInfoResponse setLogStreamingDevicesInfo(List<LogStreamingDeviceInfo> value) { this.LogStreamingDevicesInfo = value; return this; }
        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public GatewayLogStreamingDevicesInfoResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
    }

    public static class InstallationAddCameraResponse extends ResponseBase
    {
        public Camera NewCamera = null;

        public Camera getNewCamera() { return NewCamera; }
        public InstallationAddCameraResponse setNewCamera(Camera value) { this.NewCamera = value; return this; }
    }

    public static class InstallationsUsersBatchResponse extends ResponseBase
    {

    }

    public static class InstallationGatewayCredentialsResponse extends ResponseBase
    {
        public String ServiceBusCredentials = null;
        public String CloudStorageCredentials = null;
        public String IoTHubCredentials = null;

        public String getServiceBusCredentials() { return ServiceBusCredentials; }
        public InstallationGatewayCredentialsResponse setServiceBusCredentials(String value) { this.ServiceBusCredentials = value; return this; }
        public String getCloudStorageCredentials() { return CloudStorageCredentials; }
        public InstallationGatewayCredentialsResponse setCloudStorageCredentials(String value) { this.CloudStorageCredentials = value; return this; }
        public String getIoTHubCredentials() { return IoTHubCredentials; }
        public InstallationGatewayCredentialsResponse setIoTHubCredentials(String value) { this.IoTHubCredentials = value; return this; }
    }

    public static class InstallationDemandResponseResponse extends ResponseBase
    {
        public UUID DemandResponseId = null;

        public UUID getDemandResponseId() { return DemandResponseId; }
        public InstallationDemandResponseResponse setDemandResponseId(UUID value) { this.DemandResponseId = value; return this; }
    }

    public static class InstallationUsersResponse extends ResponseBase
    {
        public UUID Id = null;
        public ArrayList<UserAuth> Users = null;

        public UUID getId() { return Id; }
        public InstallationUsersResponse setId(UUID value) { this.Id = value; return this; }
        public ArrayList<UserAuth> getUsers() { return Users; }
        public InstallationUsersResponse setUsers(ArrayList<UserAuth> value) { this.Users = value; return this; }
    }

    public static class InstallationAssignableUsersResponse extends ResponseBase
    {
        public UUID Id = null;
        public ArrayList<AssignableUser> Users = null;

        public UUID getId() { return Id; }
        public InstallationAssignableUsersResponse setId(UUID value) { this.Id = value; return this; }
        public ArrayList<AssignableUser> getUsers() { return Users; }
        public InstallationAssignableUsersResponse setUsers(ArrayList<AssignableUser> value) { this.Users = value; return this; }
    }

    public static class InstallationSensorsResponse extends ResponseBase
    {
        public ArrayList<Sensor> Sensors = null;
        public String InstallationId = null;

        public ArrayList<Sensor> getSensors() { return Sensors; }
        public InstallationSensorsResponse setSensors(ArrayList<Sensor> value) { this.Sensors = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public InstallationSensorsResponse setInstallationId(String value) { this.InstallationId = value; return this; }
    }

    public static class InstallationSensorsSummaryResponse extends ResponseBase
    {
        public ArrayList<SensorBaseWithAreaIDandName> Sensors = null;

        public ArrayList<SensorBaseWithAreaIDandName> getSensors() { return Sensors; }
        public InstallationSensorsSummaryResponse setSensors(ArrayList<SensorBaseWithAreaIDandName> value) { this.Sensors = value; return this; }
    }

    public static class InstallationSensorsWithAreaIdAndNameResponse extends ResponseBase
    {
        public ArrayList<SensorWithAreaIdAndName> Sensors = null;

        public ArrayList<SensorWithAreaIdAndName> getSensors() { return Sensors; }
        public InstallationSensorsWithAreaIdAndNameResponse setSensors(ArrayList<SensorWithAreaIdAndName> value) { this.Sensors = value; return this; }
    }

    public static class InstallationsAndSensorAndCategoryResponse extends ResponseBase
    {
        public ArrayList<InstallationWithSensorAndCategory> InstallationsAndSensorAndCategory = null;

        public ArrayList<InstallationWithSensorAndCategory> getInstallationsAndSensorAndCategory() { return InstallationsAndSensorAndCategory; }
        public InstallationsAndSensorAndCategoryResponse setInstallationsAndSensorAndCategory(ArrayList<InstallationWithSensorAndCategory> value) { this.InstallationsAndSensorAndCategory = value; return this; }
    }

    public static class InstallationDeviceAndAreaResponse extends ResponseBase
    {
        public ArrayList<DeviceArea> DeviceAreas = null;

        public ArrayList<DeviceArea> getDeviceAreas() { return DeviceAreas; }
        public InstallationDeviceAndAreaResponse setDeviceAreas(ArrayList<DeviceArea> value) { this.DeviceAreas = value; return this; }
    }

    public static class InstallationsWithMasterResponse extends ResponseBase
    {
        public ArrayList<Installation> Installations = null;

        public ArrayList<Installation> getInstallations() { return Installations; }
        public InstallationsWithMasterResponse setInstallations(ArrayList<Installation> value) { this.Installations = value; return this; }
    }

    public static class InstallationSensorsActuableResponse extends ResponseBase
    {
        public ArrayList<SensorWithAreaName> Sensors = null;

        public ArrayList<SensorWithAreaName> getSensors() { return Sensors; }
        public InstallationSensorsActuableResponse setSensors(ArrayList<SensorWithAreaName> value) { this.Sensors = value; return this; }
    }

    public static class InstallationSensorsSecurityResponse extends ResponseBase
    {
        public ArrayList<SensorWithAreaName> Sensors = null;

        public ArrayList<SensorWithAreaName> getSensors() { return Sensors; }
        public InstallationSensorsSecurityResponse setSensors(ArrayList<SensorWithAreaName> value) { this.Sensors = value; return this; }
    }

    public static class InstallationSensorsComfortResponse extends ResponseBase
    {
        public ArrayList<SensorWithAreaName> Sensors = null;

        public ArrayList<SensorWithAreaName> getSensors() { return Sensors; }
        public InstallationSensorsComfortResponse setSensors(ArrayList<SensorWithAreaName> value) { this.Sensors = value; return this; }
    }

    public static class InstallationMainThermostatResponse extends ResponseBase
    {
        public Sensor MainThermostat = null;

        public Sensor getMainThermostat() { return MainThermostat; }
        public InstallationMainThermostatResponse setMainThermostat(Sensor value) { this.MainThermostat = value; return this; }
    }

    public static class InstallationCamerasResponse extends ResponseBase
    {
        public ArrayList<Camera> Cameras = null;

        public ArrayList<Camera> getCameras() { return Cameras; }
        public InstallationCamerasResponse setCameras(ArrayList<Camera> value) { this.Cameras = value; return this; }
    }

    public static class InstallationPhotosResponse extends ResponseBase
    {
        public ArrayList<Camera> Cameras = null;

        public ArrayList<Camera> getCameras() { return Cameras; }
        public InstallationPhotosResponse setCameras(ArrayList<Camera> value) { this.Cameras = value; return this; }
    }

    public static class InstallationFloorplansResponse extends ResponseBase
    {
        public ArrayList<Floorplan> Floorplans = null;

        public ArrayList<Floorplan> getFloorplans() { return Floorplans; }
        public InstallationFloorplansResponse setFloorplans(ArrayList<Floorplan> value) { this.Floorplans = value; return this; }
    }

    public static class InstallationFloorplansWithAreasBatchResponse extends ResponseBase
    {
        public ArrayList<FloorPlanWithAreas> FloorPlansWithAreas = null;

        public ArrayList<FloorPlanWithAreas> getFloorPlansWithAreas() { return FloorPlansWithAreas; }
        public InstallationFloorplansWithAreasBatchResponse setFloorPlansWithAreas(ArrayList<FloorPlanWithAreas> value) { this.FloorPlansWithAreas = value; return this; }
    }

    public static class InstallationAreasResponse extends ResponseBase
    {
        public ArrayList<Area> Areas = null;

        public ArrayList<Area> getAreas() { return Areas; }
        public InstallationAreasResponse setAreas(ArrayList<Area> value) { this.Areas = value; return this; }
    }

    public static class InstallationComfortAreasResponse extends ResponseBase
    {
        public ArrayList<ComfortArea> ComfortAreas = null;

        public ArrayList<ComfortArea> getComfortAreas() { return ComfortAreas; }
        public InstallationComfortAreasResponse setComfortAreas(ArrayList<ComfortArea> value) { this.ComfortAreas = value; return this; }
    }

    public static class InstallationNodesResponse extends ResponseBase
    {
        public ArrayList<Node> Nodes = null;

        public ArrayList<Node> getNodes() { return Nodes; }
        public InstallationNodesResponse setNodes(ArrayList<Node> value) { this.Nodes = value; return this; }
    }

    public static class Installation extends InstallationBase
    {
        public String Status = null;
        public String SecurityStatus = null;
        public Date LastDateStatus = null;
        public Date LastModificationDate = null;
        public Date LastDateAverageCalculations = null;
        public Date LastAliveDate = null;
        public Double AverageTemperature = null;
        public Double AverageHumidity = null;
        public Double AverageAirQuality = null;
        public String DayEnergyTrendCode = null;
        public String WeekEnergyTrendCode = null;
        public String MonthEnergyTrendCode = null;
        public String DayGasTrendCode = null;
        public String WeekGasTrendCode = null;
        public String MonthGasTrendCode = null;
        public String DayHeatingTrendCode = null;
        public String WeekHeatingTrendCode = null;
        public String MonthHeatingTrendCode = null;
        public String DayWaterTrendCode = null;
        public String WeekWaterTrendCode = null;
        public String MonthWaterTrendCode = null;
        public Double DayEnergyTrendValue = null;
        public Double WeekEnergyTrendValue = null;
        public Double MonthEnergyTrendValue = null;
        public Double DayGasTrendValue = null;
        public Double WeekGasTrendValue = null;
        public Double MonthGasTrendValue = null;
        public Double DayHeatingTrendValue = null;
        public Double WeekHeatingTrendValue = null;
        public Double MonthHeatingTrendValue = null;
        public Double DayWaterTrendValue = null;
        public Double WeekWaterTrendValue = null;
        public Double MonthWaterTrendValue = null;
        public Date LastDateEnergyTrend = null;
        public Date LastDateGasTrend = null;
        public Date LastDateHeatingTrend = null;
        public Date LastDateWaterTrend = null;
        public String ComfortStatus = null;
        public Double Uptime = null;
        public Integer ActiveSchedulesComfort = null;
        public Integer ActiveSchedulesSecurity = null;
        public Integer ActiveSchedulesControl = null;
        public Date LastLogUploadDate = null;
        public String LastLogName = null;

        public String getStatus() { return Status; }
        public Installation setStatus(String value) { this.Status = value; return this; }
        public String getSecurityStatus() { return SecurityStatus; }
        public Installation setSecurityStatus(String value) { this.SecurityStatus = value; return this; }
        public Date getLastDateStatus() { return LastDateStatus; }
        public Installation setLastDateStatus(Date value) { this.LastDateStatus = value; return this; }
        public Date getLastModificationDate() { return LastModificationDate; }
        public Installation setLastModificationDate(Date value) { this.LastModificationDate = value; return this; }
        public Date getLastDateAverageCalculations() { return LastDateAverageCalculations; }
        public Installation setLastDateAverageCalculations(Date value) { this.LastDateAverageCalculations = value; return this; }
        public Date getLastAliveDate() { return LastAliveDate; }
        public Installation setLastAliveDate(Date value) { this.LastAliveDate = value; return this; }
        public Double getAverageTemperature() { return AverageTemperature; }
        public Installation setAverageTemperature(Double value) { this.AverageTemperature = value; return this; }
        public Double getAverageHumidity() { return AverageHumidity; }
        public Installation setAverageHumidity(Double value) { this.AverageHumidity = value; return this; }
        public Double getAverageAirQuality() { return AverageAirQuality; }
        public Installation setAverageAirQuality(Double value) { this.AverageAirQuality = value; return this; }
        public String getDayEnergyTrendCode() { return DayEnergyTrendCode; }
        public Installation setDayEnergyTrendCode(String value) { this.DayEnergyTrendCode = value; return this; }
        public String getWeekEnergyTrendCode() { return WeekEnergyTrendCode; }
        public Installation setWeekEnergyTrendCode(String value) { this.WeekEnergyTrendCode = value; return this; }
        public String getMonthEnergyTrendCode() { return MonthEnergyTrendCode; }
        public Installation setMonthEnergyTrendCode(String value) { this.MonthEnergyTrendCode = value; return this; }
        public String getDayGasTrendCode() { return DayGasTrendCode; }
        public Installation setDayGasTrendCode(String value) { this.DayGasTrendCode = value; return this; }
        public String getWeekGasTrendCode() { return WeekGasTrendCode; }
        public Installation setWeekGasTrendCode(String value) { this.WeekGasTrendCode = value; return this; }
        public String getMonthGasTrendCode() { return MonthGasTrendCode; }
        public Installation setMonthGasTrendCode(String value) { this.MonthGasTrendCode = value; return this; }
        public String getDayHeatingTrendCode() { return DayHeatingTrendCode; }
        public Installation setDayHeatingTrendCode(String value) { this.DayHeatingTrendCode = value; return this; }
        public String getWeekHeatingTrendCode() { return WeekHeatingTrendCode; }
        public Installation setWeekHeatingTrendCode(String value) { this.WeekHeatingTrendCode = value; return this; }
        public String getMonthHeatingTrendCode() { return MonthHeatingTrendCode; }
        public Installation setMonthHeatingTrendCode(String value) { this.MonthHeatingTrendCode = value; return this; }
        public String getDayWaterTrendCode() { return DayWaterTrendCode; }
        public Installation setDayWaterTrendCode(String value) { this.DayWaterTrendCode = value; return this; }
        public String getWeekWaterTrendCode() { return WeekWaterTrendCode; }
        public Installation setWeekWaterTrendCode(String value) { this.WeekWaterTrendCode = value; return this; }
        public String getMonthWaterTrendCode() { return MonthWaterTrendCode; }
        public Installation setMonthWaterTrendCode(String value) { this.MonthWaterTrendCode = value; return this; }
        public Double getDayEnergyTrendValue() { return DayEnergyTrendValue; }
        public Installation setDayEnergyTrendValue(Double value) { this.DayEnergyTrendValue = value; return this; }
        public Double getWeekEnergyTrendValue() { return WeekEnergyTrendValue; }
        public Installation setWeekEnergyTrendValue(Double value) { this.WeekEnergyTrendValue = value; return this; }
        public Double getMonthEnergyTrendValue() { return MonthEnergyTrendValue; }
        public Installation setMonthEnergyTrendValue(Double value) { this.MonthEnergyTrendValue = value; return this; }
        public Double getDayGasTrendValue() { return DayGasTrendValue; }
        public Installation setDayGasTrendValue(Double value) { this.DayGasTrendValue = value; return this; }
        public Double getWeekGasTrendValue() { return WeekGasTrendValue; }
        public Installation setWeekGasTrendValue(Double value) { this.WeekGasTrendValue = value; return this; }
        public Double getMonthGasTrendValue() { return MonthGasTrendValue; }
        public Installation setMonthGasTrendValue(Double value) { this.MonthGasTrendValue = value; return this; }
        public Double getDayHeatingTrendValue() { return DayHeatingTrendValue; }
        public Installation setDayHeatingTrendValue(Double value) { this.DayHeatingTrendValue = value; return this; }
        public Double getWeekHeatingTrendValue() { return WeekHeatingTrendValue; }
        public Installation setWeekHeatingTrendValue(Double value) { this.WeekHeatingTrendValue = value; return this; }
        public Double getMonthHeatingTrendValue() { return MonthHeatingTrendValue; }
        public Installation setMonthHeatingTrendValue(Double value) { this.MonthHeatingTrendValue = value; return this; }
        public Double getDayWaterTrendValue() { return DayWaterTrendValue; }
        public Installation setDayWaterTrendValue(Double value) { this.DayWaterTrendValue = value; return this; }
        public Double getWeekWaterTrendValue() { return WeekWaterTrendValue; }
        public Installation setWeekWaterTrendValue(Double value) { this.WeekWaterTrendValue = value; return this; }
        public Double getMonthWaterTrendValue() { return MonthWaterTrendValue; }
        public Installation setMonthWaterTrendValue(Double value) { this.MonthWaterTrendValue = value; return this; }
        public Date getLastDateEnergyTrend() { return LastDateEnergyTrend; }
        public Installation setLastDateEnergyTrend(Date value) { this.LastDateEnergyTrend = value; return this; }
        public Date getLastDateGasTrend() { return LastDateGasTrend; }
        public Installation setLastDateGasTrend(Date value) { this.LastDateGasTrend = value; return this; }
        public Date getLastDateHeatingTrend() { return LastDateHeatingTrend; }
        public Installation setLastDateHeatingTrend(Date value) { this.LastDateHeatingTrend = value; return this; }
        public Date getLastDateWaterTrend() { return LastDateWaterTrend; }
        public Installation setLastDateWaterTrend(Date value) { this.LastDateWaterTrend = value; return this; }
        public String getComfortStatus() { return ComfortStatus; }
        public Installation setComfortStatus(String value) { this.ComfortStatus = value; return this; }
        public Double getUptime() { return Uptime; }
        public Installation setUptime(Double value) { this.Uptime = value; return this; }
        public Integer getActiveSchedulesComfort() { return ActiveSchedulesComfort; }
        public Installation setActiveSchedulesComfort(Integer value) { this.ActiveSchedulesComfort = value; return this; }
        public Integer getActiveSchedulesSecurity() { return ActiveSchedulesSecurity; }
        public Installation setActiveSchedulesSecurity(Integer value) { this.ActiveSchedulesSecurity = value; return this; }
        public Integer getActiveSchedulesControl() { return ActiveSchedulesControl; }
        public Installation setActiveSchedulesControl(Integer value) { this.ActiveSchedulesControl = value; return this; }
        public Date getLastLogUploadDate() { return LastLogUploadDate; }
        public Installation setLastLogUploadDate(Date value) { this.LastLogUploadDate = value; return this; }
        public String getLastLogName() { return LastLogName; }
        public Installation setLastLogName(String value) { this.LastLogName = value; return this; }
    }

    public static class InstallationsBatchResponse extends ResponseBase
    {
        public ArrayList<Installation> Installations = null;

        public ArrayList<Installation> getInstallations() { return Installations; }
        public InstallationsBatchResponse setInstallations(ArrayList<Installation> value) { this.Installations = value; return this; }
    }

    public static class InstallationDetailsResponse extends ResponseBase
    {
        public Installation Installation = null;

        public Installation getInstallation() { return Installation; }
        public InstallationDetailsResponse setInstallation(Installation value) { this.Installation = value; return this; }
    }

    public static class UnassignedInstallationsResponse extends ResponseBase
    {
        public ArrayList<Installation> UnassignedInstallations = null;

        public ArrayList<Installation> getUnassignedInstallations() { return UnassignedInstallations; }
        public UnassignedInstallationsResponse setUnassignedInstallations(ArrayList<Installation> value) { this.UnassignedInstallations = value; return this; }
    }

    public static class ReportsListResponse extends ResponseBase
    {
        public ArrayList<Report> Reports = null;

        public ArrayList<Report> getReports() { return Reports; }
        public ReportsListResponse setReports(ArrayList<Report> value) { this.Reports = value; return this; }
    }

    public static class UserReportsResponse extends ResponseBase
    {
        public ArrayList<Report> Reports = null;

        public ArrayList<Report> getReports() { return Reports; }
        public UserReportsResponse setReports(ArrayList<Report> value) { this.Reports = value; return this; }
    }

    public static class ReportDetailsResponse extends ResponseBase
    {
        public Report Report = null;
        public ArrayList<UUID> InstallationsId = null;

        public Report getReport() { return Report; }
        public ReportDetailsResponse setReport(Report value) { this.Report = value; return this; }
        public ArrayList<UUID> getInstallationsId() { return InstallationsId; }
        public ReportDetailsResponse setInstallationsId(ArrayList<UUID> value) { this.InstallationsId = value; return this; }
    }

    public static class ReportInstallationsResponse extends ResponseBase
    {
        public ArrayList<ReportInstallation> ReportInstallations = null;

        public ArrayList<ReportInstallation> getReportInstallations() { return ReportInstallations; }
        public ReportInstallationsResponse setReportInstallations(ArrayList<ReportInstallation> value) { this.ReportInstallations = value; return this; }
    }

    public static class UserReportAssignResponse extends ResponseBase
    {
        public UserReport UserReport = null;

        public UserReport getUserReport() { return UserReport; }
        public UserReportAssignResponse setUserReport(UserReport value) { this.UserReport = value; return this; }
    }

    public static class SensorPollResponse extends ResponseBase
    {
        public SensorPollStatus SensorPollStatus = null;

        public SensorPollStatus getSensorPollStatus() { return SensorPollStatus; }
        public SensorPollResponse setSensorPollStatus(SensorPollStatus value) { this.SensorPollStatus = value; return this; }
    }

    public static class SensorLockResponse extends ResponseBase
    {

    }

    public static class SensorAreasResponse extends ResponseBase
    {
        public Boolean IsAssigned = null;

        public Boolean getIsAssigned() { return IsAssigned; }
        public SensorAreasResponse setIsAssigned(Boolean value) { this.IsAssigned = value; return this; }
    }

    public static class SensorUnassignResponse extends ResponseBase
    {

    }

    public static class SensorConfigureResponse extends ResponseBase
    {
        public Boolean ConfigurationSuccess = null;

        public Boolean isConfigurationSuccess() { return ConfigurationSuccess; }
        public SensorConfigureResponse setConfigurationSuccess(Boolean value) { this.ConfigurationSuccess = value; return this; }
    }

    public static class SensorConfigurationUpdateResponse extends ResponseBase
    {
        public Boolean ConfigurationSuccess = null;

        public Boolean isConfigurationSuccess() { return ConfigurationSuccess; }
        public SensorConfigurationUpdateResponse setConfigurationSuccess(Boolean value) { this.ConfigurationSuccess = value; return this; }
    }

    public static class SensorUpdateEditablePropertiesResponse extends ResponseBase
    {

    }

    public static class SensorZWaveRegisterEditablesBatchResponse extends ResponseBase
    {

    }

    public static class SensorBypassResponse extends ResponseBase
    {
        public CommandResponseWrapper<Boolean> BypassResponse = null;

        public CommandResponseWrapper<Boolean> getBypassResponse() { return BypassResponse; }
        public SensorBypassResponse setBypassResponse(CommandResponseWrapper<Boolean> value) { this.BypassResponse = value; return this; }
    }

    public static class SensorPowerToggleResponse extends ResponseBase
    {
        public Boolean CommunicationSuccess = null;
        public Boolean ToggleSuccess = null;

        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public SensorPowerToggleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
        public Boolean isToggleSuccess() { return ToggleSuccess; }
        public SensorPowerToggleResponse setToggleSuccess(Boolean value) { this.ToggleSuccess = value; return this; }
    }

    public static class SensorDimmableResponse extends ResponseBase
    {
        public Boolean CommunicationSuccess = null;
        public Boolean DimmerSuccess = null;

        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public SensorDimmableResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
        public Boolean isDimmerSuccess() { return DimmerSuccess; }
        public SensorDimmableResponse setDimmerSuccess(Boolean value) { this.DimmerSuccess = value; return this; }
    }

    public static class SensorDoorLockToggleResponse extends ResponseBase
    {
        public Boolean CommunicationSuccess = null;
        public Boolean ToggleSuccess = null;

        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public SensorDoorLockToggleResponse setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
        public Boolean isToggleSuccess() { return ToggleSuccess; }
        public SensorDoorLockToggleResponse setToggleSuccess(Boolean value) { this.ToggleSuccess = value; return this; }
    }

    public static class SensorLastValueResponse extends ResponseBase
    {
        public Date LastUpdateDate = null;
        public Double LastValue = null;

        public Date getLastUpdateDate() { return LastUpdateDate; }
        public SensorLastValueResponse setLastUpdateDate(Date value) { this.LastUpdateDate = value; return this; }
        public Double getLastValue() { return LastValue; }
        public SensorLastValueResponse setLastValue(Double value) { this.LastValue = value; return this; }
    }

    public static class SensorLastStatusResponse extends ResponseBase
    {
        public Date LastUpdateDate = null;
        public String LastStatus = null;

        public Date getLastUpdateDate() { return LastUpdateDate; }
        public SensorLastStatusResponse setLastUpdateDate(Date value) { this.LastUpdateDate = value; return this; }
        public String getLastStatus() { return LastStatus; }
        public SensorLastStatusResponse setLastStatus(String value) { this.LastStatus = value; return this; }
    }

    public static class SensorLastDateProcessedResponse extends ResponseBase
    {
        public Date LastDateProcessed = null;
        public String ProcessedStatus = null;

        public Date getLastDateProcessed() { return LastDateProcessed; }
        public SensorLastDateProcessedResponse setLastDateProcessed(Date value) { this.LastDateProcessed = value; return this; }
        public String getProcessedStatus() { return ProcessedStatus; }
        public SensorLastDateProcessedResponse setProcessedStatus(String value) { this.ProcessedStatus = value; return this; }
    }

    public static class SensorValuesResponse extends ResponseBase
    {
        public ArrayList<DataPoint> Values = null;

        public ArrayList<DataPoint> getValues() { return Values; }
        public SensorValuesResponse setValues(ArrayList<DataPoint> value) { this.Values = value; return this; }
    }

    public static class SensorStatusesResponse extends ResponseBase
    {
        public ArrayList<StatusPoint> Statuses = null;

        public ArrayList<StatusPoint> getStatuses() { return Statuses; }
        public SensorStatusesResponse setStatuses(ArrayList<StatusPoint> value) { this.Statuses = value; return this; }
    }

    public static class SensorStatusesHistoryResponse extends ResponseBase
    {
        public ArrayList<SensorStatusPoint> SensorsStatuses = null;

        public ArrayList<SensorStatusPoint> getSensorsStatuses() { return SensorsStatuses; }
        public SensorStatusesHistoryResponse setSensorsStatuses(ArrayList<SensorStatusPoint> value) { this.SensorsStatuses = value; return this; }
    }

    public static class SensorsStatsResponse extends ResponseBase
    {
        public ArrayList<SensorStats> SensorStats = null;

        public ArrayList<SensorStats> getSensorStats() { return SensorStats; }
        public SensorsStatsResponse setSensorStats(ArrayList<SensorStats> value) { this.SensorStats = value; return this; }
    }

    public static class SensorsStatsMonthResponse extends ResponseBase
    {
        public Double SensorStatsMonth = null;

        public Double getSensorStatsMonth() { return SensorStatsMonth; }
        public SensorsStatsMonthResponse setSensorStatsMonth(Double value) { this.SensorStatsMonth = value; return this; }
    }

    public static class SensorValuesPredictionsResponse extends ResponseBase
    {
        public ArrayList<PredictionPoint> SensorValuePredictions = null;

        public ArrayList<PredictionPoint> getSensorValuePredictions() { return SensorValuePredictions; }
        public SensorValuesPredictionsResponse setSensorValuePredictions(ArrayList<PredictionPoint> value) { this.SensorValuePredictions = value; return this; }
    }

    public static class SensorValuesPredictionsResponseML extends ResponseBase
    {
        public ArrayList<PredictionPoint> SensorValuePredictionsML = null;

        public ArrayList<PredictionPoint> getSensorValuePredictionsML() { return SensorValuePredictionsML; }
        public SensorValuesPredictionsResponseML setSensorValuePredictionsML(ArrayList<PredictionPoint> value) { this.SensorValuePredictionsML = value; return this; }
    }

    public static class SensorOutliersResponse extends ResponseBase
    {
        public ArrayList<OutlierPoint> SensorOutliers = null;

        public ArrayList<OutlierPoint> getSensorOutliers() { return SensorOutliers; }
        public SensorOutliersResponse setSensorOutliers(ArrayList<OutlierPoint> value) { this.SensorOutliers = value; return this; }
    }

    public static class SensorGapsResponse extends ResponseBase
    {
        public ArrayList<GapPoint> SensorGaps = null;

        public ArrayList<GapPoint> getSensorGaps() { return SensorGaps; }
        public SensorGapsResponse setSensorGaps(ArrayList<GapPoint> value) { this.SensorGaps = value; return this; }
    }

    public static class SensorBatteryLevelResponse extends ResponseBase
    {

    }

    public static class SensorValuesMLBatchResponse extends ResponseBase
    {

    }

    public static class SensorStatusesBatchResponse extends ResponseBase
    {
        public ArrayList<SensorStatusPoint> SensorsStatuses = null;

        public ArrayList<SensorStatusPoint> getSensorsStatuses() { return SensorsStatuses; }
        public SensorStatusesBatchResponse setSensorsStatuses(ArrayList<SensorStatusPoint> value) { this.SensorsStatuses = value; return this; }
    }

    public static class SensorBatteryLevelBatchResponse extends ResponseBase
    {

    }

    public static class SensorValuesPredictionsBatchResponse extends ResponseBase
    {

    }

    public static class SensorChildrenResponse extends ResponseBase
    {
        public ArrayList<Sensor> Children = null;

        public ArrayList<Sensor> getChildren() { return Children; }
        public SensorChildrenResponse setChildren(ArrayList<Sensor> value) { this.Children = value; return this; }
    }

    public static class SensorInstallationsResponse extends ResponseBase
    {
        public String Id = null;
        public ArrayList<Installation> Installations = null;

        public String getId() { return Id; }
        public SensorInstallationsResponse setId(String value) { this.Id = value; return this; }
        public ArrayList<Installation> getInstallations() { return Installations; }
        public SensorInstallationsResponse setInstallations(ArrayList<Installation> value) { this.Installations = value; return this; }
    }

    public static class SensorAreaResponse extends ResponseBase
    {
        public Area Area = null;

        public Area getArea() { return Area; }
        public SensorAreaResponse setArea(Area value) { this.Area = value; return this; }
    }

    public static class SensorNodeResponse extends ResponseBase
    {
        public Node Node = null;

        public Node getNode() { return Node; }
        public SensorNodeResponse setNode(Node value) { this.Node = value; return this; }
    }

    public static class UnassignedSensorsResponse extends ResponseBase
    {
        public ArrayList<Sensor> UnassignedSensors = null;

        public ArrayList<Sensor> getUnassignedSensors() { return UnassignedSensors; }
        public UnassignedSensorsResponse setUnassignedSensors(ArrayList<Sensor> value) { this.UnassignedSensors = value; return this; }
    }

    public static class SensorAreaNameResponse extends ResponseBase
    {
        public String SensorId = null;
        public String AreaName = null;

        public String getSensorId() { return SensorId; }
        public SensorAreaNameResponse setSensorId(String value) { this.SensorId = value; return this; }
        public String getAreaName() { return AreaName; }
        public SensorAreaNameResponse setAreaName(String value) { this.AreaName = value; return this; }
    }

    public static class SensorModeResponse extends ResponseBase
    {

    }

    public static class SensorSetPointResponse extends ResponseBase
    {

    }

    public static class SensorModesBatchResponse extends ResponseBase
    {

    }


    public static class SensorSupportedModesBatchResponse extends ResponseBase
    {

    }

    public static class SensorSetPointsBatchResponse extends ResponseBase
    {

    }

    public static class SensorFanModeResponse extends ResponseBase
    {

    }

    public static class SensorFanModesBatchResponse extends ResponseBase
    {

    }

    public static class SensorSupportedFanModesBatchResponse extends ResponseBase
    {

    }

    public static class SensorThermostatSetPointResponse extends ResponseBase
    {
        public Boolean SetPointSuccess = null;

        public Boolean isSetPointSuccess() { return SetPointSuccess; }
        public SensorThermostatSetPointResponse setSetPointSuccess(Boolean value) { this.SetPointSuccess = value; return this; }
    }

    public static class SensorThermostatUpdateModeResponse extends ResponseBase
    {
        public Boolean ModeSuccess = null;

        public Boolean isModeSuccess() { return ModeSuccess; }
        public SensorThermostatUpdateModeResponse setModeSuccess(Boolean value) { this.ModeSuccess = value; return this; }
    }

    public static class SensorThermostatMainResponse extends ResponseBase
    {
        public Boolean IsMain = null;

        public Boolean getIsMain() { return IsMain; }
        public SensorThermostatMainResponse setIsMain(Boolean value) { this.IsMain = value; return this; }
    }

    public static class SensorThermostatLinkResponse extends ResponseBase
    {
        public Boolean LinkSuccess = null;

        public Boolean isLinkSuccess() { return LinkSuccess; }
        public SensorThermostatLinkResponse setLinkSuccess(Boolean value) { this.LinkSuccess = value; return this; }
    }

    public static class SensorThermostatUpdateFanModeResponse extends ResponseBase
    {
        public Boolean FanModeSuccess = null;

        public Boolean isFanModeSuccess() { return FanModeSuccess; }
        public SensorThermostatUpdateFanModeResponse setFanModeSuccess(Boolean value) { this.FanModeSuccess = value; return this; }
    }

    public static class SensorsResponse extends ResponseBase
    {
        public ArrayList<Sensor> Sensors = null;

        public ArrayList<Sensor> getSensors() { return Sensors; }
        public SensorsResponse setSensors(ArrayList<Sensor> value) { this.Sensors = value; return this; }
    }

    public static class SensorDetailsResponse extends ResponseBase
    {
        public Sensor Sensor = null;

        public Sensor getSensor() { return Sensor; }
        public SensorDetailsResponse setSensor(Sensor value) { this.Sensor = value; return this; }
    }

    public static class SensorRemoveForceResponse extends ResponseBase
    {
        public Boolean RemoveSuccess = null;

        public Boolean isRemoveSuccess() { return RemoveSuccess; }
        public SensorRemoveForceResponse setRemoveSuccess(Boolean value) { this.RemoveSuccess = value; return this; }
    }

    public static class Sensor extends SensorBase
    {
        public Double Value = null;
        public String Status = null;
        public String PreviousStatus = null;
        public String Mode = null;
        public String PreviousMode = null;
        public Double SetPoint = null;
        public Double PreviousSetPoint = null;
        public Double BatteryLevel = null;
        public Date LastDateValue = null;
        public Date LastDateStatus = null;
        public Date LastDateMode = null;
        public Date LastDateSetPoint = null;
        public Date LastDateBattery = null;
        public Date LastModificationDate = null;
        public Boolean IsVirtual = null;
        public Boolean IsLocked = null;
        public Boolean HasSecureCommunication = null;
        public String Configuration = null;

        public Double getValue() { return Value; }
        public Sensor setValue(Double value) { this.Value = value; return this; }
        public String getStatus() { return Status; }
        public Sensor setStatus(String value) { this.Status = value; return this; }
        public String getPreviousStatus() { return PreviousStatus; }
        public Sensor setPreviousStatus(String value) { this.PreviousStatus = value; return this; }
        public String getMode() { return Mode; }
        public Sensor setMode(String value) { this.Mode = value; return this; }
        public String getPreviousMode() { return PreviousMode; }
        public Sensor setPreviousMode(String value) { this.PreviousMode = value; return this; }
        public Double getSetPoint() { return SetPoint; }
        public Sensor setSetPoint(Double value) { this.SetPoint = value; return this; }
        public Double getPreviousSetPoint() { return PreviousSetPoint; }
        public Sensor setPreviousSetPoint(Double value) { this.PreviousSetPoint = value; return this; }
        public Double getBatteryLevel() { return BatteryLevel; }
        public Sensor setBatteryLevel(Double value) { this.BatteryLevel = value; return this; }
        public Date getLastDateValue() { return LastDateValue; }
        public Sensor setLastDateValue(Date value) { this.LastDateValue = value; return this; }
        public Date getLastDateStatus() { return LastDateStatus; }
        public Sensor setLastDateStatus(Date value) { this.LastDateStatus = value; return this; }
        public Date getLastDateMode() { return LastDateMode; }
        public Sensor setLastDateMode(Date value) { this.LastDateMode = value; return this; }
        public Date getLastDateSetPoint() { return LastDateSetPoint; }
        public Sensor setLastDateSetPoint(Date value) { this.LastDateSetPoint = value; return this; }
        public Date getLastDateBattery() { return LastDateBattery; }
        public Sensor setLastDateBattery(Date value) { this.LastDateBattery = value; return this; }
        public Date getLastModificationDate() { return LastModificationDate; }
        public Sensor setLastModificationDate(Date value) { this.LastModificationDate = value; return this; }
        public Boolean getIsVirtual() { return IsVirtual; }
        public Sensor setIsVirtual(Boolean value) { this.IsVirtual = value; return this; }
        public Boolean getIsLocked() { return IsLocked; }
        public Sensor setIsLocked(Boolean value) { this.IsLocked = value; return this; }
        public Boolean hasSecureCommunication() { return HasSecureCommunication; }
        public Sensor setHasSecureCommunication(Boolean value) { this.HasSecureCommunication = value; return this; }
        public String getConfiguration() { return Configuration; }
        public Sensor setConfiguration(String value) { this.Configuration = value; return this; }
    }

    public static class SensorCopyValuesBatchResponse extends ResponseBase
    {
        public ArrayList<SensorCopyValues> ActiveCopyValuesOperations = null;

        public ArrayList<SensorCopyValues> getActiveCopyValuesOperations() { return ActiveCopyValuesOperations; }
        public SensorCopyValuesBatchResponse setActiveCopyValuesOperations(ArrayList<SensorCopyValues> value) { this.ActiveCopyValuesOperations = value; return this; }
    }

    public static class SensorCopyValuesResponse extends ResponseBase
    {

    }

    public static class SensorCopyValuesStartResponse extends ResponseBase
    {

    }

    public static class SensorCopyValuesCompleteResponse extends ResponseBase
    {

    }

    public static class SensorDeleteValuesResponse extends ResponseBase
    {

    }

    public static class SchedulerBatchResponse extends ResponseBase
    {
        public Map<String,List<SchedulerPoint>> Points = null;

        public Map<String,List<SchedulerPoint>> getPoints() { return Points; }
        public SchedulerBatchResponse setPoints(Map<String,List<SchedulerPoint>> value) { this.Points = value; return this; }
    }

    public static class TipsResponse extends ResponseBase
    {
        public ArrayList<Tip> Tips = null;

        public ArrayList<Tip> getTips() { return Tips; }
        public TipsResponse setTips(ArrayList<Tip> value) { this.Tips = value; return this; }
    }

    public static class TipsBySectionResponse extends ResponseBase
    {
        public ArrayList<Tip> Tips = null;

        public ArrayList<Tip> getTips() { return Tips; }
        public TipsBySectionResponse setTips(ArrayList<Tip> value) { this.Tips = value; return this; }
    }

    public static class UserUsersResponse extends ResponseBase
    {
        public ArrayList<UserAuth> Users = null;

        public ArrayList<UserAuth> getUsers() { return Users; }
        public UserUsersResponse setUsers(ArrayList<UserAuth> value) { this.Users = value; return this; }
    }

    public static class UserUsersCountResponse extends ResponseBase
    {
        public Integer Count = null;

        public Integer getCount() { return Count; }
        public UserUsersCountResponse setCount(Integer value) { this.Count = value; return this; }
    }

    public static class UserParentUsersResponse extends ResponseBase
    {
        public ArrayList<UserAuth> Users = null;

        public ArrayList<UserAuth> getUsers() { return Users; }
        public UserParentUsersResponse setUsers(ArrayList<UserAuth> value) { this.Users = value; return this; }
    }

    public static class UnassignedUsersResponse extends ResponseBase
    {
        public ArrayList<UserAuth> UnassignedUsers = null;

        public ArrayList<UserAuth> getUnassignedUsers() { return UnassignedUsers; }
        public UnassignedUsersResponse setUnassignedUsers(ArrayList<UserAuth> value) { this.UnassignedUsers = value; return this; }
    }

    public static class UserSensorsResponse extends ResponseBase
    {
        public ArrayList<Sensor> Sensors = null;

        public ArrayList<Sensor> getSensors() { return Sensors; }
        public UserSensorsResponse setSensors(ArrayList<Sensor> value) { this.Sensors = value; return this; }
    }

    public static class UserSensorsCountResponse extends ResponseBase
    {
        public Integer Count = null;

        public Integer getCount() { return Count; }
        public UserSensorsCountResponse setCount(Integer value) { this.Count = value; return this; }
    }

    public static class UserSensorsIdsResponse extends ResponseBase
    {
        public ArrayList<String> Sensors = null;

        public ArrayList<String> getSensors() { return Sensors; }
        public UserSensorsIdsResponse setSensors(ArrayList<String> value) { this.Sensors = value; return this; }
    }

    public static class UserCamerasResponse extends ResponseBase
    {
        public ArrayList<Camera> Cameras = null;

        public ArrayList<Camera> getCameras() { return Cameras; }
        public UserCamerasResponse setCameras(ArrayList<Camera> value) { this.Cameras = value; return this; }
    }

    public static class UserCamerasCountResponse extends ResponseBase
    {
        public Integer Count = null;

        public Integer getCount() { return Count; }
        public UserCamerasCountResponse setCount(Integer value) { this.Count = value; return this; }
    }

    public static class UserNumNotificationsResponse extends ResponseBase
    {
        public UserWithNumNotifications UserBreakdown = null;

        public UserWithNumNotifications getUserBreakdown() { return UserBreakdown; }
        public UserNumNotificationsResponse setUserBreakdown(UserWithNumNotifications value) { this.UserBreakdown = value; return this; }
    }

    public static class UserAdminSentNotificationsResponse extends ResponseBase
    {
        public ArrayList<AdminSentNotification> Notifications = null;

        public ArrayList<AdminSentNotification> getNotifications() { return Notifications; }
        public UserAdminSentNotificationsResponse setNotifications(ArrayList<AdminSentNotification> value) { this.Notifications = value; return this; }
    }

    public static class UserInstallationsResponse extends ResponseBase
    {
        public ArrayList<Installation> Installations = null;

        public ArrayList<Installation> getInstallations() { return Installations; }
        public UserInstallationsResponse setInstallations(ArrayList<Installation> value) { this.Installations = value; return this; }
    }

    public static class UserInstallationsCountResponse extends ResponseBase
    {
        public Integer Count = null;

        public Integer getCount() { return Count; }
        public UserInstallationsCountResponse setCount(Integer value) { this.Count = value; return this; }
    }

    public static class UserInstallationsSummaryResponse extends ResponseBase
    {
        public ArrayList<InstallationBase> Installations = null;

        public ArrayList<InstallationBase> getInstallations() { return Installations; }
        public UserInstallationsSummaryResponse setInstallations(ArrayList<InstallationBase> value) { this.Installations = value; return this; }
    }

    public static class UsersInstallationsBatchResponse extends ResponseBase
    {
        public Boolean Success = null;

        public Boolean isSuccess() { return Success; }
        public UsersInstallationsBatchResponse setSuccess(Boolean value) { this.Success = value; return this; }
    }

    public static class UserCustomersResponse extends ResponseBase
    {
        public ArrayList<UserAuth> Customers = null;

        public ArrayList<UserAuth> getCustomers() { return Customers; }
        public UserCustomersResponse setCustomers(ArrayList<UserAuth> value) { this.Customers = value; return this; }
    }

    public static class UserCustomersCountResponse extends ResponseBase
    {
        public Integer Count = null;

        public Integer getCount() { return Count; }
        public UserCustomersCountResponse setCount(Integer value) { this.Count = value; return this; }
    }

    public static class UserDetailsResponse extends ResponseBase
    {
        public UserAuth User = null;

        public UserAuth getUser() { return User; }
        public UserDetailsResponse setUser(UserAuth value) { this.User = value; return this; }
    }

    public static class UserSettingsResponse extends ResponseBase
    {
        public UserSettings Settings = null;

        public UserSettings getSettings() { return Settings; }
        public UserSettingsResponse setSettings(UserSettings value) { this.Settings = value; return this; }
    }

    public static class UserNotificationSettingsResponse extends ResponseBase
    {
        public ArrayList<UserNotificationSettings> NotificationSettings = null;

        public ArrayList<UserNotificationSettings> getNotificationSettings() { return NotificationSettings; }
        public UserNotificationSettingsResponse setNotificationSettings(ArrayList<UserNotificationSettings> value) { this.NotificationSettings = value; return this; }
    }

    public static class UserAuth
    {
        public Integer Id = null;
        public String UserName = null;
        public String Email = null;
        public String PrimaryEmail = null;
        public String FirstName = null;
        public String LastName = null;
        public String DisplayName = null;
        public String Country = null;
        public String Culture = null;
        public String FullName = null;
        public String Gender = null;
        public String Language = null;
        public String MailAddress = null;
        public String Nickname = null;
        public String PostalCode = null;
        public String TimeZone = null;
        public Date CreatedDate = null;
        public Date ModifiedDate = null;
        public ArrayList<String> Roles = null;
        public ArrayList<String> Permissions = null;
        public Integer RefId = null;
        public String RefIdStr = null;
        public String PhoneNumber = null;
        public String Company = null;
        public String Address = null;
        public String Address2 = null;
        public String City = null;
        public String State = null;
        public Integer InvalidLoginAttempts = null;
        public Date LastLoginAttempt = null;
        public Date LockedDate = null;
        public String RecoveryToken = null;
        public HashMap<String,String> Meta = null;

        public Integer getId() { return Id; }
        public UserAuth setId(Integer value) { this.Id = value; return this; }
        public String getUserName() { return UserName; }
        public UserAuth setUserName(String value) { this.UserName = value; return this; }
        public String getEmail() { return Email; }
        public UserAuth setEmail(String value) { this.Email = value; return this; }
        public String getPrimaryEmail() { return PrimaryEmail; }
        public UserAuth setPrimaryEmail(String value) { this.PrimaryEmail = value; return this; }
        public String getFirstName() { return FirstName; }
        public UserAuth setFirstName(String value) { this.FirstName = value; return this; }
        public String getLastName() { return LastName; }
        public UserAuth setLastName(String value) { this.LastName = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public UserAuth setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getCountry() { return Country; }
        public UserAuth setCountry(String value) { this.Country = value; return this; }
        public String getCulture() { return Culture; }
        public UserAuth setCulture(String value) { this.Culture = value; return this; }
        public String getFullName() { return FullName; }
        public UserAuth setFullName(String value) { this.FullName = value; return this; }
        public String getGender() { return Gender; }
        public UserAuth setGender(String value) { this.Gender = value; return this; }
        public String getLanguage() { return Language; }
        public UserAuth setLanguage(String value) { this.Language = value; return this; }
        public String getMailAddress() { return MailAddress; }
        public UserAuth setMailAddress(String value) { this.MailAddress = value; return this; }
        public String getNickname() { return Nickname; }
        public UserAuth setNickname(String value) { this.Nickname = value; return this; }
        public String getPostalCode() { return PostalCode; }
        public UserAuth setPostalCode(String value) { this.PostalCode = value; return this; }
        public String getTimeZone() { return TimeZone; }
        public UserAuth setTimeZone(String value) { this.TimeZone = value; return this; }
        public Date getCreatedDate() { return CreatedDate; }
        public UserAuth setCreatedDate(Date value) { this.CreatedDate = value; return this; }
        public Date getModifiedDate() { return ModifiedDate; }
        public UserAuth setModifiedDate(Date value) { this.ModifiedDate = value; return this; }
        public ArrayList<String> getRoles() { return Roles; }
        public UserAuth setRoles(ArrayList<String> value) { this.Roles = value; return this; }
        public ArrayList<String> getPermissions() { return Permissions; }
        public UserAuth setPermissions(ArrayList<String> value) { this.Permissions = value; return this; }
        public Integer getRefId() { return RefId; }
        public UserAuth setRefId(Integer value) { this.RefId = value; return this; }
        public String getRefIdStr() { return RefIdStr; }
        public UserAuth setRefIdStr(String value) { this.RefIdStr = value; return this; }
        public String getPhoneNumber() { return PhoneNumber; }
        public UserAuth setPhoneNumber(String value) { this.PhoneNumber = value; return this; }
        public String getCompany() { return Company; }
        public UserAuth setCompany(String value) { this.Company = value; return this; }
        public String getAddress() { return Address; }
        public UserAuth setAddress(String value) { this.Address = value; return this; }
        public String getAddress2() { return Address2; }
        public UserAuth setAddress2(String value) { this.Address2 = value; return this; }
        public String getCity() { return City; }
        public UserAuth setCity(String value) { this.City = value; return this; }
        public String getState() { return State; }
        public UserAuth setState(String value) { this.State = value; return this; }
        public Integer getInvalidLoginAttempts() { return InvalidLoginAttempts; }
        public UserAuth setInvalidLoginAttempts(Integer value) { this.InvalidLoginAttempts = value; return this; }
        public Date getLastLoginAttempt() { return LastLoginAttempt; }
        public UserAuth setLastLoginAttempt(Date value) { this.LastLoginAttempt = value; return this; }
        public Date getLockedDate() { return LockedDate; }
        public UserAuth setLockedDate(Date value) { this.LockedDate = value; return this; }
        public String getRecoveryToken() { return RecoveryToken; }
        public UserAuth setRecoveryToken(String value) { this.RecoveryToken = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public UserAuth setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
    }

    public static class UsersResponse extends ResponseBase
    {
        public ArrayList<UserAuth> Users = null;

        public ArrayList<UserAuth> getUsers() { return Users; }
        public UsersResponse setUsers(ArrayList<UserAuth> value) { this.Users = value; return this; }
    }

    public static class UsersDeleteResponse extends ResponseBase
    {
        public Boolean Success = null;

        public Boolean isSuccess() { return Success; }
        public UsersDeleteResponse setSuccess(Boolean value) { this.Success = value; return this; }
    }

    public static class UserRolesResponse extends ResponseBase
    {
        public ArrayList<UserAuth> Users = null;

        public ArrayList<UserAuth> getUsers() { return Users; }
        public UserRolesResponse setUsers(ArrayList<UserAuth> value) { this.Users = value; return this; }
    }

    public static class UserBlockResponse extends ResponseBase
    {
        public Date LockedDate = null;

        public Date getLockedDate() { return LockedDate; }
        public UserBlockResponse setLockedDate(Date value) { this.LockedDate = value; return this; }
    }

    public static class UserGatewayAccessResponse extends ResponseBase
    {
        public Boolean HasAccess = null;

        public Boolean isHasAccess() { return HasAccess; }
        public UserGatewayAccessResponse setHasAccess(Boolean value) { this.HasAccess = value; return this; }
    }

    public static class Warning
    {
        public Integer Id = null;
        public String Name = null;
        public Integer CreatedBy = null;
        public String Message = null;
        public String Type = null;
        public Date FromDate = null;
        public Date ToDate = null;
        public Boolean IsActivated = null;
        public Boolean IsPersistent = null;
        public Boolean IsImmediate = null;
        public String I18N = null;

        public Integer getId() { return Id; }
        public Warning setId(Integer value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public Warning setName(String value) { this.Name = value; return this; }
        public Integer getCreatedBy() { return CreatedBy; }
        public Warning setCreatedBy(Integer value) { this.CreatedBy = value; return this; }
        public String getMessage() { return Message; }
        public Warning setMessage(String value) { this.Message = value; return this; }
        public String getType() { return Type; }
        public Warning setType(String value) { this.Type = value; return this; }
        public Date getFromDate() { return FromDate; }
        public Warning setFromDate(Date value) { this.FromDate = value; return this; }
        public Date getToDate() { return ToDate; }
        public Warning setToDate(Date value) { this.ToDate = value; return this; }
        public Boolean getIsActivated() { return IsActivated; }
        public Warning setIsActivated(Boolean value) { this.IsActivated = value; return this; }
        public Boolean getIsPersistent() { return IsPersistent; }
        public Warning setIsPersistent(Boolean value) { this.IsPersistent = value; return this; }
        public Boolean getIsImmediate() { return IsImmediate; }
        public Warning setIsImmediate(Boolean value) { this.IsImmediate = value; return this; }
        public String getI18N() { return I18N; }
        public Warning setI18N(String value) { this.I18N = value; return this; }
    }

    public static class WarningsResponse extends ResponseBase
    {
        public ArrayList<Warning> Warnings = null;

        public ArrayList<Warning> getWarnings() { return Warnings; }
        public WarningsResponse setWarnings(ArrayList<Warning> value) { this.Warnings = value; return this; }
    }

    public static class WarningDetailsResponse extends ResponseBase
    {
        public Warning Warning = null;

        public Warning getWarning() { return Warning; }
        public WarningDetailsResponse setWarning(Warning value) { this.Warning = value; return this; }
    }

    public static class UserWarningsResponse extends ResponseBase
    {
        public ArrayList<UserWarning> UserWarnings = null;

        public ArrayList<UserWarning> getUserWarnings() { return UserWarnings; }
        public UserWarningsResponse setUserWarnings(ArrayList<UserWarning> value) { this.UserWarnings = value; return this; }
    }

    public static class WarningUsersResponse extends ResponseBase
    {
        public ArrayList<UserAuth> WarningUsers = null;

        public ArrayList<UserAuth> getWarningUsers() { return WarningUsers; }
        public WarningUsersResponse setWarningUsers(ArrayList<UserAuth> value) { this.WarningUsers = value; return this; }
    }

    public static class WarningAssignableUsersResponse extends ResponseBase
    {
        public ArrayList<AssignableUser> Users = null;

        public ArrayList<AssignableUser> getUsers() { return Users; }
        public WarningAssignableUsersResponse setUsers(ArrayList<AssignableUser> value) { this.Users = value; return this; }
    }

    public static class WarningActivateResponse extends ResponseBase
    {

    }

    @DataContract
    public static class AuthenticateResponse
    {
        @DataMember(Order=1)
        public String UserId = null;

        @DataMember(Order=2)
        public String SessionId = null;

        @DataMember(Order=3)
        public String UserName = null;

        @DataMember(Order=4)
        public String DisplayName = null;

        @DataMember(Order=5)
        public String ReferrerUrl = null;

        @DataMember(Order=6)
        public ResponseStatus ResponseStatus = null;

        @DataMember(Order=7)
        public HashMap<String,String> Meta = null;

        public String getUserId() { return UserId; }
        public AuthenticateResponse setUserId(String value) { this.UserId = value; return this; }
        public String getSessionId() { return SessionId; }
        public AuthenticateResponse setSessionId(String value) { this.SessionId = value; return this; }
        public String getUserName() { return UserName; }
        public AuthenticateResponse setUserName(String value) { this.UserName = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public AuthenticateResponse setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getReferrerUrl() { return ReferrerUrl; }
        public AuthenticateResponse setReferrerUrl(String value) { this.ReferrerUrl = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public AuthenticateResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public AuthenticateResponse setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
    }

    @DataContract
    public static class RegisterResponse
    {
        @DataMember(Order=1)
        public String UserId = null;

        @DataMember(Order=2)
        public String SessionId = null;

        @DataMember(Order=3)
        public String UserName = null;

        @DataMember(Order=4)
        public String ReferrerUrl = null;

        @DataMember(Order=5)
        public ResponseStatus ResponseStatus = null;

        @DataMember(Order=6)
        public HashMap<String,String> Meta = null;

        public String getUserId() { return UserId; }
        public RegisterResponse setUserId(String value) { this.UserId = value; return this; }
        public String getSessionId() { return SessionId; }
        public RegisterResponse setSessionId(String value) { this.SessionId = value; return this; }
        public String getUserName() { return UserName; }
        public RegisterResponse setUserName(String value) { this.UserName = value; return this; }
        public String getReferrerUrl() { return ReferrerUrl; }
        public RegisterResponse setReferrerUrl(String value) { this.ReferrerUrl = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public RegisterResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public RegisterResponse setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
    }

    public static class ResponseBase
    {
        public ResponseStatus ResponseStatus = null;

        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public ResponseBase setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
    }

    public static class Photo
    {
        public String Url = null;
        public String TriggerId = null;
        public Date Date = null;

        public String getUrl() { return Url; }
        public Photo setUrl(String value) { this.Url = value; return this; }
        public String getTriggerId() { return TriggerId; }
        public Photo setTriggerId(String value) { this.TriggerId = value; return this; }
        public Date getDate() { return Date; }
        public Photo setDate(Date value) { this.Date = value; return this; }
    }

    public static class AzureCameraConsumption extends TableEntity
    {
        public Long Bytes = null;

        public Long getBytes() { return Bytes; }
        public AzureCameraConsumption setBytes(Long value) { this.Bytes = value; return this; }
    }

    public static class CameraNode
    {
        public Integer NodeId = null;
        public String CameraId = null;

        public Integer getNodeId() { return NodeId; }
        public CameraNode setNodeId(Integer value) { this.NodeId = value; return this; }
        public String getCameraId() { return CameraId; }
        public CameraNode setCameraId(String value) { this.CameraId = value; return this; }
    }

    public static class AssignableInstallation extends Installation
    {
        public Boolean IsAssigned = null;

        public Boolean getIsAssigned() { return IsAssigned; }
        public AssignableInstallation setIsAssigned(Boolean value) { this.IsAssigned = value; return this; }
    }

    public static class DefaultSensorConfiguration
    {
        public Integer Id = null;
        public String Type = null;
        public String GatewayType = null;
        public String Protocol = null;
        public String Manufacturer = null;
        public String ManufacturerType = null;
        public String ManufacturerTypeId = null;
        public String ManufacturerTypeName = null;
        public String FirmwareVersion = null;
        public String ManufacturerName = null;
        public String ManufacturerDeviceName = null;
        public Date LastModificationDate = null;
        public String MinGWVersion = null;
        public String SensorConfiguration = null;

        public Integer getId() { return Id; }
        public DefaultSensorConfiguration setId(Integer value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public DefaultSensorConfiguration setType(String value) { this.Type = value; return this; }
        public String getGatewayType() { return GatewayType; }
        public DefaultSensorConfiguration setGatewayType(String value) { this.GatewayType = value; return this; }
        public String getProtocol() { return Protocol; }
        public DefaultSensorConfiguration setProtocol(String value) { this.Protocol = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public DefaultSensorConfiguration setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getManufacturerType() { return ManufacturerType; }
        public DefaultSensorConfiguration setManufacturerType(String value) { this.ManufacturerType = value; return this; }
        public String getManufacturerTypeId() { return ManufacturerTypeId; }
        public DefaultSensorConfiguration setManufacturerTypeId(String value) { this.ManufacturerTypeId = value; return this; }
        public String getManufacturerTypeName() { return ManufacturerTypeName; }
        public DefaultSensorConfiguration setManufacturerTypeName(String value) { this.ManufacturerTypeName = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public DefaultSensorConfiguration setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getManufacturerName() { return ManufacturerName; }
        public DefaultSensorConfiguration setManufacturerName(String value) { this.ManufacturerName = value; return this; }
        public String getManufacturerDeviceName() { return ManufacturerDeviceName; }
        public DefaultSensorConfiguration setManufacturerDeviceName(String value) { this.ManufacturerDeviceName = value; return this; }
        public Date getLastModificationDate() { return LastModificationDate; }
        public DefaultSensorConfiguration setLastModificationDate(Date value) { this.LastModificationDate = value; return this; }
        public String getMinGWVersion() { return MinGWVersion; }
        public DefaultSensorConfiguration setMinGWVersion(String value) { this.MinGWVersion = value; return this; }
        public String getSensorConfiguration() { return SensorConfiguration; }
        public DefaultSensorConfiguration setSensorConfiguration(String value) { this.SensorConfiguration = value; return this; }
    }

    public static class SensorZWaveRegisterEditablesPoint
    {
        public String SensorId = null;
        public Map<Integer,Integer> Registers = null;

        public SensorZWaveRegisterEditablesPoint(){}
        public SensorZWaveRegisterEditablesPoint(String sensorId, Map<Integer,Integer> registers) {
            SensorId = sensorId;
            Registers = registers;
        }

        public String getSensorId() { return SensorId; }
        public SensorZWaveRegisterEditablesPoint setSensorId(String value) { this.SensorId = value; return this; }
        public Map<Integer,Integer> getRegisters() { return Registers; }
        public SensorZWaveRegisterEditablesPoint setRegisters(Map<Integer,Integer> value) { this.Registers = value; return this; }
    }

    public static class DefaultCameraConfiguration
    {
        public String Manufacturer = null;
        public String Model = null;
        public String ManufacturerModelName = null;
        public String Configuration = null;

        public String getManufacturer() { return Manufacturer; }
        public DefaultCameraConfiguration setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getModel() { return Model; }
        public DefaultCameraConfiguration setModel(String value) { this.Model = value; return this; }
        public String getManufacturerModelName() { return ManufacturerModelName; }
        public DefaultCameraConfiguration setManufacturerModelName(String value) { this.ManufacturerModelName = value; return this; }
        public String getConfiguration() { return Configuration; }
        public DefaultCameraConfiguration setConfiguration(String value) { this.Configuration = value; return this; }
    }

    public static class AzureEvent extends TableEntity
    {
        public String Type = null;
        public String Subtype = null;
        public Boolean Pending = null;
        public Date Date = null;
        public Date LastUpdate = null;
        public String InstallationId = null;
        public String Installation = null;
        public String Description = null;
        public String DescriptionArgs = null;
        public String Comments = null;
        public String TriggerId = null;
        public String TriggerType = null;
        public String TriggerName = null;
        public String LastImageName = null;
        public String CameraTrigger = null;
        public String DemandResponseId = null;
        public String TranslatedDescription = null;

        public String getType() { return Type; }
        public AzureEvent setType(String value) { this.Type = value; return this; }
        public String getSubtype() { return Subtype; }
        public AzureEvent setSubtype(String value) { this.Subtype = value; return this; }
        public Boolean isPending() { return Pending; }
        public AzureEvent setPending(Boolean value) { this.Pending = value; return this; }
        public Date getDate() { return Date; }
        public AzureEvent setDate(Date value) { this.Date = value; return this; }
        public Date getLastUpdate() { return LastUpdate; }
        public AzureEvent setLastUpdate(Date value) { this.LastUpdate = value; return this; }
        public String getInstallationId() { return InstallationId; }
        public AzureEvent setInstallationId(String value) { this.InstallationId = value; return this; }
        public String getInstallation() { return Installation; }
        public AzureEvent setInstallation(String value) { this.Installation = value; return this; }
        public String getDescription() { return Description; }
        public AzureEvent setDescription(String value) { this.Description = value; return this; }
        public String getDescriptionArgs() { return DescriptionArgs; }
        public AzureEvent setDescriptionArgs(String value) { this.DescriptionArgs = value; return this; }
        public String getComments() { return Comments; }
        public AzureEvent setComments(String value) { this.Comments = value; return this; }
        public String getTriggerId() { return TriggerId; }
        public AzureEvent setTriggerId(String value) { this.TriggerId = value; return this; }
        public String getTriggerType() { return TriggerType; }
        public AzureEvent setTriggerType(String value) { this.TriggerType = value; return this; }
        public String getTriggerName() { return TriggerName; }
        public AzureEvent setTriggerName(String value) { this.TriggerName = value; return this; }
        public String getLastImageName() { return LastImageName; }
        public AzureEvent setLastImageName(String value) { this.LastImageName = value; return this; }
        public String getCameraTrigger() { return CameraTrigger; }
        public AzureEvent setCameraTrigger(String value) { this.CameraTrigger = value; return this; }
        public String getDemandResponseId() { return DemandResponseId; }
        public AzureEvent setDemandResponseId(String value) { this.DemandResponseId = value; return this; }
        public String getTranslatedDescription() { return TranslatedDescription; }
        public AzureEvent setTranslatedDescription(String value) { this.TranslatedDescription = value; return this; }
    }

    public static class ZWaveRegister
    {
        public Integer ParamId = null;
        public Integer Length = null;
        public Integer Value = null;

        public Integer getParamId() { return ParamId; }
        public ZWaveRegister setParamId(Integer value) { this.ParamId = value; return this; }
        public Integer getLength() { return Length; }
        public ZWaveRegister setLength(Integer value) { this.Length = value; return this; }
        public Integer getValue() { return Value; }
        public ZWaveRegister setValue(Integer value) { this.Value = value; return this; }
    }

    public static class CommandResponseWrapper<Q>
    {
        public Q Response = null;
        public Boolean CommunicationSuccess = null;

        public Q getResponse() { return Response; }
        public CommandResponseWrapper<Q> setResponse(Q value) { this.Response = value; return this; }
        public Boolean isCommunicationSuccess() { return CommunicationSuccess; }
        public CommandResponseWrapper<Q> setCommunicationSuccess(Boolean value) { this.CommunicationSuccess = value; return this; }
    }

    public static class AddWibeeeSensorResult
    {
        public WibeeeDeviceMetadata Metadata = null;
        public String Error = null;

        public WibeeeDeviceMetadata getMetadata() { return Metadata; }
        public AddWibeeeSensorResult setMetadata(WibeeeDeviceMetadata value) { this.Metadata = value; return this; }
        public String getError() { return Error; }
        public AddWibeeeSensorResult setError(String value) { this.Error = value; return this; }
    }

    public static class LogStreamingDeviceInfo
    {
        public UUID Id = null;
        public Integer NodeId = null;
        public List<LogStreamingSensorInfo> Sensors = null;

        public UUID getId() { return Id; }
        public LogStreamingDeviceInfo setId(UUID value) { this.Id = value; return this; }
        public Integer getNodeId() { return NodeId; }
        public LogStreamingDeviceInfo setNodeId(Integer value) { this.NodeId = value; return this; }
        public List<LogStreamingSensorInfo> getSensors() { return Sensors; }
        public LogStreamingDeviceInfo setSensors(List<LogStreamingSensorInfo> value) { this.Sensors = value; return this; }
    }


    public static class LogStreamingSensorInfo
    {
        public UUID Id = null;
        public String Name = null;
        public String AreaName = null;

        public UUID getId() { return Id; }
        public LogStreamingSensorInfo setId(UUID value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public LogStreamingSensorInfo setName(String value) { this.Name = value; return this; }
        public String getAreaName() { return AreaName; }
        public LogStreamingSensorInfo setAreaName(String value) { this.AreaName = value; return this; }
    }


    public static enum SensorThermostatMode
    {
        @SerializedName("0")
        Off(0),
        @SerializedName("1")
        Heat(1),
        @SerializedName("2")
        Cool(2),
        @SerializedName("6")
        Fan(6),
        @SerializedName("8")
        Dry(8),
        @SerializedName("10")
        Auto(10);

        private final int value;
        SensorThermostatMode(final int intValue) { value = intValue; }
        public int getValue() { return value; }

        public static Optional<SensorThermostatMode> valueOf(int i){
            switch(i){
                case 0:
                    return Optional.of(Off);
                case 1:
                    return Optional.of(Heat);
                case 2:
                    return Optional.of(Cool);
                case 6:
                    return Optional.of(Fan);
                case 8:
                    return Optional.of(Dry);
                case 10:
                    return Optional.of(Auto);
                default:
                    return Optional.empty();
            }
        }
    }

    public static class SchedulerPoint
    {
        public static final String DAY = "Day";
        public static final String HOUR = "Hour";
        public static final String MINUTES = "Minutes";
        public static final String SECURITY = "Security";
        public static final String TEMPERATURE = "Temperature";
        public static final String MODE = "Mode";
        public static final String FAN_MODE = "FanMode";
        public static final String AUTOMATION = "Automation";
        public static final String SENSOR_ID = "SensorId";
        public static final String COLOR = "Color";

        public String Day = null;
        public Integer Hour = null;
        public Integer Minutes = null;
        public String Security = null;
        public Integer Temperature = null;
        public SensorThermostatMode Mode = null;
        public SensorThermostatFanMode FanMode = null;
        public String Automation = null;
        public String SensorId = null;
        public String Color = null;

        public SchedulerPoint(){

        }

        public SchedulerPoint(Map<String, String> map) {
            Day = map.get(DAY);
            Hour = Integer.parseInt(map.get(HOUR));
            Minutes = Integer.parseInt(map.get(MINUTES));
            Security = map.get(SECURITY);
            if (map.get(TEMPERATURE) != null) {
                Temperature = Integer.parseInt(map.get(TEMPERATURE));
            }
            if (map.get(MODE) != null) {
                Mode = SensorThermostatMode.valueOf(Integer.parseInt(map.get(MODE))).get();
            }
            if (map.get(FAN_MODE) != null) {
                FanMode = SensorThermostatFanMode.valueOf(Integer.parseInt(map.get(FAN_MODE))).get();
            }
            Automation = map.get(AUTOMATION);
            SensorId = map.get(SENSOR_ID);
            Color = map.get(COLOR);
        }

        public String getDay() { return Day; }
        public SchedulerPoint setDay(String value) { this.Day = value; return this; }
        public Integer getHour() { return Hour; }
        public SchedulerPoint setHour(Integer value) { this.Hour = value; return this; }
        public Integer getMinutes() { return Minutes; }
        public SchedulerPoint setMinutes(Integer value) { this.Minutes = value; return this; }
        public String getSecurity() { return Security; }
        public SchedulerPoint setSecurity(String value) { this.Security = value; return this; }
        public Integer getTemperature() { return Temperature; }
        public SchedulerPoint setTemperature(Integer value) { this.Temperature = value; return this; }
        public SensorThermostatMode getMode() { return Mode; }
        public SchedulerPoint setMode(SensorThermostatMode value) { this.Mode = value; return this; }
        public SensorThermostatFanMode getFanMode() { return FanMode; }
        public SchedulerPoint setFanMode(SensorThermostatFanMode value) { this.FanMode = value; return this; }
        public String getAutomation() { return Automation; }
        public SchedulerPoint setAutomation(String value) { this.Automation = value; return this; }
        public String getSensorId() { return SensorId; }
        public SchedulerPoint setSensorId(String value) { this.SensorId = value; return this; }
        public String getColor() { return Color; }
        public SchedulerPoint setColor(String value) { this.Color = value; return this; }

        public String toString(){
            return "SensorId : " + SensorId +
                    "\nDay : " + Day +
                    "\nHour : " + Hour +
                    "\nMinutes : " + Minutes +
                    "\nSecurity : " + Security +
                    "\nTemperature : " + Temperature +
                    "\nMode : " + Mode +
                    "\nFanMode : " + FanMode +
                    "\nAutomation : " + Automation +
                    "\nColor : " + Color;
        }

        public Map<String, String> getMap() {
            Map<String, String> map = new HashMap<String, String>();

            map.put(DAY, Day);
            map.put(HOUR, Integer.toString(Hour));
            map.put(MINUTES, Integer.toString(Minutes));
            map.put(SECURITY, Security);
            map.put(TEMPERATURE, Temperature == null ? null : Integer.toString(Temperature));
            map.put(MODE, Mode == null ? null : Integer.toString(Mode.getValue()));
            map.put(FAN_MODE, FanMode == null ? null : Integer.toString(FanMode.ordinal()));
            map.put(AUTOMATION, Automation);
            map.put(SENSOR_ID, SensorId);
            map.put(COLOR, Color);

            return map;
        }
    }

    public static class SensorConfiguration
    {
        public ArrayList<Capability> Capabilities = null;
        public HashMap<String,Object> Properties = null;
        public HashMap<String,Object> EditableProperties = null;

        public ArrayList<Capability> getCapabilities() { return Capabilities; }
        public SensorConfiguration setCapabilities(ArrayList<Capability> value) { this.Capabilities = value; return this; }
        public HashMap<String,Object> getProperties() { return Properties; }
        public SensorConfiguration setProperties(HashMap<String,Object> value) { this.Properties = value; return this; }
        public HashMap<String,Object> getEditableProperties() { return EditableProperties; }
        public SensorConfiguration setEditableProperties(HashMap<String,Object> value) { this.EditableProperties = value; return this; }
    }

    public static enum Capability
    {
        ShutterUpDown,
        ShutterOpenCloseVenetian;
    }

    public static class UserAuthWithCredentials extends UserAuth
    {
        public String PasswordHash = null;
        public String Salt = null;

        public String getPasswordHash() { return PasswordHash; }
        public UserAuthWithCredentials setPasswordHash(String value) { this.PasswordHash = value; return this; }
        public String getSalt() { return Salt; }
        public UserAuthWithCredentials setSalt(String value) { this.Salt = value; return this; }
    }

    public static enum SensorThermostatFanMode
    {
        @SerializedName("0")
        Auto,
        @SerializedName("1")
        On,
        @SerializedName("2")
        Autohigh,
        @SerializedName("3")
        Onhigh,
        @SerializedName("4")
        Automedium,
        @SerializedName("5")
        Onmedium;

        public static Optional<SensorThermostatFanMode> valueOf(int value){
            switch (value){
                case 0:
                    return Optional.of(Auto);
                case 1:
                    return Optional.of(On);
                case 2:
                    return Optional.of(Autohigh);
                case 3:
                    return Optional.of(Onhigh);
                case 4:
                    return Optional.of(Automedium);
                case 5:
                    return Optional.of(Onmedium);
                default:
                    return Optional.empty();
            }
        }
    }

    public static class SensorRoutingInfo
    {
        public UUID Id = null;
        public Integer NodeId = null;
        public String Protocol = null;
        public String Name = null;
        public String AreaName = null;
        public Double Value = null;
        public String Status = null;
        public Date LastCommunicationDate = null;
        public Boolean IsRouting = null;
        public List<Integer> Neighbors = null;

        public UUID getId() { return Id; }
        public SensorRoutingInfo setId(UUID value) { this.Id = value; return this; }
        public Integer getNodeId() { return NodeId; }
        public SensorRoutingInfo setNodeId(Integer value) { this.NodeId = value; return this; }
        public String getProtocol() { return Protocol; }
        public SensorRoutingInfo setProtocol(String value) { this.Protocol = value; return this; }
        public String getName() { return Name; }
        public SensorRoutingInfo setName(String value) { this.Name = value; return this; }
        public String getAreaName() { return AreaName; }
        public SensorRoutingInfo setAreaName(String value) { this.AreaName = value; return this; }
        public Double getValue() { return Value; }
        public SensorRoutingInfo setValue(Double value) { this.Value = value; return this; }
        public String getStatus() { return Status; }
        public SensorRoutingInfo setStatus(String value) { this.Status = value; return this; }
        public Date getLastCommunicationDate() { return LastCommunicationDate; }
        public SensorRoutingInfo setLastCommunicationDate(Date value) { this.LastCommunicationDate = value; return this; }
        public Boolean getIsRouting() { return IsRouting; }
        public SensorRoutingInfo setIsRouting(Boolean value) { this.IsRouting = value; return this; }
        public List<Integer> getNeighbors() { return Neighbors; }
        public SensorRoutingInfo setNeighbors(List<Integer> value) { this.Neighbors = value; return this; }
    }

    public static class Device
    {
        public Sensor Parent = null;
        public ArrayList<Sensor> Children = new ArrayList<>();

        public Sensor getParent() { return Parent; }
        public Device setParent(Sensor value) { this.Parent = value; return this; }
        public ArrayList<Sensor> getChildren() { return Children; }
        public Device setChildren(ArrayList<Sensor> value) { this.Children = value; return this; }
    }

    public static class SensorPollStatus
    {
        public String Status = null;
        public Integer BatteryLevel = null;

        public String getStatus() { return Status; }
        public SensorPollStatus setStatus(String value) { this.Status = value; return this; }
        public Integer getBatteryLevel() { return BatteryLevel; }
        public SensorPollStatus setBatteryLevel(Integer value) { this.BatteryLevel = value; return this; }
    }

    public static class UPnPDeviceInfo
    {
        public String IP = null;
        public String Port = null;
        public String UDN = null;
        public String FriendlyName = null;
        public String Manufacturer = null;
        public String ManufacturerURL = null;
        public String ModelName = null;
        public String ModelDescription = null;
        public String ModelNumber = null;
        public String SerialNumber = null;
        public String PresentationURL = null;

        public String getIp() { return IP; }
        public UPnPDeviceInfo setIp(String value) { this.IP = value; return this; }
        public String getPort() { return Port; }
        public UPnPDeviceInfo setPort(String value) { this.Port = value; return this; }
        public String getUdn() { return UDN; }
        public UPnPDeviceInfo setUdn(String value) { this.UDN = value; return this; }
        public String getFriendlyName() { return FriendlyName; }
        public UPnPDeviceInfo setFriendlyName(String value) { this.FriendlyName = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public UPnPDeviceInfo setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getManufacturerURL() { return ManufacturerURL; }
        public UPnPDeviceInfo setManufacturerURL(String value) { this.ManufacturerURL = value; return this; }
        public String getModelName() { return ModelName; }
        public UPnPDeviceInfo setModelName(String value) { this.ModelName = value; return this; }
        public String getModelDescription() { return ModelDescription; }
        public UPnPDeviceInfo setModelDescription(String value) { this.ModelDescription = value; return this; }
        public String getModelNumber() { return ModelNumber; }
        public UPnPDeviceInfo setModelNumber(String value) { this.ModelNumber = value; return this; }
        public String getSerialNumber() { return SerialNumber; }
        public UPnPDeviceInfo setSerialNumber(String value) { this.SerialNumber = value; return this; }
        public String getPresentationURL() { return PresentationURL; }
        public UPnPDeviceInfo setPresentationURL(String value) { this.PresentationURL = value; return this; }
    }

    public static class IPScanInfo
    {
        public String IP = null;
        public String HostName = null;
        public String Port = null;

        public IPScanInfo(String ip, String port){
            IP = ip;
            Port = port;
        }

        public String getIp() { return IP; }
        public IPScanInfo setIp(String value) { this.IP = value; return this; }
        public String getHostName() { return HostName; }
        public IPScanInfo setHostName(String value) { this.HostName = value; return this; }
        public String getPort() { return Port; }
        public IPScanInfo setPort(String value) { this.Port = value; return this; }
    }

    public static class CameraScanInfo
    {
        public String Address = null;
        public String Model = null;

        public String getAddress() { return Address; }
        public CameraScanInfo setAddress(String value) { this.Address = value; return this; }
        public String getModel() { return Model; }
        public CameraScanInfo setModel(String value) { this.Model = value; return this; }
    }

    public static class SchedulerInstance
    {
        public SchedulerType Name = null;
        public Boolean Status = null;
        public ArrayList<SchedulerPoint> SchedulerPoints = null;

        public SchedulerInstance(SchedulerType name, boolean status, List<SchedulerPoint> schedulerPoints) {
            Name = name;
            Status = status;
            SchedulerPoints = new ArrayList<>(schedulerPoints);
        }

        public SchedulerType getName() { return Name; }
        public SchedulerInstance setName(SchedulerType value) { this.Name = value; return this; }
        public Boolean isStatus() { return Status; }
        public SchedulerInstance setStatus(Boolean value) { this.Status = value; return this; }
        public ArrayList<SchedulerPoint> getSchedulerPoints() { return SchedulerPoints; }
        public SchedulerInstance setSchedulerPoints(ArrayList<SchedulerPoint> value) { this.SchedulerPoints = value; return this; }
    }

    public static class GatewayStatistics
    {
        public String BandwidthConsumption = null;

        public String BandwidthConsumption() { return BandwidthConsumption; }
        public GatewayStatistics setBandwidthConsumption(String value) { this.BandwidthConsumption = value; return this; }
    }

    public static class StatusPoint
    {
        public String Status = null;
        public Date Date = null;
        public String Trigger = null;
        public String TriggerName = null;


        public StatusPoint(){}
        public StatusPoint(String status, Date date, String trigger) {
            Status = status;
            Date = date;
            Trigger = trigger;
        }
        public String getStatus() { return Status; }
        public StatusPoint setStatus(String value) { this.Status = value; return this; }
        public Date getDate() { return Date; }
        public StatusPoint setDate(Date value) { this.Date = value; return this; }
        public String getTrigger() { return Trigger; }
        public StatusPoint setTrigger(String value) { this.Trigger = value; return this; }
        public String getTriggerName() { return TriggerName; }
        public StatusPoint setTriggerName(String value) { this.TriggerName = value; return this; }
    }

    public static class ComfortValues
    {
        public Double TemperatureInside = null;
        public Double Humidity = null;
        public Sensor MainThermostat = null;
        public Sensor TemperatureOutside = null;
        public Sensor Forecast = null;

        public Double getTemperatureInside() { return TemperatureInside; }
        public ComfortValues setTemperatureInside(Double value) { this.TemperatureInside = value; return this; }
        public Double getHumidity() { return Humidity; }
        public ComfortValues setHumidity(Double value) { this.Humidity = value; return this; }
        public Sensor getMainThermostat() { return MainThermostat; }
        public ComfortValues setMainThermostat(Sensor value) { this.MainThermostat = value; return this; }
        public Sensor getTemperatureOutside() { return TemperatureOutside; }
        public ComfortValues setTemperatureOutside(Sensor value) { this.TemperatureOutside = value; return this; }
        public Sensor getForecast() { return Forecast; }
        public ComfortValues setForecast(Sensor value) { this.Forecast = value; return this; }
    }

    public static class ComfortMonthValues
    {
        public Integer Id = null;
        public UUID InstallationId = null;
        public String Name = null;
        public Integer Month = null;
        public String Year = null;
        public Boolean W1Tick = null;
        public Boolean W2Tick = null;
        public Boolean W3Tick = null;
        public Boolean W4Tick = null;
        public Integer W1Temp = null;
        public Integer W2Temp = null;
        public Integer W3Temp = null;
        public Integer W4Temp = null;

        public Integer getId() { return Id; }
        public ComfortMonthValues setId(Integer value) { this.Id = value; return this; }
        public UUID getInstallationId() { return InstallationId; }
        public ComfortMonthValues setInstallationId(UUID value) { this.InstallationId = value; return this; }
        public String getName() { return Name; }
        public ComfortMonthValues setName(String value) { this.Name = value; return this; }
        public Integer getMonth() { return Month; }
        public ComfortMonthValues setMonth(Integer value) { this.Month = value; return this; }
        public String getYear() { return Year; }
        public ComfortMonthValues setYear(String value) { this.Year = value; return this; }
        public Boolean isW1Tick() { return W1Tick; }
        public ComfortMonthValues setW1Tick(Boolean value) { this.W1Tick = value; return this; }
        public Boolean isW2Tick() { return W2Tick; }
        public ComfortMonthValues setW2Tick(Boolean value) { this.W2Tick = value; return this; }
        public Boolean isW3Tick() { return W3Tick; }
        public ComfortMonthValues setW3Tick(Boolean value) { this.W3Tick = value; return this; }
        public Boolean isW4Tick() { return W4Tick; }
        public ComfortMonthValues setW4Tick(Boolean value) { this.W4Tick = value; return this; }
        public Integer getW1Temp() { return W1Temp; }
        public ComfortMonthValues setW1Temp(Integer value) { this.W1Temp = value; return this; }
        public Integer getW2Temp() { return W2Temp; }
        public ComfortMonthValues setW2Temp(Integer value) { this.W2Temp = value; return this; }
        public Integer getW3Temp() { return W3Temp; }
        public ComfortMonthValues setW3Temp(Integer value) { this.W3Temp = value; return this; }
        public Integer getW4Temp() { return W4Temp; }
        public ComfortMonthValues setW4Temp(Integer value) { this.W4Temp = value; return this; }
    }

    public static class PredictionPoint
    {
        public String Id = null;
        public Date Date = null;
        public Double Value = null;
        public Boolean Peak = null;

        public String getId() { return Id; }
        public PredictionPoint setId(String value) { this.Id = value; return this; }
        public Date getDate() { return Date; }
        public PredictionPoint setDate(Date value) { this.Date = value; return this; }
        public Double getValue() { return Value; }
        public PredictionPoint setValue(Double value) { this.Value = value; return this; }
        public Boolean isPeak() { return Peak; }
        public PredictionPoint setPeak(Boolean value) { this.Peak = value; return this; }
    }

    public static class DataPoint
    {
        public Double Value = null;
        public Date Date = null;

        public Double getValue() { return Value; }
        public DataPoint setValue(Double value) { this.Value = value; return this; }
        public Date getDate() { return Date; }
        public DataPoint setDate(Date value) { this.Date = value; return this; }
    }

    public static class InstallationCategoryPeriodConsumption
    {
        public String ConsumptionCategory = null;
        public String ConsumptionPeriod = null;
        public Double Value = null;
        public String DayName = null;
        public Integer Year = null;
        public Integer Week = null;
        public Integer Month = null;
        public Integer Day = null;
        public Integer Hour = null;

        public String getConsumptionCategory() { return ConsumptionCategory; }
        public InstallationCategoryPeriodConsumption setConsumptionCategory(String value) { this.ConsumptionCategory = value; return this; }
        public String getConsumptionPeriod() { return ConsumptionPeriod; }
        public InstallationCategoryPeriodConsumption setConsumptionPeriod(String value) { this.ConsumptionPeriod = value; return this; }
        public Double getValue() { return Value; }
        public InstallationCategoryPeriodConsumption setValue(Double value) { this.Value = value; return this; }
        public String getDayName() { return DayName; }
        public InstallationCategoryPeriodConsumption setDayName(String value) { this.DayName = value; return this; }
        public Integer getYear() { return Year; }
        public InstallationCategoryPeriodConsumption setYear(Integer value) { this.Year = value; return this; }
        public Integer getWeek() { return Week; }
        public InstallationCategoryPeriodConsumption setWeek(Integer value) { this.Week = value; return this; }
        public Integer getMonth() { return Month; }
        public InstallationCategoryPeriodConsumption setMonth(Integer value) { this.Month = value; return this; }
        public Integer getDay() { return Day; }
        public InstallationCategoryPeriodConsumption setDay(Integer value) { this.Day = value; return this; }
        public Integer getHour() { return Hour; }
        public InstallationCategoryPeriodConsumption setHour(Integer value) { this.Hour = value; return this; }
    }

    public static class InstallationCategoryConsumption
    {
        public Integer Id = null;
        public UUID InstallationId = null;
        public String Category = null;
        public Double Day = null;
        public Double Week = null;
        public Double Month = null;

        public Integer getId() { return Id; }
        public InstallationCategoryConsumption setId(Integer value) { this.Id = value; return this; }
        public UUID getInstallationId() { return InstallationId; }
        public InstallationCategoryConsumption setInstallationId(UUID value) { this.InstallationId = value; return this; }
        public String getCategory() { return Category; }
        public InstallationCategoryConsumption setCategory(String value) { this.Category = value; return this; }
        public Double getDay() { return Day; }
        public InstallationCategoryConsumption setDay(Double value) { this.Day = value; return this; }
        public Double getWeek() { return Week; }
        public InstallationCategoryConsumption setWeek(Double value) { this.Week = value; return this; }
        public Double getMonth() { return Month; }
        public InstallationCategoryConsumption setMonth(Double value) { this.Month = value; return this; }
    }

    public static class BarChartCategorizedItem
    {
        public String Marker = null;
        public HashMap<String,Double> Values = null;

        public String getMarker() { return Marker; }
        public BarChartCategorizedItem setMarker(String value) { this.Marker = value; return this; }
        public HashMap<String,Double> getValues() { return Values; }
        public BarChartCategorizedItem setValues(HashMap<String,Double> value) { this.Values = value; return this; }
    }

    public static class InstallationStats
    {
        public String Id = null;
        public Date Date = null;
        public Double Uptime = null;

        public String getId() { return Id; }
        public InstallationStats setId(String value) { this.Id = value; return this; }
        public Date getDate() { return Date; }
        public InstallationStats setDate(Date value) { this.Date = value; return this; }
        public Double getUptime() { return Uptime; }
        public InstallationStats setUptime(Double value) { this.Uptime = value; return this; }
    }

    public static class InstallationDataPoint
    {
        public Double AverageTemperature = null;
        public Double AverageHumidity = null;
        public Date Date = null;

        public Double getAverageTemperature() { return AverageTemperature; }
        public InstallationDataPoint setAverageTemperature(Double value) { this.AverageTemperature = value; return this; }
        public Double getAverageHumidity() { return AverageHumidity; }
        public InstallationDataPoint setAverageHumidity(Double value) { this.AverageHumidity = value; return this; }
        public Date getDate() { return Date; }
        public InstallationDataPoint setDate(Date value) { this.Date = value; return this; }
    }

    public static enum InstallationGatewayStatus
    {
        UNREGISTERED,
        REGISTERED,
        ACTIVE,
        BLOCKED;
    }

    public static class SensorDataPoint
    {
        public String SensorId = null;
        public String SensorName = null;
        public DataPoint DataPoint = null;

        public String getSensorId() { return SensorId; }
        public SensorDataPoint setSensorId(String value) { this.SensorId = value; return this; }
        public String getSensorName() { return SensorName; }
        public SensorDataPoint setSensorName(String value) { this.SensorName = value; return this; }
        public DataPoint getDataPoint() { return DataPoint; }
        public SensorDataPoint setDataPoint(DataPoint value) { this.DataPoint = value; return this; }
    }

    public static class SensorArea
    {
        public Sensor Sensor = null;
        public String Area = null;

        public Sensor getSensor() { return Sensor; }
        public SensorArea setSensor(Sensor value) { this.Sensor = value; return this; }
        public String getArea() { return Area; }
        public SensorArea setArea(String value) { this.Area = value; return this; }
    }

    public static class SensorWithAreaIdAndName extends Sensor
    {
        public Integer AreaId = null;
        public String AreaName = null;

        public Integer getAreaId() { return AreaId; }
        public SensorWithAreaIdAndName setAreaId(Integer value) { this.AreaId = value; return this; }
        public String getAreaName() { return AreaName; }
        public SensorWithAreaIdAndName setAreaName(String value) { this.AreaName = value; return this; }
    }

    public static class AssignableUser extends UserAuth
    {
        public Boolean IsAssigned = null;

        public Boolean getIsAssigned() { return IsAssigned; }
        public AssignableUser setIsAssigned(Boolean value) { this.IsAssigned = value; return this; }
    }

    public static class SensorBaseWithAreaIDandName extends SensorBase
    {
        public Integer AreaId = null;
        public String AreaName = null;

        public Integer getAreaId() { return AreaId; }
        public SensorBaseWithAreaIDandName setAreaId(Integer value) { this.AreaId = value; return this; }
        public String getAreaName() { return AreaName; }
        public SensorBaseWithAreaIDandName setAreaName(String value) { this.AreaName = value; return this; }
    }

    public static enum SensorProtocolType
    {
        Camera,
        WmBus,
        ZWave,
        Wibeee,
        RFXCom;
    }

    public static class InstallationWithSensorAndCategory
    {
        public UUID InstallationId = null;
        public String SensorId = null;
        public String ConsumptionCategory = null;

        public UUID getInstallationId() { return InstallationId; }
        public InstallationWithSensorAndCategory setInstallationId(UUID value) { this.InstallationId = value; return this; }
        public String getSensorId() { return SensorId; }
        public InstallationWithSensorAndCategory setSensorId(String value) { this.SensorId = value; return this; }
        public String getConsumptionCategory() { return ConsumptionCategory; }
        public InstallationWithSensorAndCategory setConsumptionCategory(String value) { this.ConsumptionCategory = value; return this; }
    }

    public static class DeviceArea
    {
        public SensorArea Parent = null;
        public ArrayList<SensorArea> Children = null;

        public SensorArea getParent() { return Parent; }
        public DeviceArea setParent(SensorArea value) { this.Parent = value; return this; }
        public ArrayList<SensorArea> getChildren() { return Children; }
        public DeviceArea setChildren(ArrayList<SensorArea> value) { this.Children = value; return this; }
    }

    public static enum MasterConsumptionCategoryType
    {
        Master,
        Gasmaster,
        Heatingmaster,
        Watermaster;
    }

    public static class SensorWithAreaName extends Sensor
    {
        public String AreaName = null;

        public String getAreaName() { return AreaName; }
        public SensorWithAreaName setAreaName(String value) { this.AreaName = value; return this; }
    }

    public static class Floorplan
    {
        public Integer Id = null;
        public UUID InstallationId = null;
        public String Name = null;
        public String ImageUri = null;
        public Float X_Ini = null;
        public Float X_End = null;
        public Float Y_Ini = null;
        public Float Y_End = null;
        public Date CreationDate = null;
        public Date LastModificationDate = null;

        public Integer getId() { return Id; }
        public Floorplan setId(Integer value) { this.Id = value; return this; }
        public UUID getInstallationId() { return InstallationId; }
        public Floorplan setInstallationId(UUID value) { this.InstallationId = value; return this; }
        public String getName() { return Name; }
        public Floorplan setName(String value) { this.Name = value; return this; }
        public String getImageUri() { return ImageUri; }
        public Floorplan setImageUri(String value) { this.ImageUri = value; return this; }
        public Float getXIni() { return X_Ini; }
        public Floorplan setXIni(Float value) { this.X_Ini = value; return this; }
        public Float getXEnd() { return X_End; }
        public Floorplan setXEnd(Float value) { this.X_End = value; return this; }
        public Float getYIni() { return Y_Ini; }
        public Floorplan setYIni(Float value) { this.Y_Ini = value; return this; }
        public Float getYEnd() { return Y_End; }
        public Floorplan setYEnd(Float value) { this.Y_End = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public Floorplan setCreationDate(Date value) { this.CreationDate = value; return this; }
        public Date getLastModificationDate() { return LastModificationDate; }
        public Floorplan setLastModificationDate(Date value) { this.LastModificationDate = value; return this; }
    }

    public static class FloorPlanWithAreas extends Floorplan
    {
        public ArrayList<AssignableArea> Areas = null;

        public ArrayList<AssignableArea> getAreas() { return Areas; }
        public FloorPlanWithAreas setAreas(ArrayList<AssignableArea> value) { this.Areas = value; return this; }
    }

    public static class Area
    {
        public Integer Id = null;
        public Integer FloorplanId = null;
        public String Name = null;
        public String Description = null;
        public Date CreationDate = null;
        public Date LastModificationDate = null;

        public Integer getId() { return Id; }
        public Area setId(Integer value) { this.Id = value; return this; }
        public Integer getFloorplanId() { return FloorplanId; }
        public Area setFloorplanId(Integer value) { this.FloorplanId = value; return this; }
        public String getName() { return Name; }
        public Area setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public Area setDescription(String value) { this.Description = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public Area setCreationDate(Date value) { this.CreationDate = value; return this; }
        public Date getLastModificationDate() { return LastModificationDate; }
        public Area setLastModificationDate(Date value) { this.LastModificationDate = value; return this; }
    }

    public static class ComfortArea
    {
        public Integer Id = null;
        public String Name = null;
        public Sensor MainThermostat = null;
        public ArrayList<Sensor> Thermostat = null;
        public ArrayList<Sensor> ACIRTransmitter = null;
        public Double AverageTemperature = null;
        public Double AverageHumidity = null;
        public Double AverageCO2 = null;
        public Double AverageBrightness = null;
        public Double AverageNO = null;
        public Double AverageNO2 = null;
        public Double AverageO3 = null;
        public Double AverageAtmosphericPressure = null;

        public Integer getId() { return Id; }
        public ComfortArea setId(Integer value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public ComfortArea setName(String value) { this.Name = value; return this; }
        public Sensor getMainThermostat() { return MainThermostat; }
        public ComfortArea setMainThermostat(Sensor value) { this.MainThermostat = value; return this; }
        public ArrayList<Sensor> getThermostat() { return Thermostat; }
        public ComfortArea setThermostat(ArrayList<Sensor> value) { this.Thermostat = value; return this; }
        public ArrayList<Sensor> getAcirTransmitter() { return ACIRTransmitter; }
        public ComfortArea setAcirTransmitter(ArrayList<Sensor> value) { this.ACIRTransmitter = value; return this; }
        public Double getAverageTemperature() { return AverageTemperature; }
        public ComfortArea setAverageTemperature(Double value) { this.AverageTemperature = value; return this; }
        public Double getAverageHumidity() { return AverageHumidity; }
        public ComfortArea setAverageHumidity(Double value) { this.AverageHumidity = value; return this; }
        public Double getAverageCO2() { return AverageCO2; }
        public ComfortArea setAverageCO2(Double value) { this.AverageCO2 = value; return this; }
        public Double getAverageBrightness() { return AverageBrightness; }
        public ComfortArea setAverageBrightness(Double value) { this.AverageBrightness = value; return this; }
        public Double getAverageNO() { return AverageNO; }
        public ComfortArea setAverageNO(Double value) { this.AverageNO = value; return this; }
        public Double getAverageNO2() { return AverageNO2; }
        public ComfortArea setAverageNO2(Double value) { this.AverageNO2 = value; return this; }
        public Double getAverageO3() { return AverageO3; }
        public ComfortArea setAverageO3(Double value) { this.AverageO3 = value; return this; }
        public Double getAverageAtmosphericPressure() { return AverageAtmosphericPressure; }
        public ComfortArea setAverageAtmosphericPressure(Double value) { this.AverageAtmosphericPressure = value; return this; }
    }

    public static class Node
    {
        public Integer Id = null;
        public String Name = null;
        public String Type = null;
        public String Description = null;
        public String Remarks = null;
        public Float PositionX = null;
        public Float PositionY = null;
        public Date CreationDate = null;
        public Date LastModificationDate = null;

        public Integer getId() { return Id; }
        public Node setId(Integer value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public Node setName(String value) { this.Name = value; return this; }
        public String getType() { return Type; }
        public Node setType(String value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public Node setDescription(String value) { this.Description = value; return this; }
        public String getRemarks() { return Remarks; }
        public Node setRemarks(String value) { this.Remarks = value; return this; }
        public Float getPositionX() { return PositionX; }
        public Node setPositionX(Float value) { this.PositionX = value; return this; }
        public Float getPositionY() { return PositionY; }
        public Node setPositionY(Float value) { this.PositionY = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public Node setCreationDate(Date value) { this.CreationDate = value; return this; }
        public Date getLastModificationDate() { return LastModificationDate; }
        public Node setLastModificationDate(Date value) { this.LastModificationDate = value; return this; }
    }

    public static class InstallationBase
    {
        public UUID Id = null;
        public String Type = null;
        public Integer OwnerId = null;
        public String Name = null;
        public Double Latitude = null;
        public Double Longitude = null;
        public String City = null;
        public Date CreationDate = null;
        public Double PricekWh = null;
        public Double PricekWhProduction = null;
        public Double PriceGaskWh = null;
        public Double PriceHeatingkWh = null;
        public Double PriceWaterM3 = null;
        public Double GasMeterTokWh = null;
        public String DashboardView = null;
        public Date ActivationDate = null;
        public Boolean Blocked = null;
        public String GWVersion = null;
        public String Environment = null;

        public UUID getId() { return Id; }
        public InstallationBase setId(UUID value) { this.Id = value; return this; }
        public String getType() { return Type; }
        public InstallationBase setType(String value) { this.Type = value; return this; }
        public Integer getOwnerId() { return OwnerId; }
        public InstallationBase setOwnerId(Integer value) { this.OwnerId = value; return this; }
        public String getName() { return Name; }
        public InstallationBase setName(String value) { this.Name = value; return this; }
        public Double getLatitude() { return Latitude; }
        public InstallationBase setLatitude(Double value) { this.Latitude = value; return this; }
        public Double getLongitude() { return Longitude; }
        public InstallationBase setLongitude(Double value) { this.Longitude = value; return this; }
        public String getCity() { return City; }
        public InstallationBase setCity(String value) { this.City = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public InstallationBase setCreationDate(Date value) { this.CreationDate = value; return this; }
        public Double getPricekWh() { return PricekWh; }
        public InstallationBase setPricekWh(Double value) { this.PricekWh = value; return this; }
        public Double getPricekWhProduction() { return PricekWhProduction; }
        public InstallationBase setPricekWhProduction(Double value) { this.PricekWhProduction = value; return this; }
        public Double getPriceGaskWh() { return PriceGaskWh; }
        public InstallationBase setPriceGaskWh(Double value) { this.PriceGaskWh = value; return this; }
        public Double getPriceHeatingkWh() { return PriceHeatingkWh; }
        public InstallationBase setPriceHeatingkWh(Double value) { this.PriceHeatingkWh = value; return this; }
        public Double getPriceWaterM3() { return PriceWaterM3; }
        public InstallationBase setPriceWaterM3(Double value) { this.PriceWaterM3 = value; return this; }
        public Double getGasMeterTokWh() { return GasMeterTokWh; }
        public InstallationBase setGasMeterTokWh(Double value) { this.GasMeterTokWh = value; return this; }
        public String getDashboardView() { return DashboardView; }
        public InstallationBase setDashboardView(String value) { this.DashboardView = value; return this; }
        public Date getActivationDate() { return ActivationDate; }
        public InstallationBase setActivationDate(Date value) { this.ActivationDate = value; return this; }
        public Boolean isBlocked() { return Blocked; }
        public InstallationBase setBlocked(Boolean value) { this.Blocked = value; return this; }
        public String getGwVersion() { return GWVersion; }
        public InstallationBase setGwVersion(String value) { this.GWVersion = value; return this; }
        public String getEnvironment() { return Environment; }
        public InstallationBase setEnvironment(String value) { this.Environment = value; return this; }
    }

    public static class Report
    {
        public Integer Id = null;
        public String Name = null;
        public Date CreationDate = null;

        public Integer getId() { return Id; }
        public Report setId(Integer value) { this.Id = value; return this; }
        public String getName() { return Name; }
        public Report setName(String value) { this.Name = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public Report setCreationDate(Date value) { this.CreationDate = value; return this; }
    }

    public static class ReportInstallation
    {
        public Integer Id = null;
        public Integer ReportId = null;
        public UUID InstallationId = null;

        public Integer getId() { return Id; }
        public ReportInstallation setId(Integer value) { this.Id = value; return this; }
        public Integer getReportId() { return ReportId; }
        public ReportInstallation setReportId(Integer value) { this.ReportId = value; return this; }
        public UUID getInstallationId() { return InstallationId; }
        public ReportInstallation setInstallationId(UUID value) { this.InstallationId = value; return this; }
    }

    public static class UserReport
    {
        public Integer Id = null;
        public Integer UserId = null;
        public Integer ReportId = null;

        public Integer getId() { return Id; }
        public UserReport setId(Integer value) { this.Id = value; return this; }
        public Integer getUserId() { return UserId; }
        public UserReport setUserId(Integer value) { this.UserId = value; return this; }
        public Integer getReportId() { return ReportId; }
        public UserReport setReportId(Integer value) { this.ReportId = value; return this; }
    }

    public static class AssignableArea extends Area
    {
        public Boolean IsAssigned = null;

        public Boolean getIsAssigned() { return IsAssigned; }
        public AssignableArea setIsAssigned(Boolean value) { this.IsAssigned = value; return this; }
    }

    public static class SensorStatusPoint
    {
        public String SensorId = null;
        public StatusPoint StatusPoint = null;


        public SensorStatusPoint() {}
        public SensorStatusPoint(String sensorId, StatusPoint statusPoint) {
            SensorId = sensorId;
            StatusPoint = statusPoint;
        }
        public String getSensorId() { return SensorId; }
        public SensorStatusPoint setSensorId(String value) { this.SensorId = value; return this; }
        public StatusPoint getStatusPoint() { return StatusPoint; }
        public SensorStatusPoint setStatusPoint(StatusPoint value) { this.StatusPoint = value; return this; }
    }

    public static class SensorStats
    {
        public String Id = null;
        public Date Date = null;
        public Double Uptime = null;

        public String getId() { return Id; }
        public SensorStats setId(String value) { this.Id = value; return this; }
        public Date getDate() { return Date; }
        public SensorStats setDate(Date value) { this.Date = value; return this; }
        public Double getUptime() { return Uptime; }
        public SensorStats setUptime(Double value) { this.Uptime = value; return this; }
    }

    public static class OutlierPoint
    {
        public String Id = null;
        public Date Date = null;
        public Double Value = null;
        public Double CorrectedValue = null;
        public Boolean Processed = null;

        public String getId() { return Id; }
        public OutlierPoint setId(String value) { this.Id = value; return this; }
        public Date getDate() { return Date; }
        public OutlierPoint setDate(Date value) { this.Date = value; return this; }
        public Double getValue() { return Value; }
        public OutlierPoint setValue(Double value) { this.Value = value; return this; }
        public Double getCorrectedValue() { return CorrectedValue; }
        public OutlierPoint setCorrectedValue(Double value) { this.CorrectedValue = value; return this; }
        public Boolean isProcessed() { return Processed; }
        public OutlierPoint setProcessed(Boolean value) { this.Processed = value; return this; }
    }

    public static class GapPoint
    {
        public String Id = null;
        public Date Date = null;
        public Double Value = null;

        public String getId() { return Id; }
        public GapPoint setId(String value) { this.Id = value; return this; }
        public Date getDate() { return Date; }
        public GapPoint setDate(Date value) { this.Date = value; return this; }
        public Double getValue() { return Value; }
        public GapPoint setValue(Double value) { this.Value = value; return this; }
    }

    public static class BatteryLevelReport
    {
        public String SensorId = null;
        public Double BatteryLevel = null;
        public Date Date = null;
        public Boolean Notify = null;

        public String getSensorId() { return SensorId; }
        public BatteryLevelReport setSensorId(String value) { this.SensorId = value; return this; }
        public Double getBatteryLevel() { return BatteryLevel; }
        public BatteryLevelReport setBatteryLevel(Double value) { this.BatteryLevel = value; return this; }
        public Date getDate() { return Date; }
        public BatteryLevelReport setDate(Date value) { this.Date = value; return this; }
        public Boolean isNotify() { return Notify; }
        public BatteryLevelReport setNotify(Boolean value) { this.Notify = value; return this; }
    }

    public static class SensorDataPointML
    {
        public String Id = null;
        public Date Date = null;
        public Double Value = null;
        public Double TemperatureOutside = null;
        public Integer WeekDay = null;
        public Integer Hour = null;
        public Integer Month = null;
        public Double PreviousValue = null;
        public String MasterType = null;

        public String getId() { return Id; }
        public SensorDataPointML setId(String value) { this.Id = value; return this; }
        public Date getDate() { return Date; }
        public SensorDataPointML setDate(Date value) { this.Date = value; return this; }
        public Double getValue() { return Value; }
        public SensorDataPointML setValue(Double value) { this.Value = value; return this; }
        public Double getTemperatureOutside() { return TemperatureOutside; }
        public SensorDataPointML setTemperatureOutside(Double value) { this.TemperatureOutside = value; return this; }
        public Integer getWeekDay() { return WeekDay; }
        public SensorDataPointML setWeekDay(Integer value) { this.WeekDay = value; return this; }
        public Integer getHour() { return Hour; }
        public SensorDataPointML setHour(Integer value) { this.Hour = value; return this; }
        public Integer getMonth() { return Month; }
        public SensorDataPointML setMonth(Integer value) { this.Month = value; return this; }
        public Double getPreviousValue() { return PreviousValue; }
        public SensorDataPointML setPreviousValue(Double value) { this.PreviousValue = value; return this; }
        public String getMasterType() { return MasterType; }
        public SensorDataPointML setMasterType(String value) { this.MasterType = value; return this; }
    }

    public static class ModePoint
    {
        public String Mode = null;
        public Date Date = null;
        public String Trigger = null;
        public String TriggerName = null;

        public ModePoint(){}
        public ModePoint(String mode, Date date, String trigger) {
            Mode = mode;
            Date = date;
            Trigger = trigger;
        }
        public String getMode() { return Mode; }
        public ModePoint setMode(String value) { this.Mode = value; return this; }
        public Date getDate() { return Date; }
        public ModePoint setDate(Date value) { this.Date = value; return this; }
        public String getTrigger() { return Trigger; }
        public ModePoint setTrigger(String value) { this.Trigger = value; return this; }
        public String getTriggerName() { return TriggerName; }
        public ModePoint setTriggerName(String value) { this.TriggerName = value; return this; }
    }

    public static class SetPointPoint
    {
        public Double SetPoint = null;
        public Date Date = null;
        public String Trigger = null;
        public String TriggerName = null;

        public SetPointPoint(){}
        public SetPointPoint(Double setPoint, Date date, String trigger) {
            SetPoint = setPoint;
            Date = date;
            Trigger = trigger;
        }
        public Double getSetPoint() { return SetPoint; }
        public SetPointPoint setSetPoint(Double value) { this.SetPoint = value; return this; }
        public Date getDate() { return Date; }
        public SetPointPoint setDate(Date value) { this.Date = value; return this; }
        public String getTrigger() { return Trigger; }
        public SetPointPoint setTrigger(String value) { this.Trigger = value; return this; }
        public String getTriggerName() { return TriggerName; }
        public SetPointPoint setTriggerName(String value) { this.TriggerName = value; return this; }
    }

    public static class SensorModePoint
    {
        public String SensorId = null;
        public ModePoint ModePoint = null;


        public SensorModePoint(){}
        public SensorModePoint(String sensorId, ModePoint modePoint) {
            SensorId = sensorId;
            ModePoint = modePoint;
        }
        public String getSensorId() { return SensorId; }
        public SensorModePoint setSensorId(String value) { this.SensorId = value; return this; }
        public ModePoint getModePoint() { return ModePoint; }
        public SensorModePoint setModePoint(ModePoint value) { this.ModePoint = value; return this; }
    }

    public static class SensorSupportedModesPoint
    {
        public String SensorId = null;
        public List<String> SupportedModes = null;


        public SensorSupportedModesPoint(){}
        public SensorSupportedModesPoint(String sensorId, List<String> supportedModes) {
            SensorId = sensorId;
            SupportedModes = supportedModes;
        }
        public String getSensorId() { return SensorId; }
        public SensorSupportedModesPoint setSensorId(String value) { this.SensorId = value; return this; }
        public List<String> getSupportedModes() { return SupportedModes; }
        public SensorSupportedModesPoint setSupportedModes(List<String> value) { this.SupportedModes = value; return this; }
    }

    public static class SensorSetPointPoint
    {
        public String SensorId = null;
        public SetPointPoint SetPointPoint = null;


        public SensorSetPointPoint(){}
        public SensorSetPointPoint(String sensorId, SetPointPoint setPointPoint) {
            SensorId = sensorId;
            SetPointPoint = setPointPoint;
        }
        public String getSensorId() { return SensorId; }
        public SensorSetPointPoint setSensorId(String value) { this.SensorId = value; return this; }
        public SetPointPoint getSetPointPoint() { return SetPointPoint; }
        public SensorSetPointPoint setSetPointPoint(SetPointPoint value) { this.SetPointPoint = value; return this; }
    }

    public static class FanModePoint
    {
        public String FanMode = null;
        public Date Date = null;
        public String Trigger = null;
        public String TriggerName = null;

        public FanModePoint(){}
        public FanModePoint(String fanMode, java.util.Date date, String trigger) {
            FanMode = fanMode;
            Date = date;
            Trigger = trigger;
        }
        public String getFanMode() { return FanMode; }
        public FanModePoint setFanMode(String value) { this.FanMode = value; return this; }
        public Date getDate() { return Date; }
        public FanModePoint setDate(Date value) { this.Date = value; return this; }
        public String getTrigger() { return Trigger; }
        public FanModePoint setTrigger(String value) { this.Trigger = value; return this; }
        public String getTriggerName() { return TriggerName; }
        public FanModePoint setTriggerName(String value) { this.TriggerName = value; return this; }
    }

    public static class SensorFanModePoint
    {
        public String SensorId = null;
        public FanModePoint FanModePoint = null;

        public SensorFanModePoint() {}
        public SensorFanModePoint(String sensorId, FanModePoint fanModePoint) {
            SensorId = sensorId;
            FanModePoint = fanModePoint;
        }
        public String getSensorId() { return SensorId; }
        public SensorFanModePoint setSensorId(String value) { this.SensorId = value; return this; }
        public FanModePoint getFanModePoint() { return FanModePoint; }
        public SensorFanModePoint setFanModePoint(FanModePoint value) { this.FanModePoint = value; return this; }
    }


    public static class SensorSupportedFanModesPoint
    {
        public String SensorId = null;
        public List<String> SupportedFanModes = null;

        public SensorSupportedFanModesPoint() {}
        public SensorSupportedFanModesPoint(String sensorId, List<String> supportedFanModes) {
            SensorId = sensorId;
            SupportedFanModes = supportedFanModes;
        }
        public String getSensorId() { return SensorId; }
        public SensorSupportedFanModesPoint setSensorId(String value) { this.SensorId = value; return this; }
        public List<String> getSupportedFanModes() { return SupportedFanModes; }
        public SensorSupportedFanModesPoint setSupportedFanModes(List<String> value) { this.SupportedFanModes = value; return this; }
    }

    public static class SensorBase
    {
        public String Id = null;
        public String ParentId = null;
        public String Protocol = null;
        public String Name = null;
        public String Type = null;
        public String Manufacturer = null;
        public String ManufacturerType = null;
        public String ManufacturerTypeId = null;
        public String ManufacturerTypeName = null;
        public String FirmwareVersion = null;
        public String ManufacturerName = null;
        public String ManufacturerDeviceName = null;
        public String Description = null;
        public String Remarks = null;
        public String ConsumptionCategory = null;
        public Date CreationDate = null;

        public String getId() { return Id; }
        public SensorBase setId(String value) { this.Id = value; return this; }
        public String getParentId() { return ParentId; }
        public SensorBase setParentId(String value) { this.ParentId = value; return this; }
        public String getProtocol() { return Protocol; }
        public SensorBase setProtocol(String value) { this.Protocol = value; return this; }
        public String getName() { return Name; }
        public SensorBase setName(String value) { this.Name = value; return this; }
        public String getType() { return Type; }
        public SensorBase setType(String value) { this.Type = value; return this; }
        public String getManufacturer() { return Manufacturer; }
        public SensorBase setManufacturer(String value) { this.Manufacturer = value; return this; }
        public String getManufacturerType() { return ManufacturerType; }
        public SensorBase setManufacturerType(String value) { this.ManufacturerType = value; return this; }
        public String getManufacturerTypeId() { return ManufacturerTypeId; }
        public SensorBase setManufacturerTypeId(String value) { this.ManufacturerTypeId = value; return this; }
        public String getManufacturerTypeName() { return ManufacturerTypeName; }
        public SensorBase setManufacturerTypeName(String value) { this.ManufacturerTypeName = value; return this; }
        public String getFirmwareVersion() { return FirmwareVersion; }
        public SensorBase setFirmwareVersion(String value) { this.FirmwareVersion = value; return this; }
        public String getManufacturerName() { return ManufacturerName; }
        public SensorBase setManufacturerName(String value) { this.ManufacturerName = value; return this; }
        public String getManufacturerDeviceName() { return ManufacturerDeviceName; }
        public SensorBase setManufacturerDeviceName(String value) { this.ManufacturerDeviceName = value; return this; }
        public String getDescription() { return Description; }
        public SensorBase setDescription(String value) { this.Description = value; return this; }
        public String getRemarks() { return Remarks; }
        public SensorBase setRemarks(String value) { this.Remarks = value; return this; }
        public String getConsumptionCategory() { return ConsumptionCategory; }
        public SensorBase setConsumptionCategory(String value) { this.ConsumptionCategory = value; return this; }
        public Date getCreationDate() { return CreationDate; }
        public SensorBase setCreationDate(Date value) { this.CreationDate = value; return this; }
    }

    public static class Tip
    {
        public Integer Id = null;
        public String Title = null;
        public String Text = null;
        public String Description = null;
        public String Icon = null;
        public String Section = null;

        public Integer getId() { return Id; }
        public Tip setId(Integer value) { this.Id = value; return this; }
        public String getTitle() { return Title; }
        public Tip setTitle(String value) { this.Title = value; return this; }
        public String getText() { return Text; }
        public Tip setText(String value) { this.Text = value; return this; }
        public String getDescription() { return Description; }
        public Tip setDescription(String value) { this.Description = value; return this; }
        public String getIcon() { return Icon; }
        public Tip setIcon(String value) { this.Icon = value; return this; }
        public String getSection() { return Section; }
        public Tip setSection(String value) { this.Section = value; return this; }
    }

    public static enum TipSection
    {
        Electricity,
        Gas,
        Heating,
        Water;
    }

    public static class UserWithNumNotifications
    {
        public UserAuth User = null;
        public Integer MailNotifications = null;
        public Integer PushNotifications = null;
        public Integer SMSNotifications = null;

        public UserAuth getUser() { return User; }
        public UserWithNumNotifications setUser(UserAuth value) { this.User = value; return this; }
        public Integer getMailNotifications() { return MailNotifications; }
        public UserWithNumNotifications setMailNotifications(Integer value) { this.MailNotifications = value; return this; }
        public Integer getPushNotifications() { return PushNotifications; }
        public UserWithNumNotifications setPushNotifications(Integer value) { this.PushNotifications = value; return this; }
        public Integer getSmsNotifications() { return SMSNotifications; }
        public UserWithNumNotifications setSmsNotifications(Integer value) { this.SMSNotifications = value; return this; }
    }

    public static class AdminSentNotification
    {
        public Long Id = null;
        public Integer UserId = null;
        public String Type = null;
        public String Subtype = null;
        public String Description = null;
        public UUID TargetInstallation = null;
        public Date Date = null;

        public Long getId() { return Id; }
        public AdminSentNotification setId(Long value) { this.Id = value; return this; }
        public Integer getUserId() { return UserId; }
        public AdminSentNotification setUserId(Integer value) { this.UserId = value; return this; }
        public String getType() { return Type; }
        public AdminSentNotification setType(String value) { this.Type = value; return this; }
        public String getSubtype() { return Subtype; }
        public AdminSentNotification setSubtype(String value) { this.Subtype = value; return this; }
        public String getDescription() { return Description; }
        public AdminSentNotification setDescription(String value) { this.Description = value; return this; }
        public UUID getTargetInstallation() { return TargetInstallation; }
        public AdminSentNotification setTargetInstallation(UUID value) { this.TargetInstallation = value; return this; }
        public Date getDate() { return Date; }
        public AdminSentNotification setDate(Date value) { this.Date = value; return this; }
    }

    public static class UserSettings
    {
        public Integer Id = null;
        public String PhoneNumber = null;
        public Boolean CelsiusUnits = null;
        public String Currency = null;
        public String DefaultInstallation = null;
        public Boolean DREnabled = null;
        public String DefaultPage = null;
        public Boolean NeedsChangePassword = null;

        public Integer getId() { return Id; }
        public UserSettings setId(Integer value) { this.Id = value; return this; }
        public String getPhoneNumber() { return PhoneNumber; }
        public UserSettings setPhoneNumber(String value) { this.PhoneNumber = value; return this; }
        public Boolean isCelsiusUnits() { return CelsiusUnits; }
        public UserSettings setCelsiusUnits(Boolean value) { this.CelsiusUnits = value; return this; }
        public String getCurrency() { return Currency; }
        public UserSettings setCurrency(String value) { this.Currency = value; return this; }
        public String getDefaultInstallation() { return DefaultInstallation; }
        public UserSettings setDefaultInstallation(String value) { this.DefaultInstallation = value; return this; }
        public Boolean isDrEnabled() { return DREnabled; }
        public UserSettings setDrEnabled(Boolean value) { this.DREnabled = value; return this; }
        public String getDefaultPage() { return DefaultPage; }
        public UserSettings setDefaultPage(String value) { this.DefaultPage = value; return this; }
        public Boolean isNeedsChangePassword() { return NeedsChangePassword; }
        public UserSettings setNeedsChangePassword(Boolean value) { this.NeedsChangePassword = value; return this; }
    }

    public static class UserNotificationSettings
    {
        public Integer Id = null;
        public Integer UserId = null;
        public String SubType = null;
        public Boolean SMS = null;
        public Boolean Mail = null;
        public Boolean Push = null;
        public Boolean IsEnabled = null;

        public Integer getId() { return Id; }
        public UserNotificationSettings setId(Integer value) { this.Id = value; return this; }
        public Integer getUserId() { return UserId; }
        public UserNotificationSettings setUserId(Integer value) { this.UserId = value; return this; }
        public String getSubType() { return SubType; }
        public UserNotificationSettings setSubType(String value) { this.SubType = value; return this; }
        public Boolean isSms() { return SMS; }
        public UserNotificationSettings setSms(Boolean value) { this.SMS = value; return this; }
        public Boolean isMail() { return Mail; }
        public UserNotificationSettings setMail(Boolean value) { this.Mail = value; return this; }
        public Boolean isPush() { return Push; }
        public UserNotificationSettings setPush(Boolean value) { this.Push = value; return this; }
        public Boolean getIsEnabled() { return IsEnabled; }
        public UserNotificationSettings setIsEnabled(Boolean value) { this.IsEnabled = value; return this; }
    }

    public static class UserWarning
    {
        public Long Id = null;
        public Integer UserId = null;
        public Integer WarningId = null;

        public Long getId() { return Id; }
        public UserWarning setId(Long value) { this.Id = value; return this; }
        public Integer getUserId() { return UserId; }
        public UserWarning setUserId(Integer value) { this.UserId = value; return this; }
        public Integer getWarningId() { return WarningId; }
        public UserWarning setWarningId(Integer value) { this.WarningId = value; return this; }
    }

    public static class TableEntity
    {
        public String PartitionKey = null;
        public String RowKey = null;
        public Date Timestamp = null;
        public String ETag = null;

        public String getPartitionKey() { return PartitionKey; }
        public TableEntity setPartitionKey(String value) { this.PartitionKey = value; return this; }
        public String getRowKey() { return RowKey; }
        public TableEntity setRowKey(String value) { this.RowKey = value; return this; }
        public Date getTimestamp() { return Timestamp; }
        public TableEntity setTimestamp(Date value) { this.Timestamp = value; return this; }
        public String getETag() { return ETag; }
        public TableEntity setETag(String value) { this.ETag = value; return this; }
    }

    public static class WibeeeDeviceMetadata
    {
        public String MAC = null;
        public String Model = null;
        public String Version = null;

        public String getMac() { return MAC; }
        public WibeeeDeviceMetadata setMac(String value) { this.MAC = value; return this; }
        public String getModel() { return Model; }
        public WibeeeDeviceMetadata setModel(String value) { this.Model = value; return this; }
        public String getVersion() { return Version; }
        public WibeeeDeviceMetadata setVersion(String value) { this.Version = value; return this; }
    }

    public static enum SchedulerType
    {
        Comfort,
        Security,
        Control;
    }

    @Route(Path="/update/{GwType}/lastimage", Verbs="GET")
    public static class UpdateGatewayImage implements IReturn<UpdateGatewayImageResponse>
    {
        @ApiMember(Name="GwType", Description="Gateway Type", ParameterType="path", DataType="string", IsRequired=true, ExcludeInSchema=true)
        public String GwType = null;

        public String getGwType() { return GwType; }
        public UpdateGatewayImage setGwType(String value) { this.GwType = value; return this; }
        private static Object responseType = UpdateGatewayImageResponse.class;
        public Object getResponseType() { return responseType; }
    }

    public static class UpdateGatewayImageResponse extends ResponseBase
    {
        public String ImageName = null;
        public String ImageVersion = null;
        public String DownloadURL = null;
        public String MD5 = null;

        public String getImageName() { return ImageName; }
        public UpdateGatewayImageResponse setImageName(String value) { this.ImageName = value; return this; }
        public String getImageVersion() { return ImageVersion; }
        public UpdateGatewayImageResponse setImageVersion(String value) { this.ImageVersion = value; return this; }
        public String getDownloadURL() { return DownloadURL; }
        public UpdateGatewayImageResponse setDownloadURL(String value) { this.DownloadURL = value; return this; }
        public String getMD5() { return MD5; }
        public UpdateGatewayImageResponse setMD5(String value) { this.MD5 = value; return this; }
    }

    @Route(Path="/update/{Id}/check", Verbs="GET")
    public static class UpdateGatewayCheckUpdate implements IReturn<UpdateGatewayCheckUpdateResponse>
    {
        /**
         * Gateway Id
         */
        @ApiMember(DataType="string", Description="Gateway Id", ExcludeInSchema=true, IsRequired=true, Name="Id", ParameterType="path")
        public String Id = null;

        public String getId() { return Id; }
        public UpdateGatewayCheckUpdate setId(String value) { this.Id = value; return this; }
        private static Object responseType = UpdateGatewayCheckUpdateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    public static class UpdateGatewayCheckUpdateResponse extends ResponseBase
    {
        public String ImageName = null;
        public String ImageVersion = null;
        public String DownloadURL = null;
        public String MD5 = null;

        public String getImageName() { return ImageName; }
        public UpdateGatewayCheckUpdateResponse setImageName(String value) { this.ImageName = value; return this; }
        public String getImageVersion() { return ImageVersion; }
        public UpdateGatewayCheckUpdateResponse setImageVersion(String value) { this.ImageVersion = value; return this; }
        public String getDownloadURL() { return DownloadURL; }
        public UpdateGatewayCheckUpdateResponse setDownloadURL(String value) { this.DownloadURL = value; return this; }
        public String getMD5() { return MD5; }
        public UpdateGatewayCheckUpdateResponse setMD5(String value) { this.MD5 = value; return this; }
    }

}