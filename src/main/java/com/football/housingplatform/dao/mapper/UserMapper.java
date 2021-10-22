package com.football.housingplatform.dao.mapper;

import com.football.housingplatform.dao.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserByName(String name);
    void InsertUser(User user);
    User getUserById(int id);
    void updateUserById(User user);
}
