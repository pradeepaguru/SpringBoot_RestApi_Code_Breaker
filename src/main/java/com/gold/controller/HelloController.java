package com.gold.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {
    @Value("${Welcome.message}")
    private String welcomeMsg;
    @GetMapping("/get")
    public String getMessage(){

        return welcomeMsg;
    }

}
