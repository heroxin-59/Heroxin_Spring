package com.heroxin.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Heroxin
 * @create 2022-03-05-19:31
 * @Description:
 */

//  代理对象
public class ProxyTest {
    public static void main(String[] args) {
        System.out.println("JDK代理：基于接口的动态代理技术");

//        目标对象
        final Target target = new Target();

//        获得增强对象
        final Advise advise = new Advise();

//        返回值就是动态生成的代理对象
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),    //目标对象类加载器
                target.getClass().getInterfaces(),//目标对象相同的接口字节码对象数组
                new InvocationHandler() {
                    @Override
//                    调用代理对象的任何方法，实质执行的都是 invoke 方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        前置增强
                        advise.before();
//                        执行目标方法
                        Object invoke = method.invoke(target, args);
//                        后置增强
                        advise.afterReturning();
                        return invoke;
                    }
                }
        );
//        调用代理对象的方法
        proxy.save();
    }
}
