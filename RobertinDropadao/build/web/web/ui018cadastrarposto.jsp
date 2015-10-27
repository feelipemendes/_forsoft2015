<%-- 
    Document   : ui018cadastrarposto
    Created on : 22/10/2015, 00:12:34
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <!-- Head -->
        <%@ include file="head.jsp" %>
    <!-- fim Head -->
    <body class="insideSystem">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header --><!-- Fim da div header --><!-- Fim da div header -->
            <span id="titlePag">Cadastrar Posto | DigiMon</span>

            
            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->
                    <h1>Cadastro de Posto</h1>
                    <form action="#" method="post" id="formularioJ">
                        <fieldset>
                            <legend>Dados do Posto</legend>
                            <div class="campo"> 
                                <label for="kmJ">Km:</label><br> 
                                <input type="text" name="km" id="kmJ"  class= "campoObrig"  size="46" maxlength="40"><span id="x_logradouroJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="latitudeJ">Latitude:</label><br> 
                                <input type="text" name="latitude" id="latitudeJ"  class= "campoObrig" placeholder="Ex: Rua, Av" size="46" maxlength="40"><span id="x_logradouroJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="longitudeJ">Longitude:</label><br> 
                                <input type="text" name="longitude" id="longitudeJ"  class= "campoObrig" placeholder="Ex: Rua, Av" size="46" maxlength="40"><span id="x_logradouroJ" class="tSpan"></span>
                            </div>
                            
                        </fieldset>				 

                        <div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                        </div><!--Fim div botoes-->
                    </form>

                    <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->

                </div><!--Fim div centro-->		
                <div id="clear"></div><!--Fim div clear-->
            </div><!--Fim div main conteúdo-->	
              <!-- Include do footer -->
                  <%@ include file="footer.jsp" %> 
              <!-- Fim do include do footer-->
    </body>
</html>