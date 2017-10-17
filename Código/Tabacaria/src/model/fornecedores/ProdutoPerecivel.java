package model.fornecedores;

import java.io.Serializable;
import java.time.LocalDate;
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
        private LocalDate dataProducao;

<<<<<<< HEAD
        @Column
        @Temporal(javax.persistence.TemporalType.DATE)
	private LocalDate dataValidade;
=======
	private String dataProducao;

	private String dataValidade;
>>>>>>> 7c59f5b0f7f8fcb0ee1da678561312f6d1c0c40c

        @Column
	private String modoConservacao;
        
        @OneToOne
        @JoinColumn(foreignKey = @ForeignKey)
        private Produto produtoBase;
        

<<<<<<< HEAD
    public ProdutoPerecivel(LocalDate dataProducao, LocalDate dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {
=======
    public ProdutoPerecivel(String dataProducao, String dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {
>>>>>>> 7c59f5b0f7f8fcb0ee1da678561312f6d1c0c40c
        super(id, nome, descricao, preco);
        this.dataProducao = dataProducao;
        this.dataValidade = dataValidade;
        this.modoConservacao = modoConservacao;
    }

<<<<<<< HEAD
    public ProdutoPerecivel() {
    }
    
    

    public LocalDate getDataProducao() {
=======
   
    public Date getDataProducao() {
>>>>>>> 7c59f5b0f7f8fcb0ee1da678561312f6d1c0c40c
        return dataProducao;
    }

    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = dataProducao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
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
