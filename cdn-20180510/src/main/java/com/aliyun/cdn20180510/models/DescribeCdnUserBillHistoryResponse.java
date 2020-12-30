// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserBillHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnUserBillHistoryResponseBody body;

    public static DescribeCdnUserBillHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserBillHistoryResponse self = new DescribeCdnUserBillHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserBillHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnUserBillHistoryResponse setBody(DescribeCdnUserBillHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnUserBillHistoryResponseBody getBody() {
        return this.body;
    }

}
