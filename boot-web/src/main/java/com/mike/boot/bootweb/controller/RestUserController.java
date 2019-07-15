package com.mike.boot.bootweb.controller;

import com.mike.boot.bootweb.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestUserController {

    /**
     * 通过id查询用户信息
     *
     * @param id 用户id
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public void getUser(@PathVariable int id) {
        System.out.println("id = [" + id + "]");
    }

    /**
     * 查询所有用户信息
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public void getUser() {
        System.out.println("查询所有用户信息");
    }

    /**
     * 保存用户信息
     */
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void saveUser(User user) {
        System.out.println("保存用户信息 user=" + user);
    }

    /**
     * 修改用户信息
     */
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public void updateUser(User user) {
        System.out.println("修改用户信息user=" + user);
    }

    /**
     * 删除用户信息
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable int id) {
        System.out.println("删除用户信息:id=" + id);
    }


}
