package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY

public class NaoVerificadoStrategy implements NivelPerfilStrategy{

	private Perfil perfil;
	
	public NaoVerificadoStrategy(Perfil perfil) {
		this.perfil = perfil;
	}
	
	@Override
	public NivelPerfilStrategy nivel() {
		if(this.perfil == null)
			return new NaoVerificadoStrategy(this.perfil);
		return null;
	}

	
}
