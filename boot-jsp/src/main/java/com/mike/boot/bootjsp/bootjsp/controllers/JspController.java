package com.mike.boot.bootjsp.bootjsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
    @GetMapping("/jsp")
    public String index() {
        return "index";
    }
}
