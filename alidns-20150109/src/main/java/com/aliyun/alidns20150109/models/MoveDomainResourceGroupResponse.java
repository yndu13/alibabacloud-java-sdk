// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveDomainResourceGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static MoveDomainResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveDomainResourceGroupResponse self = new MoveDomainResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public MoveDomainResourceGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
