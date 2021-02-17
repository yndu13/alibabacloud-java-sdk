// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesResponseBody extends TeaModel {
    @NameInMap("VirtualMFADevices")
    public ListVirtualMFADevicesResponseBodyVirtualMFADevices virtualMFADevices;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("Marker")
    public String marker;

    public static ListVirtualMFADevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualMFADevicesResponseBody self = new ListVirtualMFADevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualMFADevicesResponseBody setVirtualMFADevices(ListVirtualMFADevicesResponseBodyVirtualMFADevices virtualMFADevices) {
        this.virtualMFADevices = virtualMFADevices;
        return this;
    }
    public ListVirtualMFADevicesResponseBodyVirtualMFADevices getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public ListVirtualMFADevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirtualMFADevicesResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListVirtualMFADevicesResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser extends TeaModel {
        @NameInMap("UserPrincipalName")
        public String userPrincipalName;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UserId")
        public String userId;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser self = new ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setUserPrincipalName(String userPrincipalName) {
            this.userPrincipalName = userPrincipalName;
            return this;
        }
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("User")
        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser user;

        @NameInMap("ActivateDate")
        public String activateDate;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice self = new ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setUser(ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser user) {
            this.user = user;
            return this;
        }
        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser getUser() {
            return this.user;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setActivateDate(String activateDate) {
            this.activateDate = activateDate;
            return this;
        }
        public String getActivateDate() {
            return this.activateDate;
        }

    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevices extends TeaModel {
        @NameInMap("VirtualMFADevice")
        public java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> virtualMFADevice;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevices self = new ListVirtualMFADevicesResponseBodyVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevices setVirtualMFADevice(java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> virtualMFADevice) {
            this.virtualMFADevice = virtualMFADevice;
            return this;
        }
        public java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> getVirtualMFADevice() {
            return this.virtualMFADevice;
        }

    }

}