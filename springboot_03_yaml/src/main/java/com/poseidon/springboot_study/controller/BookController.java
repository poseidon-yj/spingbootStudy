package com.poseidon.springboot_study.controller;

import com.poseidon.springboot_study.MyDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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

    // 读取yaml配置文件
    @Value("${country}")
    private String country1;

    @Value("${user.age}")
    private int age;

    @Value("${books[0].name}")
    private String name;

    @Value("${dir.temp}")
    private String tempDir;

    @Value("${dir.temp1}")
    private String tempDir1;

    //使用自动装配装载全量配置参数
    @Autowired
    private Environment env;

    //加载datasource
    @Autowired
    private MyDatasource myDatasource;

    @GetMapping
    public String getBookID(){
        String res = "spring boot is running..";
        System.out.println(country1);
        System.out.println(age);
        System.out.println(name);
        System.out.println(tempDir);
        System.out.println(tempDir1);

        System.out.println("==========================");
        System.out.println(env.getProperty("dir.temp1"));
        System.out.println(env.getProperty("dir.temp"));
        System.out.println(env.getProperty("books[1].price"));

        System.out.println("==========================");
        System.out.println(myDatasource);
        return res;
    }
}
