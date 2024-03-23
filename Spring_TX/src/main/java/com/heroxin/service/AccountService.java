package com.heroxin.service;

/**
 * @author Heroxin
 * @create 2022-03-07-20:01
 * @Description:
 */
public interface AccountService {
//   转账业务
   public void transfer(String outMan, String inMan, double money);
}
