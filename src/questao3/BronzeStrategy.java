package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class BronzeStrategy implements NivelPerfilStrategy{
	
	private Perfil perfil;

	public BronzeStrategy(Perfil perfil) {
		this.perfil = perfil;
	}



	public NivelPerfilStrategy nivel(String usuario, String senha) {
		
		boolean validade = this.equals(usuario, senha);
		
		
			Integer pontuacao = this.perfil.documentos()
	                .filter(doc->doc.validar())
	                .mapToInt(doc->doc.pontuar())
	                .sum();
			
	    if(validade && pontuacao >=3) {
			return new BronzeStrategy(this.perfil);
	    }
	
		
		else {
			return new DesconhecidoStrategy(this.perfil);
		}
		
	}

	private boolean equals(String usuario, String senha) {
		return this.perfil.getUser().equals(usuario) &&
			   this.perfil.getPwd().equals(senha);
		
	}
	
}
