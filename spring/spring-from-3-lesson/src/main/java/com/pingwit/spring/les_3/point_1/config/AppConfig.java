package com.pingwit.spring.les_3.point_1.config;

import com.pingwit.spring.les_3.point_1.ProdStudentRepositoryImpl;
import com.pingwit.spring.les_3.point_1.StudentRepository;
import com.pingwit.spring.les_3.point_1.StudentRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    public StudentRepository studentRepository() {
        System.out.println("Default profile");
        return new StudentRepositoryImpl();
    }

    @Bean
    @Profile("prod")
    public StudentRepository prodStudentRepository() {
        System.out.println("Prod profile");
        return new ProdStudentRepositoryImpl();
    }
}
