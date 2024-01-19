package com.example.blog1.service.impl;

import com.example.blog1.mapper.BlogMapper;
import com.example.blog1.mapper.CommentMapper;
import com.example.blog1.pojo.Blog;
import com.example.blog1.pojo.Comment;
import com.example.blog1.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public List<Blog> searchBlog(Integer uId) {
        return blogMapper.searchBlog(uId);
    }

    @Override
    public String searchBlogTitle(Integer bId) {
        return blogMapper.searchBlogTitle(bId);
    }

    @Override
    public void deleteBlog(Integer bId) {
        blogMapper.deleteBlog(bId);
    }

    @Override
    public Blog searchBlogDetails(Integer bId) {
        return blogMapper.searchBlogDetails(bId);
    }
}
