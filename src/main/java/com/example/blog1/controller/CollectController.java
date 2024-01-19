package com.example.blog1.controller;

import com.example.blog1.pojo.Blog;
import com.example.blog1.pojo.Collect;
import com.example.blog1.pojo.Likes;
import com.example.blog1.pojo.Result;
import com.example.blog1.service.CollectService;
import com.example.blog1.service.LikesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/collect")
public class CollectController {
    @Autowired
    private CollectService collectService;
    @PostMapping("/")
    public void addCollect(@RequestBody Collect cl){
        log.info("新增收藏：{}",cl);
        collectService.addCollect(cl);
    }

    @GetMapping("/{bId}")
    public Result searchCollect(@PathVariable Integer bId){
        List<Collect> cls =collectService.searchCollect(bId);
        return Result.success(cls);
    }



}
