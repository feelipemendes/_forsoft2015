<%-- 
    Document   : index
    Created on : 11/09/2015, 13:52:41
    Author     : Javapos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/arquivo.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="validar" method="post">
            <label for="nome">Nome</label>
            <input type="text" id="nome" name="nome" value="" size="30" maxlength="25">
            <br><br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
