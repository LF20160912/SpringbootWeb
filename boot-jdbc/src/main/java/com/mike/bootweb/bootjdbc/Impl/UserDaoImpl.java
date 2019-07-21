package com.mike.bootweb.bootjdbc.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository//将对象类的mapper交给srping管理
public class UserDaoImpl {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add() {
        jdbcTemplate.execute("select  * from user");
    }
}
