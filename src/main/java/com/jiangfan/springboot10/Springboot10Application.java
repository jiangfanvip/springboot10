package com.jiangfan.springboot10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.jiangfan.springboot10.repository")
@SpringBootApplication
public class Springboot10Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot10Application.class, args);
    }

}
