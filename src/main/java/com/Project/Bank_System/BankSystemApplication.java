package com.Project.Bank_System;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Project.Bank_System.repository")
@EntityScan("com.Project.Bank_System.entity")
@OpenAPIDefinition(
        info = @Info(
                title = "Banking System",
                description = "Backend REST APIs for The Banking System",
                version = "v1.0",
                contact = @Contact(
                        name = "Amr Elhefnawy",
                        email = "amr223489@gmail.com",
                        url = "https://github.com/ElHefnawy1290"
                ),
                license = @License(
                        name = "Banking System",
                        url = "https://github.com/ElHefnawy1290/Bank-system"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Banking System Documentation",
                url = "https://github.com/ElHefnawy1290/Bank-system"
        )
)
public class BankSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankSystemApplication.class, args);
	}

}