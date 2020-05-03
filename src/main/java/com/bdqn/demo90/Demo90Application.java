package com.bdqn.demo90;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(value = "com.bdqn.demo90.mapper")
@SpringBootApplication
public class Demo90Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo90Application.class, args);
    }

}
