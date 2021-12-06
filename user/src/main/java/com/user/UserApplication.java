package com.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @title: UserApplication
 * @description:
 * @author： 李旺旺
 * @date： 2021/11/25 10:43 上午
 */
@SpringBootApplication
@MapperScan("com.user.repository")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
