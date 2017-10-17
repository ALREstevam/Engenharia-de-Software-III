package model.pessoa;

import model.notasFiscais.NotaFiscalVenda;
import model.notasFiscais.NotaFiscalCompra;
import model.loja.Venda;
import model.loja.Pedido;

public class Caixa extends Funcionario {

    public Caixa(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }
    
    
    

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

    Object obterDadosEntrega() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
