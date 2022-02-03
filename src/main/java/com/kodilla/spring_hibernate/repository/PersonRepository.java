package com.kodilla.spring_hibernate.repository;

import com.kodilla.spring_hibernate.domain.Person;

import java.util.List;

public interface PersonRepository {
    List<Person> getAllPeople();
    void savePerson(Person person);
    void deletePersonById(int index);
}
