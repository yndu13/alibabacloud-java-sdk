// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class RemoveMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveMemberResponseBody body;

    public static RemoveMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveMemberResponse self = new RemoveMemberResponse();
        return TeaModel.build(map, self);
    }

    public RemoveMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveMemberResponse setBody(RemoveMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveMemberResponseBody getBody() {
        return this.body;
    }

}
