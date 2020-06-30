<%-- 
    Document   : UsandoMeuPrimeiroJavaBean
    Created on : 29/06/2020, 15:34:45
    Author     : lukas
--%>

<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usando meu primeiro JavaBean</title>
    </head>
    <body>
        <jsp:useBean id="primeirojb" class="meuPacote.MeuPrimeiroJavaBeans" />
        A mensagem atual é <strong><%= primeirojb.getMensagem()%></strong> <br />
        A mendagem depois adicionada é: <br />
        <strong>
            <%
                primeirojb.setMensagem("Lukas Aqui!");
                out.print(primeirojb.getMensagem());
            %>
        </strong>
    </body>
</html>
