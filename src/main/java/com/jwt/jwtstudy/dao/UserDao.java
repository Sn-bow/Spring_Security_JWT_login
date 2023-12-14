package com.jwt.jwtstudy.dao;


import com.jwt.jwtstudy.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from user where username = #{username}")
    UserEntity findByUsername(String username);

    @Insert("insert into user(username, password, email) values(#{username}, #{password}, #{email})")
    int save(UserEntity user);

}
