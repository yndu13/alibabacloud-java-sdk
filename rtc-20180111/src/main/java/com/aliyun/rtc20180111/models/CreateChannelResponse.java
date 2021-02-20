// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateChannelResponseBody body;

    public static CreateChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChannelResponse self = new CreateChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChannelResponse setBody(CreateChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChannelResponseBody getBody() {
        return this.body;
    }

}
