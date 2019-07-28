package com.student.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.student.manager.model.Student;
import com.student.manager.service.StudentManagerService;


@RestController
public class StudentManagerController {

    @Autowired
    private StudentManagerService studentManagerService;
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentManagerService.getStudentList();
    }
    
    @GetMapping("/students/{id}")
    public Student getStudents(@PathVariable String id) {
        return studentManagerService.getStudentById(id);
    }
    
}
