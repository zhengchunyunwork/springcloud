package com.zcy.project.spirngcloud.server.feign.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zcy.project.spirngcloud.server.feign.service.IHelloWorldService;

@RestController
public class WebController {

	@Autowired 
	IHelloWorldService helloWorldFeignService;
    
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return helloWorldFeignService.sayHello();
    }
    
    @RequestMapping(value = "/introduce",method = RequestMethod.POST)
    public String introduce(@RequestParam("name") String name, @RequestParam("zy") String zy){
        return helloWorldFeignService.introduce(name, zy);
    }
}
