package model;

import questao2.IVisitor;

public interface Documento {

	public String formatar();
	public boolean validar();
	public Integer pontuar();
	public void aceitar(IVisitor ivisitor);
	
	
}
