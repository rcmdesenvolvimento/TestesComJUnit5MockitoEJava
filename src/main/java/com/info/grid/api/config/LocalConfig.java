package com.info.grid.api.config;

import com.info.grid.api.domain.User;
import com.info.grid.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository userRepository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Ricardo", "ricardo@gmail.com", "123");
        User u2 = new User(null, "Paula", "paula@gmail.com", "123");
        User u3 = new User(null, "Fernanda", "fernanda@gmail.com", "123");
        userRepository.saveAll(List.of(u1, u2, u3));
    }
}
