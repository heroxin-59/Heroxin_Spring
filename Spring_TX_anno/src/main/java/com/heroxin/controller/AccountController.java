package com.heroxin.controller;

import com.heroxin.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Heroxin
 * @create 2022-03-07-20:09
 * @Description:
 */
public class AccountController {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transfer("hua","heroxin",500);
    }
}
