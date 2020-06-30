<%-- 
    Document   : recebe
    Created on : 12/06/2020, 18:28:06
    Author     : lukas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String usuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");

            if (usuario.equals("lukas") && senha.equals("123")) {
                out.print("Seja Bem-Vindo Lukas ao seu sisteminha de merda!");
            } else {
                out.print("Não foi dessa Vez tente novamente seu burro!");
            }
        %>
    </body>
</html>
