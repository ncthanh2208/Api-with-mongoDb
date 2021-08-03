package com.example.demomongoDB.controllers;

import com.example.demomongoDB.entities.Student;
import com.example.demomongoDB.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        studentService.createStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudent(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }

    @PutMapping
        public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return ResponseEntity.status(HttpStatus.OK).body(student);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Student> findByName(@PathVariable("name") String name){
        return ResponseEntity.ok(studentService.findByName(name));
    }
}
