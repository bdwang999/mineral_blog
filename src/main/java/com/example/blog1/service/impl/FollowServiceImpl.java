package com.example.blog1.service.impl;

import com.example.blog1.mapper.CommentMapper;
import com.example.blog1.mapper.FollowMapper;
import com.example.blog1.pojo.Follow;
import com.example.blog1.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowServiceImpl implements FollowService {
    @Autowired
    private FollowMapper followMapper;
    @Override
    public List<Follow> searchFollow(Integer uId) {
        return followMapper.searchFollow(uId);
    }
}
