package com.networking.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Created by Alex@Modest on 16.05.17 13:17
 */

public class HelloWorld {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
