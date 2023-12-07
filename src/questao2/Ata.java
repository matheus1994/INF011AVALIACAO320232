package questao2;

import model.Documento;


//NA SEGUNDA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO DECORATOR
//CONCRETEDECORATOR EM DECORATOR


public class Ata extends DocumentoDecorator{

	public Ata(Documento component) {
		super(component);
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
