package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.SubmissionPublisher;

@ComponentScan
@SpringBootApplication
public class HelloApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(HelloApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);

	}

}
