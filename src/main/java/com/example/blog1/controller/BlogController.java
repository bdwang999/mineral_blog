package com.example.blog1.controller;

import com.example.blog1.pojo.Blog;
import com.example.blog1.pojo.Comment;
import com.example.blog1.pojo.Result;
import com.example.blog1.service.BlogService;
import com.sun.net.httpserver.Authenticator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("/api/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping("/{uId}")
    public Result searchBlog(@PathVariable Integer uId){
        List<Blog> bls =blogService.searchBlog(uId);
        //log.info();
        return Result.success(bls);
    }

    //根据博客ID查询博客标题
    @GetMapping("/findtitle/{bId}")
    public  Result searchBlogTitle(@PathVariable Integer bId){
        String title = blogService.searchBlogTitle(bId);
        return Result.success(title);
    }
    //根据bId删除博客
    @DeleteMapping("/deleteblog/{bId}")
    public Result deleteBlog(@PathVariable Integer bId){
        log.info("根据编号ID删除博客:{}",bId);
        blogService.deleteBlog(bId);
        return Result.success();
    }

    //根据博客ID查询博客详情
    @GetMapping("/find/{bId}")
    public  Result searchBlogDetails(@PathVariable Integer bId){
        Blog bg = blogService.searchBlogDetails(bId);
        return Result.success(bg);
    }
}
