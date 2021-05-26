// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateAgentBusinessUnitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAgentBusinessUnitResponseBody body;

    public static CreateAgentBusinessUnitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentBusinessUnitResponse self = new CreateAgentBusinessUnitResponse();
        return TeaModel.build(map, self);
    }

    public CreateAgentBusinessUnitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAgentBusinessUnitResponse setBody(CreateAgentBusinessUnitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAgentBusinessUnitResponseBody getBody() {
        return this.body;
    }

}
