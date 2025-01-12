// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs_ops20210721.models;

import com.aliyun.tea.*;

public class OperateResourceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Data")
    public String data;

    public static OperateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateResourceRequest self = new OperateResourceRequest();
        return TeaModel.build(map, self);
    }

    public OperateResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OperateResourceRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
