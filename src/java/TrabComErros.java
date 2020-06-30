
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
@WebServlet(urlPatterns = {"/TrabComErros"})
public class TrabComErros extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
          int val1 = Integer.parseInt(req.getParameter("val1"));
        int val2 = Integer.parseInt(req.getParameter("val2"));
        
        float resultado = val1/val2;
        String html = "<html><head>" + 
                "<title>Tratando Erros</title>"+
                "</head><body>"+
                "O resultado é <Strong>" + resultado + "</strong><br />" +
                "A query String enviada é: <strong>" + req.getQueryString() + 
                "</strong><br />" +
                "<form action= \"TrabComErros\" method=\"get\">" +
                "Valor 1: <input type=\"text\" name=\"val1\" /><br />"+
                "Valor 2: <input type=\"text\" name=\"val2\" /><br />"+
                "<input type=\"submit\" value=\"Enviar\" />"+
                "</body></html>";
        
                resp.setContentType("text/html");
                PrintWriter out = resp.getWriter();
                out.print(html);
                out.close();
    }
}
