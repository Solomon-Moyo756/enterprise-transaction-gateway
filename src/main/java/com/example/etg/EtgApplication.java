package com.example.etg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.etg.entity")
@EnableJpaRepositories("com.example.etg.repository")
public class EtgApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtgApplication.class, args);
	}

}
