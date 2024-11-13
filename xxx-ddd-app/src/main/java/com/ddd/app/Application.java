package com.ddd.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ddd.demo.trigger"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}