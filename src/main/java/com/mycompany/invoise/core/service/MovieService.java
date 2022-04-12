package com.mycompany.invoise.core.service;

import com.mycompany.invoise.core.entity.Movie;
import com.mycompany.invoise.core.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
