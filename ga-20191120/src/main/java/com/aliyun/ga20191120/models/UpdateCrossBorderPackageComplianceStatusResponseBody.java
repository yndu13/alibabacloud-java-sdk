// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCrossBorderPackageComplianceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCrossBorderPackageComplianceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossBorderPackageComplianceStatusResponseBody self = new UpdateCrossBorderPackageComplianceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCrossBorderPackageComplianceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
