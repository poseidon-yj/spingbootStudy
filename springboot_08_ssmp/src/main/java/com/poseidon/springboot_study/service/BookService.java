package com.poseidon.springboot_study.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.poseidon.springboot_study.domain.Book;

import java.util.List;

/**
 * @Description:
 * @Author: jiong.yu
 * @Date: Create at 2022-11-02
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getByPage(int currentPage, int pageSize);
}
