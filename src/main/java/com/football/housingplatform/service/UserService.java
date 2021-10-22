package com.football.housingplatform.service;

import com.football.housingplatform.dao.domain.User;

public interface UserService {
    int login (String name,String password);
    void signup(User user);
    User getInfobyId (int id);
    void updateUserById(User user);
}
