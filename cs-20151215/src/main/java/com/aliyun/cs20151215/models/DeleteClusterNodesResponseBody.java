// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodesResponseBody extends TeaModel {
    // 集群ID
    @NameInMap("cluster_id")
    public String clusterId;

    // 请求ID
    @NameInMap("request_id")
    public String requestId;

    // 任务ID
    @NameInMap("task_id")
    public String taskId;

    public static DeleteClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodesResponseBody self = new DeleteClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodesResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteClusterNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteClusterNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
