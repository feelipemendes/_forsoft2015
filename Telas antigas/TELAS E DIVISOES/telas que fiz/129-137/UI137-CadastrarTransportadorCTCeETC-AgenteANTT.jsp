<%-- 
    Document   : UI137-CadastrarTransportadorCTCeETC-AgenteANTT
    Created on : 18/09/2015, 04:50:37
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
	<script src="../js/UI137.js" type="text/javascript" DEFER></script>
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

				<li><a href="UI117-CadastrarTransportadorCTCeETC-AdmANTT.jsp">Cadastrar</a> 
						
						</li>
						
						<li><a href="UI139-AlterarTransportadorCTCeETC-AgenteANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI140-ExcluirTransportadorCTCeETC-AgenteANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI118-ConsultarTransportadorCTCeETC-AdmANTT.jsp">Consultar</a> 
						</li>
				</ul>
				
				<ul class="menu-ativo navigator">

					<h3>Autônomos</h3> 

						<li><a href="UI141-CadastrarTransportadorAutonomoTAC-AgenteANTT.jsp">Cadastrar</a> 
						</li>
						
						<li><a href="UI143-AlterarTransportadorAutonomoTAC-AgenteANTT.jsp">Alterar</a> 
						</li>
						
						<li><a href="UI144-ExcluirTransportadorAutonomoTAC-AgenteANTT.jsp">Excluir</a>
						</li>
						
						<li><a href="UI142-ConsultarTransportadorAutonomoTAC-AgenteANTT.jsp">Consultar</a> 
						</li>
				</ul>	
		</div>
		
		<!-- NÃO EDITAR!-->
		
		<div id="centro" class="esquerda">
		
		<!-- SÓ EDITE DAQUI PARA BAIXO!-->
		
			<h1>Cadastrar Transportador</h1>
			<h4>Preencha corretamente os campos!</h4>
			<form name="form" method="post" action="#" id="formularioJ" class="formulario">
				<div class="tabela">
					<div class="coluna-esquerda">
						<fieldset>
							<legend>Dados do Motorista</legend>					
								<div class="campo">
									<label for="nomeJ">Nome Completo:</label><br> 
									<input type="text" name="nome" id="nomeJ"><span id="x_nomeJ"></span>
								</div>								
								<div class="campo"> 
									<label for="cpfJ">CPF:</label><br> 
									<input type="text" name="CPF" id="cpfJ" maxlength="14"><span id="x_cpfJ"></span>
								</div>
								<div class="campo"> 
									<label for="cnhJ">CNH:</label><br> 
									<input type="text" name="cnh" id="cnhJ" maxlength="11"><span id="x_cnhJ"></span>
								</div>
								<div class="campo"> 
									<label for="orgemJ">Orgão Emissor:</label><br> 
									<input type="text" name="orgem" id="orgemJ" maxlength="30"><span id="x_orgemJ"></span>
								</div>
								<div class="campo"> 
									<label for="rgJ">RG:</label><br> 
									<input type="text" name="rg" id="rgJ" maxlength="12"><span id="x_rgJ"></span>
								</div>			
								<div class="campo"> 
									<label for="dataJ">Data:</label><br> 
									<input type="text" name="data" id="dataJ" maxlength="10"><span id="x_dataJ"></span>
								</div>			
								<div class="campo"> 
									<label for="telJ">Telefone:</label><br> 
									<input type="text" name="Telefone" id="telJ" maxlength="12"><span id="x_telJ"></span>
								</div>
								<div class="campo"> 
									<label for="telcJ">Telefone Celular:</label><br> 
									<input type="text" name="TelefoneC" id="telcJ" maxlength="13"><span id="x_telcJ"></span>
								</div>
								<div class="campo"> 
								<div class="campo"> 
									<label for="emailJ">Email:</label><br> 
									<input type="text" name="email" id="emailJ" maxlength="50"><span id="x_emailJ"></span>
								</div>
									<label for="estcivJ">Estado Civil:</label>
									<select name="estadocivil" id="estcivJ"><!--<span id="x_dataJ"></span>-->
										<option>Casado</option>
										<option>Solteiro</option>
										<option>Viúvo</option>
									</select>
								</div>
								<fieldset class="subfds">
									<legend>Sexo</legend>								
									<input type="radio" name="sexo" id="mascJ" checked><!--<span id="x_dataJ"></span>-->
									<label for="mascJ">Masculino</label><br>								
									<input type="radio" name="sexo" id="femJ"><!--<span id="x_dataJ"></span>-->
									<label for="femJ">Feminino</label>								
								</fieldset>
																						
					</div>
									 
					<div class="coluna-direita">
								<fieldset>
									<legend>Endereço do Motorista</legend>		
									<div class="campo"> 
										<label for="lograJ">Logradouro:</label><br> 
										<input type="text" name="logra" id="lograJ" maxlength="30"><span id="x_lograJ"></span>
									</div>
									<div class="campo"> 
										<label for="numJ">Número:</label><br> 
										<input type="text" name="num" id="numJ" maxlength="10"><span id="x_num"></span>
									</div>
									<div class="campo"> 
										<label for="complograJ">Complemento do Logradouro:</label><br> 
										<input type="text" name="complogra" id="complograJ" maxlength="30"><span id="x_complograJ"></span>
									</div>
									<div class="campo"> 
										<label for="cepJ">CEP:</label><br> 
										<input type="text" name="CEP" id="cepJ" maxlength="10"><span id="x_cepJ"></span>
									</div>
									<div class="campo"> 
										<label for="bairroJ">Bairro:</label><br> 
										<input type="text" name="bairro" id="bairroJ" maxlength="20"><span id="x_bairroJ"></span>
									</div>
									<div class="campo"> 
										<label for="estadoJ">Estado:</label><br> 
										<input type="text" name="estado" id="estadoJ" maxlength="10"><span id="x_estadoJ"></span>
									</div>
									<div class="campo"> 
										<label for="cidadeJ">Cidade:</label><br> 
										<input type="text" name="cidade" id="cidadeJ" maxlength="10"><span id="x_cidadeJ"></span>
									</div>
								</fieldset>
								
						<fieldset>
							<legend>Dados do Transportador</legend>
								<div class="campo"> 
									<label for="rntrcJ">RNTRC:</label><br> 
									<input type="text" name="rntrc" id="rntrcJ" maxlength="8"><span id="x_rntrcJ"></span>
								</div>
								<div class="campo"> 
									<label for="tellJ">Telefone:</label><br> 
									<input type="text" name="Telefonel" id="tellJ" maxlength="12"><span id="x_tellJ"></span>
								</div>										
								<div class="campo"> 
									<label for="emaillJ">Email:</label><br> 
									<input type="text" name="emaill" id="emaillJ" maxlength="50"><span id="x_emaillJ"></span>
								</div>
								<div class="campo"> 
									<label for="cnpjJ">CNPJ:</label><br> 
									<input type="text" name="cnpj" id="cnpjJ" maxlength="18"><span id="x_cnpjJ"></span>
								</div>
								<div class="campo"> 
									<label for="rzJ">Razão Social:</label><br> 
									<input type="text" name="rzj" id="rzJ" maxlength="20"><span id="x_rzJ"></span>
								</div>
						</fieldset>
					</div>
					
				</div>
				<br><Br>		
	           <input type="submit" value="Consultar" name="enviar" id="enviarJ" class="botaoJ">
	           <a href="UI002-Home-TAC.jsp"><input type="reset" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ"></a>
		</form> 
		<br>
		<br>
		</div>
	</div>
<!-- SÓ EDITE DAQUI PARA CIMA!-->
</body>
</html>
