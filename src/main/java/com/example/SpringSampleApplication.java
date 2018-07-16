package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSampleApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplicatio.run(SpringSampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello from spring sample application.");
    }
}
