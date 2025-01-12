// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DownloadDeviceResourceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 下载链接
    @NameInMap("DownloadUrl")
    public String downloadUrl;

    public static DownloadDeviceResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadDeviceResourceResponseBody self = new DownloadDeviceResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadDeviceResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadDeviceResourceResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

}
