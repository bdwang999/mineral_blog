package com.example.blog1.controller;

import com.example.blog1.pojo.Comment;
import com.example.blog1.pojo.Result;
import com.example.blog1.pojo.user;
import com.example.blog1.service.CommentService;
import com.example.blog1.service.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @GetMapping("/{bId}")
    public Result searchComment(@PathVariable Integer bId){
        List<Comment> cls =commentService.searchComment(bId);
        return Result.success(cls);
    }
    @PostMapping("/")
    public void addComment(@RequestBody Comment cm){
        log.info("新增评论：{}",cm);
        commentService.addComment(cm);
    }
}
