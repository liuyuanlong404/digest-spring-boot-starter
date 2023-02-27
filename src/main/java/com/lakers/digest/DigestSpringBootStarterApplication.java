package com.lakers.digest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigestSpringBootStarterApplication {

    private final Logger logger = LoggerFactory.getLogger(DigestSpringBootStarterApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DigestSpringBootStarterApplication.class, args);
    }

}
