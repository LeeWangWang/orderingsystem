package com.account;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @title: AccountApplication1
 * @description:
 * @author： 李旺旺
 * @date： 2021/11/25 10:12 上午
 */
@SpringBootApplication
@MapperScan("com.account.repository")
public class AccountApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class,args);
    }
}
