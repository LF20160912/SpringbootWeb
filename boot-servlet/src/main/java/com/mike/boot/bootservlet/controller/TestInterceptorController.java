package com.mike.boot.bootservlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestInterceptorController {
    @GetMapping("/index")
    public String index() {
        //回抛出异常--找不到视图。但可以在打印输出框看到拦截器输出的内容
        return "index";
    }
}
