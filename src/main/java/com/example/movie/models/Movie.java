package com.example.movie.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;
    @Column(name = "IMAGE_NAME")
    private String imageName;
    @Column(name = "GENRE")
    private String genre;
    @Column(name = "PRICE")
    private int price;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "MOVIE_LENGTH")
    private String length;
    @Column(name = "RELEASE", columnDefinition = "DATE")
    private LocalDate release;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Purchase> purchaseList = new ArrayList<>();

    public Movie() {
    }

    public Movie(Long id, String title, String imageName, String genre, int price, String description, String length, LocalDate release) {
        this.id = id;
        this.title = title;
        this.imageName = imageName;
        this.genre = genre;
        this.price = price;
        this.description = description;
        this.length = length;
        this.release = release;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }
}
