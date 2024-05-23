package com.example.app.SpringBootWebTours;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

// Вхідна точка в програму.
// @SpringBootApplication позначає головний клас програми.
// @SpringBootApplication інкапсулює анотації @Configuration,
// @EnableAutoConfiguration, @ComponentScan з їхніми атрибутами
// за замовчуванням.
// https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html
@SpringBootApplication
public class WebToursApplication {

	private static final Logger LOGGER =
			Logger.getLogger(WebToursApplication.class.getName());

	public static void main(String[] args) {
		// Можемо прибрати це
//		SpringApplication.run(WebToursApplication.class, args);

		// Формуємо такий код з можливістю
		// уникнення показу банера Spring Boot
		new SpringApplicationBuilder(WebToursApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);

		LOGGER.info("APP is running...");
	}
}
