package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping(path = "/posts")
    @ResponseBody
    public String getAllPosts() {
        return "posts index page";
    }

    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    public String postId(@PathVariable int id) {
        return "view post with the id of: "+id;
    }

    @GetMapping(path = "/posts/create")
    @ResponseBody
    public String createView() {
        return "view creation form for new post";
    }

    @PostMapping(path = "/posts/create")
    @ResponseBody
    public String createNew() {
        return "here is a new post";
    }

}
