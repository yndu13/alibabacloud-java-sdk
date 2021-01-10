// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUnfinishedActivitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnfinishedActivitiesResponseBody body;

    public static QueryUnfinishedActivitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnfinishedActivitiesResponse self = new QueryUnfinishedActivitiesResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnfinishedActivitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnfinishedActivitiesResponse setBody(QueryUnfinishedActivitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnfinishedActivitiesResponseBody getBody() {
        return this.body;
    }

}
