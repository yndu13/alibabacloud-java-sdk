// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.multimediaai20190810.models;

import com.aliyun.tea.*;

public class CreateGifTaskRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("VideoName")
    public String videoName;

    @NameInMap("VideoUrl")
    public String videoUrl;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("Scales")
    public String scales;

    public static CreateGifTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGifTaskRequest self = new CreateGifTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateGifTaskRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateGifTaskRequest setVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }
    public String getVideoName() {
        return this.videoName;
    }

    public CreateGifTaskRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public CreateGifTaskRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateGifTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateGifTaskRequest setScales(String scales) {
        this.scales = scales;
        return this;
    }
    public String getScales() {
        return this.scales;
    }

}
