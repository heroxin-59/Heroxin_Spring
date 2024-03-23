package com.heroxin.dao.impl;

import com.heroxin.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Heroxin
 * @create 2022-03-07-19:56
 * @Description:
 */

@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
//    此处使用 set 方法，将 JdbcTemplate 注入到 AccountDaoImpl 当中
    private JdbcTemplate jdbcTemplate;

//    基于注解可以不用 set 方法
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    public void out(String outMan,double money){
        jdbcTemplate.update("update account set money = money - ? where name = ?",money,outMan);
    }

    public void in(String inMan,double money){
        jdbcTemplate.update("update account set money = money + ? where name = ?",money,inMan);

    }
}
