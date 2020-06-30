<%-- 
    Document   : envDivOpc
    Created on : 25/06/2020, 21:59:37
    Author     : lukas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Selecione os programas que você usa</title>
    </head>
    <body>
        <% String[] e = request.getParameterValues("programas");

            if (e != null) {
                out.print("<h2> Você selecionous os seguintes programas </h2><br />");
                for (int i = 0; i < e.length; i++) {
                    out.print("<strong>" + e[i] + "</strong><br />");
                }
            }
        %>

        <h2>Selecione um ou mais programas usando o Ctrl</h2>
        <form action="envDivOpc.jsp" method="post">
            <select name="programas" size="4"  multiple="multiple">
                <option value="Eclipse">Eclipse</option>
                <option value="NetBeans">NetBeans</option>
                <option value="Java">Java</option>
                <option value="PHP">PHP</option>
                <option value="C#">C#</option>
            </select>
            <input type="submit" name="btEnviar" value="Enviar">
        </form>
    </body>
</html>
