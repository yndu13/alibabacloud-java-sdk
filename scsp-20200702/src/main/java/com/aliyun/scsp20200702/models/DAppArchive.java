// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class DAppArchive extends TeaModel {
    // id
    @NameInMap("Id")
    public String id;

    // 快照版本
    @NameInMap("Version")
    public String version;

    // 应用fatjar版本
    @NameInMap("AppVersion")
    public String appVersion;

    // 资源数量
    @NameInMap("ResCount")
    public Integer resCount;

    // 创建时间
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    // 部署应用
    @NameInMap("App")
    public DApp app;

    // 状态
    @NameInMap("Status")
    public DPair status;

    public static DAppArchive build(java.util.Map<String, ?> map) throws Exception {
        DAppArchive self = new DAppArchive();
        return TeaModel.build(map, self);
    }

    public DAppArchive setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DAppArchive setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DAppArchive setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public DAppArchive setResCount(Integer resCount) {
        this.resCount = resCount;
        return this;
    }
    public Integer getResCount() {
        return this.resCount;
    }

    public DAppArchive setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DAppArchive setApp(DApp app) {
        this.app = app;
        return this;
    }
    public DApp getApp() {
        return this.app;
    }

    public DAppArchive setStatus(DPair status) {
        this.status = status;
        return this;
    }
    public DPair getStatus() {
        return this.status;
    }

}