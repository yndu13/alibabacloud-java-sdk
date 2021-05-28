// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class SearchRetcodeAppByPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageBean")
    public SearchRetcodeAppByPageResponseBodyPageBean pageBean;

    public static SearchRetcodeAppByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchRetcodeAppByPageResponseBody self = new SearchRetcodeAppByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchRetcodeAppByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchRetcodeAppByPageResponseBody setPageBean(SearchRetcodeAppByPageResponseBodyPageBean pageBean) {
        this.pageBean = pageBean;
        return this;
    }
    public SearchRetcodeAppByPageResponseBodyPageBean getPageBean() {
        return this.pageBean;
    }

    public static class SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AppId")
        public Long appId;

        @NameInMap("Pid")
        public String pid;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("RegionId")
        public String regionId;

        public static SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps build(java.util.Map<String, ?> map) throws Exception {
            SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps self = new SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps();
            return TeaModel.build(map, self);
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class SearchRetcodeAppByPageResponseBodyPageBean extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("RetcodeApps")
        public java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps> retcodeApps;

        public static SearchRetcodeAppByPageResponseBodyPageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchRetcodeAppByPageResponseBodyPageBean self = new SearchRetcodeAppByPageResponseBodyPageBean();
            return TeaModel.build(map, self);
        }

        public SearchRetcodeAppByPageResponseBodyPageBean setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public SearchRetcodeAppByPageResponseBodyPageBean setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SearchRetcodeAppByPageResponseBodyPageBean setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SearchRetcodeAppByPageResponseBodyPageBean setRetcodeApps(java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps> retcodeApps) {
            this.retcodeApps = retcodeApps;
            return this;
        }
        public java.util.List<SearchRetcodeAppByPageResponseBodyPageBeanRetcodeApps> getRetcodeApps() {
            return this.retcodeApps;
        }

    }

}
