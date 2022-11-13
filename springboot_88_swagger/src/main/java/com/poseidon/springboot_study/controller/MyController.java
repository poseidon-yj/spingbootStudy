package com.poseidon.springboot_study.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Description:
 * @Author: jiong.yu
 * @Date: Create at 2022-11-13
 * Api注解用于添加当前类的别名
 */
@RestController
@Api(tags = "swagger学习")
public class MyController {
    @PutMapping("req")
    @ApiIgnore
    public String req(String m){
        return "req";
    }

    @GetMapping("get")
    public String get(String a, String b){
        return "get";
    }

    @PostMapping("post")
    @ApiOperation(value = "执行数据插入", notes = "swagger学习-执行post方法")
    public String post(){
        return "post";
    }
}
