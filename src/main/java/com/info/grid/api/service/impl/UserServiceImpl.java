package com.info.grid.api.service.impl;

import com.info.grid.api.domain.User;
import com.info.grid.api.repository.UserRepository;
import com.info.grid.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User findById(Integer id) {
        Optional<User> obj = this.userRepository.findById(id);
        return obj.orElse(null);
    }
}
