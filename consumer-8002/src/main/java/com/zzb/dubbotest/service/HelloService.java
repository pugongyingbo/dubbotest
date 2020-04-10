package com.zzb.dubbotest.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;


@Component
public class HelloService {

    @Reference(filter = {"ConsumerFilter.class"})
    private TestService testService;

    public String hello(){
     return testService.hello();
    }
}
