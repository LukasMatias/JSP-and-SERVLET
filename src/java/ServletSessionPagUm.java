/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lukas
 */
@WebServlet(urlPatterns = {"/ServletSessionPagUm"})
public class ServletSessionPagUm extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sessao = request.getSession(true);
        sessao.setAttribute("nome", "Lukas Porra!");
        sessao.setMaxInactiveInterval(10);
        new Date(sessao.getCreationTime());
        new Date(sessao.getLastAccessedTime());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy - HH:mm:ss");
        String html = "<html><head><title>Sessao em Servlet</title>"
                + "</head><body>"
                + "<h4>Sua sessão foi criada com sucesso!</h4><br />"
                + "Seu ID é: <strong>" + sessao.getId() + "</strong><br />" +
                "Tempo maximo de inatividade é: <strong> "+ sessao.getMaxInactiveInterval() +  "</strong> segundos (s) <br />"+
                "Sessão criada em: <strong>"+ formato.format(sessao.getCreationTime())+  "</strong><br />"+
                "Ultimo acesso em: <strong>"+ formato.format(sessao.getLastAccessedTime())+  "</strong><br />"+
                   "<a href=\"ServletSessionPagDois\">Clique Aqui</a>"+
                " para ver a sessao da página seguinte."+
                "</body></html>";
        PrintWriter out = response.getWriter();
        out.print(html);
        out.close();
    }

}
