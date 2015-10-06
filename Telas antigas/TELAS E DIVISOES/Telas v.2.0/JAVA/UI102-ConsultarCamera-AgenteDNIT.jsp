<%-- 
    Document   : UI102-ConsultarCamera-AgenteDNIT
    Created on : 18/09/2015, 00:22:40
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
		
		
		<div id="centro" class="esquerda">
			
		
		
			<h1>Consulta de Câmera</h1>
			<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
				<div class="pesq">
					<div class="campo">
						<label for="nomeJ">Nome:</label> 
						<input type="text" name="nome" id="nomeJ" maxlength="50"><span id="x_nomeJ" class=""></span>
					</div>
					 <input type="submit" value="Consultar" name="enviar" id="enviarJ" class="botaoJ">
					 <a href="UI069-Home-AdmDNIT.jsp"><input type="button" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
				</div>
					<table id="tblConsulta">
						<tr>
							<td class="cabecalh">Número de Série </td>
							<td class="cabecalh">ID Posto</td>
							
                                                        
							<td class="cabecalh">Abrir</td>
						</tr>
						<tr>
							
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=1">☼</a></td>
						</tr>
						<tr>
							
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=2">☼</a></td>
						</tr>
											
				</div>
		</form> 
		<br>
		<br>
		</div>
	</div>
</body>
</html>
