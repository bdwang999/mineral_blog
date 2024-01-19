package com.example.blog1.service;

import com.example.blog1.pojo.user;
import com.example.blog1.pojo.userProfile;

public interface userService {
    user getUserNameById(Integer id);

    void saveUser(user u);
}
