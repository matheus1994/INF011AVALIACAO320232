package questao2;

import model.CPF;
import model.CartaoCredito;
import model.EMail;
import model.RG;

//NA SEGUNDA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO VISITOR
//CONCRETEVISITOR EM VISITOR

public class Visitor implements IVisitor{

	@Override
	public void visitCPF(CPF cpf) {
		System.out.println("Nome: "+cpf.getNome());
		System.out.println("Numero: "+cpf.getNumero());
	}

	@Override
	public void visitRG(RG rg) {
		System.out.println("Nome: "+rg.getNome());
		System.out.println("Numero: "+rg.getNumero());
		System.out.println("Expedidor: "+rg.getExpedidor());
		System.out.println("Validade: "+rg.getValidade());

	}

	public void visitCartaoCredito(CartaoCredito cartao) {
		System.out.println("Nome: "+cartao.getNome());
		System.out.println("Numero: "+cartao.getNumero());
		System.out.println("CVC: "+cartao.getCvc());
		System.out.println("Vencimento: "+cartao.getVencimento());

	}

	public void visitEmail(EMail email) {
		System.out.println("Conta: "+email.getConta());
	}

}
