import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lukas
 */
@WebServlet(urlPatterns = {"/CriandoCookie"})
public class CriandoCookie extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie meuCookie = new Cookie("nome", "Lukas");
        meuCookie.setMaxAge(60);
        meuCookie.setSecure(false);
        meuCookie.setComment("meu nome");
        response.addCookie(meuCookie);
        
        String html = "<html><head>"+
                "<title>Criando meu cookie</title>"+
                "</head><body>"+
                "<h1>Seu cookie foi criado com sucesso!</h1>"+
                "<a href=\"VisualizaCookie\">"+ "Clique aqui para ver seu cookie criado</a>"+
                "</body></html>";
        PrintWriter out = response.getWriter();
        out.print(html);
        out.close();
    }

}
