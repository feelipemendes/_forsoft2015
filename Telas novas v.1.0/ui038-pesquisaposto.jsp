<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
	<link href='https://fonts.googleapis.com/css?family=Cantarell:400,700' rel='stylesheet' type='text/css'>
	<meta charset="utf-8">
</head>
<body>
	<div class="wrapper">
		<div class="barraSuperior">
			<a href="https://goo.gl/SsAhv"><img src="dist/imagens/logo.png" class="logo"></a>
			<div class="menu">
<ul class="menu"> <!-- Esse é o 1 nivel ou o nivel principal -->
    <li><a href="#" class="menuItem">Frete</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>
        </ul>
    </li>
    <li><a href="#" class="menuItem">Veículo</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>        </ul>
    </li>
    <li><a href="#" class="menuItem">Relatório</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>        </ul>
    </li>
    <li><a href="#" class="menuItem">Usuário</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
             <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>       
        </ul>
    </li>
    <li><a href="#" class="menuItem">Transportador</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>        
        </ul>
    </li>

    <li><a href="#" class="menuItem">Rodovia</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>        
        </ul>
    </li> 

    <li><a href="#" class="menuItem">Balança</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
             <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>      
        </ul>
    </li>

     <li><a href="#" class="menuItem">Posto de pesagem</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>
        </ul>
    </li>

     <li><a href="#" class="menuItem">Motorista</a>
        <ul class="submenu-1"> <!-- Esse é o 2 nivel ou o primeiro Drop Down -->
            <li><a href="#">Cadastrar</a></li>
            <li><a href="#">Pesquisar</a></li>
            <li><a href="#">Consultar</a></li>
        </ul>
    </li>                     

</ul>
			</div>
		</div>

		<div class="centro">
            <div class="caixaPesq">
               
                <center><br>
					<h1>Pesquisar Posto:</h1><br>
					<form name="form" method="post" action="Servletui038" id="formularioJ" class="formulario">
						<div class="campo"> 
							<label for="idPostoPesagemJ">Id do Posto:</label>
							<input type="text" name="idPostoPesagem" id="idPostoPesagemJ"><span id="x_idPostoPesagemJ" class=""></span>
						</div><br>
						<div class="campo">
                                    <div class="campo">
                                    <label for="ufJ">UF:</label><br> 
										<select name="uf" id="ufJ">
											<option value="AC">UF</option>
											<option value="AC">AC</option>
											<option value="AL">AL</option>
											<option value="AP">AP</option>
											<option value="AM">AM</option>
											<option value="BA">BA</option>
											<option value="CE">CE</option>
											<option value="DF">DF</option>
											<option value="ES">ES</option>
											<option value="GO">GO</option>
											<option value="MA">MA</option>
											<option value="MS">MS</option>
											<option value="MT">MT</option>
											<option value="MG">MG</option>
											<option value="PA">PA</option>
											<option value="PB">PB</option>
											<option value="PR">PR</option>
											<option value="PE">PE</option>
											<option value="PI">PI</option>
											<option value="RJ">RJ</option>
											<option value="RN">RN</option>
											<option value="RS">RS</option>
											<option value="RO">RO</option>
											<option value="RR">RR</option>
											<option value="SC">SC</option>
											<option value="SP">SP</option>
											<option value="SE">SE</option>
											<option value="TO">TO</option>
										</select>
                                    
                                    <span id="x_ufJ"></span>
                                </div><br>
						<input type="submit" value="Pesquisar" name="pesquisar" id="pesquisarJ" class="botaoJ">
						<input type="reset" value="Limpar" name="Limpar" id="limparJ" class="botaoJ">
						<br><br>
				</form> 
					
					<table id="tblConsulta">
						<tr>
						<td class="cabecalh" id="">Id do Posto</td>
							<td class="cabecalh">Bairro</td>
							<td class="cabecalh">Cidade</td>
							<td class="cabecalh">Estado</td>
							<td class="cabecalh">Abrir</td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							
							<td><a href="servlet?id=5">?</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							
							<td><a href="servlet?id=5">?</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							
							<td><a href="servlet?id=5">?</a></td>
						</tr>
						
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							<td><a href="servlet?id=5">?</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							
							<td><a href="servlet?id=5">?</a></td>
						</tr>
						
						
					</table>
					
                 </center>
                    
					
			<br><br>		
                    
                
            </div>
		</div>

			
		<div class="footer">
		</div>
	</div>
</body>
</html>