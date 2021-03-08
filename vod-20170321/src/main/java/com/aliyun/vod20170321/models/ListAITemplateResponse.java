// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAITemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAITemplateResponseBody body;

    public static ListAITemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAITemplateResponse self = new ListAITemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListAITemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAITemplateResponse setBody(ListAITemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAITemplateResponseBody getBody() {
        return this.body;
    }

}
