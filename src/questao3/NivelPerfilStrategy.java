package questao3;

import model.Perfil;

//STRATEGY EM STRATEGY
//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY

public interface NivelPerfilStrategy {
	
	public NivelPerfilStrategy nivel(String usuario, String senha);


}
