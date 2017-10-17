package model.pessoa;

import java.io.Serializable;
import model.notasFiscais.NotaFiscalVenda;
import model.notasFiscais.NotaFiscalCompra;
import model.loja.Venda;
import model.loja.Pedido;

<<<<<<< HEAD
public class Caixa extends Funcionario implements Serializable{
=======
public class Caixa extends Funcionario {

    public Caixa(int id, String nome, int cpf) {
        super(id, nome, cpf);
    }
    
    
    

>>>>>>> refs/remotes/origin/master
	/**
	 *  
	 */
	public NotaFiscalVenda emitirNotaVenda() {
		return null;
	}

	/**
	 *  
	 */
	public NotaFiscalCompra receberPagamento() {
		return null;
	}

	/**
	 *  
	 */
	public Venda realizarVenda() {
		return null;
	}

	/**
	 *  
	 */
	public boolean adicionarProduto() {
		return false;
	}

	/**
	 *  
	 */
	public boolean removerProduto() {
		return false;
	}

	/**
	 *  
	 */
	public Venda finalizarVenda() {
		return null;
	}

	/**
	 *  
	 */
	public Pedido obterDadosEntrega(int id) {
            Pedido p= null;
		return p;
	}

}
