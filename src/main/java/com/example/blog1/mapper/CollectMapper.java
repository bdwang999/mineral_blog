package com.example.blog1.mapper;

import com.example.blog1.pojo.Collect;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CollectMapper {
    @Select("SELECT * FROM collect WHERE bId = #{bId}")
    List<Collect> searchCollect(Integer bId);


    @Insert("Insert into collect(uId,bId)values(#{uId},#{bId})")
    void addCollect(Collect collect);


}
