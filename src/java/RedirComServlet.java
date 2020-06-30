/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukas
 */
@WebServlet(urlPatterns = {"/RedirComServlet"})
public class RedirComServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("UTF-8");
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        if (usuario.equals("lukas") && senha.equals("123")) {
            response.sendRedirect("metodoServlet.html");
        } else {
            response.sendRedirect("usuario_inv.html");
        }
    }
}
