// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    @NameInMap("GbIp")
    public String gbIp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GbId")
    public String gbId;

    @NameInMap("Id")
    public String id;

    @NameInMap("GbPort")
    public Long gbPort;

    public static CreateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponseBody self = new CreateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponseBody setGbIp(String gbIp) {
        this.gbIp = gbIp;
        return this;
    }
    public String getGbIp() {
        return this.gbIp;
    }

    public CreateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupResponseBody setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

    public CreateGroupResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateGroupResponseBody setGbPort(Long gbPort) {
        this.gbPort = gbPort;
        return this;
    }
    public Long getGbPort() {
        return this.gbPort;
    }

}
