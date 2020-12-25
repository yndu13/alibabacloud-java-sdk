// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateVideoRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("Style")
    public String style;

    @NameInMap("Duration")
    public Float duration;

    @NameInMap("DurationAdaption")
    public Boolean durationAdaption;

    @NameInMap("TransitionStyle")
    public String transitionStyle;

    @NameInMap("SmartEffect")
    public Boolean smartEffect;

    @NameInMap("PuzzleEffect")
    public Boolean puzzleEffect;

    @NameInMap("Mute")
    public Boolean mute;

    @NameInMap("FileList")
    public java.util.List<GenerateVideoRequestFileList> fileList;

    public static GenerateVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoRequest self = new GenerateVideoRequest();
        return TeaModel.build(map, self);
    }

    public GenerateVideoRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public GenerateVideoRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GenerateVideoRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public GenerateVideoRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public GenerateVideoRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public GenerateVideoRequest setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public GenerateVideoRequest setDurationAdaption(Boolean durationAdaption) {
        this.durationAdaption = durationAdaption;
        return this;
    }
    public Boolean getDurationAdaption() {
        return this.durationAdaption;
    }

    public GenerateVideoRequest setTransitionStyle(String transitionStyle) {
        this.transitionStyle = transitionStyle;
        return this;
    }
    public String getTransitionStyle() {
        return this.transitionStyle;
    }

    public GenerateVideoRequest setSmartEffect(Boolean smartEffect) {
        this.smartEffect = smartEffect;
        return this;
    }
    public Boolean getSmartEffect() {
        return this.smartEffect;
    }

    public GenerateVideoRequest setPuzzleEffect(Boolean puzzleEffect) {
        this.puzzleEffect = puzzleEffect;
        return this;
    }
    public Boolean getPuzzleEffect() {
        return this.puzzleEffect;
    }

    public GenerateVideoRequest setMute(Boolean mute) {
        this.mute = mute;
        return this;
    }
    public Boolean getMute() {
        return this.mute;
    }

    public GenerateVideoRequest setFileList(java.util.List<GenerateVideoRequestFileList> fileList) {
        this.fileList = fileList;
        return this;
    }
    public java.util.List<GenerateVideoRequestFileList> getFileList() {
        return this.fileList;
    }

    public static class GenerateVideoRequestFileList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("FileUrl")
        public String fileUrl;

        @NameInMap("FileName")
        public String fileName;

        public static GenerateVideoRequestFileList build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoRequestFileList self = new GenerateVideoRequestFileList();
            return TeaModel.build(map, self);
        }

        public GenerateVideoRequestFileList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GenerateVideoRequestFileList setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public GenerateVideoRequestFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
