// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeReplicaSetRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReplicaSetRoleResponseBody body;

    public static DescribeReplicaSetRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicaSetRoleResponse self = new DescribeReplicaSetRoleResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicaSetRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicaSetRoleResponse setBody(DescribeReplicaSetRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicaSetRoleResponseBody getBody() {
        return this.body;
    }

}
