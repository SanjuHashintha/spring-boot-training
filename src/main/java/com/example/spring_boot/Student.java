package com.example.spring_boot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter

@Document(collection = "Student")
public class Student {
    @Id
    private String id;
    private String name;
    private String dob;
    private double average;

    public Student(String id, String name, String dob, double average) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.average = average;
    }
}
