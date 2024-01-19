package com.example.blog1.service;

import com.example.blog1.pojo.Blog;
import com.example.blog1.pojo.Comment;

import java.util.List;

public interface BlogService {
    //条件查询博客
    List<Blog> searchBlog(Integer uId);
    //根据博客ID查询博客标题
    String searchBlogTitle(Integer bId);
    //删除博客
    void deleteBlog(Integer bId);

    //根据博客ID查询博客详细信息
    Blog searchBlogDetails(Integer bId);
}
