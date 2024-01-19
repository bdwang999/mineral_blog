package com.example.blog1.service.impl;

import com.example.blog1.mapper.userMapper;
import com.example.blog1.mapper.userProflieMapper;
import com.example.blog1.pojo.user;
import com.example.blog1.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userMapper usermapper;
    @Override
    public user getUserNameById(Integer id) {
        return usermapper.getUserNameById(id);
    }

    @Override
    public void saveUser(user u) {
            usermapper.saveUser(u);
    }
}
