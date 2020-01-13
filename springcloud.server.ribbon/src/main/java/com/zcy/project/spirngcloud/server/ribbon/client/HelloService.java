package com.zcy.project.spirngcloud.server.ribbon.client;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired 
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "serviceFailure")		//断路器注解
    public String getHelloContent() {
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/",String.class);
    }
	
	//断路器为open状态的时候调用
	public String serviceFailure() {
	     return "hello world service is not available !";
	}
	
	@HystrixCommand(fallbackMethod = "serviceFailure2")
    public String getIntroduceContent() throws URISyntaxException {
        return restTemplate.getForObject("http://SERVICE-HELLOWORLD/api/hello",String.class);
    }
	
	public String serviceFailure2() {
	     return "getIntroduceContent service is not available !";
	}
}
