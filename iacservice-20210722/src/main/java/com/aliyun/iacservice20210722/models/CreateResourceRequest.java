// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
