package com.example.blog1.service.impl;

import com.example.blog1.mapper.CollectMapper;
import com.example.blog1.mapper.LikesMapper;
import com.example.blog1.pojo.Collect;
import com.example.blog1.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;
    @Override
    public void addCollect(Collect collect) {
        collectMapper.addCollect(collect);
    }

    @Override
    public List<Collect> searchCollect(Integer bId) {
        return collectMapper.searchCollect(bId);
    }
}
