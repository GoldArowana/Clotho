package com.aries.auth.clotho.server.thrift.impl;

import com.alibaba.fastjson.JSON;
import com.aries.auth.clotho.dal.repository.UserRoleRepository;
import com.aries.auth.clotho.idl.thrift.dto.CompanyDTO;
import com.aries.auth.clotho.idl.thrift.dto.RequestDTO;
import com.aries.auth.clotho.idl.thrift.service.PermissionServer;
import com.aries.auth.clotho.server.thrift.util.CompanyHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;

@Slf4j
public class PermissionServerImpl implements PermissionServer.Iface {
    @Override
    public String ping() throws TException {
        log.debug("pong, category server");
        return "pong, this is permission server";
    }

    @Override
    public boolean hasPermission(CompanyDTO companyDTO, RequestDTO requestDTO) throws TException {
        CompanyHelper companyHelper = new CompanyHelper(companyDTO).check();
        if (companyHelper.isError()) {
            log.warn("hasPermission 没有权限, companyDTO:{}, requestDTO:{}", JSON.toJSONString(companyDTO), requestDTO);
            return false;
        }
        try {
            return UserRoleRepository.hasPermission(companyHelper.getDatabaseName(), requestDTO.getUserId(), requestDTO.getUrl());
        } catch (Exception e) {
            log.error("check permission error:{}", e.getMessage(), e);
            return false;
        }
    }
}
