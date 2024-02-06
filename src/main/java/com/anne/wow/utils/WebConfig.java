package com.anne.wow.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	// file upload
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//"classpath:/upload/" classpath : builed resources directory by gradle, so need to build again
		registry.addResourceHandler("/resource/**").addResourceLocations("file:src/main/resources/upload/");
    }
}