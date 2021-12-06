package com.user.repository;

import com.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserRepository {
    List<User> findAll(int index, int limit);
    int count();
    void save(User user);
    void deleteById(long id);
}
