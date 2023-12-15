package questao1;

import java.util.List;

import model.CPF;
import model.CartaoCredito;
import model.Documento;
import model.EMail;
import model.Perfil;
import model.RG;

//NA PRIMEIRA QUESTÃO FOI UTILIZADO O PADRÃO DE PROJETO BUILDER
//CONCRETEBUILDER EM BUILDER

public class PerfilBuilder implements Builder{
	
    private Perfil perfil;
    private List<Documento> docs;
    
    public PerfilBuilder(Perfil perfil) {
    	this.perfil = perfil;
    }
    
    public void adicionarCPF(CPF cpf) {
    	
    	int cont = 0;
    	
    	while(cont <= 1) {
    		this.perfil.adicionar(cpf);
    		cont++;
    	}
           
    
    }

    public void adicionarRG(RG rg) {
       
    	int cont = 0;
    	
    	while(cont <= 1) {
    		this.perfil.adicionar(rg);
    		cont++;
    	}
    	
    }

    public void adicionarCartaoCredito(CartaoCredito cartao) {
         
    	int cont = 0;
    	
    	while(cont <= 3) {
    		this.perfil.adicionar(cartao);
    		cont++;
    	}
    }

    public void adicionarEmail(EMail email) {
       
    	int cont = 0;
    	
    	while(cont <= 2) {
    		this.perfil.adicionar(email);
    		cont++;
    	}
    }

    public Perfil getPerfil(String nome, String user, String pwd, List<Documento> documentos) {
        
    	Perfil perfil = new Perfil(nome, user, pwd, documentos);
    	
    	return perfil;
    }
    
  

}
