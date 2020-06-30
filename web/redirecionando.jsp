<%-- 
    Document   : redirecionando
    Created on : 29/06/2020, 14:37:07
    Author     : lukas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usando Standard para redirecionar</title>
    </head>
    <body>
       
        <jsp:forward page="redirecionado.jsp">
            <jsp:param name="textos" value="esse texto veio da página JSP que redirecionava " />
        </jsp:forward>
    </body>
</html>
