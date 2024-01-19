package com.example.blog1.mapper;

import com.example.blog1.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface userMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    user getUserNameById(Integer id);

    @Update("UPDATE user SET username = #{username}, password = #{password}, " +
            "email = #{email}, phone = #{phone} WHERE id = #{id}")
    void saveUser(user u);
}
