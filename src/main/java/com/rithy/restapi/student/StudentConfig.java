package com.rithy.restapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student rithy = new Student(
                    "Rithy",
                    "songrithy2244@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 21)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 11)
            );
            Student dara = new Student(
                    "Dara",
                    "Dara@gmail.com",
                    LocalDate.of(2003, Month.FEBRUARY, 11)
            );
            Student reach = new Student(
                    "Reach",
                    "Reach@gmail.com",
                    LocalDate.of(2004, Month.MAY, 11)
            );
            repository.saveAll(
                    List.of(rithy,alex,dara,reach)
            );
        };
    }
}
