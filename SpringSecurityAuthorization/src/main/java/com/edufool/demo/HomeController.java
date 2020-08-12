package com.edufool.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "<h1>Welcome to home page!!!</h1>";
    }
    @GetMapping("/user")
    public String user(){
        return "<h1>Welcome user!!!</h1>";
    }
    @GetMapping("/admin")
    public String admin(){
        return "<h1>Welcome admin!!!</h1>";
    }
}
