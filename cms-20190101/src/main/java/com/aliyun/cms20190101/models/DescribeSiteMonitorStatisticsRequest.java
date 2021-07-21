// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorStatisticsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TimeRange")
    public String timeRange;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("MetricName")
    public String metricName;

    public static DescribeSiteMonitorStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorStatisticsRequest self = new DescribeSiteMonitorStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSiteMonitorStatisticsRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeSiteMonitorStatisticsRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

    public DescribeSiteMonitorStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSiteMonitorStatisticsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

}
