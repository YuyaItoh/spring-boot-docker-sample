package com.example;

import java.time.LocalDateTime;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.isd.common.ChronoService;

@SpringBootApplication
public class SpringSampleApplication implements CommandLineRunner {
    @Autowired
    ChronoService a;
    @Autowired
    org.springframework.context.ApplicationContext ctx;

    public static void main(String[] args) {
        SpringApplication.run(SpringSampleApplication.class, args);
    }

    @Bean
    public ChronoService chronoService() {
        return new DevelopmentChronoService();
    }

    @Bean
    public LocalDateTime ld(ChronoService chronoService) {
        return null;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(a.today());
    }
}
