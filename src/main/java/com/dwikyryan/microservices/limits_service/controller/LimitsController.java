package com.dwikyryan.microservices.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwikyryan.microservices.limits_service.bean.Limits;
import com.dwikyryan.microservices.limits_service.configuration.Configuration;

@RestController
public class LimitsController {
    private Configuration configuration;

    @Autowired
    public LimitsController(Configuration configuration){
        this.configuration = configuration;
    }

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimun(), configuration.getMaximum());
    }
    
}
