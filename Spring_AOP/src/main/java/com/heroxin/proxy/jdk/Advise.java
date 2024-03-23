package com.heroxin.proxy.jdk;

/**
 * @author Heroxin
 * @create 2022-03-05-19:29
 * @Description:
 */

//  增强
public class Advise {
    public void before(){
        System.out.println("模拟权限检查...");
    }

    public void afterReturning(){
        System.out.println("模拟日志记录...");
    }
}
