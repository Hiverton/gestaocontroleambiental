package com.gestaocontroleambiental.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(scanBasePackages = {"com.gestaocontroleambiental.api.endpoint", "com.gestaocontroleambiental.api.config"})
@EntityScan("com.gestaocontroleambiental.api.entity")
@EnableMongoRepositories("com.gestaocontroleambiental.api.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
