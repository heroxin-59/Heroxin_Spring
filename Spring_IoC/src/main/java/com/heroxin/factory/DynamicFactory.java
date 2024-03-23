package com.heroxin.factory;

import com.heroxin.dao.UserDao;
import com.heroxin.dao.impl.UserDaoImpl;

/**
 * @author Heroxin
 * @create 2022-03-03-18:31
 * @Description:
 */
public class DynamicFactory {
    public UserDao getUserDao03(){
        return new UserDaoImpl();
    }
}
