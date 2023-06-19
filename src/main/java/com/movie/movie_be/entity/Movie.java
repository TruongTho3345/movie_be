package com.movie.movie_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor //Cấp cho tao 1 constructor full tham số
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String image;
    private String actorName;
    private int year;

    @ManyToOne
    @JoinColumn(name = "director_id")
    Information director;

    @ManyToMany
    List<Information> actors;
}
