package com.account.entity;

import lombok.Data;

import java.util.Date;

/**
 * @title: Account
 * @description:
 * @author： 李旺旺
 * @date： 2021/11/25 10:05 上午
 */
@Data
public class Account {
    private long id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
