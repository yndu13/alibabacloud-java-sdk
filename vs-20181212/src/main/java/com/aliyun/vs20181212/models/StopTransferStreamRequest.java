// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopTransferStreamRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ShowLog")
    public String showLog;

    @NameInMap("Id")
    public String id;

    @NameInMap("Transcode")
    public String transcode;

    public static StopTransferStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTransferStreamRequest self = new StopTransferStreamRequest();
        return TeaModel.build(map, self);
    }

    public StopTransferStreamRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopTransferStreamRequest setShowLog(String showLog) {
        this.showLog = showLog;
        return this;
    }
    public String getShowLog() {
        return this.showLog;
    }

    public StopTransferStreamRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StopTransferStreamRequest setTranscode(String transcode) {
        this.transcode = transcode;
        return this;
    }
    public String getTranscode() {
        return this.transcode;
    }

}