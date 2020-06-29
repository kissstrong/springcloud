package com.cyz.springcloud.controller;

import com.cyz.springcloud.pojo.Dept;
import com.cyz.springcloud.service.DeptServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    DeptServiceImpl deptService;

    @RequestMapping("/add/{dname}")
    public boolean add(@PathVariable("dname") String dname){
        Dept dept = new Dept(dname);
        return deptService.addDept(dept);
    }
    @RequestMapping("/query/{id}")
    @HystrixCommand(fallbackMethod = "QueryById_Hystrix")
    public Dept queryByid(@PathVariable("id") int id){
        int i = Integer.parseInt(String.valueOf(id));
        Dept dept = deptService.queryById(i);
        if (dept==null){
            throw new RuntimeException();
        }
        return dept;
    }
    public Dept QueryById_Hystrix(@PathVariable("id") int id){


        return new Dept("该用户不存在");
    }


    @RequestMapping("/query")
    public List<Dept> add(){
        return deptService.queryAll();
    }
}
