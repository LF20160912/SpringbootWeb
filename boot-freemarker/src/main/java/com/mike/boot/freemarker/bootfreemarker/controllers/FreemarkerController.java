package com.mike.boot.freemarker.bootfreemarker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreemarkerController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
