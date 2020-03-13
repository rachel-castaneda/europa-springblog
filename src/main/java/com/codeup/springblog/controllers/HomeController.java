package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping(path = "/")
    @ResponseBody
    public String landingPage(){
        return "this is the landing page";
    }

    @GetMapping(path = "/home")
    public String welcome(){
        return "home";
    }

}
