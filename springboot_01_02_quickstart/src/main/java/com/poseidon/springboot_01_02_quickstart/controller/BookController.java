package com.poseidon.springboot_01_02_quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: jiong.yu
 * @Date: Create at 2022-10-29
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public String getBookID(){
        String res = "spring boot is running..";
        System.out.println(res);
        return res;
    }
}
