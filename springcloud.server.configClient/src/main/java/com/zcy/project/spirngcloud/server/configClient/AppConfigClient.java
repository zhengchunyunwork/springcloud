package com.zcy.project.spirngcloud.server.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置客户端
 * 从配置服务器获取配置
 *
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
@RefreshScope	//刷新客户款，在客户端执行refresh
public class AppConfigClient {
    public static void main( String[] args ) {
    	SpringApplication.run(AppConfigClient.class, args);
    }

    @Value("${hello}")
    String hello;
    
    @RequestMapping(value = "/hello")
    public String hello(){
        return hello;
    }
}
