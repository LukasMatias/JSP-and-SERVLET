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
@WebServlet(urlPatterns = {"/doGet"})
public class doGet extends HttpServlet {

    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String empresa = request.getParameter("empresa");
        String html = "<html><head>"+
                "<title> Trabalhando com do GET</title>"+
                "</head>"+
                "<body>"+
                "Nome: <strong>" + nome + "</strong><br />"+
                "Empresa: <strong>" + empresa + "</strong><br />"+
                "A query enviada é: <strong>" + request.getQueryString() + "</strong>"+
                "</body></html>";
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.print(html);
                out.close();
     }
}
