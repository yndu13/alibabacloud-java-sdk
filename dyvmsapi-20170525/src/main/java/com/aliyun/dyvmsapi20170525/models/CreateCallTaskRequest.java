// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateCallTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Data")
    public String data;

    @NameInMap("FireTime")
    public String fireTime;

    @NameInMap("StopTime")
    public String stopTime;

    @NameInMap("ScheduleType")
    public String scheduleType;

    public static CreateCallTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCallTaskRequest self = new CreateCallTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateCallTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCallTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCallTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCallTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateCallTaskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateCallTaskRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateCallTaskRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateCallTaskRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateCallTaskRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateCallTaskRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateCallTaskRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateCallTaskRequest setFireTime(String fireTime) {
        this.fireTime = fireTime;
        return this;
    }
    public String getFireTime() {
        return this.fireTime;
    }

    public CreateCallTaskRequest setStopTime(String stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public String getStopTime() {
        return this.stopTime;
    }

    public CreateCallTaskRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

}
