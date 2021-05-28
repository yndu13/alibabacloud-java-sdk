// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class StopAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopAlertResponseBody body;

    public static StopAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAlertResponse self = new StopAlertResponse();
        return TeaModel.build(map, self);
    }

    public StopAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAlertResponse setBody(StopAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAlertResponseBody getBody() {
        return this.body;
    }

}
