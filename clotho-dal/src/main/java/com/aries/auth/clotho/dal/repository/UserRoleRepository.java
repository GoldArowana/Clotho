package com.aries.auth.clotho.dal.repository;

import com.aries.auth.clotho.dal.mapper.AuthorityMapper;
import com.aries.auth.clotho.dal.mapper.UserRoleMapper;
import com.aries.auth.clotho.dal.po.Authority;
import com.aries.auth.clotho.dal.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import tk.mybatis.mapper.entity.Example;

@Slf4j
public class UserRoleRepository {
    public static boolean hasPermission(String database, long userId, String url) {
        try (SqlSession session = SqlSessionUtil.openSession(database)) {
            UserRoleMapper roleMapper = session.getMapper(UserRoleMapper.class);
            return roleMapper.hasPermission(userId, url);
        }
    }

    public static boolean isLimited(String database, String url) {
        try (SqlSession session = SqlSessionUtil.openSession(database)) {
            AuthorityMapper authorityMapper = session.getMapper(AuthorityMapper.class);
            Example example = new Example(Authority.class);
            example.createCriteria().andEqualTo("url", url);
            return authorityMapper.selectCountByExample(example) > 0;
        }
    }

    public static long authUrlCount(String database, String url) {
        try (SqlSession session = SqlSessionUtil.openSession(database)) {
            AuthorityMapper authorityMapper = session.getMapper(AuthorityMapper.class);
            Example example = new Example(Authority.class);
            example.createCriteria().andEqualTo("url", url);
            return authorityMapper.selectCountByExample(example);
        }
    }
}
