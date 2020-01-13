package com.zcy.project.spirngcloud.server.ribbon.action;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zcy.project.spirngcloud.server.ribbon.client.HelloService;

@RestController
public class HelloAction {

	@Autowired
	HelloService helloService;
	
	@RequestMapping("/")
	public String home() {
		return helloService.getHelloContent();
	}
	
	@RequestMapping(value = "/introduce",method = RequestMethod.POST)
    public String introduce() throws URISyntaxException{
        return helloService.getIntroduceContent();
    }
	
}
