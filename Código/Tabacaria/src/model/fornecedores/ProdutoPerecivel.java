package model.fornecedores;

import java.io.Serializable;
import java.util.Date;
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
public class ProdutoPerecivel extends Produto implements Serializable{
        
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
        
        @Column
        private Date dataProducao;

        @Column
	private Date dataValidade;

        @Column
	private String modoConservacao;
        
        @OneToOne
        @JoinColumn(foreignKey = @ForeignKey)
        private Produto produtoBase;
        

	public boolean naValidade() {
		return false;
	}

}
