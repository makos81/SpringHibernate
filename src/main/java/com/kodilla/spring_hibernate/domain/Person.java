package com.kodilla.spring_hibernate.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class Person {
    String name;
    String surname;
}
