package com.hc.config;

import com.hc.interceptor.MyHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        MyHandlerInterceptor myHandlerInterceptor = new MyHandlerInterceptor();
        //如果有多个拦截器的话，添加顺序就是拦截顺序
        registry.addInterceptor(getHandlerInterceptor())
                .addPathPatterns("/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }

    @Bean
    public static HandlerInterceptor getHandlerInterceptor() {
        return new MyHandlerInterceptor();
    }
}
