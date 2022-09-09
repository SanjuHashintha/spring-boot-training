package com.example.spring_boot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {



//    @GetMapping("/student")
//    public Student getStudent(){
//        return new Student("S101", "Sanju", "march 23", 75.3);
//    }


    @Autowired
    private StudentService studentService;





    @PostMapping("/students/add")
    public void addStudent(@RequestBody Student student){

        studentService.addStudent(student);
    }

    @GetMapping("/students/{id}")
    public Optional<Student> getUserById(@PathVariable String id){
        return studentService.getStudentById(id);
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @DeleteMapping("/students/delete/{id}")
    public String deleteStudentById(@PathVariable String id){
        studentService.deleteStudentById(id);
        return "Student deleted";
    }


}
