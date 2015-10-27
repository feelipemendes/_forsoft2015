<%-- 
    Document   : index
    Created on : 24/10/2015, 13:16:23
    Author     : Sora
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="_css/style.css">
        <title>CRUD Jogos</title>
    </head>
    <body>
	<header>
           <%@ include file="header.jsp" %> 
	</header>
        <div class="centro">
               <div class="box">
				   <form action="servlettela" method="post">
						<fieldset>
							<legend>CRUD de Jogos</legend>
								<input type="text" name="nome" placeholder="nome">
								<input type="number" name="ano"placeholder="Ano">
								<input type="text" name="nota" placeholder="Nota">
						</fieldset>
							<input type="submit" name="enviar" value="Enviar">
					</form>  
				</div>
		</div>
    </body>
</html>
