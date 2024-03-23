package com.heroxin.proxy.cglib;

/**
 * @author Heroxin
 * @create 2022-03-06-10:21
 * @Description:
 */
public class Advise {
    public void before(){
        System.out.println("模拟检查权限...");
    }

    public void afterReturning(){
        System.out.println("模拟日志记录...");
    }
}
