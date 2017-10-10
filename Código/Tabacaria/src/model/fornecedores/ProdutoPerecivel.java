package model.fornecedores;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class ProdutoPerecivel extends Produto implements Serializable{
        @Column
        @Temporal(javax.persistence.TemporalType.DATE)
        private Date dataProducao;

        @Column
        @Temporal(javax.persistence.TemporalType.DATE)
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
