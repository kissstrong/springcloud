package com.cyz.springcloud.service;

import com.cyz.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    boolean addDept(Dept dept);
    Dept queryById(int id);
    List<Dept> queryAll();
}
