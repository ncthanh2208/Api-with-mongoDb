package com.example.demomongoDB.repositories;

import com.example.demomongoDB.entities.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {

    @Query("{'firstName': ?0}") // the name of the variable
    Optional<Student> findByName(String name);
}
