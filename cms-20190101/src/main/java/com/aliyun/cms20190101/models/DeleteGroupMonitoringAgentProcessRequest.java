// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteGroupMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Id")
    public String id;

    public static DeleteGroupMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupMonitoringAgentProcessRequest self = new DeleteGroupMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupMonitoringAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteGroupMonitoringAgentProcessRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteGroupMonitoringAgentProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
