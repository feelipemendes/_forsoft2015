var numeroCampos = 6; <!-- INSIRA O NÚMERO DE CAMPOS -->

var formOk = new Array(numeroCampos);
for (var i = 0; i < numeroCampos; i++) { formOk[i] = false;}

window.onload = function () {

	<!-- EDITE DAQUI PARA BAIXO -->
	
var topo = _$("caixa");
var regexLETRAS = /^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$/;
var regexCEP = /^\d+\.\d+\-\d+$/;
var regexTEL = /^\d+\ \d+\-\d+$/;
var regexCPF = /^\d{3}\.\d{3}\.\d{3}\-\d{2}$/;
var regexCNPJ = /^\d{2}\.\d{3}\.\d{3}\/\d{4}\-\d{2}$/;
var regexNUMEROS = /^\d+$/;
var regexEMAIL= /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
var regexHORA = /^([01]\d|2[0-3]):([0-5]\d):([0-5]\d)$/;
var regexPLACA = /^([A-Za-z]{3})\-(\d{4})$/;
var regexDATA=/^(0[1-9]|1\d|2[0-8]|29(?=-\d\d-(?!1[01345789]00|2[1235679]00)\d\d(?:[02468][048]|[13579][26]))|30(?!-02)|31(?=-0[13578]|-1[02]))\/(0[1-9]|1[0-2])\/([12]\d{3})$/;

//MÁSCARAS setMask(idDoCampo, formatacaoDaMascara


//ValidaTipo(idDoCampo, regexTIPO, numeroDoCampo)
/* Exemplos:
	validaChar("nomeJ", regexLETRAS, 0);
	validaChar("sobrenomeJ", regexLETRAS, 1);
	validaCPF("cpfJ", regexCPF, 2);
	validaChar("telJ", regexTEL, 3);
	validaChar("cepJ", regexCEP, 4);
	validaChar("kmJ", regexNUMEROS, 5);
	validaChar("estadoJ", regexLETRAS, 6);
	validaChar("cidadeJ", regexLETRAS, 7);
	validaEmail("emailJ", regexEMAIL, 8);
	validarCNPJ("cnpjJ", regexCNPJ, 9);
	validaHora("horaJ", regexHORA, 10);
	validaChar("placaJ", regexPLACA, 11);
	validaChar("dataJ", regexDATA, 12);
	validaChar("paisJ", regexNUMEROS, 13);*/

	validaChar("idpostoJ", regexNUMEROS, 0);
	validaChar("telefoneJ", regexTEL, 1);
	validaChar("tipoJ", regexLETRAS, 2);
	validaChar("latitudeJ", regexNUMEROS, 3);
	validaChar("longitudeJ", regexNUMEROS, 4);
	validaChar("idrodoviaJ", regexNUMEROS, 5);

	
	
	
	
	
	<!-- EDITE DAQUI PARA CIMA-->
	
}

