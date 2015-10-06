<%-- 
    Document   : UI070-CadastrarRodovia-AdmDNIT
    Created on : 18/09/2015, 01:34:26
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
	<script src='../js/UI070.js' type="text/javascript" DEFER></script>
</head>
<body>
		<!-- NÃO EDITAR!-->
	<div id="topbar" class="conteudo-meio">
		<a href="UI069-Home-AdmDNIT.jsp" id="logo" class="esquerda"><img src="../img/logoS2.png" alt="DigiMon"></a>
		<ul id="menu-user" class="direita">
			<li><a href="#" id="profile"></a></li>
			<li><a href="#" id="config"></a></li>
			<li class="maisDireita"><a href="#" id="logout"></a></li>
		</ul>
	</div>
	
	<div id="container" class="conteudo-meio">
		<div id="sidemenu" class="esquerda">
		
			<ul class="menu-ativo navigator">

				<h3>Usuários</h3> 

						<li><a href="UI150-CasdastrarUsuario-AdmANTT.JSP">Cadastrar</a> 
						</li>
						
						<li><a href="UI153-AlterarUsuario-AdmANTT.jsp">Alterar</a> 
				
						</li>
						
						<li><a href="UI152-ExcluirUsuario-AdmANTT.jsp">Excluir</a> 
							
						</li>
						
						<li><a href="151-ConsultarUsuario-AdmANTT.jsp">Consultar</a> 
							
						</li>
				</ul>
				<ul class="menu-ativo navigator">

				<h3>Postos de Pedágio</h3>

				<li><a href="UI109-CadastrarPedagio-AdmANTT.jsp">Cadastrar</a> 
						
						</li>
						
						<li><a href="UI111-AlterarPedagio-AdmANTT.jsp">Alterar</a> 
							 
						</li>
						
						<li><a href="UI112-ExcluirPedagio-AdmANTT.jsp">Excluir</a> 
						
						</li>
						
						<li><a href="UI110-ConsultarPedagio-AdmANTT.jsp">Consultar</a> 
							
						</li>
				</ul>
				<ul class="menu-ativo navigator">
				<h3>Transportadores</h3> 

				<li><a href="UI117-CadastrarTransportadorCTCeETC-AdmANTT.jsp">Cadastrar</a> 
						
						</li>
						
						<li><a href="UI119-AlterarTransportadorCTCeETC-AdmANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI120-ExcluirTransportadorCTCeETC-AdmANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI118-ConsultarTransportadorCTCeETC-AdmANTT.jsp">Consultar</a> 
						</li>
				</ul>	
				
				<ul class="menu-ativo navigator">
				<h3>TNTI</h3> 

				<li><a href="UI113-CadastrarTNTI-AdmANTT.jsp">Cadastrar</a> 
							
						</li>
						
						<li><a href="UI115-AlterarTNTI-AdmANTT.jsp">Alterar</a> 
							
						</li>
						
						<li><a href="UI116-ExcluirTNTI-AdmANTT.jsp">Excluir</a> 
							
						</li>
						
						<li><a href="UI114-ConsultarTNTI-AdmANTT.jsp">Consultar</a> 
					
						</li>
				</ul>	

				<ul class="menu-ativo navigator">

					<h3>Autônomos</h3> 

						<li><a href="UI121-CadastrarTransportadorAutonomoTAC-AdmANTT.jsp">Cadastrar</a> 
						</li>
						
						<li><a href="UI119-AlterarTransportadorAutonomoTAC-AdmANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI120-ExcluirTransportadorAutonomoTAC-AdmANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI122-ConsultarTransportadorAutonomoTAC-AdmANTT.jsp">Consultar</a> 
						</li>
				</ul>
				
				
		</div>
            
        <div id="centro" class="esquerda">
		
		
			<h1>Consulta de Pedágio</h1>
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
							<td class="cabecalh">ID Posto</td>
							<td class="cabecalh">Tipo</td>
							<td class="cabecalh">Nome da Rodovia</td>
							<td class="cabecalh">Cidade Inicial</td>
							<td class="cabecalh">Cidade Final</td>
                                                        
							<td class="cabecalh">Abrir</td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=1">â˜¼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=2">â˜¼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=3">â˜¼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=4">â˜¼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=5">â˜¼</a></td>
						</tr>
					</table>
				</div>
		</form> 
		<br>
		<br>
		</div>
	</div>
</body>
</html>