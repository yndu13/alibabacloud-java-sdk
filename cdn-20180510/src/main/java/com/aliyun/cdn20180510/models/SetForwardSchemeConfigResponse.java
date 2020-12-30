// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetForwardSchemeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetForwardSchemeConfigResponseBody body;

    public static SetForwardSchemeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetForwardSchemeConfigResponse self = new SetForwardSchemeConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetForwardSchemeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetForwardSchemeConfigResponse setBody(SetForwardSchemeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetForwardSchemeConfigResponseBody getBody() {
        return this.body;
    }

}
