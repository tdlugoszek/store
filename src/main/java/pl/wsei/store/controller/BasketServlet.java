package pl.wsei.store.controller;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "bucketServlet", value = "/bucket-servlet")
public class BucketServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Oto aktualny stan Twojego koszyka:";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}