package com.example.demomongoDB.services;

import com.example.demomongoDB.entities.Address;
import com.example.demomongoDB.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public int createStudent(Student student);
    public List<Student> getAllStudent();
    public Student updateStudent(Student student);
    public Student findByName(String name);
}
