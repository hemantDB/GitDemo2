package com.git.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtPocApplication.class, args);
		System.out.println("Added Remote Changes");
	}

}
