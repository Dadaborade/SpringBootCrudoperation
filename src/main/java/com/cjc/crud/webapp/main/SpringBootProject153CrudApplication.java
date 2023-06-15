package com.cjc.crud.webapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
public class SpringBootProject153CrudApplication {

	public static void main(String[] args) {
		
		System.out.println("This is Spring Boot Crud");
		SpringApplication.run(SpringBootProject153CrudApplication.class, args);
	}

}
