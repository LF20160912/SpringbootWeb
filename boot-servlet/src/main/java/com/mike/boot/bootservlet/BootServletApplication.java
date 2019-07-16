package com.mike.boot.bootservlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan //第一种方式：注解方式
@SpringBootApplication
public class BootServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootServletApplication.class, args);
    }

}
