package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class DesconhecidoStrategy implements Strategy{
	
	private Perfil perfil;
	
	public DesconhecidoStrategy(Perfil perfil){
		this.perfil = perfil;
	}

	@Override
	public Strategy nivel(String usuario, String senha) {
		if(this.perfil == null) {
			new DesconhecidoStrategy(this.perfil);
		}
		else {
			return null;
		}
		return null;
	}

}
