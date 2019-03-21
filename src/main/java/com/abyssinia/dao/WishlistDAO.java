
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.dao;

import com.abyssinia.model.Genre;
import com.abyssinia.model.Movie;
import com.abyssinia.model.Wishlist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WishlistDAO {

    private static HashMap<String, List<Movie>> wishLists = new HashMap<String, List<Movie>>();

    static {

        String actors = "Angelina Jolie, Jhonny Depp";
        Movie m1 = new Movie("17", "Escape Room", Genre.HORROR, "James",actors,
                LocalDate.of(2009,11,23), 8.5, "pic17.jpg", "birdbox.mp4",
                "When a mysterious force decimates the population, if you see it, you die. The survivors must now avoid coming face to face with an entity that takes the form of their worst fears. Searching for hope, a woman and her children embark on a journey.", 125326);

        Movie m2 = new Movie("18", "Captive State", Genre.SCIFI, "Martin",actors,
                LocalDate.of(2007,11,23), 8.9, "pic18.jpg", "nightschool.mp4", "Teddy Walker is a successful salesman whose life takes an unexpected turn when he accidentally blows up his place of employment. Forced to attend night school to get his GED, Teddy soon finds himself dealing with a group of misfit students", 25362);

        List<Movie> ml1 = new ArrayList<>();
        ml1.add(m1);
        ml1.add(m2);

        List<Movie> ml2 = new ArrayList<>();
        ml2.add(m1);
        ml2.add(m2);

        wishLists.put("dagm", ml1);
        wishLists.put("yacob", ml2);
    }

    public static List<Movie> getWishList(String uname){
        return wishLists.get(uname);
    }

    public static void addMovie(String userName, String movieId) {
        List<Movie> lm = wishLists.get(userName);
        lm.add(MovieDAO.getMovieNameById(movieId));
        wishLists.put(userName, lm);
    }
}
