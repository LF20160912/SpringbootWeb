package com.mike.boot.bootaop.bootaop;

import com.mike.boot.bootaop.bootaop.domain.UserDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootAopApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BootAopApplication.class, args);
        UserDaoImpl userDao = context.getBean(UserDaoImpl.class);
        userDao.addUser("稳重", 12, "无处不在");
        context.close();
    }

}
