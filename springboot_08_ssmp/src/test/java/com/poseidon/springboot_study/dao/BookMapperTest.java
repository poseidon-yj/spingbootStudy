package com.poseidon.springboot_study.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.poseidon.springboot_study.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void getById() {
        System.out.println(bookMapper.selectById(5));
    }

    @Test
    void saveBook() {
        Book book = new Book();
        book.setDescription("testSave");
        book.setType("心理学");
        book.setName("心理学思想");
        bookMapper.insert(book);
    }

    @Test
    void getAll(){
        System.out.println(bookMapper.selectList(null));
    }

    @Test
    void getPage(){
        IPage<Book> page = new Page<>(2,4);
        IPage<Book> iPage = bookMapper.selectPage(page, null);
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());
        System.out.println(iPage.getPages());//有几页
    }

    @Test
    void getByCondition(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","心理学"); // select * from tbl_book where name like '%心理学%'
        System.out.println(bookMapper.selectList(qw));
    }

    @Test
    void getByCondition2(){
        String name = "心理学";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();

        //防手滑写错字段名,判断条件是否为空，为空则不拼接查询条件
        lqw.like(StringUtils.isEmpty(name),Book::getName,name); // select * from tbl_book where name like '%心理学%'
        System.out.println(bookMapper.selectList(lqw));
    }
}