package com.example.spring_security_dec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CollegeController {
    @GetMapping("/home")
    public String homePage(){
        return "welcome to home page";
    }
    @GetMapping("/student")
    public String student(){
        return "welcome to student page";
    }
    @GetMapping("/admin")
    public String admin(){
        return "welcome to admin page";
    }

}
