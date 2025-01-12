// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ApplyLinkMicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyLinkMicResponseBody body;

    public static ApplyLinkMicResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyLinkMicResponse self = new ApplyLinkMicResponse();
        return TeaModel.build(map, self);
    }

    public ApplyLinkMicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyLinkMicResponse setBody(ApplyLinkMicResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyLinkMicResponseBody getBody() {
        return this.body;
    }

}
