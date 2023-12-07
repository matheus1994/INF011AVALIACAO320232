package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class BronzeStrategy implements NivelPerfilStrategy{
	
	private Perfil perfil;

	public BronzeStrategy(Perfil perfil) {
		this.perfil = perfil;
	}



	@Override
	public NivelPerfilStrategy nivel() {
		
		Integer pontuacao = this.perfil.documentos()
                .filter(doc->doc.validar())
                .mapToInt(doc->doc.pontuar())
                .sum();
		
		if(pontuacao >=3)
			return new BronzeStrategy(this.perfil);
		return null;
		
	}

}
