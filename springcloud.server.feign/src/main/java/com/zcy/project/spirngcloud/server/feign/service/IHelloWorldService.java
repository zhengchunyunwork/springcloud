package com.zcy.project.spirngcloud.server.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zcy.project.spirngcloud.server.feign.service.impl.HelloWorldServiceFailure;

@FeignClient(value = "SERVICE-HELLOWORLD", fallback = HelloWorldServiceFailure.class )
public interface IHelloWorldService {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	String sayHello();
	
	@RequestMapping(value = "/api/introduce",method = RequestMethod.POST)
	String introduce(@RequestParam("name") String name, @RequestParam("zy") String zy);
}
