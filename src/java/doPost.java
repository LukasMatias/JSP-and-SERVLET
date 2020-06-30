
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
@WebServlet(urlPatterns = {"/doPost"})
public class doPost extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");

        String html = "<html><head>"
                + "<title> Trabalhando com doPost </title>"
                + "</head>"
                + "<body>";
        if (usuario.equals("lukas") && senha.equals("123")) {
            html += "Seja bem-vindo Lukas";
        } else {
            html += "usuario inválido";
        }
        html += "</body></html>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print(html);
        out.close();
    }
   
}
