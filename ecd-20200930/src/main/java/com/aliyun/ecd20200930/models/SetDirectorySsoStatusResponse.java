// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDirectorySsoStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDirectorySsoStatusResponseBody body;

    public static SetDirectorySsoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDirectorySsoStatusResponse self = new SetDirectorySsoStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDirectorySsoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDirectorySsoStatusResponse setBody(SetDirectorySsoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDirectorySsoStatusResponseBody getBody() {
        return this.body;
    }

}
