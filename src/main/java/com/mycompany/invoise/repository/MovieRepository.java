package com.mycompany.invoise.repository;

import com.mycompany.invoise.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitel()+" has been added.");
    }
}
