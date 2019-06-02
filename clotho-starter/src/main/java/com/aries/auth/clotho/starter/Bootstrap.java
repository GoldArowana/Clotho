package com.aries.auth.clotho.starter;


import com.aries.auth.clotho.server.thrift.ThriftServer;

public class Bootstrap {
    public static void main(String[] args) {
        new ThriftServer().start();
    }
}
