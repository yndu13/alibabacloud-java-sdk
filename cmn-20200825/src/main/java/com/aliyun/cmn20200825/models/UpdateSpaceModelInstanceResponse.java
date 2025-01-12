// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSpaceModelInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSpaceModelInstanceResponseBody body;

    public static UpdateSpaceModelInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpaceModelInstanceResponse self = new UpdateSpaceModelInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSpaceModelInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSpaceModelInstanceResponse setBody(UpdateSpaceModelInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSpaceModelInstanceResponseBody getBody() {
        return this.body;
    }

}
