package com.cyz.springcloud.controller;

import com.cyz.springcloud.pojo.Dept;
import com.cyz.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
public class DeptConsumerController {

   @Autowired
   DeptService deptService;
    @RequestMapping("/consumer/query/{id}")
    public Dept queryone(@PathVariable("id") int id){
      return this.deptService.queryById(id);
    }
    @RequestMapping("/consumer/query")
    public List<Dept> queryall(){
        return this.deptService.queryAll();
    }
    @RequestMapping("/consumer/add/{dname}")
    public boolean add(@PathVariable("dname") String dename){
       Dept dept =new Dept(dename);
        return this.deptService.addDept(dept);
    }
}
