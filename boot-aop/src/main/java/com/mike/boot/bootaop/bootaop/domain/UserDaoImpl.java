package com.mike.boot.bootaop.bootaop.domain;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl {

    public void addUser(String name, Integer age, String address) {
        System.out.println("user{name=" + name + ",age=" + age + ",address=" + address + "}");
    }
}
