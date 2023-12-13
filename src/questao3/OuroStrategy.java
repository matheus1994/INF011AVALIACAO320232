package questao3;
import java.util.Iterator;

import model.CPF;
import model.Documento;
import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONCRETESTRATEGY EM STRATEGY


public class OuroStrategy implements NivelPerfilStrategy{
	
	private Perfil perfil;
	
	public OuroStrategy(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public NivelPerfilStrategy nivel(String usuario, String senha) {
		
		boolean validade = this.equals(usuario, senha);
			
			boolean hasCPF = false;
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
			
			if(validade && hasCPF && pontuacao >= 5) {
				return new OuroStrategy(this.perfil);
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
