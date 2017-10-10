package model.loja;

import model.fornecedores.Produto;

public class ProdutoLoja {

	private int id;

	private Produto produto;

	private int quantidadeEstoque;

	private int precoVenda;

    public ProdutoLoja( Produto produtoto, int quantidadeEstoque, int precoVenda) {
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

    public Produto getProdutoto() {
        return produtoto;
    }

    public void setProdutoto(Produto produtoto) {
        this.produtoto = produtoto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(int precoVenda) {
        this.precoVenda = precoVenda;
    }
        
}
=======
        this.produto = produtoto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }
        

}
>>>>>>> origin/master
