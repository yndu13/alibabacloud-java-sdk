// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddDnatEntryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DnatEntryId")
    public String dnatEntryId;

    public static AddDnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDnatEntryResponseBody self = new AddDnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDnatEntryResponseBody setDnatEntryId(String dnatEntryId) {
        this.dnatEntryId = dnatEntryId;
        return this;
    }
    public String getDnatEntryId() {
        return this.dnatEntryId;
    }

}
