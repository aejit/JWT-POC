package com.example.demo_JWT.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoJwtController {

    @RequestMapping ({"/hello"})
    public String firstPage(){
        return "Hello Word!!";
    }
}
