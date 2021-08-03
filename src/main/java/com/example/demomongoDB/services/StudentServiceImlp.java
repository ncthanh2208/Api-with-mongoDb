package com.example.demomongoDB.services;

import com.example.demomongoDB.entities.Student;
import com.example.demomongoDB.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImlp implements StudentService {

   @Autowired
   private StudentRepository studentRepository;

    @Override
    public int createStudent(Student student) {
        Student studentRepo = new Student();
        studentRepo.setFirstName(student.getFirstName());
        studentRepo.setLastName(student.getLastName());
        studentRepo.setAddress(student.getAddress());
        studentRepo.setGender(student.getGender());
        studentRepo.setTotalSpentInBooks(student.getTotalSpentInBooks());
        studentRepo.setEmail(student.getEmail());
        studentRepo.setCreated(LocalDateTime.now());
        studentRepository.insert(studentRepo);
        return 0;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        Student studentRepo = studentRepository.findById(student.getId()).orElseThrow(() -> new RuntimeException(
                String.format("Cannot find Student by Id %s", student.getId())));
        studentRepo.setFirstName(student.getFirstName());
        studentRepo.setLastName(student.getLastName());
        studentRepo.setAddress(student.getAddress());
        studentRepo.setGender(student.getGender());
        studentRepo.setTotalSpentInBooks(student.getTotalSpentInBooks());
        studentRepo.setEmail(student.getEmail());
        studentRepo.setCreated(LocalDateTime.now());
        return studentRepository.save(studentRepo);
    }

    @Override
    public Student findByName(String name) {

        Optional<Student> result = studentRepository.findByName(name);
        if(result.isPresent()){
            return result.get();
        }
        else {
            return null;
        }
    }
}
