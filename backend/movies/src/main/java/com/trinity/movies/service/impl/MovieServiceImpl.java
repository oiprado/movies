package com.trinity.movies.service.impl;

import com.trinity.movies.domain.Movie;
import com.trinity.movies.repository.MovieRepository;
import com.trinity.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Override
    public void create(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public void remove(Movie movie) {
        movieRepository.delete(movie);
    }

    @Override
    public void update(Movie movie) {
        movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @Override
    public List<Movie> getEnabledMovies(String enabled) {
        return movieRepository.findByEnable(enabled);
    }

    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
}
