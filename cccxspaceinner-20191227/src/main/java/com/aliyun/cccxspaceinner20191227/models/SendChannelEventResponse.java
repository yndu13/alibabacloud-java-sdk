// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class SendChannelEventResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendChannelEventResponseBody body;

    public static SendChannelEventResponse build(java.util.Map<String, ?> map) throws Exception {
        SendChannelEventResponse self = new SendChannelEventResponse();
        return TeaModel.build(map, self);
    }

    public SendChannelEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendChannelEventResponse setBody(SendChannelEventResponseBody body) {
        this.body = body;
        return this;
    }
    public SendChannelEventResponseBody getBody() {
        return this.body;
    }

}
