package com.myohtet.spring.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value="classpath:/sql.properties")
@SpringBootApplication
public class PosApplication {
	
	public static void main(String [] args) {
		SpringApplication.run(PosApplication.class, args);
	}

}
