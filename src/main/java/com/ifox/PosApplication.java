package com.ifox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PosApplication {
    @Autowired
    public static void main(String[] args) {
        SpringApplication.run(PosApplication.class, args);
    }
}
