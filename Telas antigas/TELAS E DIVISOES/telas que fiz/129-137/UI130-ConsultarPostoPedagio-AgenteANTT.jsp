<%-- 
    Document   : UI130-ConsultarPostoDePedagio-AgenteANTT
    Created on : 18/09/2015, 00:27:01
    Author     : Javapos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
	<meta charset="UTF-8">
	<title>Digital Monitoring - Digimon</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
	<script src="../js/UI130.js" defer></script>
	<script src="../js/framework.js" defer></script>
</head>
<body>

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
		
		<div id="centro" class="esquerda full">
			<h1>Consulta aos Pedágios</h1>
			
			<form id="formularioJ" action="#" method="post" class="formulario">
				<div class="tabela">
					<h3>*Preencha pelo menos um dos campos para realizar a consulta</h3>
					<div class="coluna-esquerda">
						<fieldset>
							<legend>Dados de Consulta</legend>
							<div class="campo">
								<label for="idpostoCJ">ID do Pedágio:<label><br>
								<input type="text" name="idfrete" id="idpostoJ"><span id="x_idpostoJ"></span>
							</div>
							<div class="campo">
								<input type="submit" name="consultar" id="contultarJ" class="botaoJ" value="Consultar">
							</div>
						</fieldset>
					</div>
					<div class="coluna-direita">
						<fieldset>
							<legend>Dados do Posto de Pedágio</legend>					
								<div class="campo"> 
									<label for="kmJ">KM</label><br> 
									<input type="text" name="kilometro" id="kmJ" maxlength="5"><span id="x_kmJ"></span>
								</div>
								<div class="campo"> 
									<label for="estadoJ">Estado</label><br> 
									<input type="text" name="estado" id="estadoJ" maxlength="10"><span id="x_estadoJ"></span>
								</div>
								<div class="campo">
								<label for="tipodepostoJ">Tipo de Posto</label>
									<select name="tipodeposto" id="tipodepostoJ"><!--<span id="x_dataJ"></span>-->
										<option>Exemplo 1</option>
										<option>Exemplo 2</option>
										<option>Exemplo 3</option>
									</select>
								</div>
								<div class="campo"> 
									<label for="rodoviaJ">Rodovia</label>
									<select name="rodovia" id="rodoviaJ"><!--<span id="x_dataJ"></span>-->
										<option>Exemplo 1</option>
										<option>Exemplo 2</option>
										<option>Exemplo 3</option>
									</select>
									</div>

						</fieldset>
					</div>
				</div>
			</form>
		</div>
		
	</div>

</body>
</html>
