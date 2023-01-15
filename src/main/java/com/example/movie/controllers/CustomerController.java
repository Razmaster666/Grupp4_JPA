package com.example.movie.controllers;

import com.example.movie.models.Customer;
import com.example.movie.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/customers")
@Controller
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    //Utgå från customerId för att få fram rätt filmer som den kunden har köpt

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

    @PostMapping("/add")
    public String set(@ModelAttribute @Valid Customer customer,
                      Errors errors, Model model) {
        if(errors.hasErrors()){
            return "customerForm";
        }
        customerRepository.save(customer);
        return "redirect:";
    }
}
