// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630;

import com.aliyun.tea.*;
import com.aliyun.imp20210630.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("imp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public VerifyDomainOwnerResponse verifyDomainOwnerWithOptions(VerifyDomainOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyDomainOwner", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyDomainOwnerResponse());
    }

    public VerifyDomainOwnerResponse verifyDomainOwner(VerifyDomainOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyDomainOwnerWithOptions(request, runtime);
    }

    public CreateLiveResponse createLiveWithOptions(CreateLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLive", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLiveResponse());
    }

    public CreateLiveResponse createLive(CreateLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLiveWithOptions(request, runtime);
    }

    public RemoveMemberResponse removeMemberWithOptions(RemoveMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveMember", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveMemberResponse());
    }

    public RemoveMemberResponse removeMember(RemoveMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeMemberWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApp", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public ListApplyLinkMicUsersResponse listApplyLinkMicUsersWithOptions(ListApplyLinkMicUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApplyLinkMicUsers", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListApplyLinkMicUsersResponse());
    }

    public ListApplyLinkMicUsersResponse listApplyLinkMicUsers(ListApplyLinkMicUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApplyLinkMicUsersWithOptions(request, runtime);
    }

    public ListRoomLivesResponse listRoomLivesWithOptions(ListRoomLivesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRoomLives", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListRoomLivesResponse());
    }

    public ListRoomLivesResponse listRoomLives(ListRoomLivesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRoomLivesWithOptions(request, runtime);
    }

    public UpdateRoomResponse updateRoomWithOptions(UpdateRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRoom", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRoomResponse());
    }

    public UpdateRoomResponse updateRoom(UpdateRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRoomWithOptions(request, runtime);
    }

    public GetAppTemplateResponse getAppTemplateWithOptions(GetAppTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppTemplate", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppTemplateResponse());
    }

    public GetAppTemplateResponse getAppTemplate(GetAppTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppTemplateWithOptions(request, runtime);
    }

    public GetRoomResponse getRoomWithOptions(GetRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRoom", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetRoomResponse());
    }

    public GetRoomResponse getRoom(GetRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRoomWithOptions(request, runtime);
    }

    public SendCommentResponse sendCommentWithOptions(SendCommentRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendCommentShrinkRequest request = new SendCommentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extension)) {
            request.extensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extension, "Extension", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendComment", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new SendCommentResponse());
    }

    public SendCommentResponse sendComment(SendCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCommentWithOptions(request, runtime);
    }

    public CreateAppTemplateResponse createAppTemplateWithOptions(CreateAppTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppTemplateShrinkRequest request = new CreateAppTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.componentList)) {
            request.componentListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.componentList, "ComponentList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAppTemplate", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppTemplateResponse());
    }

    public CreateAppTemplateResponse createAppTemplate(CreateAppTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppTemplateWithOptions(request, runtime);
    }

    public GetConferenceResponse getConferenceWithOptions(GetConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConference", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetConferenceResponse());
    }

    public GetConferenceResponse getConference(GetConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConferenceWithOptions(request, runtime);
    }

    public BanCommentResponse banCommentWithOptions(BanCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BanComment", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new BanCommentResponse());
    }

    public BanCommentResponse banComment(BanCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.banCommentWithOptions(request, runtime);
    }

    public RejectLinkMicResponse rejectLinkMicWithOptions(RejectLinkMicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RejectLinkMic", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new RejectLinkMicResponse());
    }

    public RejectLinkMicResponse rejectLinkMic(RejectLinkMicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rejectLinkMicWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApps", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public AddMemberResponse addMemberWithOptions(AddMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddMember", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new AddMemberResponse());
    }

    public AddMemberResponse addMember(AddMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMemberWithOptions(request, runtime);
    }

    public CancelBanAllCommentResponse cancelBanAllCommentWithOptions(CancelBanAllCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelBanAllComment", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CancelBanAllCommentResponse());
    }

    public CancelBanAllCommentResponse cancelBanAllComment(CancelBanAllCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelBanAllCommentWithOptions(request, runtime);
    }

    public ListRoomsResponse listRoomsWithOptions(ListRoomsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRooms", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListRoomsResponse());
    }

    public ListRoomsResponse listRooms(ListRoomsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRoomsWithOptions(request, runtime);
    }

    public DeleteAppTemplateResponse deleteAppTemplateWithOptions(DeleteAppTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAppTemplate", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppTemplateResponse());
    }

    public DeleteAppTemplateResponse deleteAppTemplate(DeleteAppTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppTemplateWithOptions(request, runtime);
    }

    public ListConferenceUsersResponse listConferenceUsersWithOptions(ListConferenceUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConferenceUsers", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListConferenceUsersResponse());
    }

    public ListConferenceUsersResponse listConferenceUsers(ListConferenceUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConferenceUsersWithOptions(request, runtime);
    }

    public CancelBanCommentResponse cancelBanCommentWithOptions(CancelBanCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelBanComment", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CancelBanCommentResponse());
    }

    public CancelBanCommentResponse cancelBanComment(CancelBanCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelBanCommentWithOptions(request, runtime);
    }

    public ListAppTemplatesResponse listAppTemplatesWithOptions(ListAppTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAppTemplates", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppTemplatesResponse());
    }

    public ListAppTemplatesResponse listAppTemplates(ListAppTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppTemplatesWithOptions(request, runtime);
    }

    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListComponents", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListComponentsResponse());
    }

    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listComponentsWithOptions(request, runtime);
    }

    public UpdateLiveResponse updateLiveWithOptions(UpdateLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLive", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveResponse());
    }

    public UpdateLiveResponse updateLive(UpdateLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveWithOptions(request, runtime);
    }

    public UpdateAppTemplateConfigResponse updateAppTemplateConfigWithOptions(UpdateAppTemplateConfigRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAppTemplateConfigShrinkRequest request = new UpdateAppTemplateConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configList)) {
            request.configListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configList, "ConfigList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppTemplateConfig", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppTemplateConfigResponse());
    }

    public UpdateAppTemplateConfigResponse updateAppTemplateConfig(UpdateAppTemplateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppTemplateConfigWithOptions(request, runtime);
    }

    public ApplyLinkMicResponse applyLinkMicWithOptions(ApplyLinkMicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyLinkMic", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyLinkMicResponse());
    }

    public ApplyLinkMicResponse applyLinkMic(ApplyLinkMicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyLinkMicWithOptions(request, runtime);
    }

    public CancelApplyLinkMicResponse cancelApplyLinkMicWithOptions(CancelApplyLinkMicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelApplyLinkMic", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CancelApplyLinkMicResponse());
    }

    public CancelApplyLinkMicResponse cancelApplyLinkMic(CancelApplyLinkMicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelApplyLinkMicWithOptions(request, runtime);
    }

    public StopLiveResponse stopLiveWithOptions(StopLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopLive", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new StopLiveResponse());
    }

    public StopLiveResponse stopLive(StopLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopLiveWithOptions(request, runtime);
    }

    public GetAppResponse getAppWithOptions(GetAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApp", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppResponse());
    }

    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    public CreateConferenceResponse createConferenceWithOptions(CreateConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConference", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConferenceResponse());
    }

    public CreateConferenceResponse createConference(CreateConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConferenceWithOptions(request, runtime);
    }

    public DeleteLiveResponse deleteLiveWithOptions(DeleteLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLive", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLiveResponse());
    }

    public DeleteLiveResponse deleteLive(DeleteLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLiveWithOptions(request, runtime);
    }

    public GetLiveDomainStatusResponse getLiveDomainStatusWithOptions(GetLiveDomainStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetLiveDomainStatusShrinkRequest request = new GetLiveDomainStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.liveDomainList)) {
            request.liveDomainListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.liveDomainList, "LiveDomainList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLiveDomainStatus", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetLiveDomainStatusResponse());
    }

    public GetLiveDomainStatusResponse getLiveDomainStatus(GetLiveDomainStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveDomainStatusWithOptions(request, runtime);
    }

    public SendCustomMessageToAllResponse sendCustomMessageToAllWithOptions(SendCustomMessageToAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendCustomMessageToAll", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new SendCustomMessageToAllResponse());
    }

    public SendCustomMessageToAllResponse sendCustomMessageToAll(SendCustomMessageToAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCustomMessageToAllWithOptions(request, runtime);
    }

    public AgreeLinkMicResponse agreeLinkMicWithOptions(AgreeLinkMicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AgreeLinkMic", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new AgreeLinkMicResponse());
    }

    public AgreeLinkMicResponse agreeLinkMic(AgreeLinkMicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.agreeLinkMicWithOptions(request, runtime);
    }

    public GetDomainOwnerVerifyContentResponse getDomainOwnerVerifyContentWithOptions(GetDomainOwnerVerifyContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDomainOwnerVerifyContent", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDomainOwnerVerifyContentResponse());
    }

    public GetDomainOwnerVerifyContentResponse getDomainOwnerVerifyContent(GetDomainOwnerVerifyContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainOwnerVerifyContentWithOptions(request, runtime);
    }

    public SendCustomMessageToUsersResponse sendCustomMessageToUsersWithOptions(SendCustomMessageToUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendCustomMessageToUsers", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new SendCustomMessageToUsersResponse());
    }

    public SendCustomMessageToUsersResponse sendCustomMessageToUsers(SendCustomMessageToUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCustomMessageToUsersWithOptions(request, runtime);
    }

    public BanAllCommentResponse banAllCommentWithOptions(BanAllCommentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BanAllComment", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new BanAllCommentResponse());
    }

    public BanAllCommentResponse banAllComment(BanAllCommentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.banAllCommentWithOptions(request, runtime);
    }

    public GetAuthTokenResponse getAuthTokenWithOptions(GetAuthTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuthToken", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuthTokenResponse());
    }

    public GetAuthTokenResponse getAuthToken(GetAuthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuthTokenWithOptions(request, runtime);
    }

    public UpdateAppTemplateResponse updateAppTemplateWithOptions(UpdateAppTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppTemplate", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppTemplateResponse());
    }

    public UpdateAppTemplateResponse updateAppTemplate(UpdateAppTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppTemplateWithOptions(request, runtime);
    }

    public GetImpProductStatusResponse getImpProductStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetImpProductStatus", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetImpProductStatusResponse());
    }

    public GetImpProductStatusResponse getImpProductStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getImpProductStatusWithOptions(runtime);
    }

    public PublishLiveResponse publishLiveWithOptions(PublishLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishLive", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new PublishLiveResponse());
    }

    public PublishLiveResponse publishLive(PublishLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishLiveWithOptions(request, runtime);
    }

    public GetLiveResponse getLiveWithOptions(GetLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLive", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetLiveResponse());
    }

    public GetLiveResponse getLive(GetLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLiveWithOptions(request, runtime);
    }

    public DeleteRoomResponse deleteRoomWithOptions(DeleteRoomRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRoom", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRoomResponse());
    }

    public DeleteRoomResponse deleteRoom(DeleteRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRoomWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApp", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateRoomResponse createRoomWithOptions(CreateRoomRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRoomShrinkRequest request = new CreateRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extension)) {
            request.extensionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extension, "Extension", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRoom", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRoomResponse());
    }

    public CreateRoomResponse createRoom(CreateRoomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRoomWithOptions(request, runtime);
    }

    public UpdateConferenceResponse updateConferenceWithOptions(UpdateConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConference", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConferenceResponse());
    }

    public UpdateConferenceResponse updateConference(UpdateConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConferenceWithOptions(request, runtime);
    }

    public DeleteConferenceResponse deleteConferenceWithOptions(DeleteConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConference", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConferenceResponse());
    }

    public DeleteConferenceResponse deleteConference(DeleteConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConferenceWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateApp", "2021-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }
}
