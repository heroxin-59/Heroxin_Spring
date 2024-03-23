package com.heroxin.proxy.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Heroxin
 * @create 2022-03-06-10:21
 * @Description:
 */
public class ProxyTest {
    public static void main(String[] args) {

        System.out.println("cglib代理：基于父类的动态代理技术");

//    目标对象
        final Target target = new Target();
//    增强对象
        final Advise advise = new Advise();

//    返回值就是动态生成的代理对象,基于cglib 父类
//      1.创建增强器
        Enhancer enhancer = new Enhancer();
//      2.设置父类
        enhancer.setSuperclass(Target.class);
//      3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                执行前置增强
                advise.before();
//                执行目标
                Object invoke = method.invoke(target, args);
//                执行后置增强
                advise.afterReturning();
                return invoke;
            }
        });
//      4.创建代理对象
        Target proxy = (Target) enhancer.create();

        proxy.save();
    }

}
