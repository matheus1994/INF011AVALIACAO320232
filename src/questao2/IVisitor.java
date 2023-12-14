package questao2;

import model.CPF;
import model.CartaoCredito;
import model.EMail;
import model.RG;

//NA SEGUNDA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO VISITOR
//VISITOR EM VISITOR

public interface IVisitor {
	
	public void visitCPF(CPF cpf);
	public void visitRG(RG rg);
	public void visitCartaoCredito(CartaoCredito cartao);
	public void visitEmail(EMail email);

}
