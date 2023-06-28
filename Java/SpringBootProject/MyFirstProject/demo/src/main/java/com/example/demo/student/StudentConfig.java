package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
/*This is thew bean to insert the value when the server is up and running*/
@Repository
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student gaurav = new Student("Gaurav","g@gmail.com", LocalDate.of(2000, Month.APRIL,22));
            Student harsh =  new Student("Harsh","h@gmail.com",LocalDate.of(2001, Month.JUNE,26));
            repository.saveAll(List.of(gaurav,harsh));
        };

        }
    }

