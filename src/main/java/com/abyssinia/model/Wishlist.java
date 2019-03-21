
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.model;

import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    private String userId;
    private List<Movie> movies = new ArrayList();

    public Wishlist(){

    }

    public Wishlist(String user) {
        this.userId = user;
    }

    public String getUser() {
        return userId;
    }

    public void setUser(String user) {
        this.userId = user;
    }

    public List<Movie > getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {

        this.movies.add(movie);
    }

}
