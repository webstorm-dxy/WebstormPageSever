package com.example.wsserver.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServerPage {
    @RequestMapping("/test")
    public String test(){
        return "hello world";
    }
}
