package com.kodilla.spring_hibernate.service;

import com.kodilla.spring_hibernate.domain.Person;
import com.kodilla.spring_hibernate.repository.PersonRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{
    private final PersonRepository personRepository;

    @Override
    public List<Person> getAllPeople() {
        return personRepository.getAllPeople();
    }

    @Override
    public void savePerson(Person person) {
        personRepository.savePerson(person);
    }

    @Override
    public void deletePersonById(int index) {
        personRepository.deletePersonById(index);
    }
}
