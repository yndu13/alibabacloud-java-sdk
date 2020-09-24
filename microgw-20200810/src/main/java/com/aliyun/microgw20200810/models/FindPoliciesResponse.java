// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindPoliciesResponseBody body;

    public static FindPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        FindPoliciesResponse self = new FindPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public FindPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindPoliciesResponse setBody(FindPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public FindPoliciesResponseBody getBody() {
        return this.body;
    }

}
