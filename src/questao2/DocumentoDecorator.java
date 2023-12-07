package questao2;

import model.Documento;

//NA SEGUNDA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO DECORATOR
//DECORATOR EM DECORATOR

public class DocumentoDecorator implements Documento{
	
	public Documento component;
	
	public DocumentoDecorator(Documento component) {
		this.component = component;
	}

	@Override
	public String formatar() {
		return this.component.formatar();
	}

	@Override
	public boolean validar() {
		return this.component.validar();
	}

	@Override
	public Integer pontuar() {
	    return this.component.pontuar();
	}
	
	

}
