package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.Controller"})
public class JpaSendingDynamicDataToWebByUrlApril14Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaSendingDynamicDataToWebByUrlApril14Application.class, args);
	}

}
