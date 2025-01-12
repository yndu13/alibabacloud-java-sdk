// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDirectorySsoStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DirectoryId")
    public String directoryId;

    public static GetDirectorySsoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDirectorySsoStatusRequest self = new GetDirectorySsoStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDirectorySsoStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDirectorySsoStatusRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
