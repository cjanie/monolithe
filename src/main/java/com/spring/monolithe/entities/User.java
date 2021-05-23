package com.spring.monolithe.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity // to indicate that it corresponds to a table in database
@Data // to write getters and setter in the class when the app compiles
public class User {

    @Id // to indicate that it is a primary key
    private Long id;

    private String firstname;

    private String lastname;
    
}
