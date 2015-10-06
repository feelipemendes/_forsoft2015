<%-- 
    Document   : UI107-AlterarBalanca-AgenteDNIT
    Created on : 18/09/2015, 03:54:36
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
	<script src="../js/UI107.js" type="text/javascript" DEFER></script>
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
		
			<h1>Alterar Balança</h1>
			<h4>Preencha corretamente os campos!</h4>
			<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
					<div class="coluna-esquerda">
						<fieldset>
							<legend>Dados da Balança</legend>					
								<div class="campo">
									<label for="idbalancaJ">ID da Balança:</label><br> 
									<input type="text" name="idbalanca" id="idbalancaJ"><span id="x_idbalancaJ" class=""></span>
									<input type="submit" value = "Ok">
								</div>
								<div class="campo"> 
									<label for="numeroserieJ">Número de Série:</label><br> 
									<input type="text" name="numeroserie" id="numeroserieJ"><span id="x_numeroserieJ"></span>
								</div>
								<div class="campo"> 
									<label for="idpostoJ">ID do Posto:</label><br> 
									<input type="text" name="idposto" id="idpostoJ" maxlength="13"><span id="x_idpostoJ"></span>
								</div>
								<div class="campo"> 
									<label for="tipoJ">Tipo:</label><br> 
									<input type="text" name="tipo" id="tipoJ" maxlength="14"><span id="x_tipoJ"></span>
								</div>
						</fieldset>		
					</div>
															
				</div>
				<br><Br>		
	           <input type="submit" value="Alterar" name="enviar" id="enviarJ" class="botaoJ">
	           <a href="UI092-Home-AgenteDNIT.jsp"><input type="button" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
		</form> 
		<br>
		<br>
		</div>
	</div>
<!-- SÓ EDITE DAQUI PARA CIMA!-->
</body>
</html>
