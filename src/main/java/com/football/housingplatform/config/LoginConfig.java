package com.football.housingplatform.config;

import com.football.housingplatform.interceptor.AdminInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration interceptor = registry.addInterceptor(new AdminInterceptor());
        interceptor.addPathPatterns("/**");
        interceptor.excludePathPatterns("/login","/signup","/**/*.jsp","/Login","/**/*.jpg");
    }
}
