<%-- 
    Document   : ui019consultarposto
    Created on : 22/10/2015, 00:13:14
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
            <!-- end header -->
            <span id="titlePag">Consultar Posto | DigiMon</span>
           

            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->
                    <h1>Consulta de Posto</h1>
                    <form action="#" method="post" id="formularioJ">
                        <fieldset>
                            <legend>Dados do Posto</legend>
                            <div class="campo"> 
                                <label for="idPostoJ">ID do Posto:</label><br> 
                                <input type="text" name="idPosto" id="idPostoJ"  class= "campoObrig"  disabled size="46"><span id="x_idPostoJ" class="tSpan"></span>
                            </div>
                        </fieldset>


                        <fieldset>
                            <legend>Dados Endereço</legend>
                            <div class="campo"> 
                                <label for="logradouroJ">Logradouro:</label><br> 
                                <input type="text" name="logradouro" id="logradouroJ"  class= "campoObrig"  size="46" maxlength="40"><span id="x_logradouroJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="numeroJ">Número:</label><br> 
                                <input type="text" name="numero" id="numeroJ"  class="campoObrig" maxlength="9" ><span id="x_numeroJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="complementoJ">Complemento:</label><br> 
                                <input type="text" name="complemento" id="complementoJ"  class="campoObrig"   size="20" maxlength="30" ><span id="x_complementoJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="bairroJ">Bairro:</label><br> 
                                <input type="text" name="bairro" id="bairroJ"  class="campoObrig" maxlength="40" size="30"><span id="x_bairroJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="cepJ">CEP:</label><br> 
                                <input type="text" name="cep" id="cepJ"  class="campoObrig"  maxlength="10" size="10"><span id="x_cepJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="cidadeJ">Cidade:</label><br> 
                                <input type="text" name="cidade" id="cidadeJ"  class="campoObrig" maxlength="30"  size="27"><span id="x_cidadeJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="latitudeJ">Latitude:</label> <br>
                                <input type="text" name="latitude" class="campoObrig" id="latitudeJ" ><span id="x_latitudeJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="longitudeJ">Longitude:</label> <br>
                                <input type="text" name="longitude" class="campoObrig" id="longitudeJ" ><span id="x_longitudeJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="kmJ">Km:</label> <br>
                                <input type="text" name="km" class="campoObrig" id="kmJ" ><span id="x_kmJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="ufJ">UF</label><br> 
                                <select id="ufJ" name="uf" > 
                                    <option value="AC">AC</option> 
                                    <option value="AL">AL</option> 
                                    <option value="AM">AM</option> 
                                    <option value="AP">AP</option> 
                                    <option value="BA">BA</option> 
                                    <option value="CE">CE</option> 
                                    <option value="DF">DF</option> 
                                    <option value="ES">ES</option> 
                                    <option value="GO">GO</option> 
                                    <option value="MA">MA</option> 
                                    <option value="MT">MT</option> 
                                    <option value="MS">MS</option> 
                                    <option value="MG">MG</option> 
                                    <option value="PA">PA</option> 
                                    <option value="PB">PB</option> 
                                    <option value="PR">PR</option> 
                                    <option value="PE">PE</option> 
                                    <option value="PI">PI</option> 
                                    <option value="RJ" selected>RJ</option> 
                                    <option value="RN">RN</option> 
                                    <option value="RO">RO</option> 
                                    <option value="RS">RS</option> 
                                    <option value="RR">RR</option> 
                                    <option value="SC">SC</option> 
                                    <option value="SE">SE</option> 
                                    <option value="SP">SP</option> 
                                    <option value="TO">TO</option>
                                </select><span id="x_ufJ" class="tSpan"></span>
                            </div>
                        </fieldset>				 

                        <div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ALTERAR" name="enviar" id="enviarJ" class="botaoJ">
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