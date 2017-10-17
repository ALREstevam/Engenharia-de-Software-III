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
        

    public ProdutoPerecivel(Date dataProducao, Date dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {
        super(id, nome, descricao, preco);
        this.dataProducao = dataProducao;
        this.dataValidade = dataValidade;
        this.modoConservacao = modoConservacao;
    }

    public Date getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Date dataProducao) {
        this.dataProducao = dataProducao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getModoConservacao() {
        return modoConservacao;
    }

    public void setModoConservacao(String modoConservacao) {
        this.modoConservacao = modoConservacao;
    }

    

	public boolean naValidade() {
		return false;
	}

}
