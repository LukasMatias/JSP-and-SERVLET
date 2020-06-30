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
@WebServlet(urlPatterns = {"/VarrendoTodosObjetos"})
public class VarrendoTodosObjetos extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {
       Enumeration e = request.getParameterNames();
       String html = "<html><head> "+
               "<title>Trabalhando com getParameterNames() </title>"+
               "</head><body>"+
               "<h2> Dados cadastrados</h2>";
               while(e.hasMoreElements()){
                   String param = (String) e.nextElement();
                   html += "<strong>"+param+":</strong>" + 
                          request.getParameter(param) +"<br />";
               }
               html += "</body></html>";
               response.setContentType("text/html");
               PrintWriter out = response.getWriter();
               out.print(html);
               out.close();
    }


}
