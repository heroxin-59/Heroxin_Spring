package com.heroxin.dao.impl;

import com.heroxin.dao.AccountDao;
import com.heroxin.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author Heroxin
 * @create 2022-03-29-9:30
 * @Description:
 */
public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Account account) {
        int i = jdbcTemplate.update("insert into account values(?,?)",
                account.getName(), account.getMoney());
        return i;
    }

    @Override
    public int delete(String name) {
        int i = jdbcTemplate.update("delete from account where name=?", name);
        return i;
    }

    @Override
    public int update(Account account) {
        int i = jdbcTemplate.update("update account set money=? where name =?",
                account.getMoney(),account.getName());
        return i;
    }

    @Override
    public List<Account> findByName(String name) {
        List<Account> account =jdbcTemplate.query("select * from account where name = ?",
                new BeanPropertyRowMapper<Account>(Account.class), name);
        return account;
    }

    @Override
    public List<Account> findAll() {
        List<Account> accountList = jdbcTemplate.query("select * from account",
                new BeanPropertyRowMapper<Account>(Account.class));
        return accountList;
    }
}
