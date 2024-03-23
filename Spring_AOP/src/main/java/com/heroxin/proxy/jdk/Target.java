package com.heroxin.proxy.jdk;

/**
 * @author Heroxin
 * @create 2022-03-05-19:28
 * @Description:
 */

//  目标对象，需要完成对 Target 功能的增强
public class Target implements TargetInterface{

    @Override
    public void save() {
        System.out.println("用户登录 running...");
    }

}
