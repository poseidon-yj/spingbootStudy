package com.poseidon.springboot_study;

import com.poseidon.springboot_study.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookController bean = context.getBean(BookController.class);
		System.out.println(bean);
	}

}
