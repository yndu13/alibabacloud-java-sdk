// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBatchRegistAnonymousTbAccountResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBatchRegistAnonymousTbAccountResultResponseBody body;

    public static QueryBatchRegistAnonymousTbAccountResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegistAnonymousTbAccountResultResponse self = new QueryBatchRegistAnonymousTbAccountResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse setBody(QueryBatchRegistAnonymousTbAccountResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBatchRegistAnonymousTbAccountResultResponseBody getBody() {
        return this.body;
    }

}
