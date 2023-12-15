package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class PrataStrategy implements Strategy{
	
	public Perfil perfil;
	

	public PrataStrategy(Perfil perfil) {
		this.perfil = perfil;
	}
	 
	
	@Override
	public Strategy nivel(String usuario, String senha) {
		
		Integer qtdeCC = 0;
		Integer pontuacao = this.perfil.documentos()
                .filter(doc->doc.validar())
                .mapToInt(doc->doc.pontuar())
                .sum();
		

		if(this.validar(usuario, senha) && qtdeCC >= 1 && pontuacao >= 5) {
			return new PrataStrategy(this.perfil);
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
