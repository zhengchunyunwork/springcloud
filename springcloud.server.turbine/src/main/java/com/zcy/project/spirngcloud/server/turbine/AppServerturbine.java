package com.zcy.project.spirngcloud.server.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 全面监控接口情况
 * 页面在chrome浏览器正常展示，ie报错
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class AppServerturbine {
    public static void main( String[] args ) {
    	SpringApplication.run(AppServerturbine.class, args);
    }
}
