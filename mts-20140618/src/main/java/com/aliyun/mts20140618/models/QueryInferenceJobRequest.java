// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInferenceJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static QueryInferenceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInferenceJobRequest self = new QueryInferenceJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryInferenceJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
