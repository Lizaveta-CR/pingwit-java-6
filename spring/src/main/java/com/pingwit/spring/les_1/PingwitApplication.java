package com.pingwit.spring.les_1;

import com.pingwit.spring.les_1.classwork.point_2.User;
import com.pingwit.spring.les_1.classwork.point_2.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PingwitApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(PingwitApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.save(new User(1L, "email", "qwerty"));
    }
}
