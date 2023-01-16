package com.example.movie.models;

import javax.persistence.*;

@Entity
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Movie movie;

    public Purchase() {
    }

    public Purchase(Movie movie) {
        this.movie = movie;
    }

    public Purchase(Long id, Customer customer, Movie movie) {
        this.id = id;
        this.customer = customer;
        this.movie = movie;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
