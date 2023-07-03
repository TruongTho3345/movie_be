package com.movie.movie_be.service;

import com.movie.movie_be.entity.Movie;
import com.movie.movie_be.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

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

/*    public Movie getMovieDetailByKeyword(String keyword){
        Movie newMovie = movieRepository.findMovieByNameContaining(keyword);
        return newMovie;
    }*/

}
