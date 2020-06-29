package com.cyz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient//开启注册功能
@EnableHystrix
public class Dept8001 {
    public static void main(String[] args) {
        SpringApplication.run(Dept8001.class,args);
    }
}
