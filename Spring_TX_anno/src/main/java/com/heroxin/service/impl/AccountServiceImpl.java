package com.heroxin.service.impl;

import com.heroxin.dao.AccountDao;
import com.heroxin.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Heroxin
 * @create 2022-03-07-20:02
 * @Description:
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
//    此处 使用 set 方法将 AccountDao 注入到 AccountServiceImpl 当中
    private AccountDao accountDao;

//    基于注解可以不用set方法
//    public void setAccountDao(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

//    事务控制 标注在切点上
    @Transactional(isolation = Isolation.DEFAULT,readOnly = false,propagation = Propagation.REQUIRED)
    public void transfer(String outMan,String inMan,double money){
        accountDao.out(outMan,money);
//        设置异常 By zero
//        int i = 1/0;
        accountDao.in(inMan,money);
    }
}
