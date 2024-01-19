package com.example.blog1.service;

import com.example.blog1.pojo.userProfile;

public interface userProfileService {
     userProfile getUserById(Long id);

    void saveUserProfile(userProfile userprofile);
}
