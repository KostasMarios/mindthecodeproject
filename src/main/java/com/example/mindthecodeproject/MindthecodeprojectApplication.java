package com.example.mindthecodeproject;

import com.example.mindthecodeproject.middleware.entity.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.mindthecodeproject.*"})
public class MindthecodeprojectApplication implements CommandLineRunner {
    @Autowired
    private TeacherRepository teacherRepository;
    public static void main(String[] args) {
        SpringApplication.run(MindthecodeprojectApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        teacherRepository.deleteAll();
        teacherRepository.saveAll(LoadDatabase.generateRandomTeachers());
    }
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
