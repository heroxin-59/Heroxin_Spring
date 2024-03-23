package com.heroxin.test;

import com.heroxin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Heroxin
 * @create 2022-03-05-16:24
 * @Description:
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {
//    自动装配
    @Autowired
    private UserService userService;
    @Autowired
    private DataSource dataSource;

    @Test
    public void test01() throws SQLException {
        userService.save();
        System.out.println(dataSource.getConnection());
    }
}
