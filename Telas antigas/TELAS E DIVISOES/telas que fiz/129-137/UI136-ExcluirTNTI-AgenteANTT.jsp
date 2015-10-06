<%-- 
    Document   : UI136-ExcluirTNTI-AgenteANTT
    Created on : 18/09/2015, 08:40:59
    Author     : Javapos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : UI134-ConsultarTNTI-AgenteANTT
    Created on : 18/09/2015, 03:59:26
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
	
</head>
<body>
		<!-- NÃO EDITAR!-->
	<div id="topbar" class="conteudo-meio">
		<a href="UI145-Home-AgenteANTT.jsp" id="logo" class="esquerda"><img src="../img/logoS2.png" alt="DigiMon"></a>
		<ul id="menu-user" class="direita">
			<li><a href="#" id="profile"></a></li>
			<li><a href="#" id="config"></a></li>
			<li class="maisDireita"><a href="#" id="logout"></a></li>
		</ul>
	</div>
	
	<div id="container" class="conteudo-meio">
		<div id="sidemenu" class="esquerda">
				<ul class="menu-ativo navigator">

				<h3>Postos de Pedágio</h3>

				<li><a href="UI129-CadastrarPostoPedagio-AgenteANTT.jsp">Cadastrar</a> 
						
						</li>
						
						<li><a href="UI131-AlterarPedagio-AgenteANTT.jsp">Alterar</a> 
							 
						</li>
						
						<li><a href="UI132-ExcluirPedagio-AgenteANTT.jsp">Excluir</a> 
						
						</li>
						
						<li><a href="UI130-ConsultarPostoPedagio-AgenteANTT.jsp">Consultar</a> 
							
						</li>
				</ul>
				
				<ul class="menu-ativo navigator">

				<h3>Transportadores</h3> 

				<li><a href="UI117-CadastrarTransportadorCTCeETC-AdmANTT.jsp">Cadastrar</a> 
						
						</li>
						
						<li><a href="UI139-AlterarTransportadorCTCeETC-AgenteANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI140-ExcluirTransportadorCTCeETC-AgenteANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI118-ConsultarTransportadorCTCeETC-AdmANTT.jsp">Consultar</a> 
						</li>
				</ul>
				
				<ul class="menu-ativo navigator">

					<h3>Autônomos</h3> 

						<li><a href="UI141-CadastrarTransportadorAutonomoTAC-AgenteANTT.jsp">Cadastrar</a> 
						</li>
						
						<li><a href="UI143-AlterarTransportadorAutonomoTAC-AgenteANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI144-ExcluirTransportadorAutonomoTAC-AgenteANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI142-ConsultarTransportadorAutonomoTAC-AgenteANTT.jsp">Consultar</a> 
						</li>
				</ul>	
		</div>
		
		<!-- NÃO EDITAR!-->
		
		<div id="centro" class="esquerda">
		
		<!-- SÓ EDITE DAQUI PARA BAIXO!-->
		
			<h1>Excluir TNTI - Agente da ANTT</h1>
			<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
					<div class="coluna-esquerda">
						<fieldset>
							<legend>Dados do Motorista</legend>					
								<div class="campo">
									<label for="nomeJ">Nome:</label><br> 
									<input type="text" name="nome" id="nomeJ" disabled><span id="x_nomeJ" class=""></span>
								</div>
								<div class="campo"> 
									<label for="sobrenomeJ">Sobrenome:</label><br> 
									<input type="text" name="sobrenome" id="sobrenomeJ" disabled><span id="x_sobrenomeJ"></span>
								</div>
								<div class="campo"> 
									<label for="cpfJ">CPF:</label><br> 
									<input type="text" name="CPF" id="cpfJ" maxlength="14" disabled><span id="x_cpfJ"></span>
								</div>
								<div class="campo"> 
									<label for="rgJ">RG:</label><br> 
									<input type="text" name="RG" id="rgJ" maxlength="14" disabled><span id="x_rgJ"></span>
								</div>
								<div class="campo"> 
									<label for="telJ">Telefone:</label><br> 
									<input type="text" name="Telefone" id="telJ" maxlength="13" disabled><span id="x_telJ"></span>
								</div>
								<div class="campo"> 
									<label for="cnhJ">CNH:</label><br> 
									<input type="text" name="CNH" id="cnhJ" maxlength="15" disabled><span id="x_cnhJ"></span>
								</div>
								<div class="campo"> 
									<label for="estadocivilJ">Estado Civil:</label><br> 
									<input type="text" name="estadocivil" id="estadocivilJ" maxlength="5" disabled><span id="x_estadocivilJ"></span>
								</div>
								<div class="campo"> 
									<label for="estadoJ">Estado:</label><br> 
									<input type="text" name="estado" id="estadoJ" maxlength="10" disabled><span id="x_estadoJ"></span>
								</div>
								<div class="campo"> 
									<label for="cidadeJ">Cidade:</label><br> 
									<input type="text" name="cidade" id="cidadeJ" maxlength="10" disabled><span id="x_cidadeJ"></span>
								</div>
								<div class="campo"> 
									<label for="emailJ">Email:</label><br> 
									<input type="text" name="email" id="emailJ" maxlength="50" disabled><span id="x_emailJ"></span>
								</div>
								<fieldset class="subfds">
								<legend>Sexo</legend>
								
									<input type="radio" name="sexo" id="mascJ" checked disabled><!--<span id="x_dataJ"></span>-->
									<label for="mascJ">Masculino</label><br>
								
								
									<input type="radio" name="sexo" id="femJ" disabled><!--<span id="x_dataJ"></span>-->
									<label for="femJ">Feminino</label>
								
							</fieldset>
						</fieldset>
					</div>
					
					<div class="coluna-direita">
						<fieldset>
							<legend>Dados do Transportador</legend>
								<div class="campo"> 
									<label for="rntrcJ">RNTRC:</label><br> 
									<input type="text" name="placa" id="placaJ" maxlength="8" disabled><span id="x_placaJ"></span>
								</div>
								<div class="campo"> 
									<label for="emailJ">Email:</label><br> 
									<input type="text" name="email" id="emailJ" maxlength="50" disabled><span id="x_emailJ"></span>
								</div>
								<div class="campo"> 
									<label for="paisJ">País:</label><br> 
									<input type="text" name="pais" id="paisJ" maxlength="7" disabled><span id="x_paisJ"></span>
								</div>
						</fieldset>
					</div>
					
				</div>
				<br><Br>		
	           <input type="submit" value="Consultar" name="enviar" id="enviarJ" class="botaoJ">
	           <a href="UI002-Home-TAC.jsp"><input type="reset" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
		</form> 
		<br>
		<br>
		</div>
	</div>
<!-- SÓ EDITE DAQUI PARA CIMA!-->
</body>
</html>

