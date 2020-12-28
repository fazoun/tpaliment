package com.epita.tpaliment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Run { 
	
	public static void main(String[] args) {
		
		SpringApplication.run(Run.class, args);
	}
	
}
