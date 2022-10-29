package com.poseidon.springboot_study.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.poseidon.springboot_study.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao  {
    @Select("select * from user where id=#{id}")
    public User getById(Integer id);
}
