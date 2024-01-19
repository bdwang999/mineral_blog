package com.example.blog1.controller;


import com.example.blog1.pojo.user;
import com.example.blog1.pojo.userProfile;
import com.example.blog1.service.userProfileService;
import com.example.blog1.service.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {

//    @GetMapping("/api/getMethod")
//    public String getMethod(@RequestParam String username) {
//        return "Hello, get " + username + "!";
//    }
//
//    @PostMapping("/api/postMethod")
//    public String postMethod(@RequestParam("username") String username) {
//
//        return "Hello, post " + username + "!";
//    }
    @Autowired
    private userService userservice;

    @GetMapping("/{id}")
    public user getUserById(@PathVariable Integer id) {
        log.info("id:{}",id);
        return userservice.getUserNameById(id);
    }


    @PostMapping("/")
    public void saveUser(@RequestBody user u) {
        log.info("Received save request for user: {}", u);
        userservice.saveUser(u); // service 层有一个保存用户的方法
        try {
            userservice.saveUser(u);
            log.info("Successfully saved user: {}", u);
        } catch (Exception e) {
            log.error("Error saving user: {}", e.getMessage(), e);
        }
    }

}



