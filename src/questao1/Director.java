package questao1;

import model.CPF;
import model.CartaoCredito;
import model.EMail;
import model.RG;

// DIRECTOR EM BUILDER

public class Director {
	
	private Builder builder;
	
	public void Construct(CPF cpf, RG rg, CartaoCredito cartao, EMail email) {
		this.builder.adicionarCPF(cpf);
		this.builder.adicionarRG(rg);
		this.builder.adicionarCartaoCredito(cartao);
		this.builder.adicionarEmail(email);	
	}

}
