/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukas
 */
@WebServlet(urlPatterns = {"/VisualizaCookie"})
public class VisualizaCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie listaCookie[] = request.getCookies();
        Cookie nome = null;

        if (listaCookie != null) {
            for (int i = 0; i < listaCookie.length; i++) {
                nome = listaCookie[i];
                break;
            }
        }
        String html = "<html>"
                + "<head>"
                + "<title>Visualizando um Cookie</title>"
                + "</head>"
                + "<body>"
                + "O cookie chamado<strong> nome</strong> tem valor: "
                + "<strong>" + nome.getValue() 
                + "</strong>"
                + "</body>"
                + "</html>";
                PrintWriter out = response.getWriter();
                out.print(html);
                out.close();

    }

}
