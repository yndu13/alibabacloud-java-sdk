// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTaskResultResponseBody extends TeaModel {
    // status
    @NameInMap("Status")
    public String status;

    // message
    @NameInMap("Message")
    public String message;

    // buildId
    @NameInMap("BuildId")
    public String buildId;

    // passNumber
    @NameInMap("PassNumber")
    public Long passNumber;

    // totalNumber
    @NameInMap("TotalNumber")
    public Long totalNumber;

    // url
    @NameInMap("Url")
    public String url;

    // success
    @NameInMap("Success")
    public Boolean success;

    // testSetRecordId
    @NameInMap("TestSetRecordId")
    public Long testSetRecordId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    public static QueryTaskResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskResultResponseBody self = new QueryTaskResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryTaskResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTaskResultResponseBody setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public QueryTaskResultResponseBody setPassNumber(Long passNumber) {
        this.passNumber = passNumber;
        return this;
    }
    public Long getPassNumber() {
        return this.passNumber;
    }

    public QueryTaskResultResponseBody setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Long getTotalNumber() {
        return this.totalNumber;
    }

    public QueryTaskResultResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public QueryTaskResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTaskResultResponseBody setTestSetRecordId(Long testSetRecordId) {
        this.testSetRecordId = testSetRecordId;
        return this;
    }
    public Long getTestSetRecordId() {
        return this.testSetRecordId;
    }

    public QueryTaskResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
