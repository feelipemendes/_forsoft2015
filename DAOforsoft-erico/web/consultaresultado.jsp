<%-- 
    Document   : consultar
    Created on : 24/10/2015, 14:43:47
    Author     : Sora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <%@ include file="header.jsp" %> 
        </header>
        <div class="centro">
             
                 <cforEach var="jogo" items="${listaJogo}">
                 <tr>
                     <td>${jogo.nome}</td>
                     <td>${jogo.ano}</td>
                     <td>${jogo.nota}</td>
             </cforEach>
             <form action="consultar.jsp" method="get">
                 <input type="submit" value="Voltar" name="voltar">
             </form>
             
        </div>
         
    </body>
</html>
