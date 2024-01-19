package com.example.blog1.service;

import com.example.blog1.pojo.Comment;
import com.example.blog1.pojo.user;

import java.util.List;

public interface CommentService {
    //Comment getCommentById(Integer bId);

    //条件查询评论
    List<Comment> searchComment(Integer bId);

    //发表评论
    void addComment(Comment cm);
}
