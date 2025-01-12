// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class PromoteResourceAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Account")
    public PromoteResourceAccountResponseBodyAccount account;

    public static PromoteResourceAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PromoteResourceAccountResponseBody self = new PromoteResourceAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public PromoteResourceAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PromoteResourceAccountResponseBody setAccount(PromoteResourceAccountResponseBodyAccount account) {
        this.account = account;
        return this;
    }
    public PromoteResourceAccountResponseBodyAccount getAccount() {
        return this.account;
    }

    public static class PromoteResourceAccountResponseBodyAccount extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("ResourceDirectoryId")
        public String resourceDirectoryId;

        @NameInMap("RecordId")
        public String recordId;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("JoinMethod")
        public String joinMethod;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static PromoteResourceAccountResponseBodyAccount build(java.util.Map<String, ?> map) throws Exception {
            PromoteResourceAccountResponseBodyAccount self = new PromoteResourceAccountResponseBodyAccount();
            return TeaModel.build(map, self);
        }

        public PromoteResourceAccountResponseBodyAccount setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PromoteResourceAccountResponseBodyAccount setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PromoteResourceAccountResponseBodyAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public PromoteResourceAccountResponseBodyAccount setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public PromoteResourceAccountResponseBodyAccount setResourceDirectoryId(String resourceDirectoryId) {
            this.resourceDirectoryId = resourceDirectoryId;
            return this;
        }
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        public PromoteResourceAccountResponseBodyAccount setRecordId(String recordId) {
            this.recordId = recordId;
            return this;
        }
        public String getRecordId() {
            return this.recordId;
        }

        public PromoteResourceAccountResponseBodyAccount setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public PromoteResourceAccountResponseBodyAccount setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public PromoteResourceAccountResponseBodyAccount setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
            return this;
        }
        public String getJoinMethod() {
            return this.joinMethod;
        }

        public PromoteResourceAccountResponseBodyAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public PromoteResourceAccountResponseBodyAccount setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

    }

}
