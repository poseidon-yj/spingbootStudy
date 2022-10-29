package com.poseidon.springboot_study;

import com.poseidon.springboot_study.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisApplicationTests {



	@Autowired
	private UserDao userDao;



	@Test
	void plusLoads(){
		System.out.println(userDao.getById(3));
	}

}
