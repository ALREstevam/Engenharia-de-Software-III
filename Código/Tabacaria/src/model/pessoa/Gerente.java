package model.pessoa;

import java.io.Serializable;
import model.notasFiscais.RelatorioCompras;
import model.notasFiscais.RelatorioVendas;
import model.loja.ProdutoLoja;

public class Gerente extends Funcionario implements Serializable{

<<<<<<< HEAD
	public RelatorioCompras gerarRelatorioCompras() {
		return null;
=======
    public Gerente(int id, String nome, int cpf) {
        super(id, nome, cpf);
    }
    

	/**
	 *  
	 *  
	 */
	public RelatorioCompras gerarRelatorioCompras(String data) {
            RelatorioCompras r =null;
		return r;
>>>>>>> refs/remotes/origin/master
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
