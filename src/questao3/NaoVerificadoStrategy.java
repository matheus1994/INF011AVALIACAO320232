package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class NaoVerificadoStrategy implements Strategy{

	private Perfil perfil;
	
	public NaoVerificadoStrategy(Perfil perfil) {
		this.perfil = perfil;
	}

	
	@Override
	public Strategy nivel(String usuario, String senha) {
		if(!this.validar(usuario, senha)) {
			return new NaoVerificadoStrategy(this.perfil);
		}
		else {
			return null;
		}
	}
	
	private boolean validar(String usuario, String senha) {
		return this.perfil.getUser().equals(usuario) &&
			   this.perfil.getPwd().equals(senha);
	}

}
