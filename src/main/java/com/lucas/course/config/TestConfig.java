package com.lucas.course.config;

import com.lucas.course.entities.User;
import com.lucas.course.repositories.UserRepository;
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
        User u1 = new User(null, "Lucas", "lucas@hotmail.com", "99999999", "12345");
        User u2 = new User(null, "Mateus", "mateus@hotmail.com", "99999998", "12346");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
