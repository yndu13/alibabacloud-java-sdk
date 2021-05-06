// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class CreateSchedruleOnDemandRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("RuleName")
    @Validation(required = true)
    public String ruleName;

    @NameInMap("RuleConditionMbps")
    @Validation(required = true)
    public String ruleConditionMbps;

    @NameInMap("RuleConditionKpps")
    @Validation(required = true)
    public String ruleConditionKpps;

    @NameInMap("RuleConditionCnt")
    @Validation(required = true)
    public String ruleConditionCnt;

    @NameInMap("RuleAction")
    @Validation(required = true)
    public String ruleAction;

    @NameInMap("RuleSwitch")
    @Validation(required = true)
    public String ruleSwitch;

    @NameInMap("RuleUndoMode")
    @Validation(required = true)
    public String ruleUndoMode;

    @NameInMap("RuleUndoBeginTime")
    @Validation(required = true)
    public String ruleUndoBeginTime;

    @NameInMap("RuleUndoEndTime")
    public String ruleUndoEndTime;

    @NameInMap("TimeZone")
    @Validation(required = true)
    public String timeZone;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateSchedruleOnDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedruleOnDemandRequest self = new CreateSchedruleOnDemandRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchedruleOnDemandRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSchedruleOnDemandRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateSchedruleOnDemandRequest setRuleConditionMbps(String ruleConditionMbps) {
        this.ruleConditionMbps = ruleConditionMbps;
        return this;
    }
    public String getRuleConditionMbps() {
        return this.ruleConditionMbps;
    }

    public CreateSchedruleOnDemandRequest setRuleConditionKpps(String ruleConditionKpps) {
        this.ruleConditionKpps = ruleConditionKpps;
        return this;
    }
    public String getRuleConditionKpps() {
        return this.ruleConditionKpps;
    }

    public CreateSchedruleOnDemandRequest setRuleConditionCnt(String ruleConditionCnt) {
        this.ruleConditionCnt = ruleConditionCnt;
        return this;
    }
    public String getRuleConditionCnt() {
        return this.ruleConditionCnt;
    }

    public CreateSchedruleOnDemandRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public CreateSchedruleOnDemandRequest setRuleSwitch(String ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public String getRuleSwitch() {
        return this.ruleSwitch;
    }

    public CreateSchedruleOnDemandRequest setRuleUndoMode(String ruleUndoMode) {
        this.ruleUndoMode = ruleUndoMode;
        return this;
    }
    public String getRuleUndoMode() {
        return this.ruleUndoMode;
    }

    public CreateSchedruleOnDemandRequest setRuleUndoBeginTime(String ruleUndoBeginTime) {
        this.ruleUndoBeginTime = ruleUndoBeginTime;
        return this;
    }
    public String getRuleUndoBeginTime() {
        return this.ruleUndoBeginTime;
    }

    public CreateSchedruleOnDemandRequest setRuleUndoEndTime(String ruleUndoEndTime) {
        this.ruleUndoEndTime = ruleUndoEndTime;
        return this;
    }
    public String getRuleUndoEndTime() {
        return this.ruleUndoEndTime;
    }

    public CreateSchedruleOnDemandRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreateSchedruleOnDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
