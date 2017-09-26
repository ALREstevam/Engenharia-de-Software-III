package model.fornecedores;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor implements Serializable {

        /*private static final long serialVersionUID = 1L;*/
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

        @Column
	private String nome;

        @Column
	private String contato;

        @Column
	private String cnpj;

    public Fornecedor(long id, String nome, String contato, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.cnpj = cnpj;
    }

        
        
        
	/**
	 *  
	 *  
	 *  
	 */
	public Produto novoProduto() {
		return null;
	}

	/**
	 *  
	 *  
	 *  
	 */
	public Produto alterarProduto() {
		return null;
	}

	/**
	 *  
	 *  
	 *  
	 */
	public boolean pararVenderProduto() {
		return false;
	}

}
