<%-- 
    Document   : UI129-CadastrarPostoDePedagio-AgenteANTT
    Created on : 18/09/2015, 00:26:17
    Author     : Javapos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Digital Monitoring - Digimon</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
	<script src='../js/framework.js' type='text/javascript' DEFER></script>
	<script src="../js/UI078.js" type="text/javascript" DEFER></script>
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

				<li><a href="#">Cadastrar</a> 
							
						</li>
						
						<li><a href="#">Alterar</a> 
							
						</li>
						
						<li><a href="#">Excluir</a> 
							
						</li>
						
						<li><a href="#">Consultar</a> 
					
						</li>
				</ul>	
				
				<ul class="menu-ativo navigator">
				<h3>TNTI</h3> 

				<li><a href="#">Cadastrar</a> 
							
						</li>
						
						<li><a href="#">Alterar</a> 
							
						</li>
						
						<li><a href="#">Excluir</a> 
							
						</li>
						
						<li><a href="#">Consultar</a> 
					
						</li>
				</ul>	
				
				<ul class="menu-ativo navigator">

				<h3>Autônomos</h3> 

				<li><a href="#">Cadastrar</a> 
							
						</li>
						
						<li><a href="#">Alterar</a> 
							
						</li>
						
						<li><a href="#">Excluir</a> 
							
						</li>
						
						<li><a href="#">Consultar</a> 
					
						</li>
				</ul>	
		</div>
		
		<!-- NÃO EDITAR!-->
		
		<div id="centro" class="esquerda">
		
		<!-- SÓ EDITE DAQUI PARA BAIXO!-->
		
			<h1>Cadastro Posto de Pedágio</h1>
			<h3>*Preencha pelo menos um dos campos para realizar a consulta</h3>
			<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
					<div class="coluna-esquerda">
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
								<br>
								<label for="tipodepostoJ">Tipo de Posto</label>
									<select name="tipodeposto" id="tipodepostoJ"><!--<span id="x_dataJ"></span>-->
										<option>Exemplo 1</option>
										<option>Exemplo 2</option>
										<option>Exemplo 3</option>
									</select>								
						</fieldset>
					</div>
					
					<div class="coluna-direita">
						<fieldset>
							<legend>Dados da Rodovia</legend>								
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
				<br><Br>		
	           <input type="submit" value="Enviar" name="enviar" id="enviarJ" class="botaoJ">
	           <a href="UI153-Home-AgenteANTT.jsp"><input type="button" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
		</form> 
		<br>
		<br>
		</div>
	</div>
<!-- SÓ EDITE DAQUI PARA CIMA!-->
</body>
</html>
