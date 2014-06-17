/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet for managing realEstates.
 */
@WebServlet(DemoClassServlet.URL_MAPPING)
public class DemoClassServlet extends HttpServlet {

    public static final String URL_MAPPING = "/status";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long timeStamp = System.currentTimeMillis() / 1000L;
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("OK![" + timeStamp + "]");
        out.println("</body></html>");
    
    }

}
