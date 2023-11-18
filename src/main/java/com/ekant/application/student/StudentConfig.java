package com.ekant.application.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ekant = new Student(
                    "Ekant",
                    "chandrakarekant2000@gmail.com",
                    LocalDate.of(2000, Month.JUNE, 29)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2005, Month.MAY, 29)
            );

            repository.saveAll(
                    List.of(ekant, alex)
            );
        };
    }
}
