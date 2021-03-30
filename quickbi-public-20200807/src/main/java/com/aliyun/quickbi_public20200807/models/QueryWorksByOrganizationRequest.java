// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class QueryWorksByOrganizationRequest extends TeaModel {
    @NameInMap("WorksType")
    public String worksType;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("ThirdPartAuthFlag")
    public Integer thirdPartAuthFlag;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryWorksByOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorksByOrganizationRequest self = new QueryWorksByOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorksByOrganizationRequest setWorksType(String worksType) {
        this.worksType = worksType;
        return this;
    }
    public String getWorksType() {
        return this.worksType;
    }

    public QueryWorksByOrganizationRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryWorksByOrganizationRequest setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
        this.thirdPartAuthFlag = thirdPartAuthFlag;
        return this;
    }
    public Integer getThirdPartAuthFlag() {
        return this.thirdPartAuthFlag;
    }

    public QueryWorksByOrganizationRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryWorksByOrganizationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
