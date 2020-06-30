import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukas
 */
@WebServlet(urlPatterns = {"/RecCabecalhos"})
public class RecCabecalhos extends HttpServlet {

  
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        String html = "<html><head>"+
                "<title>Trabalhando com Servlet</title>"+
                "</head><body>";
                Enumeration e = request.getHeaderNames();
                while(e.hasMoreElements()){
                    String cabecalho = (String) e.nextElement();
                    html += "<strong>" + cabecalho + "</strong>" + request.getHeader(cabecalho);
                    html += "<br />";
                }
                html += "</body></html>";
                PrintWriter out = response.getWriter();
                out.print(html);
                out.close();
    }


}
