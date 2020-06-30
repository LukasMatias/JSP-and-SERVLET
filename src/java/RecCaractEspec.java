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
@WebServlet(urlPatterns = {"/RecCaractEspec"})
public class RecCaractEspec extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dados = request.getParameter("dados");
        String html = "<html><head>"
                + "<title>Recebendo caracteres especiais</title>"
                + "</head><body>"
                + "Os dados recebidos são: <Strong>" + dados + "</strong><br />"
                + "A query recebida é: <strong>"
                + request.getQueryString() + "</strong>"
                + "</body></html>";
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.print(html);
                out.close();
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
