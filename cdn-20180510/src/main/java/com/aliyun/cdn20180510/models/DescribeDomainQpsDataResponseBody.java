// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainQpsDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("DataInterval")
    public String dataInterval;

    @NameInMap("QpsDataInterval")
    public DescribeDomainQpsDataResponseBodyQpsDataInterval qpsDataInterval;

    public static DescribeDomainQpsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainQpsDataResponseBody self = new DescribeDomainQpsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainQpsDataResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDomainQpsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainQpsDataResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainQpsDataResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDomainQpsDataResponseBody setDataInterval(String dataInterval) {
        this.dataInterval = dataInterval;
        return this;
    }
    public String getDataInterval() {
        return this.dataInterval;
    }

    public DescribeDomainQpsDataResponseBody setQpsDataInterval(DescribeDomainQpsDataResponseBodyQpsDataInterval qpsDataInterval) {
        this.qpsDataInterval = qpsDataInterval;
        return this;
    }
    public DescribeDomainQpsDataResponseBodyQpsDataInterval getQpsDataInterval() {
        return this.qpsDataInterval;
    }

    public static class DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule extends TeaModel {
        @NameInMap("AccValue")
        public String accValue;

        @NameInMap("AccDomesticValue")
        public String accDomesticValue;

        @NameInMap("HttpsValue")
        public String httpsValue;

        @NameInMap("AccOverseasValue")
        public String accOverseasValue;

        @NameInMap("HttpsOverseasValue")
        public String httpsOverseasValue;

        @NameInMap("DomesticValue")
        public String domesticValue;

        @NameInMap("HttpsAccOverseasValue")
        public String httpsAccOverseasValue;

        @NameInMap("HttpsAccValue")
        public String httpsAccValue;

        @NameInMap("HttpsDomesticValue")
        public String httpsDomesticValue;

        @NameInMap("Value")
        public String value;

        @NameInMap("OverseasValue")
        public String overseasValue;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("HttpsAccDomesticValue")
        public String httpsAccDomesticValue;

        public static DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule self = new DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccValue(String accValue) {
            this.accValue = accValue;
            return this;
        }
        public String getAccValue() {
            return this.accValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccDomesticValue(String accDomesticValue) {
            this.accDomesticValue = accDomesticValue;
            return this;
        }
        public String getAccDomesticValue() {
            return this.accDomesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsValue(String httpsValue) {
            this.httpsValue = httpsValue;
            return this;
        }
        public String getHttpsValue() {
            return this.httpsValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setAccOverseasValue(String accOverseasValue) {
            this.accOverseasValue = accOverseasValue;
            return this;
        }
        public String getAccOverseasValue() {
            return this.accOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsOverseasValue(String httpsOverseasValue) {
            this.httpsOverseasValue = httpsOverseasValue;
            return this;
        }
        public String getHttpsOverseasValue() {
            return this.httpsOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setDomesticValue(String domesticValue) {
            this.domesticValue = domesticValue;
            return this;
        }
        public String getDomesticValue() {
            return this.domesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccOverseasValue(String httpsAccOverseasValue) {
            this.httpsAccOverseasValue = httpsAccOverseasValue;
            return this;
        }
        public String getHttpsAccOverseasValue() {
            return this.httpsAccOverseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccValue(String httpsAccValue) {
            this.httpsAccValue = httpsAccValue;
            return this;
        }
        public String getHttpsAccValue() {
            return this.httpsAccValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsDomesticValue(String httpsDomesticValue) {
            this.httpsDomesticValue = httpsDomesticValue;
            return this;
        }
        public String getHttpsDomesticValue() {
            return this.httpsDomesticValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setOverseasValue(String overseasValue) {
            this.overseasValue = overseasValue;
            return this;
        }
        public String getOverseasValue() {
            return this.overseasValue;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule setHttpsAccDomesticValue(String httpsAccDomesticValue) {
            this.httpsAccDomesticValue = httpsAccDomesticValue;
            return this;
        }
        public String getHttpsAccDomesticValue() {
            return this.httpsAccDomesticValue;
        }

    }

    public static class DescribeDomainQpsDataResponseBodyQpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        public java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> dataModule;

        public static DescribeDomainQpsDataResponseBodyQpsDataInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainQpsDataResponseBodyQpsDataInterval self = new DescribeDomainQpsDataResponseBodyQpsDataInterval();
            return TeaModel.build(map, self);
        }

        public DescribeDomainQpsDataResponseBodyQpsDataInterval setDataModule(java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> dataModule) {
            this.dataModule = dataModule;
            return this;
        }
        public java.util.List<DescribeDomainQpsDataResponseBodyQpsDataIntervalDataModule> getDataModule() {
            return this.dataModule;
        }

    }

}
