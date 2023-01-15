package com.example.movie.models;

public enum MovieGenre {
    ACTION ("Action"),
    SCIFI ("Science Fiction"),
    CHILDREN ("Barn & Familj"),
    COMEDY ("Komedi"),
    DRAMA ("Drama"),
    HORROR ("Skräck"),
    DOCUMENTARY ("Dokumentär"),
    THRILLER ("Thriller");

    private final String displayGenre;

    MovieGenre(String displayGenre) {
        this.displayGenre = displayGenre;
    }

    public String getDisplayGenre() {
        return displayGenre;
    }
}
