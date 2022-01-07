package com.example.mindthecodeproject.middleware.entity.repository;


import com.example.mindthecodeproject.middleware.entity.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TeacherRepository extends MongoRepository<Teacher,String> {
    List<Teacher> findAllByLastName(String lastName);

    List<Teacher> findByLastNameStartingWith(String lastName);
}
