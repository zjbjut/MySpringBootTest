package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Component;

@Component
public class MongoConf {
    @Value("${test.address}")
    private String address;

//    @Value("${test.mongo.name}")
    private String name;

//    @Value("${test.mongo.paswe}")
    private String paswe;

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaswe() {
        return paswe;
    }

    public void setPaswe(String paswe) {
        this.paswe = paswe;
    }
}
