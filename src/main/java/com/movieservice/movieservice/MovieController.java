package com.movieservice.movieservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("movie/api")
public class MovieController {

    @Autowired
    MovieService movieService;
    @GetMapping("/movies")
    public List<Movie> getAllMovies(){

        return movieService.list();
    }
}
