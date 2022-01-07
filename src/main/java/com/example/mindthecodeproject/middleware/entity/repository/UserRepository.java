package com.example.mindthecodeproject.middleware.entity.repository;

import com.example.mindthecodeproject.middleware.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
