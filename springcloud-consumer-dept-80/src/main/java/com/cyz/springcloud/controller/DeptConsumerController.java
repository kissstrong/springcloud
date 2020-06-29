package com.cyz.springcloud.controller;

import com.cyz.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class DeptConsumerController {
    @Autowired
    RestTemplate restTemplate;//需要自己配置在config包下,使用这个可以调用其他module的访问，两个服务都要开启
   // static final String URL_PREFIX="http://localhost:8001";
   static final String URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";
    @RequestMapping("/consumer/query/{id}")
    public Dept queryone(@PathVariable("id") int id){
      return restTemplate.getForObject(URL_PREFIX+"/query/"+id,Dept.class);
    }
    @RequestMapping("/consumer/query")
    public List<Dept> queryall(){
        return restTemplate.getForObject(URL_PREFIX+"/query/",List.class);
    }
    @RequestMapping("/consumer/add/{dname}")
    public boolean queryall(@PathVariable("dname") String dename){
        System.out.println("hello");
        return restTemplate.getForObject(URL_PREFIX+"/add/"+dename,boolean.class);
    }
}
