package com.heroxin.service.impl;

import com.heroxin.dao.AccountDao;
import com.heroxin.service.AccountService;

/**
 * @author Heroxin
 * @create 2022-03-07-20:02
 * @Description:
 */
public class AccountServiceImpl implements AccountService {

//    此处 使用 set 方法将 AccountDao 注入到 AccountServiceImpl 当中
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

//    转账业务
    public void transfer(String outMan,String inMan,double money){
        accountDao.out(outMan,money);
//        设置异常 By zero，测试事务控制
        int i = 1/0;
        accountDao.in(inMan,money);
    }
}
