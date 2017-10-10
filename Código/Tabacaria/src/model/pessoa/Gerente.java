package model.pessoa;

import java.io.Serializable;
import model.notasFiscais.RelatorioCompras;
import model.notasFiscais.RelatorioVendas;
import model.loja.ProdutoLoja;

public class Gerente extends Funcionario implements Serializable{

	public RelatorioCompras gerarRelatorioCompras() {
		return null;
	}

	/**
	 *  
	 */
	public RelatorioVendas gerarRelatorioVendas() {
		return null;
	}

	/**
	 *  
	 */
	public void comprarProduto() {

	}

	/**
	 *  
	 */
	public ProdutoLoja listarProdutosVencidos() {
		return null;
	}

	/**
	 *  
	 */
	public void descartarProduto() {

	}

}
