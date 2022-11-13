package com.poseidon.springboot_study.service.impl;

import com.poseidon.springboot_study.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    void getById() {
        System.out.println(bookService.getById(5));
    }
}