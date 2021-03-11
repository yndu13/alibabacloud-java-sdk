// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Id")
    public String id;

    @NameInMap("IncludeStats")
    public Boolean includeStats;

    public static DescribeGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupRequest self = new DescribeGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeGroupRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public DescribeGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeGroupRequest setIncludeStats(Boolean includeStats) {
        this.includeStats = includeStats;
        return this;
    }
    public Boolean getIncludeStats() {
        return this.includeStats;
    }

}
