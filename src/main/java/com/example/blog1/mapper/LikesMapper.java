package com.example.blog1.mapper;

import com.example.blog1.pojo.Likes;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LikesMapper {
    @Select("SELECT * FROM likes WHERE bId = #{bId}")
    List<Likes> searchLikes(Integer bId);

    @Insert("Insert into likes(uId,bId)values(#{uId},#{bId})")
    void addLike(Likes like);


}
