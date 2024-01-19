package com.example.blog1.service;

import com.example.blog1.pojo.Blog;
import com.example.blog1.pojo.Follow;

import java.util.List;

public interface FollowService {
    //条件查询关注
    List<Follow> searchFollow(Integer uId);
}
