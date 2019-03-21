

/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.controller;

import com.abyssinia.dao.MovieDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SingleController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String id = (String)req.getSession().getAttribute("movieId");
        String movie = MovieDAO.getMovieVideoById(id);
        req.setAttribute("movies", movie);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/single.jsp");
        requestDispatcher.forward(req, resp);
    }
}
