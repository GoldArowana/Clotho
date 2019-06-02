package com.aries.auth.clotho.dal.repository;

import com.aries.auth.clotho.dal.mapper.UserRoleMapper;
import com.aries.auth.clotho.dal.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;

@Slf4j
public class UserRoleRepository {
    public static Boolean hasPermission(String database, long userId, String url) {
//        if (StringUtils.isBlank(url)) {
//            log.warn("参数异常, url is blank");
//            return false;
//        }
        try (SqlSession session = SqlSessionUtil.openSession(database)) {
            UserRoleMapper roleMapper = session.getMapper(UserRoleMapper.class);
            return roleMapper.hasPermission(userId, url);
        }
    }
}
