package model.loja;

import model.fornecedores.Produto;

public class ProdutoLoja {

	private int id;

	private Produto produto;

	private int quantidadeEstoque;

	private int precoVenda;

    public ProdutoLoja(int id, Produto produtoto, int quantidadeEstoque, int precoVenda) {
        this.id = id;
        this.produto = produtoto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }
        

}
