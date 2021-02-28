// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeCoreWordResponseBody extends TeaModel {
    @NameInMap("CoreWordName")
    public String coreWordName;

    @NameInMap("Synonyms")
    public java.util.List<String> synonyms;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CoreWordCode")
    public String coreWordCode;

    public static DescribeCoreWordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCoreWordResponseBody self = new DescribeCoreWordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCoreWordResponseBody setCoreWordName(String coreWordName) {
        this.coreWordName = coreWordName;
        return this;
    }
    public String getCoreWordName() {
        return this.coreWordName;
    }

    public DescribeCoreWordResponseBody setSynonyms(java.util.List<String> synonyms) {
        this.synonyms = synonyms;
        return this;
    }
    public java.util.List<String> getSynonyms() {
        return this.synonyms;
    }

    public DescribeCoreWordResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeCoreWordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCoreWordResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeCoreWordResponseBody setCoreWordCode(String coreWordCode) {
        this.coreWordCode = coreWordCode;
        return this;
    }
    public String getCoreWordCode() {
        return this.coreWordCode;
    }

}
