<%-- 
    Document   : UI155.1-PesquisaConsultarTransportadorCTCeETC-AgenteANTT
    Created on : 18/09/2015, 07:31:42
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
	<script src="../js/UI155.1.js" type="text/javascript" DEFER></script>
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

						<li><a href="UI129-CadastrarPostoPedagio-AgenteANTT.jsp">Cadastrar</a> 
						</li>
						
						<li><a href="UI131-AlterarPedagio-AgenteANTT.jsp">Alterar</a>  
						</li>
						
						<li><a href="UI157.2-PesquisaExcluirPedagio-AgenteANTT.jsp">Excluir</a> 
						</li>
						
						<li><a href="UI157.1-PesquisaConsultarPostoPedagio-AgenteANTT.jsp">Consultar</a> 
						</li>
				</ul>
				
				<ul class="menu-ativo navigator">

					<h3>Transportadores</h3> 

						<li><a href="UI137-CadastrarTransportadorCTCeETC-AgenteANTT.jsp">Cadastrar</a> 
						</li>
						
						<li><a href="UI139-AlterarTransportadorCTCeETC-AgenteANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI155.2-PesquisaExcluirTransportadorCTCeETC-AgenteANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI155.1-PesquisaConsultarTransportadorCTCeETC-AgenteANTT.jsp">Consultar</a> 
						</li>
				</ul>
				
				
				<ul class="menu-ativo navigator">
				
					<h3>TNTI</h3>
					
						<li><a href="UI133-CadastrarTNTI-AgenteANTT.jsp">Cadastrar</a> 
						</li>
						
						<li><a href="UI135-AlterarTNTI-AgenteANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI158.2-PesquisaExcluirTNTI-AgenteANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI158.1-PesquisaConsultarTNTI-AgenteANTT.jsp">Consultar</a> 
						</li>
				
				</ul>
				
				<ul class="menu-ativo navigator">

					<h3>Autônomos</h3> 

						<li><a href="UI141-CadastrarTransportadorAutonomoTAC-AgenteANTT.jsp">Cadastrar</a> 
						</li>
						
						<li><a href="UI143-AlterarTransportadorAutonomoTAC-AgenteANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI156.2-PesquisaExcluirTransportadorAutonomoTAC-AgenteANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI156.1-PesquisaConsultarTransportadorAutonomoTAC-AgenteANTT.jsp">Consultar</a> 
						</li>
				</ul>	
		</div>
		
		<!-- NÃO EDITAR!-->
		
		<div id="centro" class="esquerda">
		
		
			<h1>Consulta de Transportador CTC e ETC</h1>
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
							<td class="cabecalh">CNPJ</td>
							<td class="cabecalh">Razão Social</td>
							<td class="cabecalh">RNTRC</td>
							<td class="cabecalh">Email</td>
							
                                                        
							<td class="cabecalh">Abrir</td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							<td><a href="servlet?id=1">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							<td><a href="servlet?id=2">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							<td><a href="servlet?id=3">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							<td><a href="servlet?id=4">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							<td><a href="servlet?id=5">☼</a></td>
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
