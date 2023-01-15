package com.example.movie.controllers;

import com.example.movie.models.Movie;
import com.example.movie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/movies")
@Controller
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    // ShoppingCart till ArrayList. Leva i minnet till en http session.
    // ShoppingCart måste vara specifik för varje användare.

    //

    @GetMapping("")
    public String getAllMovies(Model model,
                               @RequestParam (required = false, value = "sortBy") String sortBy,
                               @RequestParam (required = false, value = "current", defaultValue = "true") Boolean isCurrent
    ){

        boolean helper = true;
        String pageTitle = "På bio just nu";
        List<Movie> movieList;

        // På bio just nu:

        if(isCurrent && sortBy == null){
            movieList = (List<Movie>) movieRepository.getCurrentMovies();
        }
        else if(isCurrent && sortBy.equals("action")) {
            movieList = (List<Movie>) movieRepository.getCurrentMoviesByGenre("ACTION");
        }
        else if(isCurrent && sortBy.equals("komedi")) {
            movieList = (List<Movie>) movieRepository.getCurrentMoviesByGenre("COMEDY");
        }
        else if(isCurrent && sortBy.equals("scifi")) {
            movieList = (List<Movie>) movieRepository.getCurrentMoviesByGenre("SCIFI");
        }
        else if(isCurrent && sortBy.equals("barn")) {
            movieList = (List<Movie>) movieRepository.getCurrentMoviesByGenre("CHILDREN");
        }

        // Kommande filmer:

        else if(!isCurrent) {
            movieList = (List<Movie>) movieRepository.getUpcomingMovies(); // Native query method
            pageTitle ="Kommande filmer";
            helper = false;
        }

        else{
            movieList = (List<Movie>) movieRepository.getCurrentMovies();
        }

        model.addAttribute("movieList", movieList);
        model.addAttribute("pageTitle", pageTitle);
        model.addAttribute("helper", helper);

        return "movies";
    }

//    @PostMapping("/order")
//    public String getAllMoviesByRelease(Model model){
//        List<Movie> movieList= (List<Movie>) movieRepository.findAllByOrderByRelease();
//        model.addAttribute("movieList", movieList);
//        return "movies";
//    }

    @GetMapping("/{id}")
    String getmovie(Model model, @PathVariable Long id){
        Movie movie = movieRepository.findById(id).get();
        model.addAttribute("movie",movie);
        return "detailsMovie";
    }



}
