package com.helloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellowordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellowordApplication.class, args);
		helloWord();
	}
	
	public static void helloWord(){
		System.out.println("Hello Word!!!");
           System.out.println("hello from abhinav");
           System.out.println("hello again ");
	}
}
