// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetSmartAGDpiAttributeResponseBody extends TeaModel {
    @NameInMap("LogstoreName")
    public String logstoreName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SlsRegion")
    public String slsRegion;

    @NameInMap("DpiMonitorStatus")
    public String dpiMonitorStatus;

    @NameInMap("DpiStatus")
    public String dpiStatus;

    public static GetSmartAGDpiAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmartAGDpiAttributeResponseBody self = new GetSmartAGDpiAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmartAGDpiAttributeResponseBody setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public GetSmartAGDpiAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmartAGDpiAttributeResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetSmartAGDpiAttributeResponseBody setSlsRegion(String slsRegion) {
        this.slsRegion = slsRegion;
        return this;
    }
    public String getSlsRegion() {
        return this.slsRegion;
    }

    public GetSmartAGDpiAttributeResponseBody setDpiMonitorStatus(String dpiMonitorStatus) {
        this.dpiMonitorStatus = dpiMonitorStatus;
        return this;
    }
    public String getDpiMonitorStatus() {
        return this.dpiMonitorStatus;
    }

    public GetSmartAGDpiAttributeResponseBody setDpiStatus(String dpiStatus) {
        this.dpiStatus = dpiStatus;
        return this;
    }
    public String getDpiStatus() {
        return this.dpiStatus;
    }

}
