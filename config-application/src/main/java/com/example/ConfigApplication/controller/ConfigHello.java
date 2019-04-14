package com.example.ConfigApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigHello {
    @Value("${test.conf.double}")
    private String name;



//    @Autowired
//    private Environment environment;
    @RequestMapping("/hello")
    public String Hello(){
        return this.name;
    }
//    @RequestMapping("/hello2")
//    public String Hello2(){
//        return this.environment.getProfiles().toString();
//    }
}
