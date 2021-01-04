// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeMountedClientsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMountedClientsResponseBody body;

    public static DescribeMountedClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMountedClientsResponse self = new DescribeMountedClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMountedClientsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMountedClientsResponse setBody(DescribeMountedClientsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMountedClientsResponseBody getBody() {
        return this.body;
    }

}
