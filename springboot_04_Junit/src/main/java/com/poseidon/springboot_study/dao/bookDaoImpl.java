package com.poseidon.springboot_study.dao;

import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: jiong.yu
 * @Date: Create at 2022-10-29
 */
@Repository
public class bookDaoImpl implements bookDao{
    @Override
    public void save() {
        System.out.println("save test");
    }
}
