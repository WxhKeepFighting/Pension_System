package com.wxh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.wxh.dao")
@EnableTransactionManagement
public class NewElderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewElderServiceApplication.class, args);
    }

}
