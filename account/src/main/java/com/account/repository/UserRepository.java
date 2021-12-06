package com.account.repository;

import com.account.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @title: UserRepository
 * @description:
 * @author： 李旺旺
 * @date： 2021/11/25 10:09 上午
 */
@Mapper
public interface UserRepository {
    public User login(String username,String password);
}

