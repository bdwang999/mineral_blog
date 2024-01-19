package com.example.blog1.controller;

import com.example.blog1.pojo.Comment;
import com.example.blog1.pojo.Follow;
import com.example.blog1.pojo.Result;
import com.example.blog1.service.CollectService;
import com.example.blog1.service.FollowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/follow")
public class FollowController {
    @Autowired
    private FollowService followService;
    @GetMapping("/{uId}")
    public Result searchFollow(@PathVariable Integer uId){
        List<Follow> fls =followService.searchFollow(uId);
        return Result.success(fls);
    }
}
