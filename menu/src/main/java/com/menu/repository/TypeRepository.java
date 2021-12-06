package com.menu.repository;

import com.menu.entity.Type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @title: TypeRepository
 * @description: 菜品类型对接口
 * @author： 李旺旺
 * @date： 2021/11/243:25 下午
 */
@Mapper
public interface TypeRepository {
    List<Type> findAll();
    Type findById(long id);
}
