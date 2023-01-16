package com.example.movie.controllers;

import com.example.movie.models.Movie;
import com.example.movie.models.Purchase;
import com.example.movie.models.Snack;
import com.example.movie.repositories.MovieRepository;
import com.example.movie.repositories.PurchaseRepository;
import com.example.movie.repositories.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/purchases")
@Controller
public class PurchaseController {


    @Autowired
    PurchaseRepository purchaseRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    SnackRepository snackRepository;

    @GetMapping("")
    public String getAllPurchases(Model model){
        List<Purchase> purchaseList= (List<Purchase>) purchaseRepository.findAll();
        Integer total = purchaseRepository.getTotal();
        model.addAttribute("purchaseList", purchaseList);
        model.addAttribute("total", total);
        return "purchases";
    }

    @GetMapping("/addToCart")
    public String savePurchase(Model model, @RequestParam Long id, @RequestParam String type){

        Purchase purchase = new Purchase();
        if(type.equals("movie")) {
            Movie movie = movieRepository.findById(id).get();
            purchase.setMovie(movie);
            purchaseRepository.save(purchase);
            return "redirect:/purchases";
        } else if(type.equals("snack")) {
            Snack snack = snackRepository.findById(id).get();
            purchase.setSnack(snack);
            purchaseRepository.save(purchase);
            return "redirect:/purchases";
        }
        return "purchases";
    }


//    @GetMapping("/buy")
//    public String test(Model model) {
//        model.addAttribute("movie", new Movie());
//        model.addAttribute("purchase", new Purchase());
//        return "buy";
//    }
//
//    @PostMapping("/buy")
//    public String test2(@ModelAttribute Purchase purchase, @RequestParam(value="id") Long id) {
//        Movie movie = movieRepository.findById(id).get();
//        purchase.setMovie(movie);
//        purchaseRepository.save(purchase);
//        return "buy";
//    }
}
