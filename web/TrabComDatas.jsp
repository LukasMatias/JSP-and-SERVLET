<%-- 
    Document   : TrabComDatas
    Created on : 29/06/2020, 16:44:38
    Author     : lukas
--%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="data" class="meuPacote.FormatandoDatas" />
        <jsp:setProperty name="data" property="formato" value="dd/MM/yy" />
        <%
            /*data.setFormato("dd/MM/yyyy");
          data.getDateFormat();
           
            O FORMATO DE DATAS PODE SER USADO DESSA MANEIRA TAMBÉM com código java, no entanto torna mais complexo 
            de entender. O próximo exemplo torna o código mais limpo usando as tags do JSTL ajudando com o designer do site.
           
             */
        %> 
        <!-- A dara atual é: <strong> <//%= data.getData()%></strong>-->
        <strong> A data Atual é: <jsp:getProperty name="data" property="data" /> </strong>

    </body>
</html>
