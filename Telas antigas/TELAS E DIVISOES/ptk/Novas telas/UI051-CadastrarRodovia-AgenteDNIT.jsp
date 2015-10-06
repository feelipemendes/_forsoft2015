<%-- 
    Document   : UI093-CadastrarRodovia-AgenteDNIT
    Created on : 18/09/2015, 03:00:53
    Author     : Javapos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Digital Monitoring - Digimon</title>
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <script src="../js/framework.js" type='text/javascript' DEFER></script>
        <script src="../js/UI093.js" type="text/javascript" DEFER></script>
    </head>
    <body>
        <!-- NÃO EDITAR!-->
        <div id="topbar" class="conteudo-meio">
            <a href="UI092-Home-AgenteDNIT.jsp" id="logo" class="esquerda"><img src="../img/logoS2.png" alt="DigiMon"></a>
            <ul id="menu-user" class="direita">
                <li><a href="#" id="profile"></a></li>
                <li><a href="#" id="config"></a></li>
                <li class="maisDireita"><a href="#" id="logout"></a></li>
            </ul>
        </div>

        <div id="container" class="conteudo-meio">
            <div id="sidemenu" class="esquerda">
                <ul class="menu-ativo navigator">

                    <h3>Postos de Pesagem</h3> 

                    <li><a href="UI097-CadastrarPostoPesagem-AgenteDNIT.jsp">Cadastrar</a> 

                    </li>

                    <li><a href="UI099-AlterarPostoPesagem-AgenteDNIT.jsp">Alterar</a> 

                    </li>

                    <li><a href="UI100-ExcluirPostoPesagem-AgenteDNIT.jsp">Excluir</a> 

                    </li>

                    <li><a href="UI098-ConsultarPostoPesagem-AgenteDNIT.jsp">Consultar</a> 

                    </li>
                </ul>

                <ul class="menu-ativo navigator">

                    <h3>Rodovia</h3> 

                    <li><a href="UI093-CadastrarRodovia-AgenteDNIT.jsp">Cadastrar</a> 

                    </li>

                    <li><a href="UI095-AlterarRodovia-AgenteDNIT.jsp">Alterar</a> 

                    </li>

                    <li><a href="UI096-ExcluirRodovia-AgenteDNIT.jsp">Excluir</a> 

                    </li>

                    <li><a href="UI094-ConsultarRodovia-AgenteDNIT.jsp">Consultar</a> 

                    </li>
                </ul>
                <ul class="menu-ativo navigator">

                    <h3>Balança</h3> 

                    <li><a href="UI105-CadastrarBalanca-AgenteDNIT.jsp">Cadastrar</a> 

                    </li>

                    <li><a href="UI107-AlterarBalanca-AgenteDNIT.jsp">Alterar</a> 

                    </li>

                    <li><a href="UI108-ExcluirBalanca-AgenteDNIT.jsp">Excluir</a> 

                    </li>

                    <li><a href="UI106-ConsultarBalanca-AgenteDNIT.jsp">Consultar</a> 

                    </li>
                </ul>	
                <ul class="menu-ativo navigator">

                    <h3>Câmera</h3> 

                    <li><a href="UI101-CadastrarCamera-AgenteDNIT.jsp">Cadastrar</a> 

                    </li>

                    <li><a href="UI103-AlterarCamera-AgenteDNIT.jsp">Alterar</a> 

                    </li>

                    <li><a href="UI104-ExcluirCamera-AgenteDNIT.jsp">Excluir</a> 

                    </li>

                    <li><a href="UI102-ConsultarCamera-AgenteDNIT.jsp">Consultar</a> 

                    </li>
                </ul>	
            </div>


            <!-- NÃO EDITAR!-->

            <div id="centro" class="esquerda">

                <!-- SÓ EDITE DAQUI PARA BAIXO!-->

                <h1>Cadastro Rodovia</h1>
                <h4>Preencha corretamente os campos!</h4>
                <form name="form" method="post" action="#" id="formularioJ" class="formulario">
                    <div class="tabela">
                        <div class="coluna-esquerda">
                            <fieldset>
                                <legend>Rodovia</legend>					
                                <div class="campo">
                                    <label for="nomeJ">Nome:</label><br> 
                                    <input type="text" name="nome" id="nomeJ"><span id="x_nomeJ" class=""></span>
                                </div>
                                <div class="campo"> 
                                    <label for="extensaokmJ">Extensão em KM:</label><br> 
                                    <input type="text" name="extensaokm" id="extensaokmJ"><span id="x_extensaokmJ"></span>
                                </div>


                            </fieldset>
                        </div>

                        <div class="coluna-direita">
                            <fieldset>
                                <legend>Dados da Rodovia</legend>
                                <div class="campo">
                                    <label for="ufJ">UF Inicial</label><br>
                                    <select name="uf" id="ufJ">
                                        <option value="AC">UF</option>
                                        <option value="AC">AC</option>
                                        <option value="AL">AL</option>
                                        <option value="AP">AP</option>
                                        <option value="AM">AM</option>
                                        <option value="BA">BA</option>
                                        <option value="CE">CE</option>
                                        <option value="DF">DF</option>
                                        <option value="ES">ES</option>
                                        <option value="GO">GO</option>
                                        <option value="MA">MA</option>
                                        <option value="MS">MS</option>
                                        <option value="MT">MT</option>
                                        <option value="MG">MG</option>
                                        <option value="PA">PA</option>
                                        <option value="PB">PB</option>
                                        <option value="PR">PR</option>
                                        <option value="PE">PE</option>
                                        <option value="PI">PI</option>
                                        <option value="RJ">RJ</option>
                                        <option value="RN">RN</option>
                                        <option value="RS">RS</option>
                                        <option value="RO">RO</option>
                                        <option value="RR">RR</option>
                                        <option value="SC">SC</option>
                                        <option value="SP">SP</option>
                                        <option value="SE">SE</option>
                                        <option value="TO">TO</option>
                                    </select>
                                    <span id="x_ufJ"></span>
                                </div>
                                <div class="campo">
                                    <div class="campo">
                                    <label for="ufJ">UF Inicial</label><br>
                                    <select name="uf" id="ufJ">
                                        <option value="UF">UF</option>
                                        <option value="AC">AC</option>
                                        <option value="AL">AL</option>
                                        <option value="AP">AP</option>
                                        <option value="AM">AM</option>
                                        <option value="BA">BA</option>
                                        <option value="CE">CE</option>
                                        <option value="DF">DF</option>
                                        <option value="ES">ES</option>
                                        <option value="GO">GO</option>
                                        <option value="MA">MA</option>
                                        <option value="MS">MS</option>
                                        <option value="MT">MT</option>
                                        <option value="MG">MG</option>
                                        <option value="PA">PA</option>
                                        <option value="PB">PB</option>
                                        <option value="PR">PR</option>
                                        <option value="PE">PE</option>
                                        <option value="PI">PI</option>
                                        <option value="RJ">RJ</option>
                                        <option value="RN">RN</option>
                                        <option value="RS">RS</option>
                                        <option value="RO">RO</option>
                                        <option value="RR">RR</option>
                                        <option value="SC">SC</option>
                                        <option value="SP">SP</option>
                                        <option value="SE">SE</option>
                                        <option value="TO">TO</option>
                                    </select>
                                    <span id="x_ufJ"></span>
                                </div>
                            </fieldset>
                        </div>

                    </div>
                    <br><Br>		
                    <input type="submit" value="Cadastrar" name="enviar" id="enviarJ" class="botaoJ">
                    <a href="UI092-Home-AgenteDNIT.jsp"><input type="button" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
                </form> 
                <br>
                <br>
            </div>
        </div>
        <!-- SÓ EDITE DAQUI PARA CIMA!-->
    </body>
</html>