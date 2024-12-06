package com.cursojava.course.config;

import com.cursojava.course.entities.User;
import com.cursojava.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User(null, "Maria", "maria@gmail.com", "999999999", "123456");
        User user1 = new User(null, "Joao", "joao@gmail.com", "999999999", "123456");
        User user2 = new User(null, "Lucas", "lucas@gmail.com", "999999999", "123456");
        User user3 = new User(null, "Julia", "julia@gmail.com", "999999999", "123456");
        userRepository.saveAll(Arrays.asList(user, user1, user2, user3));
    }



}
