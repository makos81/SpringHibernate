package com.kodilla.spring_hibernate.service;

import com.kodilla.spring_hibernate.repository.PersonRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonServiceConfiguration {
    @Bean
    PersonService createPersonService(PersonRepository personRepository){
        return new PersonServiceImpl(personRepository);
    }
}
