
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.controller;

import com.abyssinia.dao.MovieDAO;
import com.abyssinia.dao.WishlistDAO;
import com.abyssinia.model.Genre;
import com.abyssinia.model.Wishlist;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MovieController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MovieDAO moviedao = new MovieDAO();
        req.setAttribute("movies", moviedao.getMovies());
        req.setAttribute("action", moviedao.getMoviesByCatagory(Genre.ACTION));
        req.setAttribute("adventure", moviedao.getMoviesByCatagory(Genre.ADVENTURE));
        req.setAttribute("comedy", moviedao.getMoviesByCatagory(Genre.COMMEDY));
        req.setAttribute("scifi", moviedao.getMoviesByCatagory(Genre.SCIFI));
        req.setAttribute("horror", moviedao.getMoviesByCatagory(Genre.HORROR));
        req.setAttribute("animation", moviedao.getMoviesByCatagory(Genre.ANIMATION));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/home.jsp");
        requestDispatcher.forward(req, resp);
    }

}
