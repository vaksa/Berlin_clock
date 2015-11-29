package com.becomejavasenior.servlets;


import com.becomejavasenior.User;
import com.becomejavasenior.exceptions.UserAuthorizationException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Orlov Vladislav on 15.11.2015.
 */
public class UserLoginServlet extends HttpServlet {

    private static final Map<String, User> users = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher;

        try {
            User user = authorizeUser(req.getParameter("login"), req.getParameter("password"));

            dispatcher = req.getRequestDispatcher("pages/workFlow.jsp");
            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            req.setAttribute("user", user.toString());
        }catch (UserAuthorizationException ex){
            dispatcher = req.getRequestDispatcher("pages/loginError.jsp");
            req.setAttribute("message", ex.getLocalizedMessage());
        }

        dispatcher.forward(req, resp);

    }

    private User authorizeUser(String login, String password) throws UserAuthorizationException{

        // All parameters must be valid
        if (login == null || password == null){
            throw new UserAuthorizationException("Wrong input data!!!");
        }

        // Get a user by key
        User user = users.get(login);

        if (user == null){
            throw new UserAuthorizationException("Wrong login!!!");
        }

        // Check if the password is valid
        if (!user.getPassword().equals(password.trim())){
            throw new UserAuthorizationException("Wrong password!!!");
        }

        return user;
    }


}
