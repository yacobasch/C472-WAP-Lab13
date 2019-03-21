
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.controller;

import com.abyssinia.dao.MovieDAO;
import com.abyssinia.dao.WishlistDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/wishlist")
public class WishlistController extends HttpServlet {

    String uname = "";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession s = req.getSession(false);
        uname = (String)s.getAttribute("loogedinUser");
        String movieId = req.getParameter("id");
        if(uname == null){
            s.setAttribute("Wishlist", "true");
            resp.sendRedirect("/login?id="+movieId);
        }else {
            WishlistDAO.addMovie(uname, movieId);
            s.setAttribute("wishlist", WishlistDAO.getWishList(uname));
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/wishlist.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/wishlist.jsp");
        requestDispatcher.forward(req, resp);
    }
}
