package com.heroxin.factory;

import com.heroxin.dao.UserDao;
import com.heroxin.dao.impl.UserDaoImpl;

/**
 * @author Heroxin
 * @create 2022-03-03-16:51
 * @Description:
 */
public class StaticFactory {
    public static UserDao getUserDao02(){
        return new UserDaoImpl();
    }
}
