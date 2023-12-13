package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class DesconhecidoStrategy implements NivelPerfilStrategy{
	
	private Perfil perfil;
	
	public DesconhecidoStrategy(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public NivelPerfilStrategy nivel(String usuario, String senha) {
        
		boolean validade = this.equals(usuario, senha);
		
		if(!validade) {
			return new DesconhecidoStrategy(this.perfil);
		}
		
		else {
			return null;
		}
		
	}
	
	private boolean equals(String usuario, String senha) {
		return this.perfil.getUser().equals(usuario) &&
			   this.perfil.getPwd().equals(senha);
		
	}

	
	

}
