// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorAgentProcessRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProcessUser")
    public String processUser;

    public static CreateMonitorAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorAgentProcessRequest self = new CreateMonitorAgentProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorAgentProcessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMonitorAgentProcessRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public CreateMonitorAgentProcessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMonitorAgentProcessRequest setProcessUser(String processUser) {
        this.processUser = processUser;
        return this;
    }
    public String getProcessUser() {
        return this.processUser;
    }

}
