package com.eazybytes.springSecurity.section6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* @EnableJpaRepositories("com.eazybytes.springSecurity.section6.repository")
@EnableWebSecurity
@EntityScan("com.eazybytes.springSecurity.section6.model") */
public class Section6Application {

	public static void main(String[] args) {
		SpringApplication.run(Section6Application.class, args);
	}

}
