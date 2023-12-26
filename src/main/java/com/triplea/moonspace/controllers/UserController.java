package com.triplea.moonspace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth/user")
public class UserController {
    @GetMapping
    public String index() {
        return "user";
    }
}
