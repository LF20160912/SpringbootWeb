package com.mike.boot.bootweb.controller;

import com.mike.boot.bootweb.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @RequestMapping(value = "/demo/hello")
    public String hello() {
        return "hello springboot web project";
    }

    @RequestMapping(value = "/demo/jsontest")
    public Map<String, Object> jsontest() {
        Map<String, Object> result = new HashMap();
        result.put("state", "ok");
        result.put("datas", Arrays.asList("aa", "bb", "dded"));
        return result;
    }

    @RequestMapping(value = "demo/getId")
    public Map<String, Object> getId(Integer id, String name) {
        Map<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("n", name);
        return result;
    }

    @RequestMapping(value = "demo/ann")
    public Map<String, Object> ann(@RequestParam(name = "user", required = false, defaultValue = "admin") String account,
                                   @RequestParam(name = "password", required = false, defaultValue = "1234") String password) {
        Map<String, Object> result = new HashMap<>();
        result.put("account", account);
        result.put("password", password);
        return result;
    }

    @RequestMapping(value = "demo/user")
    public Map<String, Object> user(User user) {
        Map<String, Object> result = new HashMap<>();
        result.put("account", user.getAccount());
        result.put("password", user.getPassword());
        return result;
    }
}
