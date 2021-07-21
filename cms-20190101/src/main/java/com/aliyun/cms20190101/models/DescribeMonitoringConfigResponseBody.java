// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AutoInstall")
    public Boolean autoInstall;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("EnableInstallAgentNewECS")
    public Boolean enableInstallAgentNewECS;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static DescribeMonitoringConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringConfigResponseBody self = new DescribeMonitoringConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitoringConfigResponseBody setAutoInstall(Boolean autoInstall) {
        this.autoInstall = autoInstall;
        return this;
    }
    public Boolean getAutoInstall() {
        return this.autoInstall;
    }

    public DescribeMonitoringConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMonitoringConfigResponseBody setEnableInstallAgentNewECS(Boolean enableInstallAgentNewECS) {
        this.enableInstallAgentNewECS = enableInstallAgentNewECS;
        return this;
    }
    public Boolean getEnableInstallAgentNewECS() {
        return this.enableInstallAgentNewECS;
    }

    public DescribeMonitoringConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMonitoringConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
