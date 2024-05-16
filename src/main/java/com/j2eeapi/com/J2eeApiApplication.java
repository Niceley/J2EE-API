package com.j2eeapi.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class J2eeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(J2eeApiApplication.class, args);
	}

}
