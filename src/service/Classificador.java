package service;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO PROXY
//SUBJECT EM PROXY

public interface Classificador {
	
	public NivelPerfil nivel();
	public Perfil getPerfil();

}
