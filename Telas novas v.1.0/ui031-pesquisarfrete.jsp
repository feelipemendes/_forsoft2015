<%-- 
    Document   : ui031-pesquisarfrete
    Created on : 04/10/2015, 09:29:37
    Author     : Alan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
					<h1>Pesquisar Frete</h1><br>
					<form name="form" method="post" action="servletui031" id="formularioJ" class="formulario">
						<div class="campo"> 
							<label for="idFreteJ">ID do Frete:</label>
							<input type="text" name="idFrete" id="idFreteJ"><span id="x_idFreteJ" class=""></span>
						</div><br>
						<div class="campo">
							<label for="motoristaJ">Motorista:</label>
							<input type="text" name="motorista" id="motoristaJ"><span id="x_motoristaJ" class=""></span>
						</div><br>
						<div class="campo">
							<label for="veiculoJ">Modelo do Veículo:</label>
							<input type="text" name="veiculo" id="veiculoJ"><span id="x_veiculoJ" class=""></span>
						</div><br>
						<input type="submit" value="Pesquisar" name="pesquisar" id="pesquisarJ" class="botaoJ">
						<input type="reset" value="Limpar" name="Limpar" id="limparJ" class="botaoJ">
					</form> 
					
					<table id="tblConsulta">
						<tr>
						<td class="cabecalh" id="">ID do Frete</td>
							<td class="cabecalh">Motorista</td>
							<td class="cabecalh">Modelo do Veículo</td>
							<td class="cabecalh">Tipo</td>
							<td class="cabecalh">Estado de Destino</td>
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
					
                 </center>
                    
					
			<br><br>		
                    
                
            </div>
		</div>

			
		<div class="footer">
		</div>
	</div>
</body>
</html>