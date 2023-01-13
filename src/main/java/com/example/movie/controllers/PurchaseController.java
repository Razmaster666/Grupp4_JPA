package com.example.movie.controllers;

import com.example.movie.models.Purchase;
import com.example.movie.repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/purchases")
@Controller
public class PurchaseController {

    @Autowired
    PurchaseRepository purchaseRepository;

    @GetMapping("")
    public String getAllPurchases(Model model){
        List<Purchase> purchaseList= (List<Purchase>) purchaseRepository.findAll();
        model.addAttribute("purchaseList", purchaseList);
        return "purchases";
    }

}
