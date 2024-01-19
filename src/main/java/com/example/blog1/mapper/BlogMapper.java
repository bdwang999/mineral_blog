package com.example.blog1.mapper;

import com.example.blog1.pojo.Blog;
import com.example.blog1.pojo.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BlogMapper {
    @Select("SELECT * FROM blog WHERE uId = #{uId}")
    List<Blog> searchBlog(Integer uId);

    @Select("SELECT title FROM blog WHERE bId =#{bId}")
    String searchBlogTitle(Integer bId);

    //根据编号删除博客
    @Delete("delete from blog where bId=#{bId}")
    void deleteBlog(Integer bId);

    //根据博客ID获取博客详情
    @Select("SELECT * FROM blog WHERE bId =#{bId}")
    Blog searchBlogDetails(Integer bId);
}
