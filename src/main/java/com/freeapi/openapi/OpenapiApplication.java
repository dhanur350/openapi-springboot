package com.freeapi.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OpenapiApplication extends SpringBootServletInitializer {

	@GetMapping("/")
	public String getHello() {
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenapiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(OpenapiApplication.class);
	}

}
