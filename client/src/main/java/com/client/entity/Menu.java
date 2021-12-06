package com.client.entity;

import lombok.Data;

@Data
public class Menu {
    private long id;        //菜品id
    private String name;    //菜名
    private double price;   //价格
    private String flavor;  //口味
    private Type type;      //菜品类别
}
