package model.pessoa;

import model.notasFiscais.RelatorioCompras;
import model.notasFiscais.RelatorioVendas;
import model.loja.ProdutoLoja;

public class Gerente extends Funcionario {

	/**
	 *  
	 *  
	 */
	public RelatorioCompras gerarRelatorioCompras(String data) {
            RelatorioCompras r =null;
		return r;
	}

	/**
	 *  
	 */
	public RelatorioVendas gerarRelatorioVendas(String data) {
            RelatorioVendas re =null;
		return re;
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
