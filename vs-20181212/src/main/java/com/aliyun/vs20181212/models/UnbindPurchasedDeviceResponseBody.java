// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindPurchasedDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindPurchasedDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindPurchasedDeviceResponseBody self = new UnbindPurchasedDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindPurchasedDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
