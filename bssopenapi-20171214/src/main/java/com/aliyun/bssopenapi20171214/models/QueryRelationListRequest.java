// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRelationListRequest extends TeaModel {
    @NameInMap("UserId")
    @Validation(required = true)
    public Long userId;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryRelationListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationListRequest self = new QueryRelationListRequest();
        return TeaModel.build(map, self);
    }

    public QueryRelationListRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public QueryRelationListRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public QueryRelationListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryRelationListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}