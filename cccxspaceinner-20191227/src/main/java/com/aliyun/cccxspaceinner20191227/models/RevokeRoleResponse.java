// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class RevokeRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeRoleResponseBody body;

    public static RevokeRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeRoleResponse self = new RevokeRoleResponse();
        return TeaModel.build(map, self);
    }

    public RevokeRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeRoleResponse setBody(RevokeRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeRoleResponseBody getBody() {
        return this.body;
    }

}
