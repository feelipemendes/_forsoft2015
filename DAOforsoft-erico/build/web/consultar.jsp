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
               <div class="box">
                    <form action="consultar" method="post">
                                                           <fieldset>
                                                                   <legend>CRUD de Jogos</legend>
                                                                           <input type="number" name="id" placeholder="Id" required>
                                                                           
                                                           </fieldset>
                                                                   <input type="submit" name="enviar" value="Enviar">
                                                   </form>  
              </div>
         </div>
    </body>
</html>
