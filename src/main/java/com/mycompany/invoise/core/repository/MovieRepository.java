package com.mycompany.invoise.core.repository;

import com.mycompany.invoise.core.entity.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private List<Movie> movies = new ArrayList<>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("The movie " + movie.getTitel() + " has been added.");
    }
}
