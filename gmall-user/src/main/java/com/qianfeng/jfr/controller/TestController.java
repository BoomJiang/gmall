package com.qianfeng.jfr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("info")
    public String test(){
        return "This is a SpringBoot Project!";
    }
}
