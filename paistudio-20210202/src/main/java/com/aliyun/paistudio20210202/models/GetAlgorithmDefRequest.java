// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgorithmDefRequest extends TeaModel {
    @NameInMap("Provider")
    public String provider;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("Version")
    public String version;

    @NameInMap("Signature")
    public String signature;

    public static GetAlgorithmDefRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDefRequest self = new GetAlgorithmDefRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDefRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetAlgorithmDefRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public GetAlgorithmDefRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public GetAlgorithmDefRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
