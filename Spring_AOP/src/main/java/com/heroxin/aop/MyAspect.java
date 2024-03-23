package com.heroxin.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Heroxin
 * @create 2022-03-06-11:45
 * @Description:
 */
//切面
public class MyAspect {

    public void afterReturning(){
        System.out.println("后置增强...");
    }

//    ProceedingJoinPoint正在执行的连接点  切点

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
//      切点方法
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强...");
        return proceed;
    }
    public void before(){
        System.out.println("前置增强...");
    }

//  当有异常时会抛出异常增强，停止后续增强。 无异常，不增强
    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }

//  无论是否抛出异常，最终都会执行最终增强
    public void after(){
        System.out.println("最终增强");
    }
}
