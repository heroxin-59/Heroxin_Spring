package com.heroxin.service.impl;

import com.heroxin.dao.UserDao;
import com.heroxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Heroxin
 * @create 2022-03-05-15:08
 * @Description:
 */

//<bean id="userService" class="com.heroxin.service.impl.UserServiceImpl"></bean>
@Service("userService")
public class UserServiceImpl implements UserService {

    // <property name="userDao" ref="userDao"/>
//    将 userDao 依赖注入到 userService 当中
    @Autowired
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("UserServiceImpl running...");
        userDao.save();
    }

}
