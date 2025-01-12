// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class VerifyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyOrderResponseBody body;

    public static VerifyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyOrderResponse self = new VerifyOrderResponse();
        return TeaModel.build(map, self);
    }

    public VerifyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyOrderResponse setBody(VerifyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyOrderResponseBody getBody() {
        return this.body;
    }

}
