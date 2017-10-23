package model.fornecedores;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD

@Entity
public class ProdutoPerecivel extends Produto implements Serializable {
       @Column
        private LocalDate dataProducao;


        @Column
	private LocalDate dataValidade;



	@Column
	private String modoConservacao;
       
=======
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import utils.DateUtils;

@Entity
public class ProdutoPerecivel extends Produto implements Serializable {

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
>>>>>>> refs/remotes/origin/hibernate

    public ProdutoPerecivel(LocalDate dataProducao, LocalDate dataValidade, String modoConservacao, int id, String nome, String descricao, float preco) {

        super(id, nome, descricao, preco);
        this.dataProducao = utils.DateUtils.asDate(dataProducao);
        this.dataValidade = utils.DateUtils.asDate(dataValidade);
        this.modoConservacao = modoConservacao;
    }

<<<<<<< HEAD

    
    



    public LocalDate getDataProducao() {

        return dataProducao;
=======
    public LocalDate getDataProducao() {
        return utils.DateUtils.asLocalDate(dataProducao);
>>>>>>> refs/remotes/origin/hibernate
    }

    public void setDataProducao(LocalDate dataProducao) {
        this.dataProducao = utils.DateUtils.asDate(dataProducao);
    }

    public LocalDate getDataValidade() {
        return utils.DateUtils.asLocalDate(dataValidade);
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = utils.DateUtils.asDate(dataValidade);
    }

    public String getModoConservacao() {
        return modoConservacao;
    }

    public void setModoConservacao(String modoConservacao) {
        this.modoConservacao = modoConservacao;
    }

<<<<<<< HEAD
    

	public boolean naValidade() {
            if (Integer.parseInt(dataValidade.format(DateTimeFormatter.BASIC_ISO_DATE)) > Integer.parseInt(LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE))){
                return true;
            } else {
                return false;
            }
		
	}
=======
    public boolean naValidade() {
        if(utils.DateUtils.asLocalDate(this.dataValidade).isAfter(LocalDate.now())){
            return false;
        }
        return true;
    }
>>>>>>> refs/remotes/origin/hibernate

}
