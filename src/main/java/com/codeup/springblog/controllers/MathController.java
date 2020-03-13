package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

//    @GetMapping(path="/add/{num1}/and/{num2}")
//    @ResponseBody
//    public String addTwoNum(@PathVariable int num1, @PathVariable int num2) {
//        return num1+" plus "+num2+" equals "+(num1+num2);
//    }

//    @GetMapping(path="/subtract/{num1}/from/{num2}")
//    @ResponseBody
//    public String subtractTwoNums(@PathVariable int num1,@PathVariable int num2) {
//        return num1+" subtracted from "+num2+" equals "+(num2-num1);
//    }

//    @GetMapping(path = "/multiply/{num1}/and/{num2}")
//    @ResponseBody
//    public String multiplyTwoNums(@PathVariable int num1, @PathVariable int num2) {
//        return num1+" multiplied by "+num2+" equals "+(num1*num2);
//    }

    @GetMapping(path = "/divide/{num1}/by/{num2}")
    @ResponseBody
    public String divideTwoNums(@PathVariable int num1, @PathVariable int num2) {
        return num1+" divided by "+num2+" equals "+(num1/num2);
    }
}

