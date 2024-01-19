package com.example.blog1.mapper;

import com.example.blog1.pojo.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Select("SELECT * FROM comment WHERE bId = #{bId}")
    List<Comment> searchComment(Integer bId);

    @Insert("Insert into comment(uId,bId,content,date)values(#{uId},#{bId},#{content},#{date})")
    void addComment(Comment cm);
}
