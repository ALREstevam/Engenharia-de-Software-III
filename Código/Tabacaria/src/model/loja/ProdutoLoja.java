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
	private int precoVenda;

}
