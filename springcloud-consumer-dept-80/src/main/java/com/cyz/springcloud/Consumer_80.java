package com.cyz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//开启eureka
public class Consumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_80.class,args);
    }
}
