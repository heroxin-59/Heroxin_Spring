package com.heroxin.dao.impl;

import com.heroxin.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Heroxin
 * @create 2022-03-05-15:02
 * @Description:
 */

// <bean id="userDao" class="com.heroxin.dao.impl.UserDaoImpl"></bean>
    @Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save(){
        System.out.println("UserDaoImpl running...");
    }
}
