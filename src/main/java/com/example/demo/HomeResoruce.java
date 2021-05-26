package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResoruce {

    @GetMapping("/")
    public String root(){
        return "Root";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/admin")
    public String adminpage(){
        return "admin";
    }
    @GetMapping("/user")
    public String userpage(){
        return "user";
    }
}
