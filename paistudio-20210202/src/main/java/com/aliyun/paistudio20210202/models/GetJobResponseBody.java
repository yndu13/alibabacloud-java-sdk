// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Snapshot")
    public String snapshot;

    @NameInMap("ExecuteType")
    public String executeType;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("RunInfo")
    public String runInfo;

    @NameInMap("RunId")
    public String runId;

    @NameInMap("PaiflowNodeId")
    public String paiflowNodeId;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Status")
    public String status;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("Arguments")
    public String arguments;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetJobResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetJobResponseBody setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public String getSnapshot() {
        return this.snapshot;
    }

    public GetJobResponseBody setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public GetJobResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetJobResponseBody setRunInfo(String runInfo) {
        this.runInfo = runInfo;
        return this;
    }
    public String getRunInfo() {
        return this.runInfo;
    }

    public GetJobResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public GetJobResponseBody setPaiflowNodeId(String paiflowNodeId) {
        this.paiflowNodeId = paiflowNodeId;
        return this;
    }
    public String getPaiflowNodeId() {
        return this.paiflowNodeId;
    }

    public GetJobResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetJobResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetJobResponseBody setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

}
