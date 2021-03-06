<%-- 
    Document   : ui014cadastrarrodovia
    Created on : 22/10/2015, 00:06:15
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <head>
        <title>Cadastrar Rodovia | DigiMon</title>
        <link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
        <link href='https://fonts.googleapis.com/css?family=Cantarell:400,700' rel='stylesheet' type='text/css'>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="dist/js/novo.js" defer=""></script>
    </head>
    <body class="insideSystem">
        <div id="interface">
            
             <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->

            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Cadastro de Rodovia</h1>
                    <form action="ServletUI014" method="post" id="formularioJ">
                        <fieldset>
                            <legend>Dados Rodovia</legend>
                            <div class="campo"> 
                                <label for="nomeJ">Nome:</label><br> 
                                <input type="text" name="nome" id="nomeJ" class="campoObrig" placeholder="Nome da rodovia" size="37" maxlength="40"><span id="x_nomeJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="extensaoKmJ">Extensão KM:</label><br> 
                                <input type="text" name="extensaoKm" id="extensaoKmJ" placeholder="km" class="campoObrig" size="10"><span id="x_extensaoKmJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="cidadeInicialJ">Cidade Inicial:</label><br> 
                                <input type="text" name="cidadeInicial" id="cidadeInicialJ" placeholder="Cidade Inicial" size="46" maxlength="30" class="campoObrig iLetras"><span id="x_cidadeInicialJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <%--FAZ UM FOR EACH POR FAVORRRR ... www.google.com --%>
                                <label for="ufInicialJ">UF:</label><br> 
                                <select id="ufInicialJ" name="ufInicial"> 
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
                                </select><span id="x_ufInicialJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="cidadeFinalJ">Cidade Final:</label><br> 
                                <input type="text" name="cidadeFinal" id="cidadeFinalJ" placeholder="Cidade Final" size="46" maxlength="30" class="campoObrig iLetras"><span id="x_cidadeFinalJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="ufFinalJ">UF:</label><br> 
                                <select id="ufFinalJ" name="ufFinal"> 
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
                                </select><span id="x_ufFinalJ" class="tSpan"></span>
                            </div>
                        </fieldset>
                        <div class="botoes" id="botoes">
                            <input type="submit" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                        </div><!--Fim div botoes-->
                    </form>

                    <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->

                </div><!--Fim div centro-->		
                <div id="clear"></div><!--Fim div clear-->
            </div><!--Fim div main conteúdo-->	
            <div id="rodape">
                <div class="main">
                    <div id="footer">
                        &copy 2015 - Projeto Digimon | Forsoft Rio
                    </div><!--Fim div Footer-->
                </div><!--Fim div main do rodape-->
            </div><!--Fim div "rodape"-->
        </div><!--Fim div Interface-->
    </body>
</html>