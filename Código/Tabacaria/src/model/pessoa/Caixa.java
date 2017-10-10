package model.pessoa;

import java.io.Serializable;
import model.notasFiscais.NotaFiscalVenda;
import model.notasFiscais.NotaFiscalCompra;
import model.loja.Venda;
import model.loja.Pedido;

public class Caixa extends Funcionario implements Serializable{
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
	public Pedido obterDadosEntrega() {
		return null;
	}

}
