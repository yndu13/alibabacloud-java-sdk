// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class VerifyMaterialResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public VerifyMaterialResponseResultObject resultObject;

    public static VerifyMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyMaterialResponse self = new VerifyMaterialResponse();
        return TeaModel.build(map, self);
    }

    public VerifyMaterialResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyMaterialResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyMaterialResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyMaterialResponse setResultObject(VerifyMaterialResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public VerifyMaterialResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class VerifyMaterialResponseResultObjectMaterialIdCardInfo extends TeaModel {
        @NameInMap("Number")
        @Validation(required = true)
        public String number;

        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Nationality")
        @Validation(required = true)
        public String nationality;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("FrontImageUrl")
        @Validation(required = true)
        public String frontImageUrl;

        @NameInMap("Authority")
        @Validation(required = true)
        public String authority;

        @NameInMap("Sex")
        @Validation(required = true)
        public String sex;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Birth")
        @Validation(required = true)
        public String birth;

        @NameInMap("BackImageUrl")
        @Validation(required = true)
        public String backImageUrl;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        public static VerifyMaterialResponseResultObjectMaterialIdCardInfo build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseResultObjectMaterialIdCardInfo self = new VerifyMaterialResponseResultObjectMaterialIdCardInfo();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setFrontImageUrl(String frontImageUrl) {
            this.frontImageUrl = frontImageUrl;
            return this;
        }
        public String getFrontImageUrl() {
            return this.frontImageUrl;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setAuthority(String authority) {
            this.authority = authority;
            return this;
        }
        public String getAuthority() {
            return this.authority;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setBirth(String birth) {
            this.birth = birth;
            return this;
        }
        public String getBirth() {
            return this.birth;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setBackImageUrl(String backImageUrl) {
            this.backImageUrl = backImageUrl;
            return this;
        }
        public String getBackImageUrl() {
            return this.backImageUrl;
        }

        public VerifyMaterialResponseResultObjectMaterialIdCardInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

    }

    public static class VerifyMaterialResponseResultObjectMaterial extends TeaModel {
        @NameInMap("FaceImageUrl")
        @Validation(required = true)
        public String faceImageUrl;

        @NameInMap("IdCardName")
        @Validation(required = true)
        public String idCardName;

        @NameInMap("IdCardNumber")
        @Validation(required = true)
        public String idCardNumber;

        @NameInMap("FaceQuality")
        @Validation(required = true)
        public String faceQuality;

        @NameInMap("FaceGlobalUrl")
        @Validation(required = true)
        public String faceGlobalUrl;

        @NameInMap("FaceMask")
        @Validation(required = true)
        public String faceMask;

        @NameInMap("IdCardInfo")
        @Validation(required = true)
        public VerifyMaterialResponseResultObjectMaterialIdCardInfo idCardInfo;

        public static VerifyMaterialResponseResultObjectMaterial build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseResultObjectMaterial self = new VerifyMaterialResponseResultObjectMaterial();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseResultObjectMaterial setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public VerifyMaterialResponseResultObjectMaterial setIdCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }
        public String getIdCardName() {
            return this.idCardName;
        }

        public VerifyMaterialResponseResultObjectMaterial setIdCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }
        public String getIdCardNumber() {
            return this.idCardNumber;
        }

        public VerifyMaterialResponseResultObjectMaterial setFaceQuality(String faceQuality) {
            this.faceQuality = faceQuality;
            return this;
        }
        public String getFaceQuality() {
            return this.faceQuality;
        }

        public VerifyMaterialResponseResultObjectMaterial setFaceGlobalUrl(String faceGlobalUrl) {
            this.faceGlobalUrl = faceGlobalUrl;
            return this;
        }
        public String getFaceGlobalUrl() {
            return this.faceGlobalUrl;
        }

        public VerifyMaterialResponseResultObjectMaterial setFaceMask(String faceMask) {
            this.faceMask = faceMask;
            return this;
        }
        public String getFaceMask() {
            return this.faceMask;
        }

        public VerifyMaterialResponseResultObjectMaterial setIdCardInfo(VerifyMaterialResponseResultObjectMaterialIdCardInfo idCardInfo) {
            this.idCardInfo = idCardInfo;
            return this;
        }
        public VerifyMaterialResponseResultObjectMaterialIdCardInfo getIdCardInfo() {
            return this.idCardInfo;
        }

    }

    public static class VerifyMaterialResponseResultObject extends TeaModel {
        @NameInMap("VerifyToken")
        @Validation(required = true)
        public String verifyToken;

        @NameInMap("VerifyStatus")
        @Validation(required = true)
        public Integer verifyStatus;

        @NameInMap("AuthorityComparisionScore")
        @Validation(required = true)
        public Float authorityComparisionScore;

        @NameInMap("IdCardFaceComparisonScore")
        @Validation(required = true)
        public Float idCardFaceComparisonScore;

        @NameInMap("Material")
        @Validation(required = true)
        public VerifyMaterialResponseResultObjectMaterial material;

        public static VerifyMaterialResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            VerifyMaterialResponseResultObject self = new VerifyMaterialResponseResultObject();
            return TeaModel.build(map, self);
        }

        public VerifyMaterialResponseResultObject setVerifyToken(String verifyToken) {
            this.verifyToken = verifyToken;
            return this;
        }
        public String getVerifyToken() {
            return this.verifyToken;
        }

        public VerifyMaterialResponseResultObject setVerifyStatus(Integer verifyStatus) {
            this.verifyStatus = verifyStatus;
            return this;
        }
        public Integer getVerifyStatus() {
            return this.verifyStatus;
        }

        public VerifyMaterialResponseResultObject setAuthorityComparisionScore(Float authorityComparisionScore) {
            this.authorityComparisionScore = authorityComparisionScore;
            return this;
        }
        public Float getAuthorityComparisionScore() {
            return this.authorityComparisionScore;
        }

        public VerifyMaterialResponseResultObject setIdCardFaceComparisonScore(Float idCardFaceComparisonScore) {
            this.idCardFaceComparisonScore = idCardFaceComparisonScore;
            return this;
        }
        public Float getIdCardFaceComparisonScore() {
            return this.idCardFaceComparisonScore;
        }

        public VerifyMaterialResponseResultObject setMaterial(VerifyMaterialResponseResultObjectMaterial material) {
            this.material = material;
            return this;
        }
        public VerifyMaterialResponseResultObjectMaterial getMaterial() {
            return this.material;
        }

    }

}