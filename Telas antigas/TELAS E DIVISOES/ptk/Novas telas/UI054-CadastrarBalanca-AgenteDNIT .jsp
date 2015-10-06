<%-- 
    Document   : UI105-CadastrarBalanaca-AgenteDNIT
    Created on : 18/09/2015, 03:46:08
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
        <script src="../js/UI105.js" type="text/javascript" DEFER></script>
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

                <h1>Cadastrar Balança - Agente do DNIT</h1>
                <h4>Preencha corretamente os campos!</h4>
                <form name="form" method="post" action="#" id="formularioJ" class="formulario">
                    <div class="tabela">
                        <div class="coluna-esquerda">
                            <fieldset>
                                <legend>Dados do Posto</legend>					
                                <div class="campo"> 
                                    <label for="telJ">Telefone:</label><br> 
                                    <input type="text" name="Telefone" id="telJ" maxlength="13"><span id="x_telJ"></span>
                                </div>
                                <div class="campo"> 
                                    <label for="cepJ">CEP:</label><br> 
                                    <input type="text" name="CEP" id="cepJ" maxlength="10"><span id="x_cepJ"></span>
                                </div>
                                <div class="campo"> 
                                    <label for="kmJ">KM:</label><br> 
                                    <input type="text" name="kilometro" id="kmJ" maxlength="5"><span id="x_kmJ"></span>
                                </div>
                                <div class="campo">
                                    <label for="estadoJ">Estado</label><br>
                                    <select name="estado"> 
                                        <option value="estado">Selecione o Estado</option> 
                                        <option value="ac">Acre</option> 
                                        <option value="al">Alagoas</option> 
                                        <option value="am">Amazonas</option> 
                                        <option value="ap">Amapá</option> 
                                        <option value="ba">Bahia</option> 
                                        <option value="ce">Ceará</option> 
                                        <option value="df">Distrito Federal</option> 
                                        <option value="es">Espírito Santo</option> 
                                        <option value="go">Goiás</option> 
                                        <option value="ma">Maranhão</option> 
                                        <option value="mt">Mato Grosso</option> 
                                        <option value="ms">Mato Grosso do Sul</option> 
                                        <option value="mg">Minas Gerais</option> 
                                        <option value="pa">Pará</option> 
                                        <option value="pb">Paraíba</option> 
                                        <option value="pr">Paraná</option> 
                                        <option value="pe">Pernambuco</option> 
                                        <option value="pi">Piauí</option> 
                                        <option value="rj">Rio de Janeiro</option> 
                                        <option value="rn">Rio Grande do Norte</option> 
                                        <option value="ro">Rondônia</option> 
                                        <option value="rs">Rio Grande do Sul</option> 
                                        <option value="rr">Roraima</option> 
                                        <option value="sc">Santa Catarina</option> 
                                        <option value="se">Sergipe</option> 
                                        <option value="sp">São Paulo</option> 
                                        <option value="to">Tocantins</option> 
                                    </select>
                                    <div class="campo"> 
                                        <label for="cidadeJ">Cidade:</label><br> 
                                        <input type="text" name="cidade" id="cidadeJ" maxlength="10"><span id="x_cidadeJ"></span>
                                    </div>
                                    <div class="campo"> 
                                        <label for="cnpjJ">CNPJ:</label><br> 
                                        <input type="text" name="cnpj" id="cnpjJ" maxlength="18"><span id="x_cnpjJ"></span>
                                    </div>
                            </fieldset>
                        </div>

                        <div class="coluna-direita">
                            <fieldset>
                                <legend>Dados da Balança</legend>
                                <div class="campo"> 
                                    <label for="numeroserieJ">Numero de Serie:</label><br> 
                                    <input type="text" name="numeroserie" id="numeroserieJ" maxlength="8"><span id="x_numeroserieJ"></span>
                                </div>
                                <div class="campo"> 
                                    <label for="tipobalJ">Modelo de Balança:</label>
                                    <select name="tipodebalanca" id="tipobalJ"><!--<span id="x_dataJ"></span>-->
                                        <option>Móvel</option>
                                        <option>Fixa</option>
                                    </select>
                                </div>
                                <div class="campo"> 
                                    <label for="fabricanteJ">Fabricante:</label><br> 
                                    <input type="text" name="fabricante" id="fabricanteJ" maxlength="20"><span id="x_fabricanteJ"></span>
                                </div>
                            </fieldset>
                        </div>

                    </div>
                    <br><Br>		
                    <input type="submit" value="Enviar" name="enviar" id="enviarJ" class="botaoJ">
                    <a href="UI092-Home-AgenteDNIT.jsp"><input type="button" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
                </form> 
                <br>
                <br>
            </div>
        </div>
        <!-- SÓ EDITE DAQUI PARA CIMA!-->
    </body>
</html>
