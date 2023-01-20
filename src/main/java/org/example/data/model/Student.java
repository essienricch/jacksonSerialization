package org.example;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private String school;
    private String address;
    private LocalDate dateOfBirth;


}
