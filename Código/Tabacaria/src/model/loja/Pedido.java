package model.loja;

import model.fornecedores.Produto;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pedido extends Venda implements Serializable{
        private static final long serialVersionUID = 1L;
       
        /*@Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;*/

        @Column
	private String receptorNome;

        @Column
	private String endereco;
        
        
	public void entregar() {

	}
}
