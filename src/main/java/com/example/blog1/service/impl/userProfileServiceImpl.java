package com.example.blog1.service.impl;

import com.example.blog1.mapper.userProflieMapper;
import com.example.blog1.pojo.userProfile;
import com.example.blog1.service.userProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.reactive.TransactionalOperator;

@Service
public class userProfileServiceImpl implements userProfileService {
    @Autowired
    private userProflieMapper userprofileMapper;
    public userProfile getUserById(Long id) {
        return userprofileMapper.getUserById(id);
    }

    @Override
    public void saveUserProfile(userProfile userprofile) {
        userprofileMapper.saveUserProfile(userprofile);
    }
}
