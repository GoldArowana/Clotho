package com.aries.auth.clotho.server.thrift.biz;


import com.aries.auth.clotho.dal.repository.CompanyRepository;
import com.aries.auth.clotho.server.thrift.bean.CompanyBean;

public class CompanyBiz {
    public static String getDatabase(CompanyBean company) {
        return CompanyRepository.queryDatabaseByPassword(company.getName(), company.getPassword());
    }
}
