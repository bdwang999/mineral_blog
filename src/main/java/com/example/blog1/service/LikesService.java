package com.example.blog1.service;

import com.example.blog1.pojo.Comment;
import com.example.blog1.pojo.Likes;

import java.util.List;

public interface LikesService {
    //点赞
    void addLike(Likes like);

    List<Likes> searchLikes(Integer bId);
}
