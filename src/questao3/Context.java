package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONTEXT EM STRATEGY


public class Context {
	
	public Strategy getStrategy(Strategy strategy, String usuario, String senha) {
		Strategy s = strategy.nivel(usuario, senha);
		return s;
	}

}
