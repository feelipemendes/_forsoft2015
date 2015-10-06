<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Digital Monitoring - Digimon</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
	<script src="../js/framework.js" type='text/javascript' DEFER></script>
	<script src="../js/UI153.1.js" type="text/javascript" DEFER></script>
</head>
<body>
	
	<div id="topbar" class="conteudo-meio">
		<a href="UI146-Home-AdmANTT.jsp" id="logo" class="esquerda"><img src="../img/logoS2.png" alt="DigiMon"></a>
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

				<li><a href="UI003-CadastrarFrete-TAC.jsp">Cadastrar</a> 
						
						</li>
						
						<li><a href="UI005-AlterarFrete-TAC.jsp">Alterar</a> 
							
						</li>
						
						<li><a href="UI006-ExcluirFrete-TAC.jsp">Excluir</a> 
							 
						</li>
						
						<li><a href="UI004-ConsultarFrete-TAC.jsp">Consultar</a> 
							
						</li>
				</ul>
				<ul class="menu-ativo navigator">

				<h3>Veículo</h3> 

				<li><a href="UI007-CadastrarVeiculo-TAC.jsp">Cadastrar</a> 
							
						</li>
						
						<li><a href="UI008-AlterarVeiculo-TAC.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI010-ExcluirVeiculo-TAC.jsp">Excluir</a> 
						</li>
						
						<li><a href="UI009-ConsultarVeiculo-TAC.jsp">Consultar</a> 
						</li>
                                </ul>	


                                <ul class="menu-ativo navigator">

					<h3>Configurações da Conta</h3>
					
					<li><a href="UI011-AlterarConfiguracoesConta-TAC.jsp">Alterar</a> 
					</li>
						
				</ul>
		</div>
		
		<!-- NÃO EDITAR!-->
		
		<div id="centro" class="esquerda">
		
		<!-- SÓ EDITE DAQUI PARA BAIXO!-->
		
			<h1>Pesquisa de Transportador</h1>

			<div class="esquerda article">
                            
                         
				<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
				<div class="pesq">
					<div class="campo">
						<label for="nomeJ">Razão Social:</label> 
						<input type="text" name="nome" id="nomeJ" maxlength="50"><span id="x_nomeJ" class=""></span>
					</div>
					 <input type="submit" value="Consultar" name="enviar" id="enviarJ" class="botaoJ">
					 <a href="UI069-Home-AdmDNIT.jsp"><input type="button" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
				</div>
					<table id="tblConsulta">
						<tr>
							<td class="cabecalh">Tipo</td>
							<td class="cabecalh">Razão Social</td>
                                                        <td class="cabecalh">RNTRC</td>
							<td class="cabecalh">CNPJ</td>
                                                        <td class="cabecalh">CEP</td>
							
                                                        <td class="cabecalh">Abrir</td>
						</tr>
						<tr>
							<td>  </td>
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
							<td>  </td>
							<td><a href="servlet?id=2">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
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
							<td>  </td>
							<td><a href="servlet?id=4">☼</a></td>
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
