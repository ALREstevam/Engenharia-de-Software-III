package model.fornecedores;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
/**
 * Classe produto
 */
public class Produto implements Serializable{
        
        private static final long serialVersionUID = 1L;
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

        @Column
	private String nome;

        @Column
	private String descricao;

        @Column
	private double preco;
        
        @Column
        @OneToOne
        @JoinColumn(foreignKey = @ForeignKey)
        private Fornecedor forn;
        /*
        Como o preço de compra é diferente de acordo com cada fornecedor
        cada produto precisa estar ligado com apenas um fornecedor
        */

    /**
     * Construtor da classe
     * @param id
     * @param nome
     * @param descricao
     * @param preco 
     */
    public Produto(int id, String nome, String descricao, float preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    /**
     * Obeter id
     * @return 
     */
    public long getId() {
        return id;
    }

    
   /**
    * Setar id
    * @param id 
    */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obter o nome
     * @return 
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setar o nome
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obter a descrição do produto
     * @return 
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Setar a descrição do produto
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obter o preço do produto
     * @return 
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Setar o preço do produto
     * @param preco 
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
