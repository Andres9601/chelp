package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.Entity","com.example.demo.Controller","com.example.demo.DTO","com.example.demo.Repository","com.example.demo.Service","com.example.demo.ServiceImpl"})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
