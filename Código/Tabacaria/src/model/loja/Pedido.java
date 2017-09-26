package model.loja;

import model.fornecedores.Produto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable{
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

        @Column
	private String receptorNome;

        @Column
	private String endereco;
        
        @OneToOne
        @JoinColumn(foreignKey = @ForeignKey)
        private List<Produto> produtos;

	public void entregar() {

	}
}
