// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PublishKnowledgeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PublishKnowledgeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishKnowledgeResponseBody self = new PublishKnowledgeResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishKnowledgeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
