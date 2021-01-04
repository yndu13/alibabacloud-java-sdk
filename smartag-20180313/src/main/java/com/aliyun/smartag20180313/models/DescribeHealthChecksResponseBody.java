// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeHealthChecksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("HealthChecks")
    public DescribeHealthChecksResponseBodyHealthChecks healthChecks;

    public static DescribeHealthChecksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthChecksResponseBody self = new DescribeHealthChecksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthChecksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeHealthChecksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHealthChecksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthChecksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHealthChecksResponseBody setHealthChecks(DescribeHealthChecksResponseBodyHealthChecks healthChecks) {
        this.healthChecks = healthChecks;
        return this;
    }
    public DescribeHealthChecksResponseBodyHealthChecks getHealthChecks() {
        return this.healthChecks;
    }

    public static class DescribeHealthChecksResponseBodyHealthChecksHealthCheck extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ProbeTimeout")
        public Integer probeTimeout;

        @NameInMap("Status")
        public String status;

        @NameInMap("DstIpAddr")
        public String dstIpAddr;

        @NameInMap("RelationCount")
        public Integer relationCount;

        @NameInMap("RttFailThreshold")
        public Integer rttFailThreshold;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("DstPort")
        public Integer dstPort;

        @NameInMap("FailCountThreshold")
        public Integer failCountThreshold;

        @NameInMap("RttThreshold")
        public Integer rttThreshold;

        @NameInMap("SrcPort")
        public Integer srcPort;

        @NameInMap("ProbeCount")
        public Integer probeCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("SrcIpAddr")
        public String srcIpAddr;

        @NameInMap("ProbeInterval")
        public Integer probeInterval;

        @NameInMap("Name")
        public String name;

        @NameInMap("HcInstanceId")
        public String hcInstanceId;

        public static DescribeHealthChecksResponseBodyHealthChecksHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthChecksResponseBodyHealthChecksHealthCheck self = new DescribeHealthChecksResponseBodyHealthChecksHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setProbeTimeout(Integer probeTimeout) {
            this.probeTimeout = probeTimeout;
            return this;
        }
        public Integer getProbeTimeout() {
            return this.probeTimeout;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setDstIpAddr(String dstIpAddr) {
            this.dstIpAddr = dstIpAddr;
            return this;
        }
        public String getDstIpAddr() {
            return this.dstIpAddr;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setRelationCount(Integer relationCount) {
            this.relationCount = relationCount;
            return this;
        }
        public Integer getRelationCount() {
            return this.relationCount;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setRttFailThreshold(Integer rttFailThreshold) {
            this.rttFailThreshold = rttFailThreshold;
            return this;
        }
        public Integer getRttFailThreshold() {
            return this.rttFailThreshold;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setDstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public Integer getDstPort() {
            return this.dstPort;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setFailCountThreshold(Integer failCountThreshold) {
            this.failCountThreshold = failCountThreshold;
            return this;
        }
        public Integer getFailCountThreshold() {
            return this.failCountThreshold;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setRttThreshold(Integer rttThreshold) {
            this.rttThreshold = rttThreshold;
            return this;
        }
        public Integer getRttThreshold() {
            return this.rttThreshold;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setSrcPort(Integer srcPort) {
            this.srcPort = srcPort;
            return this;
        }
        public Integer getSrcPort() {
            return this.srcPort;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setProbeCount(Integer probeCount) {
            this.probeCount = probeCount;
            return this;
        }
        public Integer getProbeCount() {
            return this.probeCount;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setSrcIpAddr(String srcIpAddr) {
            this.srcIpAddr = srcIpAddr;
            return this;
        }
        public String getSrcIpAddr() {
            return this.srcIpAddr;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setProbeInterval(Integer probeInterval) {
            this.probeInterval = probeInterval;
            return this;
        }
        public Integer getProbeInterval() {
            return this.probeInterval;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHealthChecksResponseBodyHealthChecksHealthCheck setHcInstanceId(String hcInstanceId) {
            this.hcInstanceId = hcInstanceId;
            return this;
        }
        public String getHcInstanceId() {
            return this.hcInstanceId;
        }

    }

    public static class DescribeHealthChecksResponseBodyHealthChecks extends TeaModel {
        @NameInMap("HealthCheck")
        public java.util.List<DescribeHealthChecksResponseBodyHealthChecksHealthCheck> healthCheck;

        public static DescribeHealthChecksResponseBodyHealthChecks build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthChecksResponseBodyHealthChecks self = new DescribeHealthChecksResponseBodyHealthChecks();
            return TeaModel.build(map, self);
        }

        public DescribeHealthChecksResponseBodyHealthChecks setHealthCheck(java.util.List<DescribeHealthChecksResponseBodyHealthChecksHealthCheck> healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public java.util.List<DescribeHealthChecksResponseBodyHealthChecksHealthCheck> getHealthCheck() {
            return this.healthCheck;
        }

    }

}
