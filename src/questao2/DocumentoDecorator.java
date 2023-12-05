package questao2;

import model.Documento;

//DECORATOR EM DECORATOR

public class DocumentoDecorator implements Documento{
	
	private Documento component;

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
