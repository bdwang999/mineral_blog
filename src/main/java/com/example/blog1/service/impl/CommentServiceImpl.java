package com.example.blog1.service.impl;

import com.example.blog1.mapper.CommentMapper;
import com.example.blog1.mapper.userMapper;
import com.example.blog1.pojo.Comment;
import com.example.blog1.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Comment> searchComment(Integer bId) {
        return commentMapper.searchComment(bId);
    }

    @Override
    public void addComment(Comment cm) {
        commentMapper.addComment(cm);
    }
}
