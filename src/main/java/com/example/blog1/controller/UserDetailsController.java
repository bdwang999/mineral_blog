package com.example.blog1.controller;

import com.example.blog1.pojo.user;
import com.example.blog1.pojo.userProfile;
import com.example.blog1.service.userProfileService;
import com.example.blog1.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserDetailsController {
    @Autowired
    private userService userservice;
    @Autowired
    private userProfileService userprofileService;
    @GetMapping("/details/{id}")
    public ResponseEntity<?> getUserDetails(@PathVariable Integer id) {
        user user1 = userservice.getUserNameById(id);
        userProfile userprofile = userprofileService.getUserById(id.longValue());

        if (user1 == null || userprofile == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User or UserProfile not found");
        }
        Map<String, Object> result = new HashMap<>();
        result.put("username", user1.getUsername());
        result.put("avatar", userprofile.getAvatar());
        return ResponseEntity.ok(result);
    }
}
