package com.example.blog1.controller;

import com.example.blog1.pojo.Collect;
import com.example.blog1.pojo.Comment;
import com.example.blog1.pojo.Likes;
import com.example.blog1.pojo.Result;
import com.example.blog1.service.CommentService;
import com.example.blog1.service.LikesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/likes")
public class LikesController {
    @Autowired
    private LikesService likesService;
    @PostMapping("/")
    public void addLike(@RequestBody Likes lk){
        log.info("新增点赞：{}",lk);
        likesService.addLike(lk);
    }

    @GetMapping("/{bId}")
    public Result searchLikes(@PathVariable Integer bId){
        List<Likes> cls =likesService.searchLikes(bId);
        log.info("点赞bId：{}",bId);
        return Result.success(cls);
    }
}
