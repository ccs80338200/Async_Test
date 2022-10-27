package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
public class Controller {

    @GetMapping("/test1")
    public String test1(){
        return "hello test1";
    }
}
