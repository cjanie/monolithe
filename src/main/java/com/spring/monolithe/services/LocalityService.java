package com.spring.monolithe.services;

import java.util.List;

import com.spring.monolithe.entities.Locality;
import com.spring.monolithe.exceptions.DatabaseException;
import com.spring.monolithe.repositories.LocalityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalityService {

    @Autowired
    private LocalityRepository localityRepository;

    public List<Locality> list() throws DatabaseException {
        return this.localityRepository.findAll();
    }
    
}
