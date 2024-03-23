package com.heroxin.test;

import com.heroxin.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Heroxin
 * @create 2022-03-19-17:25
 * @Description:
 */
public class UserServiceTest {
//    测试setter方法实现依赖注入
    @Test
    public void test01(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService01");
        userService.save();
    }
//    测试setter方法实现依赖注入
    @Test
    public void test02(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService02");
        userService.save();
    }
}
