package com.mycompany.invoise.service;

import com.mycompany.invoise.entity.Movie;
import com.mycompany.invoise.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }
}
