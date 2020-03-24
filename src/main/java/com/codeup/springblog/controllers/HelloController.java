package com.codeup.springblog.controllers;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
class HelloController {

//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello() {
//        return "hello from spring!";
//    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/fruit")
    public String fruit(Model model) {
        List<String> fruitBasket = new ArrayList<>();
        fruitBasket.add("banana");
        fruitBasket.add("mango");
        fruitBasket.add("pineapple");
        fruitBasket.add("orange");
        fruitBasket.add("strawberry");
        model.addAttribute("fruitBasket", fruitBasket);
        return "fruit";
    }

//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name) {
//        return "hello " +name+ "!";
//    }
//
//    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
//    @ResponseBody
//    public String addOne(@PathVariable int number) {
//        return number + " plus one is " + (number + 1) + "!";
//    }
//
//    @GetMapping(path = "/double/{number}")
//    @ResponseBody
//    public String addOneMore(@PathVariable int number) {
//        return number + " plus one plus one is " + (number + 2) + "!";
//    }

}
