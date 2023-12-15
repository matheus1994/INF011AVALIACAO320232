package questao1;

import model.CPF;
import model.CartaoCredito;
import model.EMail;
import model.Perfil;
import model.RG;

//NA PRIMEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO BUILDER
// DIRECTOR EM BUILDER

public class Director {
	
	private Builder builder;
	
	public void Construct(Perfil perfil, CPF cpf, RG rg, CartaoCredito cartao, EMail email) {
		this.builder = new PerfilBuilder(perfil);
		this.builder.adicionarCPF(cpf);
		this.builder.adicionarRG(rg);
		this.builder.adicionarCartaoCredito(cartao);
		this.builder.adicionarEmail(email);	
	}

}
