package com.example.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index() {
        return "Hello World!,端口：" + port;
    }
    @RequestMapping("index2")
    public String index2(){
        return "wewewwewewewe:"+port;
    }
}

