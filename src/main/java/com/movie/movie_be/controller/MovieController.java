package com.movie.movie_be.controller;

import com.movie.movie_be.entity.Movie;
import com.movie.movie_be.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5173/"})
public class MovieController {
    //METHOD
    //GET
    //POST

    //crud
    @Autowired
    MovieService movieService;

    @GetMapping("/movie")
    public ResponseEntity getMovie(){
        List<Movie> movies = movieService.getMovies();
        return ResponseEntity.ok(movies);
    }

    @PostMapping("/movie")
    public ResponseEntity postMovie(@RequestBody Movie movie){
        Movie movies = movieService.postMovie(movie);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/movie/{movieId}")
    public ResponseEntity getMovieDetailById(@PathVariable long movieId){
        Movie movies = movieService.getMovieDetailById(movieId);
        return ResponseEntity.ok(movies);
    }
    @GetMapping("/movie-by-name")
    public ResponseEntity getMovieDetailByName(@RequestParam String movieName){
        List<Movie> movies = movieService.getMovieDetailByName(movieName);
        return ResponseEntity.ok(movies);
    }

}
