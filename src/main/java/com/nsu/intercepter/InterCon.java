package com.nsu.intercepter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class InterCon implements WebMvcConfigurer {

    @Bean
    public NsuIntercepter getNsu(){
        return new NsuIntercepter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getNsu()).addPathPatterns("/page/**");
    }


}
