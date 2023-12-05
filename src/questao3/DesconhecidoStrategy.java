package questao3;

import model.Perfil;

public class DesconhecidoStrategy implements NivelPerfilStrategy{
	
	@Override
	public NivelPerfilStrategy nivel() {
		// TODO Auto-generated method stub
		return new DesconhecidoStrategy();
	}
	
	

}
