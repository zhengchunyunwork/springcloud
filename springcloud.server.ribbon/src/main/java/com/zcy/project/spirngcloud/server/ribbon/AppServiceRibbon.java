package com.zcy.project.spirngcloud.server.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.zcy.project.spirngcloud.server.ribbon.config.MySelfRule;

/**
 * 服务自动发现与消费
 * 并且提供负载均衡
 * @LoadBalanced  此注释提供了负载均衡
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker	// 使用断路器
@EnableHystrixDashboard	// 断路器指标监控
@RibbonClient(name="SERVICE-HELLOWORLD", configuration=MySelfRule.class) //切换负载均衡算法用，但不生效
public class AppServiceRibbon {

    public static void main(String[] args) {
        SpringApplication.run(AppServiceRibbon.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}
