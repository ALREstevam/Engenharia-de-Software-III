package model.loja;

import model.fornecedores.Produto;

public class ProdutoLoja {

	private int id;

	private Produto produto;

	private int quantidadeEstoque;

	private float precoVenda;

    public ProdutoLoja( Produto produtoto, int quantidadeEstoque, float precoVenda) {
        this.id = id;
        this.produto = produto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produtoto) {
        this.produto = produtoto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
        
}

