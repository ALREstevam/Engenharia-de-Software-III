package model.pessoa;

import java.io.Serializable;

<<<<<<< HEAD
public class Entregador extends Funcionario implements Serializable{
    
=======
    public Entregador(int id, String nome, int cpf) {
        super(id, nome, cpf);
    }
    

>>>>>>> refs/remotes/origin/master
	/**
	 *  
	 *  
	 */
	public boolean entregarPedido() {
		return false;
	}

	/**
	 *  
	 *  
	 */
	public void retornarPedido() {

	}

}
