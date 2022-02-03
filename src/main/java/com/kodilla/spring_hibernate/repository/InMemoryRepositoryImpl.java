package com.kodilla.spring_hibernate.repository;

import com.kodilla.spring_hibernate.domain.Person;

import java.util.ArrayList;
import java.util.List;

class InMemoryRepositoryImpl implements PersonRepository{
    List<Person> people = new ArrayList<>();

    @Override
    public List<Person> getAllPeople() {
        return people;
    }

    @Override
    public void savePerson(Person person) {
        people.add(person);
    }

    @Override
    public void deletePersonById(int index) {
        people.remove(index);
    }
}
