// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartDate")
    @Validation(required = true)
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Rr")
    @Validation(required = true)
    public String rr;

    @NameInMap("DomainType")
    public String domainType;

    public static DescribeRecordStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsRequest self = new DescribeRecordStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecordStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRecordStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeRecordStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeRecordStatisticsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeRecordStatisticsRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public DescribeRecordStatisticsRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

}
