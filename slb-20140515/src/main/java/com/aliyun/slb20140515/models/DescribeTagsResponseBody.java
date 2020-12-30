// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeTagsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TagSets")
    public DescribeTagsResponseBodyTagSets tagSets;

    public static DescribeTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsResponseBody self = new DescribeTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagsResponseBody setTagSets(DescribeTagsResponseBodyTagSets tagSets) {
        this.tagSets = tagSets;
        return this;
    }
    public DescribeTagsResponseBodyTagSets getTagSets() {
        return this.tagSets;
    }

    public static class DescribeTagsResponseBodyTagSetsTagSet extends TeaModel {
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeTagsResponseBodyTagSetsTagSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagSetsTagSet self = new DescribeTagsResponseBodyTagSetsTagSet();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagSetsTagSet setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeTagsResponseBodyTagSetsTagSet setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeTagsResponseBodyTagSetsTagSet setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeTagsResponseBodyTagSets extends TeaModel {
        @NameInMap("TagSet")
        public java.util.List<DescribeTagsResponseBodyTagSetsTagSet> tagSet;

        public static DescribeTagsResponseBodyTagSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsResponseBodyTagSets self = new DescribeTagsResponseBodyTagSets();
            return TeaModel.build(map, self);
        }

        public DescribeTagsResponseBodyTagSets setTagSet(java.util.List<DescribeTagsResponseBodyTagSetsTagSet> tagSet) {
            this.tagSet = tagSet;
            return this;
        }
        public java.util.List<DescribeTagsResponseBodyTagSetsTagSet> getTagSet() {
            return this.tagSet;
        }

    }

}
