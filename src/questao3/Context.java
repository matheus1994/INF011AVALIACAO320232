package questao3;

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
