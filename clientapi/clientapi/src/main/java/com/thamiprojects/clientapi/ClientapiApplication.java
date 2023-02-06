package com.thamiprojects.clientapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan({ "com.thamiprojects.clientapi.*" })
@SpringBootApplication
public class ClientapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientapiApplication.class, args);
	}

}
