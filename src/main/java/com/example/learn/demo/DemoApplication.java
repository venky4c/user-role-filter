package com.example.learn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class DemoApplication {
    //private Logger logger = Logger.getLogger("DemoApplication");
	public static void main(String[] args) {
		System.out.println("starting demo application");
		SpringApplication.run(DemoApplication.class, args);
	}

}
