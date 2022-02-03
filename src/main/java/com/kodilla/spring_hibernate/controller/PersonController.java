package com.kodilla.spring_hibernate.controller;


import com.kodilla.spring_hibernate.domain.Person;
import com.kodilla.spring_hibernate.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @GetMapping
    public List<Person> m1(){
        return personService.getAllPeople();
    }

    @PostMapping
    public void m2(@RequestBody Person person){
        personService.savePerson(person);
    }

    @DeleteMapping(path = "/index")
    public void m3(@PathVariable("index") int index){
        personService.deletePersonById(index);
    }
}
