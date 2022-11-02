package com.poseidon.springboot_study.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.poseidon.springboot_study.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
