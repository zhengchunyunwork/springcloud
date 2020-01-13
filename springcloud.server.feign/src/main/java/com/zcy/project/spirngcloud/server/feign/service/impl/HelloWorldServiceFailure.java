package com.zcy.project.spirngcloud.server.feign.service.impl;

import org.springframework.stereotype.Service;

import com.zcy.project.spirngcloud.server.feign.service.IHelloWorldService;

@Service
public class HelloWorldServiceFailure implements IHelloWorldService{

	@Override
	public String sayHello() {
		System.out.println("hello world service is not available !");
		return "hello world service is not available !";
	}

	@Override
	public String introduce(String name, String zy) {
		System.out.println("introduce service is not available !");
		return "introduce service is not available !";
	}

}
