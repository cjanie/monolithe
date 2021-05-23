package com.spring.monolithe.repositories;

import com.spring.monolithe.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
