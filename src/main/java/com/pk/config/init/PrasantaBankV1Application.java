package com.pk.config.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.pk")
@EnableJpaRepositories(basePackages = "com.pk.repository")
@EntityScan(basePackages = "com.pk.model")
public class PrasantaBankV1Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PrasantaBankV1Application.class, args);
    }

}
