// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentByOuterInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentByOuterInfoResponseBody body;

    public static GetAgentByOuterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByOuterInfoResponse self = new GetAgentByOuterInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentByOuterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentByOuterInfoResponse setBody(GetAgentByOuterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentByOuterInfoResponseBody getBody() {
        return this.body;
    }

}
