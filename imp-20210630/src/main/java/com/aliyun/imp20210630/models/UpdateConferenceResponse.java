// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateConferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateConferenceResponseBody body;

    public static UpdateConferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConferenceResponse self = new UpdateConferenceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConferenceResponse setBody(UpdateConferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConferenceResponseBody getBody() {
        return this.body;
    }

}
