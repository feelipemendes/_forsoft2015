<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Digital Monitoring - Digimon</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
	<script src="../js/framework.js" type='text/javascript' DEFER></script>
	<script src="../js/UI152.1.js" type="text/javascript" DEFER></script>
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
		
			<h1>Pesquisa de Balança</h1>

			<div class="esquerda article">
				<form name="form" method="post" action="#" id="formularioJ" class="formulario">
						<fieldset>
							<legend>Dados da Balança</legend>
							
									<div class="campo"> 
									<label for="numeroserieJ">Número de Série: </label><br> 
									<input type="text" name="numeroserie" id="numeroserieJ" maxlength="20"><span id="x_numeroserieJ"></span>
									<br>
									<br>
									<input type="submit" value="Pesquisar" name="Pesquisar" id="pesquisarJ" class="botaoJ">
								</div>
								<br>
								<br>
								<div class="campo"> 
									<label for="idbalancaJ">Id da Balança: </label><br> 
									<input type="text" name="idbalanca" id="idbalancaJ" maxlength="5"><span id="x_idbalancaJ"></span>
									<br>
									<br>
									<input type="submit" value="Pesquisar" name="Pesquisar" id="pesquisarJ" class="botaoJ">
								</div>
								<br>
								<div class="campo"> 
									<label for="idpostoJ">Id do Posto</label><br> 
									<input type="text" name="idposto" id="idpostoJ" maxlength="10"><span id="x_idpostoJ"></span>
									<br>
									<br>
									<input type="submit" value="Pesquisar" name="Pesquisar" id="pesquisarJ" class="botaoJ">
								</div>
								<br>
						</fieldset>
					
						
				</form>
						
			</div>
			
			<div class="esquerda article">
	
			</div>
			<div class="esquerda article">

			</div>
			
		
		</div>
	</div>

</body>
</html>