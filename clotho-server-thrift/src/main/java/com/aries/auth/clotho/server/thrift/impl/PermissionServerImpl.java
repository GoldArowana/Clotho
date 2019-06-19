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
            // 数据库中是否有user和url的关系
            boolean hasPermission = UserRoleRepository.hasPermission(companyHelper.getDatabaseName(), requestDTO.getUserId(), requestDTO.getUrl());
            // 如果有，那么说明该user有url的权限。如果没有，不一定是没有权限，也可能是该url不限制权限，任何人都可以访问。
            if (hasPermission) {
                return true;
            }

            // 判断url是否被限制，如果没被限制，那么返回true，并记录到布隆过滤器中，防止后续再次访问。
            boolean limited = UserRoleRepository.isLimited(companyHelper.getDatabaseName(), requestDTO.getUrl());
            if (!limited) {
                return true;
            }

            return false;
        } catch (Exception e) {
            log.error("check permission error:{}", e.getMessage(), e);
            return false;
        }
    }
}
