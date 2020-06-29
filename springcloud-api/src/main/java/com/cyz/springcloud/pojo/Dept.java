package com.cyz.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@NoArgsConstructor//无参构造
//@AllArgsConstructor//有参构造,这里不需要
@Accessors(chain = true)//链式写法
/*
* 链式写法介绍：
* Dept dept =new Dept（）；
* dept.setdname("市场部").setdb_source("dd").....
*
* */
public class Dept implements Serializable {
    private int deptno;
    private String dname;
    //是哪个数据库的字段~ 微服务，一个服务对应一个数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
