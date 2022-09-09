package com.example.spring_boot;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Student, String> {
//    Student save(Student student);
}
