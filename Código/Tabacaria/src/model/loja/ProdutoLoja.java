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

<<<<<<< HEAD
        @OneToOne
        @JoinColumn(foreignKey = @ForeignKey)
=======
>>>>>>> refs/remotes/origin/master
	private Produto produto;

        @Column
	private int quantidadeEstoque;

        @Column
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
