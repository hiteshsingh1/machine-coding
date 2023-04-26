package com.startup.listing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.machindcoding.*"})
public class MachineCoding {

    public static void main(String[] args) {
        SpringApplication.run(MachineCoding.class, args);
    }

}