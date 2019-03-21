
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.dao;

import com.abyssinia.model.Genre;
import com.abyssinia.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MovieDAO {
    private static Map<String, Movie> movies = new HashMap<String, Movie>();

    static {
        String actors = "Angelina Jolie, Jhonny Depp";

        Movie m1 = new Movie("1", "Shaun of the Dead", Genre.HORROR, "Martin",actors,
                LocalDate.of(2007,11,23), 8.3, "pic13.jpg", "nightschool.mp4", "Teddy Walker is a successful salesman whose life takes an unexpected turn when he accidentally blows up his place of employment. Forced to attend night school to get his GED, Teddy soon finds himself dealing with a group of misfit students",12333);

        Movie m2= new Movie("2", "Frozen", Genre.ANIMATION, "Martin",actors,
                LocalDate.of(2007,11,23), 8.1, "pic11.jpg", "thehangover.mp4", "Two days before his wedding, Doug (Justin Bartha) and three friends (Bradley Cooper, Ed Helms, Zach Galifianakis) drive to Las Vegas for a wild and memorable stag party.", 36477);

        Movie m3 = new Movie("3", "Journey To Center Of Earth", Genre.ADVENTURE, "Martin",actors,
                LocalDate.of(2007,11,23), 7.7, "pic12.jpg", "gamenight.mp4", "Max and Annie's weekly game night gets kicked up a notch when Max's brother Brooks arranges a murder mystery party -- complete with fake thugs and federal agents.", 44762);

        Movie m4 = new Movie("4", "Spider Man", Genre.SCIFI, "Martin",actors,
                LocalDate.of(2007,11,23), 8.7, "pic04.jpg", "spiderman.mp4", "Peter Parker (Tobey Maguire) and M.J. (Kirsten Dunst) seem to finally be on the right track in their complicated relationship, but trouble looms for the superhero and his lover.", 14253);

        Movie m5 = new Movie("5", "The Hangover", Genre.COMMEDY, "Martin",actors,
                LocalDate.of(2007,11,23), 6.8, "pic05.jpg", "thehangover.mp4", "Two days before his wedding, Doug (Justin Bartha) and three friends (Bradley Cooper, Ed Helms, Zach Galifianakis) drive to Las Vegas for a wild and memorable stag party.", 13532);

        Movie m6 = new Movie("6", "Night School", Genre.COMMEDY, "Martin",actors,
                LocalDate.of(2007,11,23), 7.8, "pic03.jpg", "nightschool.mp4", "Teddy Walker is a successful salesman whose life takes an unexpected turn when he accidentally blows up his place of employment. Forced to attend night school to get his GED, Teddy soon finds himself dealing with a group of misfit students",24414);

        Movie m7 = new Movie("7", "Avengers: Infinity War", Genre.ACTION, "Stephen",actors,
                LocalDate.of(2000,11,23), 8.3, "pic07.jpg", "venom.mp4",
                "Journalist Eddie is trying to take down Carlton Drake, the notorious and brilliant founder of the Life Foundation. While investigating one of Drake's experiments, Eddie's body merges with the alien Venom -- leaving him with superhuman strength and power.", 51424);

        Movie m8 = new Movie("8", "Black Panther", Genre.ACTION, "James",actors,
                LocalDate.of(2009,11,23), 8.8, "pic08.jpg", "birdbox.mp4",
                "When a mysterious force decimates the population, if you see it, you die. The survivors must now avoid coming face to face with an entity that takes the form of their worst fears. Searching for hope, a woman and her children embark on a journey.", 15252);

        Movie m9 = new Movie("9", "Captain Marvel", Genre.ACTION, "Martin",actors,
                LocalDate.of(2007,11,23), 8.6, "pic09.jpg", "nightschool.mp4", "Teddy Walker is a successful salesman whose life takes an unexpected turn when he accidentally blows up his place of employment. Forced to attend night school to get his GED, Teddy soon finds himself dealing with a group of misfit students", 25141);

        Movie m10 = new Movie("10", "Moana", Genre.ANIMATION, "Martin",actors,
                LocalDate.of(2007,11,23), 8.2, "pic10.jpg", "spiderman.mp4", "Peter Parker (Tobey Maguire) and M.J. (Kirsten Dunst) seem to finally be on the right track in their complicated relationship, but trouble looms for the superhero and his lover.", 52414);

        Movie m11 = new Movie("11", "Bird Box", Genre.HORROR, "James",actors,
                LocalDate.of(2009,11,23), 9.9, "pic02.jpg", "birdbox.mp4",
                "When a mysterious force decimates the population, if you see it, you die. The survivors must now avoid coming face to face with an entity that takes the form of their worst fears. Searching for hope, a woman and her children embark on a journey.", 15252);

        Movie m12 = new Movie("12", "Venom", Genre.SCIFI, "Stephen",actors,
                LocalDate.of(2000,11,23), 10, "pic01.jpg", "venom.mp4",
                "Journalist Eddie is trying to take down Carlton Drake, the notorious and brilliant founder of the Life Foundation. While investigating one of Drake's experiments, Eddie's body merges with the alien Venom -- leaving him with superhuman strength and power.", 35242);

        Movie m13 = new Movie("13", "Game Night", Genre.COMMEDY, "Martin",actors,
                LocalDate.of(2007,11,23), 9.3, "pic06.jpg", "gamenight.mp4", "Max and Annie's weekly game night gets kicked up a notch when Max's brother Brooks arranges a murder mystery party -- complete with fake thugs and federal agents.", 88726);

        Movie m14 = new Movie("14", "Jumanji", Genre.ADVENTURE, "Martin",actors,
                LocalDate.of(2007,11,23), 6.4, "pic14.jpg", "spiderman.mp4", "Peter Parker (Tobey Maguire) and M.J. (Kirsten Dunst) seem to finally be on the right track in their complicated relationship, but trouble looms for the superhero and his lover.", 62638);

        Movie m15 = new Movie("15", "Incredibles 2", Genre.ANIMATION, "James",actors,
                LocalDate.of(2009,11,23), 8.2, "pic15.jpg", "birdbox.mp4",
                "When a mysterious force decimates the population, if you see it, you die. The survivors must now avoid coming face to face with an entity that takes the form of their worst fears. Searching for hope, a woman and her children embark on a journey.",125352);

        Movie m16 = new Movie("16", "The Jungle Book", Genre.ADVENTURE, "Martin",actors,
                LocalDate.of(2007,11,23), 8.7, "pic16.jpg", "nightschool.mp4", "Teddy Walker is a successful salesman whose life takes an unexpected turn when he accidentally blows up his place of employment. Forced to attend night school to get his GED, Teddy soon finds himself dealing with a group of misfit students", 152532);

        Movie m17 = new Movie("17", "Escape Room", Genre.HORROR, "James",actors,
                LocalDate.of(2009,11,23), 8.5, "pic17.jpg", "birdbox.mp4",
                "When a mysterious force decimates the population, if you see it, you die. The survivors must now avoid coming face to face with an entity that takes the form of their worst fears. Searching for hope, a woman and her children embark on a journey.", 125326);

        Movie m18 = new Movie("18", "Captive State", Genre.SCIFI, "Martin",actors,
                LocalDate.of(2007,11,23), 8.9, "pic18.jpg", "nightschool.mp4", "Teddy Walker is a successful salesman whose life takes an unexpected turn when he accidentally blows up his place of employment. Forced to attend night school to get his GED, Teddy soon finds himself dealing with a group of misfit students", 25362);

        movies.put("1", m1);
        movies.put("2", m2);
        movies.put("3", m3);
        movies.put("4", m4);
        movies.put("5", m5);
        movies.put("6", m6);
        movies.put("7", m7);
        movies.put("8", m8);
        movies.put("9", m9);
        movies.put("10", m10);
        movies.put("11", m11);
        movies.put("12", m12);
        movies.put("13", m13);
        movies.put("14", m14);
        movies.put("15", m15);
        movies.put("16", m16);
        movies.put("17", m17);
        movies.put("18", m18);
    }

    public static List<Movie> getMovies() {
        return movies.entrySet().stream().map(p -> p.getValue()).collect(Collectors.toList());
    }

    public static String getMovieById(String id){
      return movies.get(id).getMovieId();
    }

    public static String getMovieVideoById(String id){
        return movies.get(id).getVideo();
    }

    public static Movie getMovieNameById(String id){
        return movies.get(id);
    }


    public static List<Movie> getMoviesByCatagory(Genre genre) {
        return movies.entrySet().stream().filter(p->p.getValue().getGenre().equals(genre)).map(p -> p.getValue()).collect(Collectors.toList());
    }

    public static void addMovie(String title, Genre genre, String owner, String actors, LocalDate date, double rating, String image, String video, String desc){
        movies.put( (movies.size() + 1) + "", new Movie((movies.size() + 1) + "", title, genre, owner, actors, date, rating, image, video, desc, 0));
    }

}
