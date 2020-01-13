package com.zcy.project.spirngcloud.server.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由网关
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class AppServiceZuul {
	
    public static void main( String[] args ) {
    	SpringApplication.run(AppServiceZuul.class, args);
    }
}
