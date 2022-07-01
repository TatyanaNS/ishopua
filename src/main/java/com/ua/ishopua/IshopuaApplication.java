package com.ua.ishopua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
@ConfigurationProperties(prefix="spring.security.oauth2.resourceserver")
public class IshopuaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IshopuaApplication.class, args);
    }
}