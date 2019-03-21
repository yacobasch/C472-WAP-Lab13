

/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.model;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String movieId;
    private String title;
    private Genre genre;
    private String owner;
    private String actors;
    private LocalDate releaseDate;
    private double rating;
    private long numberOfViews;
    private String image;
    private String video;
    private String movieDescription;

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public Movie() {
    }

    public Movie(String movieId, String title, Genre genre, String owner,
                 String actors, LocalDate releaseDate, double rating, String image, String video, String movieDescription, long numberOfViews) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.owner = owner;
        this.numberOfViews = numberOfViews;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.image = image;
        this.video = video;
        this.movieDescription = movieDescription;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setNumberOfViews() {
        numberOfViews++;
    }

    public long getNumberOfViews() {
        return numberOfViews;
    }

}
