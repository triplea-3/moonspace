package com.triplea.moonspace.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorController {
    @RequestMapping("/error")
    public String index() {
        return "error";
    }
}
