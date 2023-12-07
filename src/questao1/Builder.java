package questao1;

import model.CPF;
import model.CartaoCredito;
import model.EMail;
import model.RG;

// NA PRIMEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO BUILDER
// BUILDER EM BUILDER

public interface Builder {
	
	public void adicionarCPF(CPF cpf);
    public void adicionarRG(RG rg);
    public void adicionarCartaoCredito(CartaoCredito cartao);
    public void adicionarEmail(EMail email);
	  

}
