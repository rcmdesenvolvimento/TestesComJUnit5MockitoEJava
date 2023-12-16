package com.info.grid.api.repository;

import com.info.grid.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
