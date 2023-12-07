package questao2;

import model.Documento;

//NA SEGUNDA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO DECORATOR
//CONCRETEDECORATOR EM DECORATOR

public class Memorando extends DocumentoDecorator{

	public Memorando(Documento component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String formatar() {
		return super.formatar();
	}

	@Override
	public boolean validar() {
		return super.validar();
	}

	@Override
	public Integer pontuar() {
	    return super.pontuar();
	}

}
