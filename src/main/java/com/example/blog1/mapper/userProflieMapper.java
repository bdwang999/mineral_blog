package com.example.blog1.mapper;

import com.example.blog1.pojo.userProfile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface userProflieMapper {
    @Select("SELECT * FROM userinfo WHERE userId = #{id}")
    userProfile getUserById(Long id);

    @Update("UPDATE userinfo SET fullName = #{fullName}, birthday = #{birthday}, " +
            "address = #{address}, gender = #{gender}, occupation = #{occupation}, userId = #{userId}, " +
            "avatar = #{avatar} WHERE userId = #{userId}")
    void saveUserProfile(userProfile userProfile);
}

