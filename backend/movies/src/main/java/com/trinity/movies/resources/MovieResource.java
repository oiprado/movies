package com.trinity.movies.resources;

import com.trinity.movies.domain.Movie;
import com.trinity.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieResource {

    private MovieService movieService;

    @PostMapping()
    public ResponseEntity create(@RequestBody Movie movie){
        movieService.create(movie);
        return ResponseEntity.ok(movie);
    }

    @PutMapping()
    public ResponseEntity update(@RequestBody Movie movie){
        movieService.update(movie);
        return ResponseEntity.ok(movie);
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestBody Movie movie){
        movieService.remove(movie);
        return ResponseEntity.ok(movie);
    }

    @GetMapping(value = "/movies")
    public List<Movie> getAll() {
        return movieService.getAll();
    }

    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }
}
