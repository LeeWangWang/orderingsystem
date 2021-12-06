package com.account.repository;

import com.account.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @title: AdminRepository
 * @description:
 * @author： 李旺旺
 * @date： 2021/11/25 10:09 上午
 */
@Mapper
public interface AdminRepository {
    public Admin login(String username,String password);
}

