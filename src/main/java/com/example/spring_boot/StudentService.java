package com.example.spring_boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

//    Student s1 = new Student("S01", "Sanju", "March 23", 75.3);
//    Student s2 = new Student("S02", "Hashintha", "June 3", 45.9);
//
//    private List<Student> students = new ArrayList<>(Arrays.asList(s1,s2));
//
//    public List<Student> getStudents(){
//        return students;
//    }
//
//    public Student getStudentById(String id){
//        Student student = students.stream().filter(t -> id.equals(t.getId()))
//                .findFirst()
//                .orElse(null);
//        return student;
//    }

    public String addStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "Name of student" + student.getName();

    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(@PathVariable String id){
        return studentRepository.findById(id);
    }

    public String deleteStudentById (@PathVariable String id){
        studentRepository.deleteById(id);
        return "Student deleted";
    }

}
