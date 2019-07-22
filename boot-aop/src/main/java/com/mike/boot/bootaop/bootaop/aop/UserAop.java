package com.mike.boot.bootaop.bootaop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAop {
    public static final String POINT_CUT="execution(* com.mike.boot.bootaop.bootaop.domain..*.*(..))";

    @Before(POINT_CUT)
    public  void before(){
        System.out.println("添加用户信息前**********");
    }
    @After(POINT_CUT)
    public  void after(){
        System.out.println("添加用户信息前**********");
    }
}
