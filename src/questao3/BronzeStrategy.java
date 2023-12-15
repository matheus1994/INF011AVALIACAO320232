package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class BronzeStrategy implements Strategy{

	private Perfil perfil;
	
	public BronzeStrategy(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public Strategy nivel(String usuario, String senha) {
		Integer pontuacao = this.perfil.documentos()
                .filter(doc->doc.validar())
                .mapToInt(doc->doc.pontuar())
                .sum();
        if(this.validar(usuario, senha) && pontuacao >=3) {
        	return new BronzeStrategy(this.perfil);
        }
        else {
        	return new NaoVerificadoStrategy(this.perfil);
        }
	}
	
	private boolean validar(String usuario, String senha) {
		return this.perfil.getUser().equals(usuario) &&
			   this.perfil.getPwd().equals(senha);
	}

}
