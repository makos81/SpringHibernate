package com.kodilla.spring_hibernate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonDto {
    String name;
    String surname;
}
