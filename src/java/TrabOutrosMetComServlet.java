/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukas
 */
@WebServlet(urlPatterns = {"/TrabOutrosMetComServlet"})
public class TrabOutrosMetComServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] e = request.getParameterValues("musica");
        String html = "<html><head>"
                + "<title> Trabalhando com outros metodos em Servlet</title>"
                + "</head><body>"
                + "<h2> Músicas escolhidas</h2>";
        for (int i = 0; i < e.length; i++) {
            html += "<strong>" + e[i] + "</strong><br />";
        }
        html += "</body></html>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(html);
        out.close();

    }
}
