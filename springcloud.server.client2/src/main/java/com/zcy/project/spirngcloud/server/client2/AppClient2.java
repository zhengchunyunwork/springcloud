package com.zcy.project.spirngcloud.server.client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class AppClient2 {
	
	public static void main(String[] args) {
		SpringApplication.run(AppClient2.class, args);
	}

	
	@Value("${server.port}")
	String port;
	
	@RequestMapping("/")
	public String home() {
		return "hello world from port " + port;
	}
	
	@RequestMapping("/api/hello")
	public String introduce() {
		return "introduce from port " + port;
	}
	
	@RequestMapping("/api/introduce")
	public String introduce(@RequestParam("name") String name, @RequestParam("zy") String zy) {
		return "hello world from port " + port + ", and my name is " + name + ", I am a "+ zy;
	}
}
