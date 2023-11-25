package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args-> {
            Student jane = new Student(
                    "Jane",
                    "jane.doe@gmail.com",
                    LocalDate.of(2000, 10, 25),
                    22

            );

            Student richard = new Student
                    (
                    "Richard",
                    "richard.roe@gmail.com.com",
                    LocalDate.of(2000, 10, 25),
                    22
                    );

            repository.saveAll(List.of(jane, richard));

        };
    }
}
