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

    public Produto getProdutoto() {
        return produto;
    }

    public void setProdutoto(Produto produtoto) {
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

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
        
}