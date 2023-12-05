package questao3;

import model.Perfil;

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
