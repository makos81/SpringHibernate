package com.kodilla.spring_hibernate.service;


import com.kodilla.spring_hibernate.domain.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAllPeople();
    void savePerson(Person person);
    void deletePersonById(int index);
}
