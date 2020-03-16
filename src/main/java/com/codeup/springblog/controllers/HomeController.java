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

    @GetMapping(path = "/roll-dice")
    public String rollDice() {
        return "dice/roll_dice";
    }

    @GetMapping(path = "roll-dice/{guess}")
    public String rollDiceGuess(@PathVariable int guess, Model model) {
        String message;

        int random = (int) Math.ceil(Math.random()* 6);
        if (random == guess) {
            message = "you guessed the random number!";
        } else {
            message = "sorry, try again";
        }

        model.addAttribute("message", message);
        model.addAttribute("guess", guess);
        model.addAttribute("random", random);

        return "dice/roll-dice-guess";
    }

}
