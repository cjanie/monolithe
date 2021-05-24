package com.spring.monolithe.repositories;

import com.spring.monolithe.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
