package com.thamiprojects.clientapi;

import com.thamiprojects.clientapi.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
//@SpringBootApplication(scanBasePackages={"com.thamiprojects.clientapi"})
//@ComponentScan({"com.thamiprojects.clientapi", "com.thamiprojects.clientapi.repository"})
//@EnableJpaRepositories(basePackageClasses = UserRepository.class)
//@EntityScan("com.thamiprojects.clientapi")
//@EnableJpaRepositories(basePackages = "com.thamiprojects.clientapi.repository", entityManagerFactoryRef = "sessionFactory")
public class ClientapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientapiApplication.class, args);
	}

}
