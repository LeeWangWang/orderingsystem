package com.menu.repository;

import com.menu.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @title: MenuRepository
 * @description: 菜单各种操作的接口类
 * @author： 李旺旺
 * @date： 2021/11/233:47 下午
 */
@Mapper
public interface MenuRepository {
    List<Menu> findAll(int index, int limit);
    int count();
    void save(Menu menu);
    Menu findById(long id);
    void update(Menu menu);
    void deleteById(long id);
}
