package com.cyz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient//开启eureka
@EnableFeignClients(basePackages = "com.cyz.springcloud")//开启feign
public class Consumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_80.class,args);
    }
}
