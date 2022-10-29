package com.poseidon.springboot_study.domain;

import lombok.Data;

/**
 * @Description:
 * @Author: jiong.yu
 * @Date: Create at 2022-10-29
 */
@Data
public class User {
    private String name;
    private String pwd;
    private Integer id;
}
