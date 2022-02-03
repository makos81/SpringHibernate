package com.kodilla.spring_hibernate.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {
    @Bean
    PersonRepository getPerson(){
        return new InMemoryRepositoryImpl();
    }
}
