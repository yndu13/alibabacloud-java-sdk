// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class SubmitTraceAbRequest extends TeaModel {
    // 任务结果回调
    @NameInMap("CallBack")
    public String callBack;

    // 溯源水印ab流处理视频输入
    @NameInMap("Input")
    public String input;

    // 水印强度
    @NameInMap("Level")
    public Long level;

    // 溯源水印ab流处理输出
    @NameInMap("Output")
    public String output;

    // 用户自定义数据，最大长度1024个字节
    @NameInMap("UserData")
    public String userData;

    public static SubmitTraceAbRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbRequest self = new SubmitTraceAbRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbRequest setCallBack(String callBack) {
        this.callBack = callBack;
        return this;
    }
    public String getCallBack() {
        return this.callBack;
    }

    public SubmitTraceAbRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitTraceAbRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitTraceAbRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitTraceAbRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
