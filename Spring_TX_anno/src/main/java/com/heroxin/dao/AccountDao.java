package com.heroxin.dao;

/**
 * @author Heroxin
 * @create 2022-03-07-19:55
 * @Description:
 */
public interface AccountDao {

    public void in(String inMan, double money);
    public void out(String outMan, double money);
}
