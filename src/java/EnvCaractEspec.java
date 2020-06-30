/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukas
 */
@WebServlet(urlPatterns = {"/EnvCaractEspec"})
public class EnvCaractEspec extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            // use o MIME "UTF-8" para caracteres especiais.
        String queryString = URLEncoder.encode("cidadão&João", "ISO-8859-1");
        
        String html = "<html><head>"+
                "<title> Enviando caracteres especiais</title></head>"+
                "<body>"+
                "<a href=\"RecCaractEspec?dados=" + queryString+"\">" + "Clique aqui para enviar" + "</a>"+
                "</body></html>";
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
