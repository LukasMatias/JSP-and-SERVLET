<%-- 
    Document   : recCaractEspeciais
    Created on : 12/06/2020, 20:27:41
    Author     : lukas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recebenco carcteres especiais via JSP</title>
    </head>
    <body>
        <% 
        String dados = request.getParameter("dados");
        %>
        Você enviou os seguintes dados: <strong> <%= dados %></strong>
        <br />
        A query string passada foi: 
        <strong> <%=request.getQueryString ()%> </strong>
    </body>
</html>
