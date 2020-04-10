package com.zzb.dubbotest.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class TestServiceImpl implements TestService{

    @Override
    public String hello() {
        return "hello";
    }
}
