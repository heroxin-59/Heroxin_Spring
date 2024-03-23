package com.heroxin.dao;

/**
 * @author Heroxin
 * @create 2022-03-07-19:55
 * @Description:
 */
public interface AccountDao {
//    转入
    public void in(String inMan, double money);
//    转出
    public void out(String outMan, double money);
}
