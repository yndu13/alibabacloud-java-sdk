// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerHTTPSListenerAttributeResponseBody extends TeaModel {
    @NameInMap("AclType")
    public String aclType;

    @NameInMap("XForwardedFor_ClientCertClientVerify")
    public String XForwardedFor_ClientCertClientVerify;

    @NameInMap("CACertificateId")
    public String CACertificateId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HealthCheckConnectPort")
    public Integer healthCheckConnectPort;

    @NameInMap("BackendServerPort")
    public Integer backendServerPort;

    @NameInMap("CookieTimeout")
    public Integer cookieTimeout;

    @NameInMap("HealthCheckDomain")
    public String healthCheckDomain;

    @NameInMap("XForwardedFor")
    public String XForwardedFor;

    @NameInMap("XForwardedFor_ClientCertFingerprint")
    public String XForwardedFor_ClientCertFingerprint;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("HealthCheckURI")
    public String healthCheckURI;

    @NameInMap("XForwardedFor_SLBPORT")
    public String XForwardedFor_SLBPORT;

    @NameInMap("StickySessionType")
    public String stickySessionType;

    @NameInMap("Scheduler")
    public String scheduler;

    @NameInMap("XForwardedFor_proto")
    public String XForwardedFor_proto;

    @NameInMap("HealthCheckMethod")
    public String healthCheckMethod;

    @NameInMap("TLSCipherPolicy")
    public String TLSCipherPolicy;

    @NameInMap("Status")
    public String status;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("XForwardedFor_ClientSrcPort")
    public String XForwardedFor_ClientSrcPort;

    @NameInMap("Cookie")
    public String cookie;

    @NameInMap("Gzip")
    public String gzip;

    @NameInMap("EnableHttp2")
    public String enableHttp2;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("Description")
    public String description;

    @NameInMap("HealthCheckTimeout")
    public Integer healthCheckTimeout;

    @NameInMap("AclStatus")
    public String aclStatus;

    @NameInMap("UnhealthyThreshold")
    public Integer unhealthyThreshold;

    @NameInMap("XForwardedFor_SLBID")
    public String XForwardedFor_SLBID;

    @NameInMap("XForwardedFor_ClientCertSubjectDN")
    public String XForwardedFor_ClientCertSubjectDN;

    @NameInMap("SecurityStatus")
    public String securityStatus;

    @NameInMap("HealthCheckHttpCode")
    public String healthCheckHttpCode;

    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    @NameInMap("HealthCheckInterval")
    public Integer healthCheckInterval;

    @NameInMap("ServerCertificateId")
    public String serverCertificateId;

    @NameInMap("AclId")
    public String aclId;

    @NameInMap("XForwardedFor_ClientCertIssuerDN")
    public String XForwardedFor_ClientCertIssuerDN;

    @NameInMap("HealthyThreshold")
    public Integer healthyThreshold;

    @NameInMap("XForwardedFor_SLBIP")
    public String XForwardedFor_SLBIP;

    @NameInMap("StickySession")
    public String stickySession;

    @NameInMap("HealthCheck")
    public String healthCheck;

    @NameInMap("Rules")
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules rules;

    @NameInMap("DomainExtensions")
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions domainExtensions;

    public static DescribeLoadBalancerHTTPSListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerHTTPSListenerAttributeResponseBody self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setAclType(String aclType) {
        this.aclType = aclType;
        return this;
    }
    public String getAclType() {
        return this.aclType;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientCertClientVerify(String XForwardedFor_ClientCertClientVerify) {
        this.XForwardedFor_ClientCertClientVerify = XForwardedFor_ClientCertClientVerify;
        return this;
    }
    public String getXForwardedFor_ClientCertClientVerify() {
        return this.XForwardedFor_ClientCertClientVerify;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setCACertificateId(String CACertificateId) {
        this.CACertificateId = CACertificateId;
        return this;
    }
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckConnectPort(Integer healthCheckConnectPort) {
        this.healthCheckConnectPort = healthCheckConnectPort;
        return this;
    }
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setBackendServerPort(Integer backendServerPort) {
        this.backendServerPort = backendServerPort;
        return this;
    }
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setCookieTimeout(Integer cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
        return this;
    }
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckDomain(String healthCheckDomain) {
        this.healthCheckDomain = healthCheckDomain;
        return this;
    }
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor(String XForwardedFor) {
        this.XForwardedFor = XForwardedFor;
        return this;
    }
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientCertFingerprint(String XForwardedFor_ClientCertFingerprint) {
        this.XForwardedFor_ClientCertFingerprint = XForwardedFor_ClientCertFingerprint;
        return this;
    }
    public String getXForwardedFor_ClientCertFingerprint() {
        return this.XForwardedFor_ClientCertFingerprint;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckURI(String healthCheckURI) {
        this.healthCheckURI = healthCheckURI;
        return this;
    }
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
        this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
        return this;
    }
    public String getXForwardedFor_SLBPORT() {
        return this.XForwardedFor_SLBPORT;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setStickySessionType(String stickySessionType) {
        this.stickySessionType = stickySessionType;
        return this;
    }
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_proto(String XForwardedFor_proto) {
        this.XForwardedFor_proto = XForwardedFor_proto;
        return this;
    }
    public String getXForwardedFor_proto() {
        return this.XForwardedFor_proto;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckMethod(String healthCheckMethod) {
        this.healthCheckMethod = healthCheckMethod;
        return this;
    }
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setTLSCipherPolicy(String TLSCipherPolicy) {
        this.TLSCipherPolicy = TLSCipherPolicy;
        return this;
    }
    public String getTLSCipherPolicy() {
        return this.TLSCipherPolicy;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
        this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
        return this;
    }
    public String getXForwardedFor_ClientSrcPort() {
        return this.XForwardedFor_ClientSrcPort;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setCookie(String cookie) {
        this.cookie = cookie;
        return this;
    }
    public String getCookie() {
        return this.cookie;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setGzip(String gzip) {
        this.gzip = gzip;
        return this;
    }
    public String getGzip() {
        return this.gzip;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setEnableHttp2(String enableHttp2) {
        this.enableHttp2 = enableHttp2;
        return this;
    }
    public String getEnableHttp2() {
        return this.enableHttp2;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckTimeout(Integer healthCheckTimeout) {
        this.healthCheckTimeout = healthCheckTimeout;
        return this;
    }
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setAclStatus(String aclStatus) {
        this.aclStatus = aclStatus;
        return this;
    }
    public String getAclStatus() {
        return this.aclStatus;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_SLBID(String XForwardedFor_SLBID) {
        this.XForwardedFor_SLBID = XForwardedFor_SLBID;
        return this;
    }
    public String getXForwardedFor_SLBID() {
        return this.XForwardedFor_SLBID;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientCertSubjectDN(String XForwardedFor_ClientCertSubjectDN) {
        this.XForwardedFor_ClientCertSubjectDN = XForwardedFor_ClientCertSubjectDN;
        return this;
    }
    public String getXForwardedFor_ClientCertSubjectDN() {
        return this.XForwardedFor_ClientCertSubjectDN;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setSecurityStatus(String securityStatus) {
        this.securityStatus = securityStatus;
        return this;
    }
    public String getSecurityStatus() {
        return this.securityStatus;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckHttpCode(String healthCheckHttpCode) {
        this.healthCheckHttpCode = healthCheckHttpCode;
        return this;
    }
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheckInterval(Integer healthCheckInterval) {
        this.healthCheckInterval = healthCheckInterval;
        return this;
    }
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_ClientCertIssuerDN(String XForwardedFor_ClientCertIssuerDN) {
        this.XForwardedFor_ClientCertIssuerDN = XForwardedFor_ClientCertIssuerDN;
        return this;
    }
    public String getXForwardedFor_ClientCertIssuerDN() {
        return this.XForwardedFor_ClientCertIssuerDN;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setXForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
        this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
        return this;
    }
    public String getXForwardedFor_SLBIP() {
        return this.XForwardedFor_SLBIP;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setStickySession(String stickySession) {
        this.stickySession = stickySession;
        return this;
    }
    public String getStickySession() {
        return this.stickySession;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setHealthCheck(String healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }
    public String getHealthCheck() {
        return this.healthCheck;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setRules(DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules rules) {
        this.rules = rules;
        return this;
    }
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules getRules() {
        return this.rules;
    }

    public DescribeLoadBalancerHTTPSListenerAttributeResponseBody setDomainExtensions(DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions domainExtensions) {
        this.domainExtensions = domainExtensions;
        return this;
    }
    public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions getDomainExtensions() {
        return this.domainExtensions;
    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule extends TeaModel {
        @NameInMap("VServerGroupId")
        public String VServerGroupId;

        @NameInMap("Url")
        public String url;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setVServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule> rule;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRules setRule(java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyRulesRule> getRule() {
            return this.rule;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension extends TeaModel {
        @NameInMap("ServerCertificateId")
        public String serverCertificateId;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("DomainExtensionId")
        public String domainExtensionId;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension setServerCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension setDomainExtensionId(String domainExtensionId) {
            this.domainExtensionId = domainExtensionId;
            return this;
        }
        public String getDomainExtensionId() {
            return this.domainExtensionId;
        }

    }

    public static class DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions extends TeaModel {
        @NameInMap("DomainExtension")
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension> domainExtension;

        public static DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions self = new DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensions setDomainExtension(java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension> domainExtension) {
            this.domainExtension = domainExtension;
            return this;
        }
        public java.util.List<DescribeLoadBalancerHTTPSListenerAttributeResponseBodyDomainExtensionsDomainExtension> getDomainExtension() {
            return this.domainExtension;
        }

    }

}
