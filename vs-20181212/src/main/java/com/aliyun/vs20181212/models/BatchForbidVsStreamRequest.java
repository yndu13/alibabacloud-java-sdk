// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchForbidVsStreamRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Channel")
    public String channel;

    @NameInMap("LiveStreamType")
    public String liveStreamType;

    @NameInMap("Oneshot")
    public String oneshot;

    @NameInMap("ControlStreamAction")
    public String controlStreamAction;

    @NameInMap("ResumeTime")
    public String resumeTime;

    public static BatchForbidVsStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchForbidVsStreamRequest self = new BatchForbidVsStreamRequest();
        return TeaModel.build(map, self);
    }

    public BatchForbidVsStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchForbidVsStreamRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public BatchForbidVsStreamRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public BatchForbidVsStreamRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public BatchForbidVsStreamRequest setLiveStreamType(String liveStreamType) {
        this.liveStreamType = liveStreamType;
        return this;
    }
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    public BatchForbidVsStreamRequest setOneshot(String oneshot) {
        this.oneshot = oneshot;
        return this;
    }
    public String getOneshot() {
        return this.oneshot;
    }

    public BatchForbidVsStreamRequest setControlStreamAction(String controlStreamAction) {
        this.controlStreamAction = controlStreamAction;
        return this;
    }
    public String getControlStreamAction() {
        return this.controlStreamAction;
    }

    public BatchForbidVsStreamRequest setResumeTime(String resumeTime) {
        this.resumeTime = resumeTime;
        return this;
    }
    public String getResumeTime() {
        return this.resumeTime;
    }

}
