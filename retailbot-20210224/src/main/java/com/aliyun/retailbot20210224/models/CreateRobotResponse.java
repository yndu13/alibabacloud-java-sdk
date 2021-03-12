// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRobotResponseBody body;

    public static CreateRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRobotResponse self = new CreateRobotResponse();
        return TeaModel.build(map, self);
    }

    public CreateRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRobotResponse setBody(CreateRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRobotResponseBody getBody() {
        return this.body;
    }

}
