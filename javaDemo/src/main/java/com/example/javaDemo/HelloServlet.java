package com.example.javaDemo;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        System.out.println("the GET request has been made to /hello");
        response.setContentType("text/plain");
        response.getWriter().println("<h1>way to go</h1>");
        response.getWriter().println("here is x");

    }

    public void destroy() {
    }
}

