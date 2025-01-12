// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSuspEventsResponseBody body;

    public static DescribeSuspEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsResponse self = new DescribeSuspEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventsResponse setBody(DescribeSuspEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventsResponseBody getBody() {
        return this.body;
    }

}
