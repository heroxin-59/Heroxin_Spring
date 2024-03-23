package com.heroxin.aop;

/**
 * @author Heroxin
 * @create 2022-03-06-11:42
 * @Description:
 */
public class Target implements TargetInterface {
    @Override
    public void save(){
//        int i = 1/0;   // 测试异常抛出增强
        System.out.println("Target running...");
    }
}
