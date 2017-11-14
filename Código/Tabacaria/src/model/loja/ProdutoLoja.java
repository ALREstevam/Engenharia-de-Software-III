package model.loja;

import dao.ClassNamable;
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
/**
 * Classe ProdutoLoja indica quais dos produtos fornecidos foram comprados e que
 * potencialmente estão sendo vendidos
 */
public class ProdutoLoja implements Serializable, ClassNamable {

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

    /**
     * Construtor para a classe
     * @param produto
     * @param quantidadeEstoque
     * @param precoVenda 
     */
    public ProdutoLoja(Produto produto, int quantidadeEstoque, double precoVenda) {
        this.produto = produto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }

    /**
     * Obter o id do produto da loja
     * @return 
     */
    public long getId() {
        return id;
    }

    /**
     * Setar o id do produto da loja
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obter o objeto produto 
     * @return 
     */
    public Produto getProduto() {
        return produto;
    }

    
    /**
     * Definir o objeto produto
     * @param produtoto 
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * Obter a quantidade em estoque do produto
     * @return 
     */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     * Definir a quantidade em estoque do produto
     * @param quantidadeEstoque 
     */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     * Obter o preço de venda do produto
     * @return 
     */
    public double getPrecoVenda() {
        return precoVenda;
    }

    /**
     * Definir o preço de venda do produto
     * @param precoVenda 
     */
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String getClassName() {
        return "ProdutoLoja";
    }

}
