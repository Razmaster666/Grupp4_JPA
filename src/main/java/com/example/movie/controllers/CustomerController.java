package com.example.movie.controllers;

import com.example.movie.models.Customer;
import com.example.movie.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/customers")
@Controller
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("")
    public String getAllCustomers(Model model){
        List<Customer> customerList= (List<Customer>) customerRepository.findAll();
        model.addAttribute("customerList", customerList);
        return "customers";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("customer", new Customer());
        return "customerForm";
    }

    @PostMapping("/save")
    public String set(@ModelAttribute Customer customer) {
        customerRepository.save(customer);
        return "redirect:";

        //Utgå från customerId för att få fram rätt filmer som den kunden har köpt
    }
}
