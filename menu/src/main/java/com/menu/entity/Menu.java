package com.menu.entity;
/**
 * @title: Menu
 * @description: 菜单的实体类
 * @author： 李旺旺
 * @date： 2021/11/229:05 下午
 */

import lombok.Data;

@Data
public class Menu {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
