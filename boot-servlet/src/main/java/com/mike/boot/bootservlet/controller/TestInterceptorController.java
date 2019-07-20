package com.mike.boot.bootservlet.controller;

import com.mike.boot.bootservlet.exception.BizExceptionHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestInterceptorController {
    @GetMapping("/index")
    public void index() {
        //默认 跳转到500.html
        throw new RuntimeException();
    }

    /**
     * 跳转到业务异常类
     * @param ex
     * @param model
     * @return
     */
    @ExceptionHandler(BizExceptionHandler.class)
    public String exPage(Exception ex, Model model) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "Mike");
        map.put("age", 30);
        map.put("msg", ex.toString());
        model.addAttribute("user", map);
        return "/error/bizEx.html";
    }

    @GetMapping("/add")
    public String add() {
        throw new BizExceptionHandler("添加业务异常！");
    }
}
