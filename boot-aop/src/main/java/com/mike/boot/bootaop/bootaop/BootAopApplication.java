package com.mike.boot.bootaop.bootaop;

import com.mike.boot.bootaop.bootaop.domain.UserDao;
import com.mike.boot.bootaop.bootaop.domain.UserDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true,exposeProxy = true)
public class BootAopApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BootAopApplication.class, args);
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao.getClass());

        userDao.addUser("稳重", 12, "无处不在");

//        UserDaoImpl userDao1 = context.getBean(UserDaoImpl.class);
//        System.out.println(userDao1.getClass());
        context.close();
    }

}
