package com.wayuup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.wayuup")
@SpringBootApplication
public class SpringTimingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTimingApplication.class, args);
	}
}
