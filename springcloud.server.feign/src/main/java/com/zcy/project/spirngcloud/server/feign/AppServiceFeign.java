package com.zcy.project.spirngcloud.server.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 提供调用其他服务rest的接口
 * 还有像ribbon一样提供负载均衡的能力
 * 本身支持断路器功能
 *
 */

@SpringBootApplication	//springboot启动类注解
@EnableDiscoveryClient	// 注册自动发现
@EnableFeignClients		// 负载均衡
@EnableCircuitBreaker	// 断路器注解
@EnableHystrixDashboard	// 断路器指标监控
public class AppServiceFeign {
    public static void main( String[] args ) {
    	SpringApplication.run(AppServiceFeign.class, args);
    }
}
