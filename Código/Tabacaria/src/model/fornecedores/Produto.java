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
	private int preco;
        
        @ManyToOne
        @JoinColumn(foreignKey = @ForeignKey)
        private Fornecedor fornecedor;

}
