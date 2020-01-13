package com.zcy.project.springcloud.server.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

/**
 * 代码调用路径追踪
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class AppServerZipkin {
	
	public static void main(String[] args) {
		SpringApplication.run(AppServerZipkin.class, args);
	}

}
