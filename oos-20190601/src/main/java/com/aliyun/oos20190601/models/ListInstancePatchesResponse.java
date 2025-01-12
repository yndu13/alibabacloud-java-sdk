// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstancePatchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstancePatchesResponseBody body;

    public static ListInstancePatchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePatchesResponse self = new ListInstancePatchesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancePatchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancePatchesResponse setBody(ListInstancePatchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancePatchesResponseBody getBody() {
        return this.body;
    }

}
