
/*        Created by IntelliJ IDEA.
        User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
        Date: 3/15/19
        Time: 2:36 PM
        To change this template use File | Settings | File Templates.
        */

package com.abyssinia.controller;

import com.abyssinia.dao.UserDAO;
import com.abyssinia.model.CreditCard;
import com.abyssinia.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/payment")
public class PaymentController extends HttpServlet {

    String uname = "";
    String id = "";
    ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        uname = (String)req.getSession().getAttribute("userName");
        id = (String)req.getSession().getAttribute("movieId");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/view/payment.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String passedParam = req.getParameter("paymentinfo");
        CreditCard card = null;

        if(passedParam != null){
            card = mapper.readValue(passedParam, CreditCard.class);
        } else{
            card = new CreditCard();
            System.out.println("credit card");
        }

        User user = UserDAO.getUserById(uname);
        if(user != null){
            user.setCreditCard(card);
        }

        HttpSession s = req.getSession(true);
        s.setAttribute("movieId", id);

        String publish = (String) getServletContext().getAttribute("Publisher");
        if( publish == "true"){
            resp.sendRedirect("/publish");
        }else {
            resp.sendRedirect("/single");
        }
    }
}