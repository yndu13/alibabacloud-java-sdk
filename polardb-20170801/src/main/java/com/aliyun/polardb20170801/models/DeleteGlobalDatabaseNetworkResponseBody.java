// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteGlobalDatabaseNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteGlobalDatabaseNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalDatabaseNetworkResponseBody self = new DeleteGlobalDatabaseNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalDatabaseNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
