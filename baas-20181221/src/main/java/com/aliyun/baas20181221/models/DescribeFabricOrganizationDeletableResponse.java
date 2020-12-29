// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationDeletableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFabricOrganizationDeletableResponseBody body;

    public static DescribeFabricOrganizationDeletableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationDeletableResponse self = new DescribeFabricOrganizationDeletableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationDeletableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricOrganizationDeletableResponse setBody(DescribeFabricOrganizationDeletableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricOrganizationDeletableResponseBody getBody() {
        return this.body;
    }

}
