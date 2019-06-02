package com.aries.auth.clotho.dal.mapper;


import com.aries.auth.clotho.dal.po.UserRole;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserRoleMapper extends Mapper<UserRole> {
    //    @Select("select count(*) from role ")
    Boolean hasPermission(@Param(value = "userId") long userId, @Param(value = "url") String url);
}
