package com.heroxin.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author Heroxin
 * @create 2022-03-05-9:36
 * @Description:
 */
public class DateSourceTest {
    @Test
//    测试手动创建c3p0数据源
    public void test01() throws Exception {
//        创建数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

//        设置基本连接参数(驱动，url，用户名，密码)
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");//mysql8.0以上用此驱动
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/heroxin");//heroxin为本地数据库名字
        dataSource.setUser("root");
        dataSource.setPassword("heroxin");

//        获取连接资源
        Connection connection = dataSource.getConnection();
        System.out.println(connection);//打印地址，用来测试是否连接成功
        connection.close();
    }

    @Test
//    测试手动创建c3p0数据源(加载配置文件properties方式)
//    用来配置数据源的基本配置，方便后期修改，降低耦合
    public void test02() throws Exception {
//        读取配置文件
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("jdbc.driver");
        String url = resourceBundle.getString("jdbc.url");
        String username = resourceBundle.getString("jdbc.username");
        String password = resourceBundle.getString("jdbc.password");

//        创建数据源对象，设置连接参数
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

//        获取连接资源
        Connection connection = dataSource.getConnection();
        System.out.println(connection);//打印地址，用来测试是否连接成功
        connection.close();
    }

    @Test
//    测试Spring容器创建数据源,加载applicationContext.xml文件
    public void test03() throws SQLException {
        ApplicationContext app = new
                ClassPathXmlApplicationContext("applicationContext.xml");

//        使用.class方式获取Bean，不用强转，适用于配置文件中Bean标签较少
//        DataSource dataSource = app.getBean(DataSource.class);

        DataSource dataSource = (DataSource) app.getBean("dataSource");

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
