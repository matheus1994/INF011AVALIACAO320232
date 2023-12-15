package questao3;

import service.NivelPerfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//STRATEGY EM STRATEGY


public interface Strategy {
	
	public Strategy nivel(String usuario, String senha);

}
