
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Digital Monitoring - Digimon</title>
	<link rel="stylesheet" type="text/css" href="C:\Users\md10\Desktop\WEB FORSOFT\WebAppForsoft-master\WebAppForsoft-master\web\css\style.css">
	<script src="../js/framework.js" type="text/javascript" DEFER></script>
	<script src="../js/UI014.js" type="text/javascript" DEFER></script>
</head>
<body>
	<!-- NÃO EDITAR!-->
	
	<div id="topbar" class="conteudo-meio">
		<a href="UI015-Home-AdmMinisterio.jsp" id="logo" class="esquerda"><img src="C:\Users\md10\Desktop\WEB FORSOFT\WebAppForsoft-master\WebAppForsoft-master\web\img\logoS2.png" alt="DigiMon"></a>
		<ul id="menu-user" class="direita">
			<li><a href="#" id="profile"></a></li>
			<li><a href="#" id="config"></a></li>
			<li class="maisDireita"><a href="#" id="logout"></a></li>
		</ul>
	</div>
	
	<div id="container" class="conteudo-meio">
		<div id="sidemenu" class="esquerda">
				<ul class="menu-ativo navigator">

				<h3>Relatórios</h3> 

						<li><a href="UI017-EmitirRelatorio-AdmMinisterio.jsp">Emitir</a> 
						</li>
						
						<li><a href="UI016-ConsultarRelatorio-AdmMinisterio.jsp">Consultar</a> 
				
						</li>
						
				</ul>
				
				<ul class="menu-ativo navigator">

					<h3>Usuários</h3> 

						<li><a href="UI015.1-CadastrarUsuario-AdmMinisterio.jsp">Cadastrar</a></li>
						
						<li><a href="UI015.2.1-PesquisarUsuario-AdmMinisterio.jsp">Alterar</a></li>
						
						<li><a href="UI015.3.1-Pesquisarusuario-AdmMinisterio.jsp">Excluir</a></li>
						
						<li><a href="UI015.4.1-PesquisarUsuario-AdmMinisterio.jsp">Consultar</a></li>
				</ul>
		
		</div>
	
		<div id="centro" class="esquerda">
			<h1>Pesquisa de Usuário</h1>
			<div class="tabela">
				<div class="coluna-esquerda">
					<form name="form" method="post" action="#" id="formularioJ" class="formulario">
						<fieldset>
							<legend>Dados do Usuário</legend>
							<div class="campo">
								<label for="idfreteJ">Número do ID:</label><br>
								<a href="UI015.2-AlterarUsuario-AdmMinisterio.jsp"><input type="text" name="idfreteJ" id="idfreteJ"></a><br><br>
								<a href="UI015.2-AlterarUsuario-AdmMinisterio.jsp"><input type="submit" value="Pesquisar" name="Pesquisar" id="pesquisarJ" class="botaoJ"></a>
							</div>
							<div class="campo">
								<label for="nomdestJ">Nome Completo:</label><br>
								<a href="UI015.2-AlterarUsuario-AdmMinisterio.jsp"><input type="text" name="nomdestJ" id="nomdestJ"></a><br><br>
								<a href="UI015.2-AlterarUsuario-AdmMinisterio.jsp"><input type="submit" value="Pesquisar" name="Pesquisar" id="pesquisarJ" class="botaoJ"></a>
							</div>
						</fieldset>
				</div> <!-- fim da div coluna-esquerda-->
			</div> <!-- Fim da div tabela -->
					
						<a href="UI015-Home-AdmMinisterio.jsp"><input type="button" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a><br><br>
					</form>
		
			<table id="tblConsulta">
						<tr>
							<td class="cabecalh">ID</td>
							<td class="cabecalh" id="tdnome">Nome</td>
							<td class="cabecalh">RG</td>
							<td class="cabecalh">CPF</td>							
							<td class="cabecalh">E-mail</td>
							<td class="cabecalh">Abrir</td>
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
	</div>

</body>
</html>