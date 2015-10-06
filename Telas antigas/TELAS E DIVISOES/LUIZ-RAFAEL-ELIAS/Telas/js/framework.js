var _$ = function (id) {
    return document.getElementById(id);
}

// Início das Estrtuturas para Máscaras 
	
	
	setMask = function (id, mask) {
		_$(id).onkeypress = function () {
		mascara(id, mask);
	}
	}

	
	// Eventos de Validação
	
	//Campo Obrigatório e Somente Letras
	
	validaChar = function (id, regex, indiceCampo) {
		
		_$(id).onblur = function () {
		if (required (id) == false || onlyWhatever (id, regex) == false ) {
			_$(id).style.border = "thin solid red";
			msgErro(id, " Campo Inválido!");
			formOk[indiceCampo] = false;
		
		}
		else if (required (id) == true && onlyWhatever (id, regex) == true ) {
			_$(id).style.border = "thin solid #a9a9a9";
			_$("x_"+id).style.display = "none";
			formOk[indiceCampo] = true;
			
		}
	}
	}
	
	// valida e-mail 
	
	validaEmail = function (id, regex, indiceCampo) {
		
		_$(id).onblur = function () {
		if (required (id) == false || onlyWhatever (id, regex) == false ) {
			_$(id).style.border = "thin solid red";
			msgErro(id, " Email Inválido!");
			formOk[indiceCampo] = false;
		
		}
		else if (required (id) == true && onlyWhatever (id, regex) == true ) {
			_$(id).style.border = "thin solid #a9a9a9";
			_$("x_"+id).style.display = "none"
			formOk[indiceCampo] = true;
			
		}
	}
	}
	

	// Fim campo obrigatório e Somente Letras
	
	// Campo obrigatório e somente números  [ Verificação por Regex!!!]
	
	validaCPF = function (id, regex, indiceCampo) {
		_$(id).onblur = function () {
		if (required (id) == false || onlyWhatever(id, regex ) == false || TestaCPF (_$(id).value) == false ) {
			_$(id).style.border = "1px solid red";	
			msgErro(id, " CPF Inválido!");
			formOk[indiceCampo] = false;
		}
		else if (required (id) == true && onlyWhatever(id, regex ) == true && TestaCPF (_$(id).value) == true ) {
			_$(id).style.border = "1px solid #a9a9a9";
			_$("x_"+id).style.display = "none";	 // padrão form_spam = "x_"+id
			formOk[indiceCampo] = true;
			
		}
	}
	}
	
	/*validaNumerico = function (id, regex, indiceCampo) {
		_$(id).onblur = function () {
			if (required (id) == false || onlyWhatever(id, regex) == false ) {
			_$(id).style.border = "1px solid red";	
			msgErro(id, " Campo Inválido!");
			formOk[indiceCampo] = false;
			}
		else if (required (id) == true && onlyWhatever(id, regex) == true ) {
			_$(id).style.border = "1px solid #a9a9a9";	
			_$("x_"+id).style.display = "none";
			formOk[indiceCampo] = true;
			
		}
	}
	}*/
	
	validarCNPJ =  function (id, regex, indiceCampo) {
		_$(id).onblur = function () {
		if (required (id) == false || onlyWhatever(id, regex ) == false || TestaCNPJ (_$(id).value) == false ) {
			_$(id).style.border = "1px solid red";	
			msgErro(id, " CNPJ Inválido!");
			formOk[indiceCampo] = false;
		}
		else if (required (id) == true && onlyWhatever(id, regex ) == true && TestaCNPJ (_$(id).value) == true ) {
			_$(id).style.border = "1px solid #a9a9a9";
			_$("x_"+id).style.display = "none";	 // padrão form_spam = "x_"+id
			formOk[indiceCampo] = true;
			
		}
	}
	}
	
	validaHora = function (id, regex, indiceCampo) {
		_$(id).onblur = function () {
			if (required (id) == false || onlyWhatever(id, regex) == false ) {
			_$(id).style.border = "1px solid red";	
			// _$("x_"+id).innerHTML = " Hora inválida!";
			msgErro(id, " Hora inválida!");
			formOk[indiceCampo] = false;
			}
		else if (required (id) == true && onlyWhatever(id, regex) == true ) {
			_$(id).style.border = "1px solid #a9a9a9";	
			_$("x_"+id).style.display = "none";
			formOk[indiceCampo] = true;
			
		}
	}
	}

	// Fim das Funções de Validação
	
	_$("formularioJ").onsubmit = function() {
		for (map in formOk) {
			console.log("posicao " + map + "= " + formOk[map]);
			if (formOk[map] == false) {
				alert("Dados Inválidos!");
				return false;
			}
		}
		alert("Dados cadastrados com sucesso!");
		_$("formularioJ").submit();
	}



function required  (id){
	if (_$(id).value.length == 0) {	// função campo obrigatório
		return false;		 	
	} 
	else {
		return true;
	}
}

function onlyWhatever   (id, regex){
	if (!(_$(id).value.match(regex))) {    // função só letras com expressão regular
		return false;		 	
	} 
	else {
		return true;
	}		
}

function mascara (id, mask) {    // função das máscaras
	var i = _$(id).value.length;
	var saida = mask.substring(1, 0);
	var texto = mask.substring(i)
	if (texto.substring(0, 1) != saida) {
		_$(id).value += texto.substring(0, 1);
	}
}

function TestaCPF  (CPF) {
	var strCPF = takeMask(CPF);//CPF.substring(0,3)+CPF.substring(4,7)+CPF.substring(8,11)+CPF.substring(12,14);
	var Soma;
	var Resto;
	Soma = 0;
		if (strCPF == "00000000000") return false;

		for (i=1; i<=9; i++) Soma = Soma + parseInt(strCPF.substring(i-1, i)) * (11 - i); 
		Resto = (Soma * 10) % 11; 
		
	if ((Resto == 10) || (Resto == 11)) Resto = 0;
	if (Resto != parseInt(strCPF.substring(9, 10)) ) return false; 
	
		Soma = 0; 
	for (i = 1; i <= 10; i++) Soma = Soma + parseInt(strCPF.substring(i-1, i)) * (12 - i); 
	Resto = (Soma * 10) % 11; 
	
	if ((Resto == 10) || (Resto == 11)) Resto = 0; 
	if (Resto != parseInt(strCPF.substring(10, 11) ) ) return false; return true; 
}

function takeMask(string){
	return string.replace(/[-./: ]+/g,"");
}

function TestaCNPJ(CNPJ) {

    var strCNPJ = takeMask(CNPJ);//CNPJ.substring(0, 2)+CNPJ.substring(3, 6)+CNPJ.substring(7, 10)+CNPJ.substring(11, 15)+CNPJ.substring(16, 18);
	
	console.log(strCNPJ);
     
    if (strCNPJ.length != 14)
        return false;
 
    // Elimina strCNPJs invalidos conhecidos
    if (strCNPJ == "00000000000000" ||
        strCNPJ == "11111111111111" || 
        strCNPJ == "22222222222222" || 
        strCNPJ == "33333333333333" || 
        strCNPJ == "44444444444444" || 
        strCNPJ == "55555555555555" || 
        strCNPJ == "66666666666666" || 
        strCNPJ == "77777777777777" || 
        strCNPJ == "88888888888888" || 
        strCNPJ == "99999999999999")
        return false;
         
    // Valida DVs
    tamanho = strCNPJ.length - 2
    numeros = strCNPJ.substring(0,tamanho);
    digitos = strCNPJ.substring(tamanho);
    soma = 0;
    pos = tamanho - 7;
    for (i = tamanho; i >= 1; i--) {
      soma += numeros.charAt(tamanho - i) * pos--;
      if (pos < 2)
            pos = 9;
    }
    resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
    if (resultado != digitos.charAt(0))
        return false;
         
    tamanho = tamanho + 1;
    numeros = strCNPJ.substring(0,tamanho);
    soma = 0;
    pos = tamanho - 7;
    for (i = tamanho; i >= 1; i--) {
      soma += numeros.charAt(tamanho - i) * pos--;
      if (pos < 2)
            pos = 9;
    }
    resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
    if (resultado != digitos.charAt(1))
          return false;
           
    return true;
    
}

function msgErro (id, msg, lado) {
	/*_$("x_"+id).style.color = "#be0000";
	_$("x_"+id).style.backgroundColor = "#ff9e9e"; 
	_$("x_"+id).style.border = "dashed 1px #be0000";
	_$("x_"+id).style.padding = "3px 5px";
	_$("x_"+id).style.marginLeft = "5px";
	_$("x_"+id).style.fontFamily = "sans-serif";*/
	 _$("x_"+id).style.display = "inline-block";
	_$("x_"+id).innerHTML = msg;
}

							  

