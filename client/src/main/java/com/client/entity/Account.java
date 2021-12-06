package com.client.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Account {

    private long id;            //用户id
    private String username;    //用户名
    private String password;    //密码
    private String nickname;    //昵称
    private String gender;      //性别
    private String telephone;   //电话
    private Date registerdate;  //注册时间
    private String address;     //地址
}
