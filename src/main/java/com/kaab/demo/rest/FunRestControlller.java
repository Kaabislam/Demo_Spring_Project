package com.kaab.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestControlller {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/kaab")
    public String sayName(){
        return "My Name is Kaab";
    }
}
