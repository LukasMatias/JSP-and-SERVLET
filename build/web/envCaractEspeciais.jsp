<%-- 
    Document   : envCaractEspeciais
    Created on : 12/06/2020, 20:21:56
    Author     : lukas
--%>

<%@page import="java.net.URLEncoder"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enviando caracteres especiais usando JSP</title>
    </head>
    <body>
        <% String queryString = URLEncoder.encode("Erro meu filho", "UTF-8");
        
        %>
        
        <a href="recCaractEspecias.jsp?dados=<%=queryString %>">
            Enviar caracteres especiais...
        </a>
    </body>
</html>
