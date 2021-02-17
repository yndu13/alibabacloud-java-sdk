// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLLogTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLLogTemplatesResponseBody body;

    public static DescribeSQLLogTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogTemplatesResponse self = new DescribeSQLLogTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogTemplatesResponse setBody(DescribeSQLLogTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogTemplatesResponseBody getBody() {
        return this.body;
    }

}