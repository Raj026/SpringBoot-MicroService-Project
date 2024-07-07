package com.sboot.student_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sboot.student_service.entities.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{
    
}
