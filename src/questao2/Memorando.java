package questao2;

import model.Documento;

//NA SEGUNDA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO DECORATOR
//CONCRETEDECORATOR EM DECORATOR

public class Memorando extends DocumentoDecorator{

	public Memorando(Documento component) {
		super(component);
	}

}
