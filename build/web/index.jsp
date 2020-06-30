<%-- 
    Document   : index
    Created on : 12/06/2020, 13:17:34
    Author     : lukas
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trabalhando com JavaServer Pages</title>
    </head>
    <body>
        Esse é um exemplo da ultilização da diretiva <strong>Page</strong><br />
        <% Date data = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");

        %>
        A data de Hoje é: <strong> <%= formato.format(data)%></strong>
    </body>
</html>
