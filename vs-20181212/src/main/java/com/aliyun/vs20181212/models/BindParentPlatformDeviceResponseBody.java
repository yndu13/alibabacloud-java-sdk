// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindParentPlatformDeviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BindParentPlatformDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindParentPlatformDeviceResponseBody self = new BindParentPlatformDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BindParentPlatformDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
