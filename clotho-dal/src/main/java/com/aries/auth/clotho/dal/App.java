package com.aries.auth.clotho.dal;

import com.aries.auth.clotho.dal.repository.UserRoleRepository;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println(CompanyRepository.queryDatabaseByPassword("aries", "123123"));
        Boolean clotho_aries = UserRoleRepository.hasPermission("clotho_aries", 25, "/");
        System.out.println(clotho_aries);
    }
}
