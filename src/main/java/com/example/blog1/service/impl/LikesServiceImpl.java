package com.example.blog1.service.impl;

import com.example.blog1.mapper.CommentMapper;
import com.example.blog1.mapper.LikesMapper;
import com.example.blog1.pojo.Comment;
import com.example.blog1.pojo.Likes;
import com.example.blog1.service.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikesServiceImpl implements LikesService {
    @Autowired
    private LikesMapper likesMapper;
    @Override
    public void addLike(Likes like) {
        likesMapper.addLike(like);
    }
    @Override
    public List<Likes> searchLikes(Integer bId) {
        return likesMapper.searchLikes(bId);
    }
}
