package com.example.controller;

import com.example.api.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    public String index() {
        return apiService.index();
    }
    @RequestMapping("index2")
    public String index2(){
        return apiService.re();
    }
}
