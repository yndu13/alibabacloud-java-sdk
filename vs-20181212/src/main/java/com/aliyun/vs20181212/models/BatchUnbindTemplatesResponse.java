// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUnbindTemplatesResponseBody body;

    public static BatchUnbindTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindTemplatesResponse self = new BatchUnbindTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindTemplatesResponse setBody(BatchUnbindTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindTemplatesResponseBody getBody() {
        return this.body;
    }

}
