package questao3;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO STRATEGY
//CONTEXT EM STRATEGY

public class Context {
	
	NivelPerfilStrategy nivelPerfil;
	
	public Context(NivelPerfilStrategy nivel) {
		this.nivelPerfil = nivel;
	}
	
	public void operation() {
		NivelPerfilStrategy nivel = this.nivelPerfil.nivel();
		System.out.println(nivel);
	}

}
