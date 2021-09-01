package com.example.hello;

import com.example.hello.service.MailSenderService;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.event.EventListener;

@ComponentScan
@SpringBootApplication
public class HelloApplication extends SpringBootServletInitializer {

	// @Autowired
	// private MailSenderService mailSenderService;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloApplication.class);
	}

	// @EventListener(ApplicationReadyEvent.class)
	// public void triggerwhenstart() {
	// mailSenderService.sendmail("azadsingh42878@gmail.com", "Hello Azad", "Party
	// Begins Now");
	// }

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);

	}

}
