package com.aries.auth.clotho.server.thrift;

import com.aries.auth.clotho.core.utils.PropertiesProxy;
import com.aries.auth.clotho.idl.thrift.service.PermissionServer;
import com.aries.auth.clotho.server.thrift.impl.PermissionServerImpl;
import com.aries.hera.client.thrift.DiscoverClient;
import com.aries.hera.contract.thrift.dto.ServiceInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

import static com.aries.auth.clotho.core.constance.AppConst.APP_NAME;
import static com.aries.auth.clotho.core.constance.AppConst.PORT;

@Slf4j
public class ThriftServer {

    public void start() {
        try {
            TMultiplexedProcessor processor = new TMultiplexedProcessor();

            { // 准备注册 CategoryServer
                PermissionServer.Iface permissionServer = new PermissionServerImpl();
                PermissionServer.Processor permissionProcessor = new PermissionServer.Processor<>(permissionServer);
                String simpleName = PermissionServer.class.getSimpleName();
                log.info("simpleName:{}", simpleName);
                processor.registerProcessor(simpleName, permissionProcessor);
            }


            // 设置端口
            TServerTransport serverTransport = new TServerSocket(PORT);
            TThreadPoolServer.Args args = new TThreadPoolServer.Args(serverTransport)
                    .processor(processor)
                    .maxWorkerThreads(16)
                    .minWorkerThreads(2)
                    .requestTimeout(5000);
            TServer server = new TThreadPoolServer(args);
            log.info("服务启动,端口:{}", PORT);

            // 用新线程开启服务。
            new Thread(() -> {
                try {
                    server.serve();
                } catch (Exception e) {
                    log.error("Clotho服务异常,error:{}", e.getMessage(), e);
                }
            }, "thrift-service-starter-thread").start();


            // 注册服务
            PropertiesProxy heraProperties = new PropertiesProxy("/opt/config/local.properties");
            String apphost = heraProperties.readProperty("host");

            DiscoverClient.registe(new ServiceInfo(APP_NAME, apphost, PORT));
            log.info("注册服务, appname:{}, host:{}, port:{}", APP_NAME, apphost, PORT);
        } catch (Exception x) {
            log.error("创建服务失败,error:{}", x.getMessage(), x);
        }
    }
}