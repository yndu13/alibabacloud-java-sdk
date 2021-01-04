// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagPortRouteProtocolListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ports")
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyPorts> ports;

    @NameInMap("TaskStates")
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyTaskStates> taskStates;

    public static DescribeSagPortRouteProtocolListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagPortRouteProtocolListResponseBody self = new DescribeSagPortRouteProtocolListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSagPortRouteProtocolListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSagPortRouteProtocolListResponseBody setPorts(java.util.List<DescribeSagPortRouteProtocolListResponseBodyPorts> ports) {
        this.ports = ports;
        return this;
    }
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyPorts> getPorts() {
        return this.ports;
    }

    public DescribeSagPortRouteProtocolListResponseBody setTaskStates(java.util.List<DescribeSagPortRouteProtocolListResponseBodyTaskStates> taskStates) {
        this.taskStates = taskStates;
        return this;
    }
    public java.util.List<DescribeSagPortRouteProtocolListResponseBodyTaskStates> getTaskStates() {
        return this.taskStates;
    }

    public static class DescribeSagPortRouteProtocolListResponseBodyPorts extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("RemoteIp")
        public String remoteIp;

        @NameInMap("PortName")
        public String portName;

        @NameInMap("NeighborIp")
        public String neighborIp;

        @NameInMap("RouteProtocol")
        public String routeProtocol;

        @NameInMap("RemoteAs")
        public String remoteAs;

        @NameInMap("Vlan")
        public String vlan;

        public static DescribeSagPortRouteProtocolListResponseBodyPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagPortRouteProtocolListResponseBodyPorts self = new DescribeSagPortRouteProtocolListResponseBodyPorts();
            return TeaModel.build(map, self);
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setPortName(String portName) {
            this.portName = portName;
            return this;
        }
        public String getPortName() {
            return this.portName;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setNeighborIp(String neighborIp) {
            this.neighborIp = neighborIp;
            return this;
        }
        public String getNeighborIp() {
            return this.neighborIp;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setRouteProtocol(String routeProtocol) {
            this.routeProtocol = routeProtocol;
            return this;
        }
        public String getRouteProtocol() {
            return this.routeProtocol;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setRemoteAs(String remoteAs) {
            this.remoteAs = remoteAs;
            return this;
        }
        public String getRemoteAs() {
            return this.remoteAs;
        }

        public DescribeSagPortRouteProtocolListResponseBodyPorts setVlan(String vlan) {
            this.vlan = vlan;
            return this;
        }
        public String getVlan() {
            return this.vlan;
        }

    }

    public static class DescribeSagPortRouteProtocolListResponseBodyTaskStates extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("State")
        public String state;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("CreateTime")
        public String createTime;

        public static DescribeSagPortRouteProtocolListResponseBodyTaskStates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSagPortRouteProtocolListResponseBodyTaskStates self = new DescribeSagPortRouteProtocolListResponseBodyTaskStates();
            return TeaModel.build(map, self);
        }

        public DescribeSagPortRouteProtocolListResponseBodyTaskStates setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSagPortRouteProtocolListResponseBodyTaskStates setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeSagPortRouteProtocolListResponseBodyTaskStates setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeSagPortRouteProtocolListResponseBodyTaskStates setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
