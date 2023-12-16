package com.info.grid.api.service;

import com.info.grid.api.domain.User;
import com.info.grid.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO userDTO);
}
