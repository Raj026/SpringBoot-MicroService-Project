package com.sboot.student_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.student_service.entities.Student;
import com.sboot.student_service.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin("*")
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping() 
    public ResponseEntity<?> fetchStudents() {
        return studentService.fetchStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> fetchStudentById(@PathVariable("id") String id) {
        return studentService.fetchStudentById(id);
    }

    @PostMapping("")
    public ResponseEntity<?> createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    
}
