package com.metacoding.upload;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);

        // 1. 절대경로 file:///c:/upload/
        // 2. 상대경로 file:./upload/
        registry
                .addResourceHandler("/upload/**") // html에서 경로를 읽으면
                .addResourceLocations("file:" + "./images/") // 웹서버의 /images/ 폴더 경로를 찾음
                .setCachePeriod(60*60); // 초단위 >> 한시간

        // file://localhost/머시기/upload/images/
    }
}
