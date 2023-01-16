package com.example.movie.controllers;

import com.example.movie.models.Movie;
import com.example.movie.models.Purchase;
import com.example.movie.repositories.MovieRepository;
import com.example.movie.repositories.PurchaseRepository;
import com.example.movie.repositories.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/purchases")
@Controller
public class PurchaseController {


    @Autowired
    PurchaseRepository purchaseRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    private SnackRepository snackRepository;

    @GetMapping("")
    public String getAllPurchases(Model model){
        List<Purchase> purchaseList= (List<Purchase>) purchaseRepository.findAll();
        Integer total = purchaseRepository.getTotal();
        model.addAttribute("purchaseList", purchaseList);
        model.addAttribute("total", total);
        return "purchases";
    }

    @GetMapping("/addToCart")
    public String savePurchase(Model model, @RequestParam Long id){
        Movie movie = movieRepository.findById(id).get();
        Purchase purchase = new Purchase();
        purchase.setMovie(movie);
        purchaseRepository.save(purchase);
        return "redirect:/purchases";
    }

//    @GetMapping("/addToCart2")
//    public String saveSnack(Model model, @RequestParam Long id){
//        Snack snack = snackRepository.findById(id).get();
//        Purchase purchase = new Purchase();
//        purchase.setSnack(snack);
//        purchaseRepository.save(purchase);
//        return "redirect:/purchases";
//    }


}
