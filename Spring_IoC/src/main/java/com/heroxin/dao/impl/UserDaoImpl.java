package com.heroxin.dao.impl;

import com.heroxin.dao.UserDao;

/**
 * @author Heroxin
 * @create 2022-03-02-20:20
 * @Description:
 */
public class UserDaoImpl implements UserDao {
//    重写它的无参构造，看看调用无参构造的情况
    public UserDaoImpl(){
        System.out.println("UserDaoImpl无参构造被调用...");
    }
    @Override
    public void save(){
        System.out.println("UserDaoImpl running...");
    }
}
