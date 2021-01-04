// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionRiskyTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListExecutionRiskyTasksResponseBody body;

    public static ListExecutionRiskyTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionRiskyTasksResponse self = new ListExecutionRiskyTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutionRiskyTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutionRiskyTasksResponse setBody(ListExecutionRiskyTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutionRiskyTasksResponseBody getBody() {
        return this.body;
    }

}