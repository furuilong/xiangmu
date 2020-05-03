package com.bdqn.demo90;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class Demo90ApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println("=======================" + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("=======" + connection);
        connection.close();
    }

}
