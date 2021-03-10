// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015;

import com.aliyun.tea.*;
import com.aliyun.aiccs20191015.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aiccs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public SendHotlineHeartBeatResponse sendHotlineHeartBeatWithOptions(SendHotlineHeartBeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendHotlineHeartBeat", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new SendHotlineHeartBeatResponse());
    }

    public SendHotlineHeartBeatResponse sendHotlineHeartBeat(SendHotlineHeartBeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendHotlineHeartBeatWithOptions(request, runtime);
    }

    public StartChatWorkResponse startChatWorkWithOptions(StartChatWorkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartChatWork", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartChatWorkResponse());
    }

    public StartChatWorkResponse startChatWork(StartChatWorkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startChatWorkWithOptions(request, runtime);
    }

    public HangUpDoubleCallResponse hangUpDoubleCallWithOptions(HangUpDoubleCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HangUpDoubleCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new HangUpDoubleCallResponse());
    }

    public HangUpDoubleCallResponse hangUpDoubleCall(HangUpDoubleCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hangUpDoubleCallWithOptions(request, runtime);
    }

    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAgent", "2019-10-15", "HTTPS", "PUT", "AK", "json", req, runtime), new UpdateAgentResponse());
    }

    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    public EditQualityRuleTagResponse editQualityRuleTagWithOptions(EditQualityRuleTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditQualityRuleTag", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new EditQualityRuleTagResponse());
    }

    public EditQualityRuleTagResponse editQualityRuleTag(EditQualityRuleTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editQualityRuleTagWithOptions(request, runtime);
    }

    public DeleteOutboundTaskResponse deleteOutboundTaskWithOptions(DeleteOutboundTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOutboundTask", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteOutboundTaskResponse());
    }

    public DeleteOutboundTaskResponse deleteOutboundTask(DeleteOutboundTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOutboundTaskWithOptions(request, runtime);
    }

    public AddOuterAccountResponse addOuterAccountWithOptions(AddOuterAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddOuterAccount", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new AddOuterAccountResponse());
    }

    public AddOuterAccountResponse addOuterAccount(AddOuterAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addOuterAccountWithOptions(request, runtime);
    }

    public GetAgentByIdResponse getAgentByIdWithOptions(GetAgentByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentById", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetAgentByIdResponse());
    }

    public GetAgentByIdResponse getAgentById(GetAgentByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentByIdWithOptions(request, runtime);
    }

    public GetQualityRuleDetailResponse getQualityRuleDetailWithOptions(GetQualityRuleDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQualityRuleDetail", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetQualityRuleDetailResponse());
    }

    public GetQualityRuleDetailResponse getQualityRuleDetail(GetQualityRuleDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualityRuleDetailWithOptions(request, runtime);
    }

    public GetQualityProjectLogResponse getQualityProjectLogWithOptions(GetQualityProjectLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQualityProjectLog", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetQualityProjectLogResponse());
    }

    public GetQualityProjectLogResponse getQualityProjectLog(GetQualityProjectLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualityProjectLogWithOptions(request, runtime);
    }

    public ListHotlineRecordDetailResponse listHotlineRecordDetailWithOptions(ListHotlineRecordDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHotlineRecordDetail", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListHotlineRecordDetailResponse());
    }

    public ListHotlineRecordDetailResponse listHotlineRecordDetail(ListHotlineRecordDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotlineRecordDetailWithOptions(request, runtime);
    }

    public GetQualityProjectListResponse getQualityProjectListWithOptions(GetQualityProjectListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQualityProjectList", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetQualityProjectListResponse());
    }

    public GetQualityProjectListResponse getQualityProjectList(GetQualityProjectListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualityProjectListWithOptions(request, runtime);
    }

    public CreateOutboundTaskResponse createOutboundTaskWithOptions(CreateOutboundTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOutboundTask", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOutboundTaskResponse());
    }

    public CreateOutboundTaskResponse createOutboundTask(CreateOutboundTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOutboundTaskWithOptions(request, runtime);
    }

    public MakeDoubleCallResponse makeDoubleCallWithOptions(MakeDoubleCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MakeDoubleCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new MakeDoubleCallResponse());
    }

    public MakeDoubleCallResponse makeDoubleCall(MakeDoubleCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.makeDoubleCallWithOptions(request, runtime);
    }

    public GetNumLocationResponse getNumLocationWithOptions(GetNumLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNumLocation", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetNumLocationResponse());
    }

    public GetNumLocationResponse getNumLocation(GetNumLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNumLocationWithOptions(request, runtime);
    }

    public GetQualityRuleListResponse getQualityRuleListWithOptions(GetQualityRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQualityRuleList", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetQualityRuleListResponse());
    }

    public GetQualityRuleListResponse getQualityRuleList(GetQualityRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualityRuleListWithOptions(request, runtime);
    }

    public ListOutboundPhoneNumberResponse listOutboundPhoneNumberWithOptions(ListOutboundPhoneNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOutboundPhoneNumber", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListOutboundPhoneNumberResponse());
    }

    public ListOutboundPhoneNumberResponse listOutboundPhoneNumber(ListOutboundPhoneNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOutboundPhoneNumberWithOptions(request, runtime);
    }

    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupIdWithOptions(ListAgentBySkillGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAgentBySkillGroupId", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListAgentBySkillGroupIdResponse());
    }

    public ListAgentBySkillGroupIdResponse listAgentBySkillGroupId(ListAgentBySkillGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAgentBySkillGroupIdWithOptions(request, runtime);
    }

    public HangupThirdCallResponse hangupThirdCallWithOptions(HangupThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HangupThirdCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new HangupThirdCallResponse());
    }

    public HangupThirdCallResponse hangupThirdCall(HangupThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hangupThirdCallWithOptions(request, runtime);
    }

    public StartHotlineServiceResponse startHotlineServiceWithOptions(StartHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartHotlineService", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartHotlineServiceResponse());
    }

    public StartHotlineServiceResponse startHotlineService(StartHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startHotlineServiceWithOptions(request, runtime);
    }

    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgent", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetAgentResponse());
    }

    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    public GetAgentIndexRealTimeResponse getAgentIndexRealTimeWithOptions(GetAgentIndexRealTimeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentIndexRealTime", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetAgentIndexRealTimeResponse());
    }

    public GetAgentIndexRealTimeResponse getAgentIndexRealTime(GetAgentIndexRealTimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentIndexRealTimeWithOptions(request, runtime);
    }

    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReportWithOptions(GetHotlineGroupDetailReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineGroupDetailReport", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotlineGroupDetailReportResponse());
    }

    public GetHotlineGroupDetailReportResponse getHotlineGroupDetailReport(GetHotlineGroupDetailReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineGroupDetailReportWithOptions(request, runtime);
    }

    public GetInstanceListResponse getInstanceListWithOptions(GetInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceList", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceListResponse());
    }

    public GetInstanceListResponse getInstanceList(GetInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceListWithOptions(request, runtime);
    }

    public GetQualityProjectDetailResponse getQualityProjectDetailWithOptions(GetQualityProjectDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQualityProjectDetail", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetQualityProjectDetailResponse());
    }

    public GetQualityProjectDetailResponse getQualityProjectDetail(GetQualityProjectDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualityProjectDetailWithOptions(request, runtime);
    }

    public SendCcoSmartCallOperateResponse sendCcoSmartCallOperateWithOptions(SendCcoSmartCallOperateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendCcoSmartCallOperate", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new SendCcoSmartCallOperateResponse());
    }

    public SendCcoSmartCallOperateResponse sendCcoSmartCallOperate(SendCcoSmartCallOperateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCcoSmartCallOperateWithOptions(request, runtime);
    }

    public AnswerCallResponse answerCallWithOptions(AnswerCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AnswerCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new AnswerCallResponse());
    }

    public AnswerCallResponse answerCall(AnswerCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.answerCallWithOptions(request, runtime);
    }

    public StartMicroOutboundResponse startMicroOutboundWithOptions(StartMicroOutboundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartMicroOutbound", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartMicroOutboundResponse());
    }

    public StartMicroOutboundResponse startMicroOutbound(StartMicroOutboundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startMicroOutboundWithOptions(request, runtime);
    }

    public SuspendHotlineServiceResponse suspendHotlineServiceWithOptions(SuspendHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendHotlineService", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendHotlineServiceResponse());
    }

    public SuspendHotlineServiceResponse suspendHotlineService(SuspendHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendHotlineServiceWithOptions(request, runtime);
    }

    public UpdateOuterAccountResponse updateOuterAccountWithOptions(UpdateOuterAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOuterAccount", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new UpdateOuterAccountResponse());
    }

    public UpdateOuterAccountResponse updateOuterAccount(UpdateOuterAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOuterAccountWithOptions(request, runtime);
    }

    public GetHotlineWaitingNumberResponse getHotlineWaitingNumberWithOptions(GetHotlineWaitingNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineWaitingNumber", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetHotlineWaitingNumberResponse());
    }

    public GetHotlineWaitingNumberResponse getHotlineWaitingNumber(GetHotlineWaitingNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineWaitingNumberWithOptions(request, runtime);
    }

    public HoldCallResponse holdCallWithOptions(HoldCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HoldCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new HoldCallResponse());
    }

    public HoldCallResponse holdCall(HoldCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.holdCallWithOptions(request, runtime);
    }

    public GetRtcTokenResponse getRtcTokenWithOptions(GetRtcTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRtcToken", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetRtcTokenResponse());
    }

    public GetRtcTokenResponse getRtcToken(GetRtcTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRtcTokenWithOptions(request, runtime);
    }

    public GetRecordDataResponse getRecordDataWithOptions(GetRecordDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRecordData", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetRecordDataResponse());
    }

    public GetRecordDataResponse getRecordData(GetRecordDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRecordDataWithOptions(request, runtime);
    }

    public DeleteQualityRuleResponse deleteQualityRuleWithOptions(DeleteQualityRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQualityRule", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteQualityRuleResponse());
    }

    public DeleteQualityRuleResponse deleteQualityRule(DeleteQualityRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQualityRuleWithOptions(request, runtime);
    }

    public SuspendOutboundTaskResponse suspendOutboundTaskWithOptions(SuspendOutboundTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SuspendOutboundTask", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new SuspendOutboundTaskResponse());
    }

    public SuspendOutboundTaskResponse suspendOutboundTask(SuspendOutboundTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.suspendOutboundTaskWithOptions(request, runtime);
    }

    public EditQualityProjectResponse editQualityProjectWithOptions(EditQualityProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditQualityProject", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new EditQualityProjectResponse());
    }

    public EditQualityProjectResponse editQualityProject(EditQualityProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editQualityProjectWithOptions(request, runtime);
    }

    public ListOuterOrderedNumbersResponse listOuterOrderedNumbersWithOptions(ListOuterOrderedNumbersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOuterOrderedNumbers", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListOuterOrderedNumbersResponse());
    }

    public ListOuterOrderedNumbersResponse listOuterOrderedNumbers(ListOuterOrderedNumbersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOuterOrderedNumbersWithOptions(request, runtime);
    }

    public GetQualityResultResponse getQualityResultWithOptions(GetQualityResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQualityResult", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetQualityResultResponse());
    }

    public GetQualityResultResponse getQualityResult(GetQualityResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualityResultWithOptions(request, runtime);
    }

    public GetIndexCurrentValueResponse getIndexCurrentValueWithOptions(GetIndexCurrentValueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIndexCurrentValue", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetIndexCurrentValueResponse());
    }

    public GetIndexCurrentValueResponse getIndexCurrentValue(GetIndexCurrentValueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIndexCurrentValueWithOptions(request, runtime);
    }

    public GenerateWebSocketSignResponse generateWebSocketSignWithOptions(GenerateWebSocketSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateWebSocketSign", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateWebSocketSignResponse());
    }

    public GenerateWebSocketSignResponse generateWebSocketSign(GenerateWebSocketSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateWebSocketSignWithOptions(request, runtime);
    }

    public CreateAgentResponse createAgentWithOptions(CreateAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAgent", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAgentResponse());
    }

    public CreateAgentResponse createAgent(CreateAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAgentWithOptions(request, runtime);
    }

    public QueryTaskDetailResponse queryTaskDetailWithOptions(QueryTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskDetail", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskDetailResponse());
    }

    public QueryTaskDetailResponse queryTaskDetail(QueryTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskDetailWithOptions(request, runtime);
    }

    public EditQualityRuleResponse editQualityRuleWithOptions(EditQualityRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditQualityRule", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new EditQualityRuleResponse());
    }

    public EditQualityRuleResponse editQualityRule(EditQualityRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editQualityRuleWithOptions(request, runtime);
    }

    public DeleteAgentResponse deleteAgentWithOptions(DeleteAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAgent", "2019-10-15", "HTTPS", "DELETE", "AK", "json", req, runtime), new DeleteAgentResponse());
    }

    public DeleteAgentResponse deleteAgent(DeleteAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAgentWithOptions(request, runtime);
    }

    public GetCustomerInfoResponse getCustomerInfoWithOptions(GetCustomerInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCustomerInfo", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetCustomerInfoResponse());
    }

    public GetCustomerInfoResponse getCustomerInfo(GetCustomerInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerInfoWithOptions(request, runtime);
    }

    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReportWithOptions(GetHotlineAgentDetailReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineAgentDetailReport", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotlineAgentDetailReportResponse());
    }

    public GetHotlineAgentDetailReportResponse getHotlineAgentDetailReport(GetHotlineAgentDetailReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentDetailReportWithOptions(request, runtime);
    }

    public SendCcoSmartCallResponse sendCcoSmartCallWithOptions(SendCcoSmartCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendCcoSmartCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new SendCcoSmartCallResponse());
    }

    public SendCcoSmartCallResponse sendCcoSmartCall(SendCcoSmartCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCcoSmartCallWithOptions(request, runtime);
    }

    public ListChatRecordDetailResponse listChatRecordDetailWithOptions(ListChatRecordDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListChatRecordDetail", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListChatRecordDetailResponse());
    }

    public ListChatRecordDetailResponse listChatRecordDetail(ListChatRecordDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChatRecordDetailWithOptions(request, runtime);
    }

    public AddSkillGroupResponse addSkillGroupWithOptions(AddSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSkillGroup", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new AddSkillGroupResponse());
    }

    public AddSkillGroupResponse addSkillGroup(AddSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSkillGroupWithOptions(request, runtime);
    }

    public HangupCallResponse hangupCallWithOptions(HangupCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HangupCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new HangupCallResponse());
    }

    public HangupCallResponse hangupCall(HangupCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hangupCallWithOptions(request, runtime);
    }

    public DeleteSkillGroupResponse deleteSkillGroupWithOptions(DeleteSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSkillGroup", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteSkillGroupResponse());
    }

    public DeleteSkillGroupResponse deleteSkillGroup(DeleteSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSkillGroupWithOptions(request, runtime);
    }

    public CreateQualityProjectResponse createQualityProjectWithOptions(CreateQualityProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateQualityProject", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateQualityProjectResponse());
    }

    public CreateQualityProjectResponse createQualityProject(CreateQualityProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createQualityProjectWithOptions(request, runtime);
    }

    public QuerySkillGroupsResponse querySkillGroupsWithOptions(QuerySkillGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySkillGroups", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySkillGroupsResponse());
    }

    public QuerySkillGroupsResponse querySkillGroups(QuerySkillGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySkillGroupsWithOptions(request, runtime);
    }

    public CreateQualityRuleResponse createQualityRuleWithOptions(CreateQualityRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateQualityRule", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateQualityRuleResponse());
    }

    public CreateQualityRuleResponse createQualityRule(CreateQualityRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createQualityRuleWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRoles", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public GetHotlineCallActionResponse getHotlineCallActionWithOptions(GetHotlineCallActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineCallAction", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotlineCallActionResponse());
    }

    public GetHotlineCallActionResponse getHotlineCallAction(GetHotlineCallActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineCallActionWithOptions(request, runtime);
    }

    public ListSkillGroupResponse listSkillGroupWithOptions(ListSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSkillGroup", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListSkillGroupResponse());
    }

    public ListSkillGroupResponse listSkillGroup(ListSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSkillGroupWithOptions(request, runtime);
    }

    public DeleteQualityProjectResponse deleteQualityProjectWithOptions(DeleteQualityProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteQualityProject", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteQualityProjectResponse());
    }

    public DeleteQualityProjectResponse deleteQualityProject(DeleteQualityProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteQualityProjectWithOptions(request, runtime);
    }

    public QueryTouchListResponse queryTouchListWithOptions(QueryTouchListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTouchList", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTouchListResponse());
    }

    public QueryTouchListResponse queryTouchList(QueryTouchListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTouchListWithOptions(request, runtime);
    }

    public QueryHotlineInQueueResponse queryHotlineInQueueWithOptions(QueryHotlineInQueueRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryHotlineInQueue", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new QueryHotlineInQueueResponse());
    }

    public QueryHotlineInQueueResponse queryHotlineInQueue(QueryHotlineInQueueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHotlineInQueueWithOptions(request, runtime);
    }

    public FinishHotlineServiceResponse finishHotlineServiceWithOptions(FinishHotlineServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FinishHotlineService", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new FinishHotlineServiceResponse());
    }

    public FinishHotlineServiceResponse finishHotlineService(FinishHotlineServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.finishHotlineServiceWithOptions(request, runtime);
    }

    public ListOutboundStrategiesResponse listOutboundStrategiesWithOptions(ListOutboundStrategiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOutboundStrategies", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListOutboundStrategiesResponse());
    }

    public ListOutboundStrategiesResponse listOutboundStrategies(ListOutboundStrategiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOutboundStrategiesWithOptions(request, runtime);
    }

    public ListHotlineRecordResponse listHotlineRecordWithOptions(ListHotlineRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHotlineRecord", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListHotlineRecordResponse());
    }

    public ListHotlineRecordResponse listHotlineRecord(ListHotlineRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHotlineRecordWithOptions(request, runtime);
    }

    public ChangeQualityProjectStatusResponse changeQualityProjectStatusWithOptions(ChangeQualityProjectStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeQualityProjectStatus", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeQualityProjectStatusResponse());
    }

    public ChangeQualityProjectStatusResponse changeQualityProjectStatus(ChangeQualityProjectStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeQualityProjectStatusWithOptions(request, runtime);
    }

    public TransferCallToSkillGroupResponse transferCallToSkillGroupWithOptions(TransferCallToSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TransferCallToSkillGroup", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new TransferCallToSkillGroupResponse());
    }

    public TransferCallToSkillGroupResponse transferCallToSkillGroup(TransferCallToSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferCallToSkillGroupWithOptions(request, runtime);
    }

    public RemoveSkillGroupResponse removeSkillGroupWithOptions(RemoveSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveSkillGroup", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveSkillGroupResponse());
    }

    public RemoveSkillGroupResponse removeSkillGroup(RemoveSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeSkillGroupWithOptions(request, runtime);
    }

    public StartCallV2Response startCallV2WithOptions(StartCallV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCallV2", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartCallV2Response());
    }

    public StartCallV2Response startCallV2(StartCallV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCallV2WithOptions(request, runtime);
    }

    public ChangeChatAgentStatusResponse changeChatAgentStatusWithOptions(ChangeChatAgentStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeChatAgentStatus", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeChatAgentStatusResponse());
    }

    public ChangeChatAgentStatusResponse changeChatAgentStatus(ChangeChatAgentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeChatAgentStatusWithOptions(request, runtime);
    }

    public DescribeRecordDataResponse describeRecordDataWithOptions(DescribeRecordDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecordData", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordDataResponse());
    }

    public DescribeRecordDataResponse describeRecordData(DescribeRecordDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordDataWithOptions(request, runtime);
    }

    public DeleteOuterAccountResponse deleteOuterAccountWithOptions(DeleteOuterAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOuterAccount", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteOuterAccountResponse());
    }

    public DeleteOuterAccountResponse deleteOuterAccount(DeleteOuterAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOuterAccountWithOptions(request, runtime);
    }

    public GetHotlineAgentDetailResponse getHotlineAgentDetailWithOptions(GetHotlineAgentDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineAgentDetail", "2019-10-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetHotlineAgentDetailResponse());
    }

    public GetHotlineAgentDetailResponse getHotlineAgentDetail(GetHotlineAgentDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentDetailWithOptions(request, runtime);
    }

    public MakeCallResponse makeCallWithOptions(MakeCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MakeCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new MakeCallResponse());
    }

    public MakeCallResponse makeCall(MakeCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.makeCallWithOptions(request, runtime);
    }

    public FetchCallResponse fetchCallWithOptions(FetchCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FetchCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new FetchCallResponse());
    }

    public FetchCallResponse fetchCall(FetchCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fetchCallWithOptions(request, runtime);
    }

    public GetHotlineAgentStatusResponse getHotlineAgentStatusWithOptions(GetHotlineAgentStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHotlineAgentStatus", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetHotlineAgentStatusResponse());
    }

    public GetHotlineAgentStatusResponse getHotlineAgentStatus(GetHotlineAgentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineAgentStatusWithOptions(request, runtime);
    }

    public StartCallResponse startCallWithOptions(StartCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new StartCallResponse());
    }

    public StartCallResponse startCall(StartCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startCallWithOptions(request, runtime);
    }

    public GetQualityRuleTagListResponse getQualityRuleTagListWithOptions(GetQualityRuleTagListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetQualityRuleTagList", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetQualityRuleTagListResponse());
    }

    public GetQualityRuleTagListResponse getQualityRuleTagList(GetQualityRuleTagListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getQualityRuleTagListWithOptions(request, runtime);
    }

    public GetOutbounNumListResponse getOutbounNumListWithOptions(GetOutbounNumListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOutbounNumList", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetOutbounNumListResponse());
    }

    public GetOutbounNumListResponse getOutbounNumList(GetOutbounNumListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOutbounNumListWithOptions(request, runtime);
    }

    public CreateThirdSsoAgentResponse createThirdSsoAgentWithOptions(CreateThirdSsoAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateThirdSsoAgent", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateThirdSsoAgentResponse());
    }

    public CreateThirdSsoAgentResponse createThirdSsoAgent(CreateThirdSsoAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createThirdSsoAgentWithOptions(request, runtime);
    }

    public BatchCreateQualityProjectsResponse batchCreateQualityProjectsWithOptions(BatchCreateQualityProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchCreateQualityProjects", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new BatchCreateQualityProjectsResponse());
    }

    public BatchCreateQualityProjectsResponse batchCreateQualityProjects(BatchCreateQualityProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCreateQualityProjectsWithOptions(request, runtime);
    }

    public InsertTaskDetailResponse insertTaskDetailWithOptions(InsertTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InsertTaskDetail", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new InsertTaskDetailResponse());
    }

    public InsertTaskDetailResponse insertTaskDetail(InsertTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.insertTaskDetailWithOptions(request, runtime);
    }

    public UpdateSkillGroupResponse updateSkillGroupWithOptions(UpdateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSkillGroup", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSkillGroupResponse());
    }

    public UpdateSkillGroupResponse updateSkillGroup(UpdateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSkillGroupWithOptions(request, runtime);
    }

    public HotlineSessionQueryResponse hotlineSessionQueryWithOptions(HotlineSessionQueryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HotlineSessionQuery", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new HotlineSessionQueryResponse());
    }

    public HotlineSessionQueryResponse hotlineSessionQuery(HotlineSessionQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.hotlineSessionQueryWithOptions(request, runtime);
    }

    public QueryTicketsResponse queryTicketsWithOptions(QueryTicketsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryTicketsShrinkRequest request = new QueryTicketsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "Extra", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTickets", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTicketsResponse());
    }

    public QueryTicketsResponse queryTickets(QueryTicketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTicketsWithOptions(request, runtime);
    }

    public QueryOutboundTaskResponse queryOutboundTaskWithOptions(QueryOutboundTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOutboundTask", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOutboundTaskResponse());
    }

    public QueryOutboundTaskResponse queryOutboundTask(QueryOutboundTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOutboundTaskWithOptions(request, runtime);
    }

    public JoinThirdCallResponse joinThirdCallWithOptions(JoinThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinThirdCall", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new JoinThirdCallResponse());
    }

    public JoinThirdCallResponse joinThirdCall(JoinThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinThirdCallWithOptions(request, runtime);
    }

    public CreateSkillGroupResponse createSkillGroupWithOptions(CreateSkillGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSkillGroup", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSkillGroupResponse());
    }

    public CreateSkillGroupResponse createSkillGroup(CreateSkillGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSkillGroupWithOptions(request, runtime);
    }

    public RestartOutboundTaskResponse restartOutboundTaskWithOptions(RestartOutboundTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestartOutboundTask", "2019-10-15", "HTTPS", "POST", "AK", "json", req, runtime), new RestartOutboundTaskResponse());
    }

    public RestartOutboundTaskResponse restartOutboundTask(RestartOutboundTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartOutboundTaskWithOptions(request, runtime);
    }
}