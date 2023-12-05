package questao1;

import model.CPF;
import model.CartaoCredito;
import model.EMail;
import model.Perfil;
import model.RG;

//CONCRETEBUILDER EM BUILDER

public class PerfilBuilder implements Builder{
	
    private Perfil perfil;
    
    public PerfilBuilder(Perfil perfil) {
    	this.perfil = perfil;
    }
    
    public void adicionarCPF(CPF cpf) {
    	
    	int cont = 0;
    	
    	while(cont < 1) {
    		this.perfil.adicionar(cpf);
    		cont++;
    	}
           
    
    }

    public void adicionarRG(RG rg) {
       
    	int cont = 0;
    	
    	while(cont < 1) {
    		this.perfil.adicionar(rg);
    		cont++;
    	}
    	
    }

    public void adicionarCartaoCredito(CartaoCredito cartao) {
         
    	int cont = 0;
    	
    	while(cont < 3) {
    		this.perfil.adicionar(cartao);
    		cont++;
    	}
    }

    public void adicionarEmail(EMail email) {
       
    	int cont = 0;
    	
    	while(cont < 2) {
    		this.perfil.adicionar(email);
    		cont++;
    	}
    }

    public Perfil construir() {
        return perfil;
    }


}
