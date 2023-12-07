package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class DesconhecidoStrategy implements NivelPerfilStrategy{
	
	@Override
	public NivelPerfilStrategy nivel() {
		// TODO Auto-generated method stub
		return new DesconhecidoStrategy();
	}
	
	

}
