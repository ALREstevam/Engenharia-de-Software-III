package model.fornecedores;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

	private Date dataProducao;

	private Date dataValidade;

	private String modoConservacao;

	public boolean naValidade() {
		return false;
	}

}
