// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainBpsDataResponseBody body;

    public static DescribeDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsDataResponse self = new DescribeDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainBpsDataResponse setBody(DescribeDomainBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainBpsDataResponseBody getBody() {
        return this.body;
    }

}
