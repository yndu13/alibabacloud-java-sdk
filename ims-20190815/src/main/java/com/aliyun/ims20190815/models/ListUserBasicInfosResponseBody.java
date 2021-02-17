// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListUserBasicInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("UserBasicInfos")
    public ListUserBasicInfosResponseBodyUserBasicInfos userBasicInfos;

    @NameInMap("Marker")
    public String marker;

    public static ListUserBasicInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserBasicInfosResponseBody self = new ListUserBasicInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserBasicInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserBasicInfosResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUserBasicInfosResponseBody setUserBasicInfos(ListUserBasicInfosResponseBodyUserBasicInfos userBasicInfos) {
        this.userBasicInfos = userBasicInfos;
        return this;
    }
    public ListUserBasicInfosResponseBodyUserBasicInfos getUserBasicInfos() {
        return this.userBasicInfos;
    }

    public ListUserBasicInfosResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public static class ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo extends TeaModel {
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UserId")
        public String userId;

        public static ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo self = new ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListUserBasicInfosResponseBodyUserBasicInfos extends TeaModel {
        @NameInMap("UserBasicInfo")
        public java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> userBasicInfo;

        public static ListUserBasicInfosResponseBodyUserBasicInfos build(java.util.Map<String, ?> map) throws Exception {
            ListUserBasicInfosResponseBodyUserBasicInfos self = new ListUserBasicInfosResponseBodyUserBasicInfos();
            return TeaModel.build(map, self);
        }

        public ListUserBasicInfosResponseBodyUserBasicInfos setUserBasicInfo(java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> userBasicInfo) {
            this.userBasicInfo = userBasicInfo;
            return this;
        }
        public java.util.List<ListUserBasicInfosResponseBodyUserBasicInfosUserBasicInfo> getUserBasicInfo() {
            return this.userBasicInfo;
        }

    }

}