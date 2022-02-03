package com.kodilla.spring_hibernate.mapper;

import com.kodilla.spring_hibernate.domain.Person;
import com.kodilla.spring_hibernate.domain.PersonDto;

import java.util.List;
import java.util.stream.Collectors;

public class PersonMapper {
    Person toDomain(PersonDto personDto){
        return Person.of(personDto.getName(), personDto.getSurname());
    }

    PersonDto toPersonDto(Person person){
        return new PersonDto(person.getName(), person.getSurname());
    }

    List<Person> toDomainList(List<PersonDto> personDtoList){
        return personDtoList.stream()
                .map(personDto -> Person.of(personDto.getName(), personDto.getSurname()))
                .collect(Collectors.toList());
    }

    List<PersonDto> toDtoList(List<Person> personList){
        return personList.stream()
                .map(person -> new PersonDto(person.getName(), person.getSurname()))
                .collect(Collectors.toList());
    }
}
