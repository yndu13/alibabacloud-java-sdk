// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateConfigurationVariateRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源一级ID
    @NameInMap("ConfigurationVariateId")
    public String configurationVariateId;

    // 变量名字
    @NameInMap("VariateName")
    public String variateName;

    // 描述变量
    @NameInMap("Comment")
    public String comment;

    // python转换函数
    @NameInMap("FormatFunction")
    public String formatFunction;

    public static UpdateConfigurationVariateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationVariateRequest self = new UpdateConfigurationVariateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationVariateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateConfigurationVariateRequest setConfigurationVariateId(String configurationVariateId) {
        this.configurationVariateId = configurationVariateId;
        return this;
    }
    public String getConfigurationVariateId() {
        return this.configurationVariateId;
    }

    public UpdateConfigurationVariateRequest setVariateName(String variateName) {
        this.variateName = variateName;
        return this;
    }
    public String getVariateName() {
        return this.variateName;
    }

    public UpdateConfigurationVariateRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateConfigurationVariateRequest setFormatFunction(String formatFunction) {
        this.formatFunction = formatFunction;
        return this;
    }
    public String getFormatFunction() {
        return this.formatFunction;
    }

}
