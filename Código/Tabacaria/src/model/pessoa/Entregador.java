package model.pessoa;

public class Entregador extends Funcionario {

    public Entregador(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }
    

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
