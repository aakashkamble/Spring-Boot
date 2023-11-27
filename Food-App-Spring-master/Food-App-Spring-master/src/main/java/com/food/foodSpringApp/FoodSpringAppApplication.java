package com.food.foodSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class FoodSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodSpringAppApplication.class, args);
	}

}
