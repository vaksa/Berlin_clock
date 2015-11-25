package com.becomejavasenior.servlets;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserViewServlet extends HttpServlet{

    private ServletConfig cfg;
    private ServletContext ctx;

    @Override
    public void init(ServletConfig config) throws ServletException {
        cfg = config;
        ctx = cfg.getServletContext();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);

        RequestDispatcher dispatcher = req.getRequestDispatcher("pages/userView.jsp");
        dispatcher.forward(req, resp);

    }

}
