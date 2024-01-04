package com.programerian.auth.server.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/test")
public class MyController {

    @GetMapping("/user")
    public String getUser() {
        return "user";
    }
}
