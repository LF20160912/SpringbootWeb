package com.mike.boot.bootaop.bootaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class UserAop {
    public static final String POINT_CUT = "execution(* com.mike.boot.bootaop.bootaop.domain..*.*(..))";

    @Before(POINT_CUT)
    public void before() {
        System.out.println("添加用户信息前**********");
    }

    @After(POINT_CUT)
    public void after(JoinPoint jp) {
        //System.out.println(AopContext.currentProxy());//exposeProxy = true才可以拿到上下文对象
        System.out.println(jp.getTarget());
        System.out.println(Arrays.asList(jp.getArgs()));
        System.out.println("添加用户信息完成**********");
    }
}
