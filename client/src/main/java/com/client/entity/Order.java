package com.client.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private long id;        //订单id
    private User user;      //下单用户
    private Menu menu;      //菜品
    private Admin admin;    //处理管理员
    private Date date;      //下单日期
    private int state;      //订单状态
}
