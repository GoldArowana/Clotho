package com.aries.auth.clotho.client.thrift.facade;

import com.aries.auth.clotho.client.thrift.vo.RequestVO;
import com.aries.auth.clotho.idl.thrift.dto.CompanyDTO;
import com.aries.auth.clotho.idl.thrift.service.PermissionServer;
import com.aries.hera.client.thrift.ThriftHelper;
import com.aries.hera.client.thrift.exception.ServiceNotFoundException;
import com.aries.hera.core.utils.PropertiesProxy;
import org.apache.thrift.transport.TTransportException;

public class PermissionFacade {
    private static final CompanyDTO companyDTO;

    static {
        PropertiesProxy propertiesProxy = new PropertiesProxy("clotho-pass.properties");
        String company = propertiesProxy.readProperty("company");
        String password = propertiesProxy.readProperty("password");
        companyDTO = new CompanyDTO(company, password, "");
    }

    public static boolean hasPermission(RequestVO requestVO) throws ServiceNotFoundException, TTransportException {
        return ThriftHelper.call("Clotho", PermissionServer.Client.class, client -> client.hasPermission(companyDTO, RequestVO.toDTO(requestVO)));
    }


}
