// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDmsBindingTemplateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDmsBindingTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDmsBindingTemplateRequest self = new GetDmsBindingTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetDmsBindingTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}