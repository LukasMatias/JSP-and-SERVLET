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
@WebServlet(urlPatterns = {"/ServletFecharSessao"})
public class ServletFecharSessao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession sessao = request.getSession(true);
        
        sessao.removeAttribute("nome");
        String nome = (String) sessao.getAttribute("nome");
        String html = "<html><heade>"
                + "<title>Fechando a sessão</title>"
                + "</head>"
                + "<body>"
                + "Sua Id é: <strong>" + sessao.getId() + "</strong><br />"+
                "e seu nome é: <strong>" + nome + "</strong><br />"+
                "<a href=\"ServletSessionPagUm\" Clique Aqui</a> "
                + "para iniciar uma nova sessão"
                + "</body></html>";
        PrintWriter out = response.getWriter();
        out.print(html);
        out.close();
    }

 
}
