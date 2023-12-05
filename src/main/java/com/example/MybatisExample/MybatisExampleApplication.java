package com.example.MybatisExample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("main");
		SpringApplication.run(MybatisExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("run");
	}
}
