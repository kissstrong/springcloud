package com.cyz.springcloud;

import com.cyz.springcloud.pojo.Dept;
import com.cyz.springcloud.service.DeptService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
//服务降级
@Component
public class DeptConsumer_Hystrix implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryById(int id) {
                return new Dept("服务器已断开~~~~");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }
        };
    }
}
