package com.aries.auth.clotho.server.thrift.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyBean {
    private String name;
    private String password;
    private String keyword;
}
