package com.football.housingplatform.service.impl;

import com.football.housingplatform.dao.domain.User;
import com.football.housingplatform.dao.mapper.UserMapper;
import com.football.housingplatform.service.UserService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplement implements UserService {
    @Autowired
    public UserMapper userMapper;

    @Override
    public int login(String name, String password) {
        User user = userMapper.findUserByName(name);
        if(user == null){
            return -1;
        }
        if(user.getPassword().equals(password)){
            return user.getId();
        }
        return 0;
    }

    @Override
    public void signup(User user){
        userMapper.InsertUser(user);
        return;
    }

    @Override
    public User getInfobyId(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateUserById(user);
    }
}
