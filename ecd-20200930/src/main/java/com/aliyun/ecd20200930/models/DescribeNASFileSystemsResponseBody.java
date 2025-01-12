// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNASFileSystemsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FileSystems")
    public java.util.List<DescribeNASFileSystemsResponseBodyFileSystems> fileSystems;

    public static DescribeNASFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNASFileSystemsResponseBody self = new DescribeNASFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNASFileSystemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNASFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNASFileSystemsResponseBody setFileSystems(java.util.List<DescribeNASFileSystemsResponseBodyFileSystems> fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public java.util.List<DescribeNASFileSystemsResponseBodyFileSystems> getFileSystems() {
        return this.fileSystems;
    }

    public static class DescribeNASFileSystemsResponseBodyFileSystems extends TeaModel {
        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("MountTargetStatus")
        public String mountTargetStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        @NameInMap("SupportAcl")
        public Boolean supportAcl;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("FileSystemType")
        public String fileSystemType;

        @NameInMap("FileSystemName")
        public String fileSystemName;

        @NameInMap("MeteredSize")
        public Long meteredSize;

        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        @NameInMap("Description")
        public String description;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("FileSystemStatus")
        public String fileSystemStatus;

        public static DescribeNASFileSystemsResponseBodyFileSystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeNASFileSystemsResponseBodyFileSystems self = new DescribeNASFileSystemsResponseBodyFileSystems();
            return TeaModel.build(map, self);
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setMountTargetStatus(String mountTargetStatus) {
            this.mountTargetStatus = mountTargetStatus;
            return this;
        }
        public String getMountTargetStatus() {
            return this.mountTargetStatus;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setSupportAcl(Boolean supportAcl) {
            this.supportAcl = supportAcl;
            return this;
        }
        public Boolean getSupportAcl() {
            return this.supportAcl;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setFileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setMeteredSize(Long meteredSize) {
            this.meteredSize = meteredSize;
            return this;
        }
        public Long getMeteredSize() {
            return this.meteredSize;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeNASFileSystemsResponseBodyFileSystems setFileSystemStatus(String fileSystemStatus) {
            this.fileSystemStatus = fileSystemStatus;
            return this;
        }
        public String getFileSystemStatus() {
            return this.fileSystemStatus;
        }

    }

}
