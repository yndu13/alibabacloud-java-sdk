// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 创建 UTC 时间，日期格式 iso8601
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 创建 UTC 时间，日期格式 iso8601
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 镜像名称
    @NameInMap("Name")
    public String name;

    // 描述
    @NameInMap("Description")
    public String description;

    // 镜像地址，包含版本号
    @NameInMap("ImageUri")
    public String imageUri;

    // 创建人
    @NameInMap("OperatorCreate")
    public String operatorCreate;

    // 创建人父账户
    @NameInMap("ParentOperatorCreate")
    public String parentOperatorCreate;

    // 镜像标签
    @NameInMap("Labels")
    public java.util.List<GetImageResponseBodyLabels> labels;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetImageResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetImageResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetImageResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetImageResponseBody setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public GetImageResponseBody setOperatorCreate(String operatorCreate) {
        this.operatorCreate = operatorCreate;
        return this;
    }
    public String getOperatorCreate() {
        return this.operatorCreate;
    }

    public GetImageResponseBody setParentOperatorCreate(String parentOperatorCreate) {
        this.parentOperatorCreate = parentOperatorCreate;
        return this;
    }
    public String getParentOperatorCreate() {
        return this.parentOperatorCreate;
    }

    public GetImageResponseBody setLabels(java.util.List<GetImageResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetImageResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public static class GetImageResponseBodyLabels extends TeaModel {
        // Key
        @NameInMap("Key")
        public String key;

        // Value
        @NameInMap("Value")
        public String value;

        public static GetImageResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyLabels self = new GetImageResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetImageResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
