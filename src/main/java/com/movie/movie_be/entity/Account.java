package com.movie.movie_be.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Account {

    @Id
    private long id;
    private String username;
    private String password;
    private String fullName;
}
