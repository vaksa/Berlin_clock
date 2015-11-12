package com.becomejavasenior.filters;

import com.becomejavasenior.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class UserCheckFilter implements Filter {

    private String LOGIN_ACTION_URI;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGIN_ACTION_URI = filterConfig.getInitParameter("loginActionURI");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        RequestDispatcher requestDispatcher;

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpSession session = req.getSession();

        String URI = ((HttpServletRequest)servletRequest).getRequestURI();

        User user = (User)session.getAttribute("user");

        /*if (user == null && !LOGIN_ACTION_URI.equals(req.getRequestURI())){
            requestDispatcher = req.getRequestDispatcher("/login.jsp");
            requestDispatcher.forward(servletRequest, servletResponse);
            return;
        }*/


        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {

    }
}
