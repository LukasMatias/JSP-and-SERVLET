<%-- 
    Document   : topo
    Created on : 29/06/2020, 14:12:59
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
        <% String texto = request.getParameter("texto"); 
        out.print(texto);
        %>
    </body>
</html>
