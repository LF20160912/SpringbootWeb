package com.mike.boot.bootservlet.config;

import com.mike.boot.bootservlet.interceptor.MyInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 拦截器配置类
 */
@SpringBootConfiguration
public class MyWebMvcConfituration extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor());
    }
}
