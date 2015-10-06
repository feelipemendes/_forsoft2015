<%-- 
    Document   : ui037-pesquisarodovia
    Created on : 04/10/2015, 05:09:32
    Author     : VictorRF
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
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
						<h1>Pesquisar Rodovia: </h1><br>
					<form name="form" method="post" action="Servletui037" id="formularioJ" class="formulario">
						<div class="campo"> 
							<label for="nomeJ">Nome:</label>
							<input type="text" name="nome" id="nomeJ"><span id="x_nomeJ" class=""></span>
						</div><br>
						<div class="campo">
							<label for="ufInicialJ">Estado Inicial:</label>
								<select name="ufInicial" id="ufInicialJ"><span id="x_ufInicialJ" class=""></span>> 
									<option value="estado">Selecione o Estado</option> 
									<option value="ac">Acre</option> 
									<option value="al">Alagoas</option> 
									<option value="am">Amazonas</option> 
									<option value="ap">Amapá</option> 
									<option value="ba">Bahia</option> 
									<option value="ce">Ceará</option> 
									<option value="df">Distrito Federal</option> 
									<option value="es">Espírito Santo</option> 
									<option value="go">Goiás</option> 
									<option value="ma">Maranhão</option> 
									<option value="mt">Mato Grosso</option> 
									<option value="ms">Mato Grosso do Sul</option> 
									<option value="mg">Minas Gerais</option> 
									<option value="pa">Pará</option> 
									<option value="pb">Paraíba</option> 
									<option value="pr">Paraná</option> 
									<option value="pe">Pernambuco</option> 
									<option value="pi">Piauí</option> 
									<option value="rj">Rio de Janeiro</option> 
									<option value="rn">Rio Grande do Norte</option> 
									<option value="ro">Rondônia</option> 
									<option value="rs">Rio Grande do Sul</option> 
									<option value="rr">Roraima</option> 
									<option value="sc">Santa Catarina</option> 
									<option value="se">Sergipe</option> 
									<option value="sp">São Paulo</option> 
									<option value="to">Tocantins</option> 
								</select>
						</div><br>
						<div class="campo">
							<label for="ufFinalJ">Estado Final:</label>
								<select name="ufFinal" id="ufFinalJ"><span id="x_ufFinalJ" class=""></span>> 
									<option value="estado">Selecione o Estado</option> 
									<option value="ac">Acre</option> 
									<option value="al">Alagoas</option> 
									<option value="am">Amazonas</option> 
									<option value="ap">Amapá</option> 
									<option value="ba">Bahia</option> 
									<option value="ce">Ceará</option> 
									<option value="df">Distrito Federal</option> 
									<option value="es">Espírito Santo</option> 
									<option value="go">Goiás</option> 
									<option value="ma">Maranhão</option> 
									<option value="mt">Mato Grosso</option> 
									<option value="ms">Mato Grosso do Sul</option> 
									<option value="mg">Minas Gerais</option> 
									<option value="pa">Pará</option> 
									<option value="pb">Paraíba</option> 
									<option value="pr">Paraná</option> 
									<option value="pe">Pernambuco</option> 
									<option value="pi">Piauí</option> 
									<option value="rj">Rio de Janeiro</option> 
									<option value="rn">Rio Grande do Norte</option> 
									<option value="ro">Rondônia</option> 
									<option value="rs">Rio Grande do Sul</option> 
									<option value="rr">Roraima</option> 
									<option value="sc">Santa Catarina</option> 
									<option value="se">Sergipe</option> 
									<option value="sp">São Paulo</option> 
									<option value="to">Tocantins</option> 
								</select>
						</div><br>
						<input type="submit" value="Pesquisar" name="pesquisar" id="pesquisarJ" class="botaoJ">
						<input type="reset" value="Limpar" name="Limpar" id="limparJ" class="botaoJ">
					</form> 
					
					<table id="tblConsulta">
						<tr>
						<td class="cabecalh" id="">Nome</td>
							<td class="cabecalh">Extensão em Km</td>
							<td class="cabecalh">Cidade Inicial</td>
							<td class="cabecalh">UF Inicial</td>
							<td class="cabecalh">Cidade Final</td>
							<td class="cabecalh">UF Final</td>
							<td class="cabecalh">Abrir</td>
						</tr>
						<tr>
							<td>  </td>
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
							<td>  </td>
							<td><a href="servlet?id=5">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
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
							<td>  </td>
							<td><a href="servlet?id=5">☼</a></td>
						</tr>
						<tr>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td>  </td>
							<td><a href="servlet?id=5">☼</a></td>
						</tr>
					</table>
					
					<br><br><br>
					
                 </center>
                    
					
			<br><br>		
                    
                
            </div>
		</div>

			
		<div class="footer">
		</div>
	</div>
</body>
</html>