package com.abyssinia.controller;


import com.abyssinia.dao.MovieDAO;
import com.abyssinia.dao.WishlistDAO;
import com.abyssinia.model.Genre;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/wishlistcontrol")
public class WishlistControl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession s = req.getSession(false);
        String uname = (String)s.getAttribute("loogedinUser");
        req.setAttribute("wishlist", WishlistDAO.getWishList(uname));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/wishlist.jsp");
        requestDispatcher.forward(req, resp);
    }

}
