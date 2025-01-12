// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("NewAssumeRolePolicyDocument")
    public String newAssumeRolePolicyDocument;

    @NameInMap("NewMaxSessionDuration")
    public Long newMaxSessionDuration;

    @NameInMap("NewDescription")
    public String newDescription;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public UpdateRoleRequest setNewAssumeRolePolicyDocument(String newAssumeRolePolicyDocument) {
        this.newAssumeRolePolicyDocument = newAssumeRolePolicyDocument;
        return this;
    }
    public String getNewAssumeRolePolicyDocument() {
        return this.newAssumeRolePolicyDocument;
    }

    public UpdateRoleRequest setNewMaxSessionDuration(Long newMaxSessionDuration) {
        this.newMaxSessionDuration = newMaxSessionDuration;
        return this;
    }
    public Long getNewMaxSessionDuration() {
        return this.newMaxSessionDuration;
    }

    public UpdateRoleRequest setNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }
    public String getNewDescription() {
        return this.newDescription;
    }

}
