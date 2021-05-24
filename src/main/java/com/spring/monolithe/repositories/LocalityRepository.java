package com.spring.monolithe.repositories;

import com.spring.monolithe.entities.Locality;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LocalityRepository extends JpaRepository<Locality, Long> {
    
}
