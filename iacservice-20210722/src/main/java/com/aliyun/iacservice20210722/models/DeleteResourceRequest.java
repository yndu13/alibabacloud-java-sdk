// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class DeleteResourceRequest extends TeaModel {
    @NameInMap("regionId")
    public String regionId;

    public static DeleteResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRequest self = new DeleteResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
