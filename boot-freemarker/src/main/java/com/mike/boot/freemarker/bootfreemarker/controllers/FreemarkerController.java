package com.mike.boot.freemarker.bootfreemarker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FreemarkerController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/data")
    public String data(Model model) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Mike");
        map.put("age", 30);
        map.put("birth", (new Date()).toString());
        model.addAttribute("user", map);
        return "index";
    }
}
