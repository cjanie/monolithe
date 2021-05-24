package com.spring.monolithe.services;

import java.util.List;

import com.spring.monolithe.entities.User;
import com.spring.monolithe.exceptions.DatabaseException;
import com.spring.monolithe.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> list() throws DatabaseException {
        return this.userRepository.findAll();
    }
    
}
