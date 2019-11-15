package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){

        return ("Index");
    }

    @GetMapping("/github")
    public String github(){
        return ("github");
    }

    @RequestMapping("/JavaCamp")
    public String JavaCamp(){
        return ("JavaCamp");
    }


}
