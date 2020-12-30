// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnCertificateSigningRequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCdnCertificateSigningRequestResponseBody body;

    public static CreateCdnCertificateSigningRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnCertificateSigningRequestResponse self = new CreateCdnCertificateSigningRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateCdnCertificateSigningRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCdnCertificateSigningRequestResponse setBody(CreateCdnCertificateSigningRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCdnCertificateSigningRequestResponseBody getBody() {
        return this.body;
    }

}
