package com.zzb.dubbotest.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zzb.dubbotest.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
      return helloService.hello();
    }
}
