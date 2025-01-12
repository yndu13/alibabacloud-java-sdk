// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSavingsPlansCoverageDetailResponseBody body;

    public static DescribeSavingsPlansCoverageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageDetailResponse self = new DescribeSavingsPlansCoverageDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSavingsPlansCoverageDetailResponse setBody(DescribeSavingsPlansCoverageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSavingsPlansCoverageDetailResponseBody getBody() {
        return this.body;
    }

}
