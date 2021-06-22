package com.SpringBoot.crm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.SpringBoot.crm.controller")
@EntityScan(basePackages="com.SpringBoot.crm.domain")
@EnableJpaRepositories(basePackages="com.SpringBoot.crm.data.repository")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}