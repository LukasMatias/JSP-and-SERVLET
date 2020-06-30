<%-- 
    Document   : interagindo
    Created on : 29/06/2020, 19:03:41
    Author     : lukas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interagindo com o usuário</title>
    </head>
    <body>
        <jsp:useBean id="interagindo" class="meuPacote.InteragindoBean" />
        <jsp:setProperty name="interagindo" property="*" />
        seu nome é: <strong>
            <jsp:getProperty name="interagindo" property="nome" />
        </strong>
        <form action="interagindo.jsp" method="post" >
            Nome: <input type="text" size="20" name="nome" /> <br />
            <input type="submit" value="Enviar" name="submit" />
        </form>
    </strong>
</body>
</html>
