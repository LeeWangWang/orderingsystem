package com.menu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @title: Menu
 * @description: 菜单(layui接受对数据类型格式)
 * @author： 李旺旺
 * @date: 2021/11/23 3:49 下午
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuVO {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
