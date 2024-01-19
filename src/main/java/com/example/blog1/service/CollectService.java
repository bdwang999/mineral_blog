package com.example.blog1.service;

import com.example.blog1.pojo.Collect;
import com.example.blog1.pojo.Likes;

import java.util.List;

public interface CollectService {
    //收藏
    void addCollect(Collect collect);
    //展示所有收藏
    List<Collect> searchCollect(Integer bId);
}
