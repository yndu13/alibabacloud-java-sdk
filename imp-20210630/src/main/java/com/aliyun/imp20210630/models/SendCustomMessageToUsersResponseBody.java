// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class SendCustomMessageToUsersResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // API请求的返回结果结构体。
    @NameInMap("Result")
    public SendCustomMessageToUsersResponseBodyResult result;

    public static SendCustomMessageToUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendCustomMessageToUsersResponseBody self = new SendCustomMessageToUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public SendCustomMessageToUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendCustomMessageToUsersResponseBody setResult(SendCustomMessageToUsersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SendCustomMessageToUsersResponseBodyResult getResult() {
        return this.result;
    }

    public static class SendCustomMessageToUsersResponseBodyResult extends TeaModel {
        // 消息的唯一ID标识。由数字、大小写字母组成，长度不超过20。
        @NameInMap("MessageId")
        public String messageId;

        public static SendCustomMessageToUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SendCustomMessageToUsersResponseBodyResult self = new SendCustomMessageToUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SendCustomMessageToUsersResponseBodyResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
