package de.pietsch.webservicetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WebServiceTestApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceTestApplication.class, args);
	}

}
