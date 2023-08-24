package com.nddat.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        // xu ly ...
        return "hello";
    }

}
