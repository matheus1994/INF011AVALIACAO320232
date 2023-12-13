package questao3;

import model.Perfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONTEXT EM STRATEGY

public class Context {
	
	NivelPerfilStrategy nivelPerfil;
	
	public Context(NivelPerfilStrategy nivel) {
		this.nivelPerfil = nivel;
	}
	
	public void operation(String usuario, String senha) {
		NivelPerfilStrategy nivel = this.nivelPerfil.nivel(usuario, senha);
		System.out.println(nivel);
	}

}
