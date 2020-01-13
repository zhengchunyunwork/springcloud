package com.zcy.project.spirngcloud.server.ribbon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**
 * 切换负载均衡算法不生效
 * @author Administrator
 *
 */
@Configuration
public class MySelfRule{
	@Bean
    public IRule myRule() {
    	//会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务,以及并发的连接数量超过阈值的服务,然后对剩余的服务列表按照轮询策略进行访问
//        return new AvailabilityFilteringRule(); 
        
        // 显式的指定使用轮询算法
        return new RoundRobinRule();
        //随机访问
//        return new RandomRule();
    }
}