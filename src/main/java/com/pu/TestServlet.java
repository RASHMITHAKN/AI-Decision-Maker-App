package com.pu;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("username");

        response.setContentType("text/html");
        response.getWriter().println("<h1>Welcome " + user + " 🎉</h1>");
    }
}