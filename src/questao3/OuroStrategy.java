package questao3;
import java.util.Iterator;

import model.CPF;
import model.Documento;
import model.Perfil;

//CONCRETESTRATEGY EM STRATEGY


public class OuroStrategy implements NivelPerfilStrategy{
	
	private Perfil perfil;
	
	public OuroStrategy(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public NivelPerfilStrategy nivel() {
		
		boolean hasCPF = false;
		Integer qtdeCC = 0;
		Integer pontuacao = this.perfil.documentos()
				                  .filter(doc->doc.validar())
				                  .mapToInt(doc->doc.pontuar())
				                  .sum();
		Iterator<Documento> docs = this.perfil.documentos().iterator();
		while(docs.hasNext()) {
			Documento doc = docs.next();
			if(doc.getClass().equals(CPF.class))
				hasCPF = true;
		
		}
		
		if(hasCPF && pontuacao >= 5)
			return new OuroStrategy(this.perfil);
		return null;
		
		
	}

}
