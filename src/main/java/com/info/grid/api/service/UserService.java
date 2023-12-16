package com.info.grid.api.service;

import com.info.grid.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
