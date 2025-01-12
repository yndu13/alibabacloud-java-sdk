// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopsLiteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDesktopsLiteResponseBody body;

    public static CreateDesktopsLiteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopsLiteResponse self = new CreateDesktopsLiteResponse();
        return TeaModel.build(map, self);
    }

    public CreateDesktopsLiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDesktopsLiteResponse setBody(CreateDesktopsLiteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDesktopsLiteResponseBody getBody() {
        return this.body;
    }

}
