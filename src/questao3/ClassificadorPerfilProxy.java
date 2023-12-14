package questao3;

import model.Perfil;
import service.Classificador;
import service.ClassificadorPerfil;
import service.NivelPerfil;

//NA TERCEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO PROXY
//PROXY EM PROXY

public class ClassificadorPerfilProxy implements Classificador{
	
	private ClassificadorPerfil classific;
	private String usuario;
	private String senha;
	
	public ClassificadorPerfilProxy(Perfil perfil, String usuario, String senha) {
		this.classific = new ClassificadorPerfil(perfil);
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public NivelPerfil nivel() {
		if(this.verfifica(this.getUsuario(), this.getSenha())) {
			this.classific.nivel();
		}
		else {
			return NivelPerfil.DESCONHECIDO;
		}
		return null;
	}
	
	public String getUsuario(){
		return this.usuario;
	}
	
	public String getSenha(){
		return this.senha;
	}

	@Override
	public Perfil getPerfil() {
		return this.classific.getPerfil();
	}

	private boolean verfifica(String usuario, String senha) {
		return this.getPerfil().getUser().equals(this.getUsuario()) &&
			   this.getPerfil().getPwd().equals(this.getSenha());
	}
	
}
