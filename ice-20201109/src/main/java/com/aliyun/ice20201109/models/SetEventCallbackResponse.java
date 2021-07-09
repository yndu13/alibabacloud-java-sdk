// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetEventCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetEventCallbackResponseBody body;

    public static SetEventCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SetEventCallbackResponse self = new SetEventCallbackResponse();
        return TeaModel.build(map, self);
    }

    public SetEventCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetEventCallbackResponse setBody(SetEventCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SetEventCallbackResponseBody getBody() {
        return this.body;
    }

}
