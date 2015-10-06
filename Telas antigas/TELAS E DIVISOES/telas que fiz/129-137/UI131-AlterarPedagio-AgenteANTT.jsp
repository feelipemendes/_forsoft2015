<%-- 
    Document   : UI131-AlterarPedagio-AgenteANTT
    Created on : 18/09/2015, 03:57:40
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
	<script src="../js/UI131.js" type="text/javascript" DEFER></script>
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

						
						<li><a href="UI131-AlterarPedagio-AgenteANTT.jsp">Alterar</a> 
							 
						</li>
						
						
						<li><a href="UI130-ConsultarPostoPedagio-AgenteANTT.jsp">Consultar</a> 
							
						</li>
				</ul>	
				<ul class="menu-ativo navigator">

				<h3>Transportadores</h3> 

				
						
						<li><a href="UI139-AlterarTransportadorCTCeETC-AgenteANTT.jsp">Alterar</a> 
							
						</li>
						
						
						
						<li><a href="UI138-ConsultarTransportadorCTCeETC-AgenteANTT.jsp">Consultar</a> 
					
						</li>
				</ul>	
				
				<ul class="menu-ativo navigator">
				<h3>TNTI</h3> 

				
						
						<li><a href="UI135-AlterarTNTI-AgenteANTT.jsp">Alterar</a> 
							
						</li>
						
						
						<li><a href="UI134-ConsultarTNTI-AgenteANTT.jsp">Consultar</a> 
					
						</li>
				</ul>	
				
				<ul class="menu-ativo navigator">

				<h3>Autônomos</h3> 

						
						<li><a href="UI143-AlterarTransportadorAutonomoTAC-AgenteANTT.jsp">Alterar</a> 
							
						</li>
						
						
						<li><a href="UI142-ConsultarTransportadorAutonomoTAC-AgenteANTT.jsp">Consultar</a> 
					
						</li>
				</ul>	
		</div>
		
		<!-- NÃO EDITAR!-->
		
		<div id="centro" class="esquerda">
		
		<!-- SÓ EDITE DAQUI PARA BAIXO!-->
		
			<h1>Alterar Pedágio</h1>
			<h4>Preencha corretamente os campos!</h4>
			<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
					<div class="coluna-esquerda">
						<fieldset>
							<legend>Dados do Pedágio</legend>					
								<div class="campo">
									<label for="idpostoJ">Id do Posto:</label><br> 
									<input type="text" name="idposto" id="idpostoJ"><span id="x_idpostoJ" class=""></span>
									<input type="submit" value="OK" name="posto">
									
								</div>
								<div class="campo"> 
									<label for="telefoneJ">Telefone:</label><br> 
									<input type="text" name="telefone" id="telefoneJ"><span id="x_telefoneJ"></span>
								</div>
								<div class="campo"> 
									<label for="tipoJ">Tipo:</label><br> 
									<input type="text" name="tipo" id="tipoJ" maxlength="14" placeholder="Pedágio"><span id="x_tipoJ"></span>
								</div>
								<div class="campo"> 
									<label for="latitudeJ">Latitude:</label><br> 
									<input type="text" name="latitude" id="latitudeJ" maxlength="13"><span id="x_latitudeJ"></span>
								</div>
								<div class="campo"> 
									<label for="longitudeJ">Longitude:</label><br> 
									<input type="text" name="longitude" id="longitudeJ" maxlength="10"><span id="x_longitudeJ"></span>
								</div>
								<div class="campo"> 
									<label for="idrodoviaJ">Id da Rodovia:</label><br> 
									<input type="text" name="idrodovia" id="idrodoviaJ" maxlength="5"><span id="x_idrodoviaJ"></span>
								</div>
						</fieldset>
					</div>

					</div>
					<div>
						<br><Br>		
					   <input type="submit" value="Alterar" name="enviar" id="enviarJ" class="botaoJ">
					   <a href="UI002-Home-TAC.jsp"><input type="reset" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
					</div>

		</form> 
		<br>
		<br>
		</div>
	</div>
<!-- SÓ EDITE DAQUI PARA CIMA!-->
</body>
</html>
