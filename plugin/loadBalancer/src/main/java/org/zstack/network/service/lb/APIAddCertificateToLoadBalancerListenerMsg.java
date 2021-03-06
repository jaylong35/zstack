package org.zstack.network.service.lb;

import org.springframework.http.HttpMethod;
import org.zstack.header.identity.Action;
import org.zstack.header.message.APIEvent;
import org.zstack.header.message.APIMessage;
import org.zstack.header.message.APIParam;
import org.zstack.header.other.APIAuditor;
import org.zstack.header.rest.APINoSee;
import org.zstack.header.rest.RestRequest;

/**
 * Created by shixin on 03/26/2018.
 */
@Action(category = LoadBalancerConstants.ACTION_CATEGORY)
@RestRequest(
        path = "/load-balancers/listeners/{listenerUuid}/certificate",
        method = HttpMethod.POST,
        parameterName = "params",
        responseClass = APIAddCertificateToLoadBalancerListenerEvent.class
)
public class APIAddCertificateToLoadBalancerListenerMsg extends APIMessage implements LoadBalancerMessage, APIAuditor {
    @APIParam(resourceType = CertificateVO.class, checkAccount = true, operationTarget = true, nonempty = true)
    private String certificateUuid;
    @APIParam(resourceType = LoadBalancerListenerVO.class, checkAccount = true, operationTarget = true)
    private String listenerUuid;
    @APINoSee
    private String loadBalancerUuid;

    public String getListenerUuid() {
        return listenerUuid;
    }

    public void setListenerUuid(String listenerUuid) {
        this.listenerUuid = listenerUuid;
    }

    public String getCertificateUuid() {
        return certificateUuid;
    }

    public void setCertificateUuid(String certificateUuid) {
        this.certificateUuid = certificateUuid;
    }

    @Override
    public String getLoadBalancerUuid() {
        return loadBalancerUuid;
    }

    public void setLoadBalancerUuid(String loadBalancerUuid) {
        this.loadBalancerUuid = loadBalancerUuid;
    }
 
    public static APIAddCertificateToLoadBalancerListenerMsg __example__() {
        APIAddCertificateToLoadBalancerListenerMsg msg = new APIAddCertificateToLoadBalancerListenerMsg();

        msg.setCertificateUuid(uuid());
        msg.setListenerUuid(uuid());
        msg.setLoadBalancerUuid(uuid());

        return msg;
    }

    @Override
    public Result audit(APIMessage msg, APIEvent rsp) {
        return new Result(((APIAddCertificateToLoadBalancerListenerMsg)msg).getLoadBalancerUuid(), LoadBalancerVO.class);
    }
}
