// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GotoPresetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Id")
    public String id;

    public static GotoPresetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GotoPresetResponseBody self = new GotoPresetResponseBody();
        return TeaModel.build(map, self);
    }

    public GotoPresetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GotoPresetResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}