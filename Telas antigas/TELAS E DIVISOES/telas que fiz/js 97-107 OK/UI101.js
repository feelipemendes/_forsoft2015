var numeroCampos = 15; //INSIRA O NÚMERO DE CAMPOS

var formOk = new Array(numeroCampos);
for (var i = 0; i < numeroCampos; i++) { formOk[i] = false;}

window.onload = function () {

	//EDITE DAQUI PARA BAIXO
	
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

//setMask("cnpjJ","##.###.###/####-##");
setMask("telJ", "## #####-####");
setMask("cepJ", "##.###-###");

//ValidaTipo(idDoCampo, regexTIPO, numeroDoCampo)

validaChar("logradouroJ", regexLETRAS, 0);
validaChar("numeroJ", regexNUMEROS, 1);
validaChar("complementoJ", regexLETRAS, 2);
validaChar("cepJ", regexCEP,3);
validaChar("bairroJ", regexLETRAS,4);
validaChar("cidadeJ", regexLETRAS, 5);
validaChar("estadoJ", regexLETRAS,6);

validaChar("nomerodJ", regexLETRAS, 7);
validaChar("tipoJ", regexLETRAS, 8);
validaChar("extensaokmJ", regexNUMEROS, 9);
validaChar("cinicialJ", regexLETRAS, 10);
validaChar("cfinalJ", regexLETRAS, 11);
validaChar("telJ", regexTEL,12);
validaChar("numserieJ", regexNUMEROS, 13);
validaChar("kmJ", regexNUMEROS, 14);


	//EDITE DAQUI PARA CIMA
	
}


