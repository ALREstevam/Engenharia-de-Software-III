package model.loja;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import model.fornecedores.Produto;

@Entity
public class ProdutoLoja implements Serializable{

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

        @OneToOne
        @JoinColumn(foreignKey = @ForeignKey)
	private Produto produto;

        @Column
	private int quantidadeEstoque;

        @Column
	private double precoVenda;

    public ProdutoLoja( Produto produtoto, int quantidadeEstoque, double precoVenda) {
        this.produto = produto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

<<<<<<< HEAD
    public Produto getProdutoto() {
        return produto;
    }

    public void setProdutoto(Produto produtoto) {
=======
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produtoto) {
>>>>>>> 7c59f5b0f7f8fcb0ee1da678561312f6d1c0c40c
        this.produto = produtoto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

<<<<<<< HEAD
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
        
}
=======
    public void setPrecoVenda(int precoVenda) {
        this.precoVenda = precoVenda;
    }
        
}

>>>>>>> 7c59f5b0f7f8fcb0ee1da678561312f6d1c0c40c
