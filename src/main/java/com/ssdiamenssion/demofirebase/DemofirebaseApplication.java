package com.ssdiamenssion.demofirebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DemofirebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemofirebaseApplication.class, args);
	}

}
