package com.dailycodebuffer.springbootex.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarManagementSystemController {
    @GetMapping("/msg")
    public String getMessage(){
        return "Tis is first APP";
    }
}
