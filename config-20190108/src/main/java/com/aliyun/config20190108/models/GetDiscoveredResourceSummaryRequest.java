// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetDiscoveredResourceSummaryRequest extends TeaModel {
    @NameInMap("MultiAccount")
    public Boolean multiAccount;

    @NameInMap("MemberId")
    public Long memberId;

    public static GetDiscoveredResourceSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiscoveredResourceSummaryRequest self = new GetDiscoveredResourceSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetDiscoveredResourceSummaryRequest setMultiAccount(Boolean multiAccount) {
        this.multiAccount = multiAccount;
        return this;
    }
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    public GetDiscoveredResourceSummaryRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

}
