package com.zcy.project.spirngcloud.server.feign.utils;

import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Configuration
public class FeignInterceptor implements RequestInterceptor {

	@Override
	public void apply(RequestTemplate template) {
		template.header("ab", "abc");
	}

}
