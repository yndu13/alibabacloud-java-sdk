// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOperateVulResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyOperateVulResponseBody body;

    public static ModifyOperateVulResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulResponse self = new ModifyOperateVulResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOperateVulResponse setBody(ModifyOperateVulResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOperateVulResponseBody getBody() {
        return this.body;
    }

}
