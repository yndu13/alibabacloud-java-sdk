// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryAddressResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DivisionAddress")
    public QueryAddressResponseBodyDivisionAddress divisionAddress;

    @NameInMap("Code")
    public String code;

    public static QueryAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAddressResponseBody self = new QueryAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAddressResponseBody setDivisionAddress(QueryAddressResponseBodyDivisionAddress divisionAddress) {
        this.divisionAddress = divisionAddress;
        return this;
    }
    public QueryAddressResponseBodyDivisionAddress getDivisionAddress() {
        return this.divisionAddress;
    }

    public QueryAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class QueryAddressResponseBodyDivisionAddressDivisionAddress extends TeaModel {
        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("DivisionCode")
        public Long divisionCode;

        @NameInMap("DivisionName")
        public String divisionName;

        @NameInMap("DivisionLevel")
        public Integer divisionLevel;

        public static QueryAddressResponseBodyDivisionAddressDivisionAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressResponseBodyDivisionAddressDivisionAddress self = new QueryAddressResponseBodyDivisionAddressDivisionAddress();
            return TeaModel.build(map, self);
        }

        public QueryAddressResponseBodyDivisionAddressDivisionAddress setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryAddressResponseBodyDivisionAddressDivisionAddress setDivisionCode(Long divisionCode) {
            this.divisionCode = divisionCode;
            return this;
        }
        public Long getDivisionCode() {
            return this.divisionCode;
        }

        public QueryAddressResponseBodyDivisionAddressDivisionAddress setDivisionName(String divisionName) {
            this.divisionName = divisionName;
            return this;
        }
        public String getDivisionName() {
            return this.divisionName;
        }

        public QueryAddressResponseBodyDivisionAddressDivisionAddress setDivisionLevel(Integer divisionLevel) {
            this.divisionLevel = divisionLevel;
            return this;
        }
        public Integer getDivisionLevel() {
            return this.divisionLevel;
        }

    }

    public static class QueryAddressResponseBodyDivisionAddress extends TeaModel {
        @NameInMap("DivisionAddress")
        public java.util.List<QueryAddressResponseBodyDivisionAddressDivisionAddress> divisionAddress;

        public static QueryAddressResponseBodyDivisionAddress build(java.util.Map<String, ?> map) throws Exception {
            QueryAddressResponseBodyDivisionAddress self = new QueryAddressResponseBodyDivisionAddress();
            return TeaModel.build(map, self);
        }

        public QueryAddressResponseBodyDivisionAddress setDivisionAddress(java.util.List<QueryAddressResponseBodyDivisionAddressDivisionAddress> divisionAddress) {
            this.divisionAddress = divisionAddress;
            return this;
        }
        public java.util.List<QueryAddressResponseBodyDivisionAddressDivisionAddress> getDivisionAddress() {
            return this.divisionAddress;
        }

    }

}