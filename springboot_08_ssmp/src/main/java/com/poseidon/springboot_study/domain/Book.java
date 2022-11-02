package com.poseidon.springboot_study.domain;

import lombok.Data;

/**
 * @Description:
 * @Author: jiong.yu
 * @Date: Create at 2022-10-30
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
