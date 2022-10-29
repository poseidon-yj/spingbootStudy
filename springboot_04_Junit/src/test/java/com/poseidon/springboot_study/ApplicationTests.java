package com.poseidon.springboot_study;

import com.poseidon.springboot_study.dao.bookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private bookDao dao;

	@Test
	void contextLoads() {
		dao.save();
	}

}
