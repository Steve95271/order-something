package com.order_something.holy_grail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHolyGrail {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Holy Grail!";
    }

}
