package com.aries.auth.clotho.client.thrift;

import com.aries.auth.clotho.client.thrift.facade.PermissionFacade;
import com.aries.auth.clotho.client.thrift.vo.RequestVO;
import org.apache.thrift.transport.TTransportException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws TTransportException {
//        Boolean result = ThriftHelper.call("Clotho", PermissionServer.Client.class, client -> client.hasPermission(new CompanyDTO("aries", "123123", ""), new RequestDTO(25, "/")));
        System.out.println(PermissionFacade.hasPermission(RequestVO.RequestVOBuilder.aRequestVO().userId(25).url("/bbs").build()));
    }
}
