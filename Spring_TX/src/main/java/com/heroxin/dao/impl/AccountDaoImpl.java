package com.heroxin.dao.impl;

import com.heroxin.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Heroxin
 * @create 2022-03-07-19:56
 * @Description:
 */
public class AccountDaoImpl implements AccountDao {

//    此处使用 set 方法，将 JdbcTemplate 注入到 AccountDaoImpl 当中
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

//    使用 jdbcTemplate 模板
    public void out(String outMan,double money){
        jdbcTemplate.update(
                "update account set money = money - ? where name = ?",money,outMan);
    }

    public void in(String inMan,double money){
        jdbcTemplate.update(
                "update account set money = money + ? where name = ?",money,inMan);

    }
}
