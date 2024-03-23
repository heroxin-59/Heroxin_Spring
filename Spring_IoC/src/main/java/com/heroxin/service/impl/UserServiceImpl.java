package com.heroxin.service.impl;

import com.heroxin.dao.UserDao;
import com.heroxin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Heroxin
 * @create 2022-03-02-20:21
 * @Description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

//    setter方法实现依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

//    有参构造方法实现依赖注入
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    public UserServiceImpl() {
    }

    @Override
    public void save(){
//        使用依赖注入后，此处不需要单独创建容器实例 userDao 而是在userService中注入userDao
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
        System.out.println("UserServiceImpl running...");
    }
}
