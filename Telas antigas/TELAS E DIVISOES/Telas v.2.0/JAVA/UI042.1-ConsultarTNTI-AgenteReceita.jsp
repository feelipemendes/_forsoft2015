<%-- 
    Document   : UI041-Home-AgenteReceita
    Created on : 17/09/2015, 20:54:34
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
	<script src="../js/js_exemplo.js" type="text/javascript" DEFER></script>
</head>
<body>
	<!-- NÃO EDITAR!-->
	
	<div id="topbar" class="conteudo-meio">
		<a href="UI041-Home-AgenteReceita.jsp" id="logo" class="esquerda"><img src="../img/logoS2.png" alt="DigiMon"></a>
		<ul id="menu-user" class="direita">
			<li><a href="#" id="profile"></a></li>
			<li><a href="#" id="config"></a></li>
			<li class="maisDireita"><a href="#" id="logout"></a></li>
		</ul>
	</div>
	
	<div id="container" class="conteudo-meio">
		<div id="sidemenu" class="esquerda">
			
				<ul class="menu-ativo navigator">
					<h3>Frete</h3> 
					<li>
						<a href="UI045-CadastrarFreteInternacional-AgenteReceita.jsp">Cadastrar Frete</a> 
					</li>
					<li>
						<a href="UI043.1-ConsultarFrete-AgenteReceita.jsp">Consultar Frete</a> 
					</li>
				</ul>		
				
				<ul class="menu-ativo navigator">
					<h3>TETI</h3>
					
					<li>
						<a href="UI46-CadastrarTETI-AgenteReceita.jsp">Cadastrar TETI</a>						
					</li>
							
					<li>
						<a href="UI044.1-ConsultarTETI-AgenteReceita.jsp">Consultar TETI</a>
					</li>
				</ul>
	
				<ul class="menu-ativo navigator">
				<h3>TNTI</h3>
						
					<li><a href="UI042.1-ConsultarTNTI-AgenteReceita.jsp">Consultar TNTI</a>
						
					</li>
				</ul>
		</div>
		
		<!-- NÃO EDITAR!-->
<div id="centro" class="esquerda">
		
		
			<h1>Consulta de TNTI</h1>
			<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
				<div class="pesq">
					<div class="campo">
						<label for="idtntiJ">ID do TNTI:</label> 
						<input type="text" name="idtnti" id="idtntiJ" maxlength="50"><span id="x_idtntiJ" class=""></span>
					</div>
					<div class="campo">
						<label for="idrntrcJ">ID do RNTRC:</label> 
						<input type="text" name="idrntrc" id="idrntrcJ" maxlength="50"><span id="x_idrntrcJ" class=""></span>
					</div>
					 <input type="submit" value="Consultar" name="enviar" id="enviarJ" class="botaoJ">
					 <a href="UI041-Home-AgenteReceita.jsp"><input type="button" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
				</div>
					<table id="tblConsulta">
						<tr>
							<td class="cabecalh">Nome</td>
							<td class="cabecalh">RNTRC<td>
							<td class="cabecalh">Telefone</td>
							<td class="cabecalh">Email</td>
							<td class="cabecalh">Estado</td>
							
							<td class="cabecalh">Abrir</td>
						<tr> 
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=5">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=5">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=5">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=5">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
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
		


