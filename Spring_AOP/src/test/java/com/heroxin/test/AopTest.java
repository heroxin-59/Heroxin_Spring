package com.heroxin.test;

import com.heroxin.aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Heroxin
 * @create 2022-03-06-12:00
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
    @Autowired 
    private TargetInterface target;

    @Test
    public void test01(){
        target.save();
    }

    @Test
    public void soutdate(){
        System.out.println(LocalDateTime.now());
        System.out.println();
    }
}
