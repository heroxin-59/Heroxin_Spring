package com.heroxin.dao;

import com.heroxin.domain.Account;

import java.util.List;

/**
 * @author Heroxin
 * @create 2022-03-29-9:28
 * @Description:
 */
public interface AccountDao {
    public int insert(Account account);

    public int delete(String name);

    public int update(Account account);

    public List<Account> findByName(String name);

    public List<Account> findAll();
}
