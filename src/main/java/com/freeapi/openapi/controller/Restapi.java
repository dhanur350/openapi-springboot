package com.freeapi.openapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Restapi {

    @GetMapping("/user/dhanur")
    public String getuser() {
        return "User dhanur here!";
    }
}
