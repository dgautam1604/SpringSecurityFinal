package com.example.springsecurityfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = userRepo.class)
public class SpringSecurityFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityFinalApplication.class, args);
    }

}
