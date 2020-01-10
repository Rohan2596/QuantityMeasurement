package com.bridgelabz.measurement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MeasurementApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Quantity Measurement");
        SpringApplication.run(MeasurementApplication.class, args);
    }

}
