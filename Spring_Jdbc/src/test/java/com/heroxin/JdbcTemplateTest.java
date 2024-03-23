package com.heroxin;

import com.heroxin.dao.AccountDao;
import com.heroxin.domain.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Heroxin
 * @create 2022-03-24-16:28
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateTest {



    private AccountDao accountDao;
    @Before
    public void before(){
        ApplicationContext app = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        accountDao = app.getBean(AccountDao.class);
    }

    @Test
    public void  testInsert(){
        Account account = new Account();
        account.setName("李鑫");
        account.setMoney(599);
        int i = accountDao.insert(account);
        System.out.println(i);
    }

    @Test
    public void testDelete(){
        int i = accountDao.delete("李鑫");
        System.out.println(i);
    }

    @Test
    public void testUpdate(){
        Account account = new Account();
        account.setName("李鑫");
        account.setMoney(599499);
        int i = accountDao.update(account);
        System.out.println(i);
    }

    @Test
    public void testFindByName(){
        List<Account> name = accountDao.findByName("李鑫");
        System.out.println(name);
    }

    @Test
    public void testFindAll(){
        List<Account> accountDaoAll = accountDao.findAll();
        for (Account account : accountDaoAll) {
            System.out.println(account);
        }
    }

}
