package com.example.blog1.mapper;

import com.example.blog1.pojo.Follow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FollowMapper {
    @Select("SELECT * FROM follow WHERE uId = #{uId}")
    List<Follow> searchFollow(Integer uId);
}
