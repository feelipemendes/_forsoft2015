<%-- 
    Document   : UI101-CadastrarCamera-AgenteDNIT
    Created on : 18/09/2015, 03:01:20
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
	<script src="../js/UI101.js" type='text/javascript' DEFER></script>
	
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
		
		<div id="centro" class="esquerda full">
		
		<!-- SÓ EDITE DAQUI PARA BAIXO!-->
		
			<h1>Cadastrar Câmera</h1>
			<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
					<div class="coluna-esquerda">
						<fieldset>
							<legend>Dados da Localização da Câmera</legend>					
								<div class="campo">
									<label for="logradouroJ">Logradouro:</label><br> 
									<input type="text" name="logradouro" id="logradouroJ" ><span id="x_logradouroJ" class=""></span>
								</div>
								<div class="campo"> 
									<label for="numeroJ">Numero:</label><br> 
									<input type="text" name="numero" id="numeroJ" ><span id="x_numeroJ"></span>
								</div>
								<div class="campo"> 
									<label for="complementoJ">Complemento:</label><br> 
									<input type="text" name="complemento" id="complementoJ" ><span id="x_complementoJ"></span>
								</div>
								<div class="campo"> 
									<label for="cepJ">CEP:</label><br> 
									<input type="text" name="cep" id="cepJ" maxlength="10"><span id="x_cepJ"></span>
								</div>
								<div class="campo"> 
									<label for="bairroJ">Bairro:</label><br> 
									<input type="text" name="bairro" id="bairroJ" ><span id="x_bairroJ"></span>
								</div>
								<div class="campo"> 
									<label for="cidadeJ">Cidade:</label><br> 
									<input type="text" name="cidade" id="cidadeJ" ><span id="x_cidadeJ"></span>
								</div>
								<div class="campo"> 
									<label for="estadoJ">Estado:</label><br> 
									<input type="text" name="estado" id="estadoJ" ><span id="x_estadoJ"></span>
								</div>
						</fieldset>
						<fieldset>
							<legend>Dados da Rodovia</legend>					
								<div class="campo">
									<label for="nomerodJ">Nome da Rodovia:</label><br> 
									<input type="text" name="nomerod" id="nomerodJ"  ><span id="x_nomerodJ" class=""></span>
								</div>
								<div class="campo"> 
									<label for="tipoJ">Tipo:</label><br> 
									<input type="text" name="tipo" id="tipoJ"  ><span id="x_tipoJ"></span>
								</div>
								<div class="campo"> 
									<label for="extensaokmJ">Extensão em KM:</label><br> 
									<input type="text" name="extensaokm" id="extensaokmJ"  ><span id="x_extensaokmJ"></span>
								</div>
								<div class="campo"> 
									<label for="cinicialJ">Cidade Inicial:</label><br> 
									<input type="text" name="cinicial" id="cinicialJ"  ><span id="x_cinicialJ"></span>
								</div>
								<div class="campo"> 
									<label for="cfinalJ">Cidade Final:</label><br> 
									<input type="text" name="cfinal" id="cfinalJ"  ><span id="x_cfinalJ"></span>
								</div>
								<div class="campo"> 
									<label for="telJ">Telefone:</label><br> 
									<input type="text" name="tel" id="telJ"  ><span id="x_telJ"></span>
								</div>
						</fieldset>
							
						</fieldset>
					</div>
					
					<div class="coluna-direita">
						<fieldset>
							<legend>Dados da Câmera</legend>
								<div class="campo">
									<label for="numserieJ">Número de Série:</label><br> 
									<input type="text" name="numserie" id="numserieJ"  ><span id="x_numserieJ" class=""></span>
								</div>
								<div class="campo">
									<label for="kmJ">KM:</label><br> 
									<input type="text" name="km" id="kmJ"  ><span id="x_kmJ" class=""></span>
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
