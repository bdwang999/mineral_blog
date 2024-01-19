package com.example.blog1.controller;

import com.example.blog1.pojo.user;
import com.example.blog1.pojo.userProfile;
import com.example.blog1.service.userProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/userprofile")
public class userProfileController {
    @Autowired
    private userProfileService userprofileService;
    @GetMapping("/{id}")
    public userProfile getUserById(@PathVariable Long id) {
       return userprofileService.getUserById(id);
    }

    @PostMapping("/")
    public void saveUserProfile(@RequestBody userProfile userprofile) {
        log.info("Received save request for userproflie: {}", userprofile);
        userprofileService.saveUserProfile(userprofile); // service 层有一个保存用户的方法
        try {
            userprofileService.saveUserProfile(userprofile);
            log.info("Successfully saved userprofile: {}", userprofile);
        } catch (Exception e) {
            log.error("Error saving userproflie: {}", e.getMessage(), e);
        }
    }


}
