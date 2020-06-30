
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(urlPatterns = {"/ServletSessionPagDois"})
public class ServletSessionPagDois extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sessao = request.getSession(true);
        String nome = (String) sessao.getAttribute("nome");

        String html = "<html><head><title>Trabalhando com sessão</title>"
                + "</head><body>";
        if (nome != null) {
            html += "Sua Id é:<strong>" + sessao.getId() + "</strong><br />"
                    + "E seu nome é: <strong>" + nome + "</strong><br />"
                    + "<a href=\"ServletFecharSessao\">Clique Aqui</a> "
                    + "para fechar a sessao.";
        } else {
            html += "sua sessão não foi criada. <br />"
                    + "<a href=\"ServletSessionPagUm\">Clique Aqui</a>"
                    + " para criar uma sessão";
        }
        html += "</body></html>";
        PrintWriter out = response.getWriter();
        out.print(html);
        out.close();
    }

}
