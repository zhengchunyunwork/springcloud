package com.zcy.project.spirngcloud.server.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置服务器
 * 可以从git上获取配置
 *
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class AppConfigServer {
    public static void main( String[] args ) {
    	SpringApplication.run(AppConfigServer.class, args);
    }
}
