package com.cyz.springcloud.service;

import com.cyz.springcloud.DeptConsumer_Hystrix;
import com.cyz.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptConsumer_Hystrix.class)
public interface DeptService {

    @RequestMapping("/add")
    boolean addDept(Dept dept);

    @RequestMapping("/query/{id}")
    Dept queryById(@PathVariable("id") int id);

    @RequestMapping("/query")
    List<Dept> queryAll();
}
