package com.example.demo.controller;

import com.example.demo.bean.MongoConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    MongoConf mongoConf;

    @RequestMapping("/hello")
    public String test(){
        return mongoConf.getAddress();
    }
}
