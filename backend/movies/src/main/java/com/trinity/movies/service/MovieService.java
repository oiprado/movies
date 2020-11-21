package com.trinity.movies.service;

import com.trinity.movies.domain.Movie;

import java.util.List;

public interface MovieService {

    void create(Movie movie);

    void remove(Movie movie);

    void update(Movie movie);

    List<Movie> getAll();

}
