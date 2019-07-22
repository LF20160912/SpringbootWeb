package com.mike.bootweb.bootjdbc;

import com.mike.bootweb.bootjdbc.Impl.UserDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;//已经弃用，改用com.mysql.cj.jdbc.Driver，动程序通过SPI自动注册，通常不需要手动加载驱动程序类。
import java.sql.SQLException;


@SpringBootApplication
public class BootJdbcApplication {

    public static void main(String[] args) throws SQLException {

        ConfigurableApplicationContext context = SpringApplication.run(BootJdbcApplication.class, args);
        //默认数据库连接类型：class com.zaxxer.hikari.HikariDataSource
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection().getCatalog());
        System.out.println(dataSource.getClass());

        //spring自动装配
        System.out.println(context.getBean(JdbcTemplate.class));

        //查询数据
        UserDaoImpl userDao = context.getBean(UserDaoImpl.class);
        System.out.println(userDao.selectOne(1));
        context.close();
    }

}
