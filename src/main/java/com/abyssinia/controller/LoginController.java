
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */


package com.abyssinia.controller;

import com.abyssinia.dao.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/login")
public class LoginController extends HttpServlet {
    /*UserDAO udao = UserDAO

    @Override
    public void init() throws ServletException {

    }*/

    String id = "";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        id = req.getParameter("id");

        String uname = (String)req.getSession().getAttribute("loogedinUser");
        HttpSession session = req.getSession(false);
        session.setAttribute("movieId", id);
        String publish = (String) session.getAttribute("Publisher");
        String wishlist = (String) session.getAttribute("Wishlist");
        if(uname != null) {
            if(publish =="true"){
                session.setAttribute("Publisher", "false");
                resp.sendRedirect("/publish");
            }else if( wishlist == "true"){
                session.setAttribute("Wishlist", "false");
                resp.sendRedirect("/wishlist");
            }else {
                session.setAttribute("movieId", id);
                resp.sendRedirect("/single");
            }
        }else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/login.jsp");
            requestDispatcher.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String passedUname = req.getParameter("uname");
        String passedPwd = req.getParameter("pass");

        if(UserDAO.isRegistered(passedUname, passedPwd)){
            if(UserDAO.isgetCreditCard(passedUname)){
                HttpSession s = req.getSession(false);
                s.setAttribute("loogedinUser", passedUname);
                String publish = (String) s.getAttribute("Publisher");
                String wishlist = (String) s.getAttribute("Wishlist");

                if( publish == "true"){
                    s.setAttribute("Publisher", "false");
                    resp.sendRedirect("/publish");
                }else if(wishlist == "true"){
                    s.setAttribute("Wishlist", "false");
                    resp.sendRedirect("/wishlist");
                }else {
                    resp.sendRedirect("/single");
                }
           }else {
                HttpSession ss = req.getSession(true);
                ss.setAttribute("movieId", id);
                ss.setAttribute("userName", passedUname);
                resp.sendRedirect("/payment");
            }
        }else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/login.jsp");
            requestDispatcher.forward(req, resp);
        }
    }
}