package com.heroxin.test;

import com.heroxin.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Heroxin
 * @create 2022-03-19-17:28
 * @Description:
 */
public class UserDaoTest {
    //    无参构造实例化Bean
    @Test
    public void test01(){
        ApplicationContext app = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao01");
        userDao.save();
    }
    //    静态工厂实例化Bean
    @Test
    public void test02(){
        ApplicationContext app = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao02");
        userDao.save();
    }
    //    实例工厂实例化Bean
    @Test
    public void test03(){
        ApplicationContext app = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao03");
        userDao.save();
    }
    //  测试Bean的作用域
    @Test
    public void  test04(){
//        当属性值为singleton时，每次加载配置文件时，创建Bean的实例
//        当属性值为prototype时，每次运行getBean()时，创建Bean的实例
        ApplicationContext app = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao01 = (UserDao) app.getBean("userDao01");
        UserDao userDao02 = (UserDao) app.getBean("userDao01");

//        当属性值为singleton时，输出坐标相同，说明只有一个Bean实例
//        当属性值为prototype时，输出坐标不同，说明创建了新的Bean实例
        System.out.println(userDao01);
        System.out.println(userDao02);
    }

}
