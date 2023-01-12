package com.example.movie.controllers;

import com.example.movie.models.Movie;
import com.example.movie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/movies")
@Controller
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    // ShoppingCart till ArrayList. Leva i minnet till en http session.
    // ShoppingCart måste vara specifik för varje användare.

    @GetMapping("/all")
    public String getAllMovies(Model model){
        List<Movie> movieList= (List<Movie>) movieRepository.findAll();
        model.addAttribute("movieList", movieList);
        return "movies";
    }
//    @GetMapping("/movie/{imageName}/{id}") //kolla rätt länk.
//    String getmovie(Model model, @PathVariable Long id){
//        Movie movie = movieRepository.findById(id).get();
//        model.addAttribute("movie",movie);
//        return "detailsMovie";
//    }



}
