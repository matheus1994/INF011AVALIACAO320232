package model;

import java.util.List;
import java.util.stream.Stream;

//PRDOUTCT EM BUILDER

public class Perfil {
	
	private List<Documento> documentos;
	private String nome;
	private String user;
	private String pwd;
	
	public Perfil(String nome) {
		this.nome = nome;
	}
	
	public Perfil(String nome, String user, String pwd, List<Documento> documentos) {
		this.documentos = documentos;
		this.nome = nome;
		this.user = user;
		this.pwd = pwd;
	}	
	
	public void adicionar(Documento documento) {
		this.documentos.add(documento);
	}

	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.nome + "\n");
		for(Documento doc : this.documentos)
			str.append(doc.formatar() + (doc.validar() ? " [Válido]" : "") + "\n");
		return str.toString();
		
	}

	public String getUser() {
		return user;
	}

	public String getPwd() {
		return pwd;
	}

	public Stream<Documento> documentos(){
		return this.documentos.stream();
	}

}
