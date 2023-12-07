package questao3;

import model.Perfil;

import java.util.Iterator;

import model.Documento;
import model.CartaoCredito;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class PrataStrategy implements NivelPerfilStrategy{

	private Perfil perfil;
	
	public PrataStrategy(Perfil perfil2) {
		this.perfil = perfil;
	}

	@Override
	public NivelPerfilStrategy nivel() {
		Integer qtdeCC = 0;
		Integer pontuacao = this.perfil.documentos()
				                  .filter(doc->doc.validar())
				                  .mapToInt(doc->doc.pontuar())
				                  .sum();
		Iterator<Documento> docs = this.perfil.documentos().iterator();
		while(docs.hasNext()) {
			Documento doc = docs.next();
			if(doc.getClass().equals(CartaoCredito.class))
				qtdeCC++;
		}
		
		if(qtdeCC >= 1 && pontuacao >=50)
			return new PrataStrategy(this.perfil);
		return null;
	}

}
