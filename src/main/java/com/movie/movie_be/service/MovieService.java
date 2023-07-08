package com.movie.movie_be.service;

import com.movie.movie_be.entity.Information;
import com.movie.movie_be.entity.Movie;
import com.movie.movie_be.repository.ActorResponsitory;
import com.movie.movie_be.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ActorResponsitory actorRepository;

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }

    public Movie postMovie(Movie movie){
        Movie newMovie = movieRepository.save(movie);
        return newMovie;
    }
    public List<Movie> postMovies(List<Movie> movies){
        List<Movie> newMovies = movieRepository.saveAll(movies);
        return newMovies;
    }

    public Movie getMovieDetailById(long movieId){
        Movie newMovie = movieRepository.findMovieById(movieId);
        return newMovie;
    }
    public List<Movie> getMovieDetailByName(String movieName){
        List<Movie> movies = movieRepository.find(movieName);
        return movies;
    }

    public void addData(){
        Movie movie = movieRepository.findMovieById(1);
        Set<Information> actors = actorRepository.findAll().stream().collect(Collectors.toSet());
        movie.setActors(actors);
        movieRepository.save(movie);
    }

/*    public Movie getMovieDetailByKeyword(String keyword){
        Movie newMovie = movieRepository.findMovieByNameContaining(keyword);
        return newMovie;
    }*/

}
